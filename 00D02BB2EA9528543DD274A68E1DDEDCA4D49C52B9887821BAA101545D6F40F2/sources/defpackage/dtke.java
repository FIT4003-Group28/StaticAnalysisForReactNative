package defpackage;
/* compiled from: PG */
/* renamed from: dtke  reason: default package */
/* loaded from: classes6.dex */
public final class dtke extends dsqr<dtkf, dtke> implements dsqt {
    public dtke() {
        super(dtkf.n);
    }

    public final void a(String str) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dtkf dtkfVar = (dtkf) this.b;
        dtkf dtkfVar2 = dtkf.n;
        str.getClass();
        dsrj<String> dsrjVar = dtkfVar.c;
        if (!dsrjVar.a()) {
            dtkfVar.c = dsqw.cl(dsrjVar);
        }
        dtkfVar.c.add(str);
    }

    public final void b(String str) {
        if (this.c) {
            bF();
            this.c = false;
        }
        dtkf dtkfVar = (dtkf) this.b;
        dtkf dtkfVar2 = dtkf.n;
        str.getClass();
        dsrj<String> dsrjVar = dtkfVar.b;
        if (!dsrjVar.a()) {
            dtkfVar.b = dsqw.cl(dsrjVar);
        }
        dtkfVar.b.add(str);
    }
}
