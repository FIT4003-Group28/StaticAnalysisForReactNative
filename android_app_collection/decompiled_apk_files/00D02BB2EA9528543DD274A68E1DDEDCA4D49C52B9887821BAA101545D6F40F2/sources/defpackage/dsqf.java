package defpackage;
/* compiled from: PG */
/* renamed from: dsqf  reason: default package */
/* loaded from: classes6.dex */
public final class dsqf extends dsqp<dsqg, dsqf> implements dssk {
    public dsqf() {
        super(dsqg.b);
    }

    public final void a(Iterable<String> iterable) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dsqg dsqgVar = (dsqg) this.b;
        dsqg dsqgVar2 = dsqg.b;
        dsqgVar.c();
        dsod.bv(iterable, dsqgVar.a);
    }

    public final void b(String str) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dsqg dsqgVar = (dsqg) this.b;
        dsqg dsqgVar2 = dsqg.b;
        str.getClass();
        dsqgVar.c();
        dsqgVar.a.add(str);
    }
}
