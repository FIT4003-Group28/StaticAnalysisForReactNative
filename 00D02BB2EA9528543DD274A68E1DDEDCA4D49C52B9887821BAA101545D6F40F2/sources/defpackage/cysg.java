package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cysg  reason: default package */
/* loaded from: classes5.dex */
public final class cysg extends cysd {
    private final bn a;
    private final bc<cysn> b;
    private final bt c;

    public cysg(bn bnVar) {
        this.a = bnVar;
        this.b = new cyse(bnVar);
        this.c = new cysf(bnVar);
    }

    @Override // defpackage.cysm
    public final void a(List<cysn> list) {
        this.a.E();
        this.a.F();
        try {
            this.b.b(list);
            this.a.l();
        } finally {
            this.a.k();
        }
    }

    @Override // defpackage.cysm
    public final void b() {
        this.a.E();
        awj e = this.c.e();
        this.a.F();
        try {
            e.a();
            this.a.l();
        } finally {
            this.a.k();
            this.c.f(e);
        }
    }
}
