package defpackage;
/* compiled from: PG */
/* renamed from: gew  reason: default package */
/* loaded from: classes.dex */
public abstract class gew extends ges {
    public akxp a;
    public dxio<hwd> b;
    private cryz<akox> c;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void Qm();

    @Override // defpackage.ges, defpackage.fd
    public void s() {
        super.s();
        dehn<akox> n = this.b.a().n();
        if (n != null) {
            this.c = bvqj.d(n, new bvqg(this) { // from class: get
                private final gew a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    gew gewVar = this.a;
                    gewVar.a = new gev(gewVar, ((akox) obj).j());
                    gewVar.a.b();
                }
            }, dege.a);
        } else {
            dbsk.l(false);
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public void u() {
        cryz<akox> cryzVar = this.c;
        if (cryzVar != null) {
            cryzVar.c();
        } else {
            dbsk.l(false);
        }
        akxp akxpVar = this.a;
        if (akxpVar != null) {
            akxpVar.c();
        }
        super.u();
    }
}
