package defpackage;
/* compiled from: PG */
/* renamed from: dmpk  reason: default package */
/* loaded from: classes.dex */
public final class dmpk extends dsqr<dmpn, dmpk> implements dsqt {
    public dmpk() {
        super(dmpn.r);
    }

    public final void a(Iterable<? extends Integer> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dmpn dmpnVar = (dmpn) this.b;
        dmpn dmpnVar2 = dmpn.r;
        dsrf dsrfVar = dmpnVar.o;
        if (!dsrfVar.a()) {
            dmpnVar.o = dsqw.cg(dsrfVar);
        }
        dsod.bv(iterable, dmpnVar.o);
    }
}
