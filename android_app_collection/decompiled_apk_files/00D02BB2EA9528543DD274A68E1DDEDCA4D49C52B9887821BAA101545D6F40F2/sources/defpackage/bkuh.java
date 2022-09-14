package defpackage;
/* compiled from: PG */
/* renamed from: bkuh  reason: default package */
/* loaded from: classes3.dex */
public class bkuh implements bkuc {
    private final dwfl a;
    private final Runnable b;
    private final jic c;

    public bkuh(dwfl dwflVar, Runnable runnable, bbtu bbtuVar) {
        this.a = dwflVar;
        this.b = runnable;
        this.c = new jic(dwflVar.h, jfv.b(dwflVar), irg.e(), 0);
        Float f = (Float) bbtuVar.a(dwflVar, eaou.i()).E().h(bkug.a).c(Float.valueOf(0.75f));
    }

    @Override // defpackage.bkuc
    public jic a() {
        return this.c;
    }

    @Override // defpackage.bkuc
    public cqkl b() {
        this.b.run();
        return cqkl.a;
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof bkuh)) {
            return false;
        }
        return dbsd.a(this.a, ((bkuh) obj).a);
    }

    public int hashCode() {
        dwfl dwflVar = this.a;
        int i = dwflVar.bC;
        if (i != 0) {
            return i;
        }
        int c = dsst.a.b(dwflVar).c(dwflVar);
        dwflVar.bC = c;
        return c;
    }
}
