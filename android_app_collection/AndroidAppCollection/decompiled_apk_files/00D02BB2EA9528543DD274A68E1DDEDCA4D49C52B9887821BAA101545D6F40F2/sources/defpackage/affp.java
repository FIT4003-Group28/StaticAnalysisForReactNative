package defpackage;

import android.content.Context;
/* renamed from: affp  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class affp {
    public static affr a(Context context) {
        synchronized (affq.class) {
            if (affq.a == null) {
                dbsk.l(affq.a == new affk(context.getApplicationContext()));
            }
        }
        affr affrVar = affq.a;
        dbsk.s(affrVar);
        return affrVar;
    }
}
