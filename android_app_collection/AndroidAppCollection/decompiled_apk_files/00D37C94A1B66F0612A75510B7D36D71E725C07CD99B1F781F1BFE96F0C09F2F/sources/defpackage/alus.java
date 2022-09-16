package defpackage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: PG */
/* renamed from: alus  reason: default package */
/* loaded from: classes.dex */
public final class alus {
    private static final alrz c = new alrz("LocalTestingConfigParser");
    public final XmlPullParser a;
    public final aluo b = alup.a();

    public alus(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
    }

    public static alup a(File file) {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return alup.a;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                newPullParser.setInput(fileReader);
                alus alusVar = new alus(newPullParser);
                alusVar.b("local-testing-config", new aluq(alusVar, 1));
                alup a = alusVar.b.a();
                fileReader.close();
                return a;
            } catch (Throwable th) {
                try {
                    fileReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e) {
            c.c("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e.getMessage());
            return alup.a;
        }
    }

    public final void b(String str, alur alurVar) {
        while (true) {
            int next = this.a.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (this.a.getEventType() == 2) {
                if (this.a.getName().equals(str)) {
                    alurVar.a();
                } else {
                    throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", str, this.a.getName()), this.a, null);
                }
            }
        }
    }
}
