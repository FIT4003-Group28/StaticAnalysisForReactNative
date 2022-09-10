package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: dale  reason: default package */
/* loaded from: classes5.dex */
public final class dale {
    private static dakz a;

    public static synchronized dakz a(Context context) {
        dakz dakzVar;
        synchronized (dale.class) {
            if (a == null) {
                dako dakoVar = new dako();
                dakoVar.a = new daln(dank.a(context));
                dxjg.a(dakoVar.a, daln.class);
                a = new dakp(dakoVar.a);
            }
            dakzVar = a;
        }
        return dakzVar;
    }
}
