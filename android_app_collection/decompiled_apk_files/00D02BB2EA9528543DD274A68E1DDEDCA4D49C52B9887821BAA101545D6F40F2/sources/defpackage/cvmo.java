package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cvmo  reason: default package */
/* loaded from: classes5.dex */
final class cvmo {
    private static dela a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized dela a(Context context, cvmm cvmmVar, cvjs cvjsVar) {
        dela delaVar;
        synchronized (cvmo.class) {
            if (a == null) {
                dele l = cvjsVar.l();
                if (l == null) {
                    deld deldVar = new deld();
                    deldVar.d = "chime-sdk";
                    deldVar.b("AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los");
                    deldVar.c("1:747654520220:android:0000000000000000");
                    deldVar.b = cvjsVar.c();
                    l = deldVar.a();
                }
                dbsg dbsgVar = cvmmVar.a;
                a = dela.initializeApp(context, l, "CHIME_ANDROID_SDK");
            }
            delaVar = a;
        }
        return delaVar;
    }
}
