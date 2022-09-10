package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: auez  reason: default package */
/* loaded from: classes.dex */
public final class auez<T> extends btrh<T> {
    public auez(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        aufc aufcVar;
        GmmLocation a = ((amqo) obj).a();
        auey aueyVar = ((auex) this.a).a;
        bvrj.UI_THREAD.c();
        boolean d = aueyVar.d();
        if (a == null) {
            aueyVar.d = false;
            aueyVar.c = false;
        } else {
            aueyVar.d = aueyVar.a.a(a) == 1;
            if (a.g()) {
                aueyVar.c = true;
            } else {
                amvw x = a.x();
                if (x == null || x.h() < 0.1d) {
                    aueyVar.c = false;
                }
            }
        }
        if (d == aueyVar.d() || (aufcVar = aueyVar.b) == null) {
            return;
        }
        aufcVar.g();
    }
}
