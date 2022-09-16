package defpackage;

import android.util.Log;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: PG */
/* renamed from: bav  reason: default package */
/* loaded from: classes2.dex */
final class bav {
    private static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static bar a(String str) {
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (!pxv.j(newPullParser, "x:xmpmeta")) {
                throw pjq.a("Couldn't find xmp metadata", null);
            }
            amuk q = amuk.q();
            long j2 = -9223372036854775807L;
            do {
                newPullParser.next();
                if (pxv.j(newPullParser, "rdf:Description")) {
                    String[] strArr = a;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        String h = pxv.h(newPullParser, strArr[i2]);
                        if (h != null) {
                            if (Integer.parseInt(h) != 1) {
                                return null;
                            } else {
                                String[] strArr2 = b;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= 4) {
                                        break;
                                    }
                                    String h2 = pxv.h(newPullParser, strArr2[i3]);
                                    if (h2 != null) {
                                        j = Long.parseLong(h2);
                                        if (j == -1) {
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                                j = -9223372036854775807L;
                                String[] strArr3 = c;
                                while (true) {
                                    if (i < 2) {
                                        String h3 = pxv.h(newPullParser, strArr3[i]);
                                        if (h3 != null) {
                                            q = amuk.s(new baq("image/jpeg", 0L, 0L), new baq("video/mp4", Long.parseLong(h3), 0L));
                                            break;
                                        }
                                        i++;
                                    } else {
                                        q = amuk.q();
                                        break;
                                    }
                                }
                                j2 = j;
                            }
                        }
                    }
                    return null;
                } else if (pxv.j(newPullParser, "Container:Directory")) {
                    q = b(newPullParser, "Container", "Item");
                } else if (pxv.j(newPullParser, "GContainer:Directory")) {
                    q = b(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!pxv.i(newPullParser, "x:xmpmeta"));
            if (!q.isEmpty()) {
                return new bar(j2, q);
            }
            return null;
        } catch (NumberFormatException | XmlPullParserException | pjq unused) {
            Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static amuk b(XmlPullParser xmlPullParser, String str, String str2) {
        amuf f = amuk.f();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (pxv.j(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String h = pxv.h(xmlPullParser, concat3);
                String h2 = pxv.h(xmlPullParser, concat4);
                String h3 = pxv.h(xmlPullParser, concat5);
                String h4 = pxv.h(xmlPullParser, concat6);
                if (h != null && h2 != null) {
                    f.h(new baq(h, h3 != null ? Long.parseLong(h3) : 0L, h4 != null ? Long.parseLong(h4) : 0L));
                } else {
                    return amuk.q();
                }
            }
        } while (!pxv.i(xmlPullParser, concat2));
        return f.g();
    }
}
