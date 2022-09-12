package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: gkr  reason: default package */
/* loaded from: classes.dex */
public final class gkr<T> extends btrh<T> {
    public gkr(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        gkp gkpVar = (gkp) this.a;
        ege egeVar = (ege) obj;
        int i = egeVar.b;
        if (i == 1) {
            gkpVar.a.g().b();
            gkpVar.a.i = true;
        } else if (i != 3) {
        } else {
            gkq gkqVar = gkpVar.a;
            gkqVar.i = false;
            gkqVar.h = new WeakReference<>(egeVar.a);
            gkpVar.a.f();
        }
    }
}
