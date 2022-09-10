package defpackage;
/* compiled from: PG */
/* renamed from: acjv  reason: default package */
/* loaded from: classes2.dex */
public final class acjv extends dsqp<acjw, acjv> implements dssk {
    public acjv() {
        super(acjw.m);
    }

    public final void a(Iterable<? extends acjq> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        acjw acjwVar = (acjw) this.b;
        dsrg<Integer, acjq> dsrgVar = acjw.g;
        dsrf dsrfVar = acjwVar.f;
        if (!dsrfVar.a()) {
            acjwVar.f = dsqw.cg(dsrfVar);
        }
        for (acjq acjqVar : iterable) {
            acjwVar.f.h(acjqVar.e);
        }
    }
}
