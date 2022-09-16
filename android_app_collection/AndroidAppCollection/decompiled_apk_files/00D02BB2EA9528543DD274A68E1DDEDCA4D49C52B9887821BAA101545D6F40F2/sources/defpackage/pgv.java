package defpackage;
/* compiled from: PG */
/* renamed from: pgv  reason: default package */
/* loaded from: classes7.dex */
public final class pgv extends dsqp<pgw, pgv> implements dssk {
    public pgv() {
        super(pgw.e);
    }

    public final void a(Iterable<? extends dsyl> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        pgw pgwVar = (pgw) this.b;
        dsrg<Integer, dsyl> dsrgVar = pgw.c;
        dsrf dsrfVar = pgwVar.b;
        if (!dsrfVar.a()) {
            pgwVar.b = dsqw.cg(dsrfVar);
        }
        for (dsyl dsylVar : iterable) {
            pgwVar.b.h(dsylVar.Y);
        }
    }
}
