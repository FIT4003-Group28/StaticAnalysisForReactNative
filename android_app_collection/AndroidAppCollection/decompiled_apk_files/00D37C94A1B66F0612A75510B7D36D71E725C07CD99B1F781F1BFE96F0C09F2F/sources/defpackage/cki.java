package defpackage;
/* compiled from: PG */
/* renamed from: cki  reason: default package */
/* loaded from: classes2.dex */
public final class cki {
    public final ckf a;
    public final ckx b;
    public final ckd c;
    public final cjl d;
    public final cmc e;
    public final jmm f;
    public final ake g;
    private final ckg h;

    public cki(cmc cmcVar, cls clsVar, cmm cmmVar, cmm cmmVar2, cmm cmmVar3, boolean z) {
        this.e = cmcVar;
        ckg ckgVar = new ckg(clsVar);
        this.h = ckgVar;
        cjl cjlVar = new cjl(z);
        this.d = cjlVar;
        synchronized (this) {
            synchronized (cjlVar) {
                cjlVar.e = this;
            }
        }
        this.g = new ake();
        this.f = new jmm();
        this.a = new ckf(cmmVar, cmmVar2, cmmVar3, this, this);
        this.c = new ckd(ckgVar);
        this.b = new ckx();
        cmcVar.a = this;
    }

    public final synchronized void a(ckm ckmVar, chy chyVar) {
        this.f.b(chyVar, ckmVar);
    }

    public final synchronized void b(ckm ckmVar, chy chyVar, cko ckoVar) {
        if (ckoVar != null) {
            if (ckoVar.a) {
                this.d.b(chyVar, ckoVar);
            }
        }
        this.f.b(chyVar, ckmVar);
    }

    public final void c(chy chyVar, cko ckoVar) {
        this.d.d(chyVar);
        if (ckoVar.a) {
            this.e.d(chyVar, ckoVar);
        } else {
            this.b.a(ckoVar, false);
        }
    }
}
