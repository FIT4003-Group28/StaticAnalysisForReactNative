package defpackage;
/* compiled from: PG */
/* renamed from: qif  reason: default package */
/* loaded from: classes7.dex */
public final class qif {
    public final ckmp a;
    private final ckcw b;
    @dzsi
    private ckcq c;
    @dzsi
    private ckcq d;

    public qif(ckcw ckcwVar, ckmp ckmpVar) {
        this.b = ckcwVar;
        this.a = ckmpVar;
    }

    public final synchronized void a() {
        if (this.c != null && this.d != null) {
            bvmo.b(ddda.co);
        }
        this.c = null;
        this.d = null;
    }

    public final synchronized void b() {
        this.c = ((ckcr) this.b.a(ckeq.o)).a();
        this.d = ((ckcr) this.b.a(ckeq.p)).a();
        bvmo.b(ddda.cr);
        this.a.a(ckmk.DIRECTIONS_SEARCH);
    }

    public final synchronized void c(boolean z) {
        if (z) {
            ckcq ckcqVar = this.c;
            if (ckcqVar != null) {
                ckcqVar.b();
                ckcqVar.c();
                bvmo.b(ddda.cp);
                this.c = null;
            }
        } else {
            ckcq ckcqVar2 = this.d;
            if (ckcqVar2 != null) {
                ckcqVar2.b();
                ckcqVar2.c();
                bvmo.b(ddda.cq);
                this.c = null;
                this.d = null;
            }
        }
        this.a.c(ckmk.DIRECTIONS_SEARCH, ckmo.OK);
    }
}
