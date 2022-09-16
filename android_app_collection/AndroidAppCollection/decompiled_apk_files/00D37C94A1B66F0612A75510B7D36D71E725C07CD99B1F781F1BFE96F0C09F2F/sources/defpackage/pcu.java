package defpackage;

import android.os.RemoteException;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: PG */
/* renamed from: pcu  reason: default package */
/* loaded from: classes4.dex */
public final class pcu {
    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean b(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean c(XmlPullParser xmlPullParser, String str) {
        return b(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static String d(String str) {
        int indexOf = str.indexOf(47);
        if (indexOf == -1) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid mime type: ".concat(valueOf) : new String("Invalid mime type: "));
        }
        return str.substring(0, indexOf);
    }

    public static boolean e(String str) {
        return d(str).equals("audio");
    }

    public static boolean f(String str) {
        return d(str).equals("video");
    }

    public static void g(Throwable th) {
        String message = th.getMessage();
        if (message != null) {
            aqvb.k(message, "Failed to construct command router.");
        } else {
            aqvb.k("Failed to construct command router.", new Object[0]);
        }
    }

    public static void h(RemoteException remoteException) {
        String message = remoteException.getMessage();
        if (message == null) {
            aqvb.l("Service was disconnected", new Object[0]);
        } else {
            aqvb.l("Service was disconnected: %s", message);
        }
    }

    public static void i() {
        aqvb.l("Service was disconnected", new Object[0]);
    }
}
