package defpackage;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: PG */
/* renamed from: jr  reason: default package */
/* loaded from: classes.dex */
public final class jr {
    public static List<byte[]> a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public static void b(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
