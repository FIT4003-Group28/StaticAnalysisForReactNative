package defpackage;
/* compiled from: PG */
/* renamed from: dmpo  reason: default package */
/* loaded from: classes.dex */
public final class dmpo extends dsqp<dmpp, dmpo> implements dssk {
    public dmpo() {
        super(dmpp.b);
    }

    public final void a(Iterable<? extends dmpn> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmpp dmppVar = (dmpp) this.b;
        dmpp dmppVar2 = dmpp.b;
        dmppVar.b();
        dsod.bv(iterable, dmppVar.a);
    }
}
