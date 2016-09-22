import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Article> articleList = new ArrayList<Article>();
        ArrayList<String> news = new ArrayList<String>();
        ArrayList<String> urls = new ArrayList<String>();
        ArrayList<String> titles = new ArrayList<String>();

        Document doc = Jsoup.connect("http://pikabu.ru/tag/%F2%E5%EA%F1%F2/hot").get();
        Elements testElement = doc.getElementsByAttributeValue("class", "b-story__content b-story__content_type_text");
        for (Element element : testElement) {
            news.add(element.toString());
        }
        Elements titleElement = doc.getElementsByAttributeValue("class", "story__header-title");
        for (Element element : titleElement) {
            Element aElement = element.child(0);
            String url = aElement.attr("href");
            String testUrl = aElement.text();
            urls.add(url);
            titles.add(testUrl);
        }

        for (int i = 0; i < urls.size(); i++) {
            System.out.println("<a href=\"" + urls.get(i) + "\">" + titles.get(i) + "</a>" );
        }
    }
}

