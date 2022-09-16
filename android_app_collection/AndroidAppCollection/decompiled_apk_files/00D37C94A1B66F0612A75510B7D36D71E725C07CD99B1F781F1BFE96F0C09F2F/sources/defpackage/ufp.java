package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ufp  reason: default package */
/* loaded from: classes4.dex */
final class ufp {
    private static anwg a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized anwg a(Context context, ufk ufkVar, ucj ucjVar) {
        synchronized (ufp.class) {
            if (a == null) {
                if (ucjVar.j) {
                    anwg a2 = ufkVar.a(context);
                    a = a2;
                    return a2;
                }
                anwj anwjVar = new anwj();
                anwjVar.b = "chime-sdk";
                anwjVar.b("AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los");
                anwjVar.c("1:747654520220:android:0000000000000000");
                anwjVar.a = ucjVar.b;
                a = ufkVar.c(context, anwjVar.a());
            }
            return a;
        }
    }
}
