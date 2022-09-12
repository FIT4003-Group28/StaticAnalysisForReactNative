package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PG */
/* renamed from: damh  reason: default package */
/* loaded from: classes5.dex */
final class damh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final daku a(XmlPullParser xmlPullParser, dakt daktVar) {
        while (xmlPullParser.next() != 1) {
            try {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("splits")) {
                        while (xmlPullParser.next() != 3) {
                            if (xmlPullParser.getEventType() == 2) {
                                if (xmlPullParser.getName().equals("module")) {
                                    String b = b("name", xmlPullParser);
                                    if (b != null) {
                                        while (xmlPullParser.next() != 3) {
                                            if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("language")) {
                                                    while (xmlPullParser.next() != 3) {
                                                        if (xmlPullParser.getEventType() == 2) {
                                                            if (xmlPullParser.getName().equals("entry")) {
                                                                String b2 = b("key", xmlPullParser);
                                                                String b3 = b("split", xmlPullParser);
                                                                c(xmlPullParser);
                                                                if (b2 != null && b3 != null) {
                                                                    if (!daktVar.a.containsKey(b2)) {
                                                                        daktVar.a.put(b2, new HashMap());
                                                                    }
                                                                    daktVar.a.get(b2).put(b, b3);
                                                                }
                                                            } else {
                                                                c(xmlPullParser);
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    c(xmlPullParser);
                                                }
                                            }
                                        }
                                    } else {
                                        c(xmlPullParser);
                                    }
                                } else {
                                    c(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        c(xmlPullParser);
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Map<String, String>> entry : daktVar.a.entrySet()) {
            hashMap.put(entry.getKey(), Collections.unmodifiableMap(new HashMap(entry.getValue())));
        }
        return new daku(Collections.unmodifiableMap(hashMap));
    }

    private static final String b(String str, XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    private static final void c(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
