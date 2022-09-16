package defpackage;

import android.view.Surface;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: PG */
/* renamed from: pxv  reason: default package */
/* loaded from: classes4.dex */
public class pxv {
    public static void g(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            pns.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    public static String h(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static pzb k(int i, int i2, String str) {
        return new pzb(i, i2, str);
    }

    public void a() {
        throw null;
    }

    public void b() {
        throw null;
    }

    public void c(pzg pzgVar) {
        throw null;
    }

    public void d() {
        throw null;
    }

    public void e() {
        throw null;
    }

    public void f() {
    }
}
