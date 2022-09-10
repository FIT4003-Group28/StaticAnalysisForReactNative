package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdba  reason: default package */
/* loaded from: classes3.dex */
public final class bdba implements jco {
    final /* synthetic */ bdbb a;
    private final cjqy b;
    private final jco c;

    public bdba(bdbb bdbbVar, cjqy cjqyVar, jco jcoVar) {
        this.a = bdbbVar;
        this.b = cjqyVar;
        this.c = jcoVar;
    }

    @Override // defpackage.jco
    public final void a(int i, boolean z) {
        bdar bdarVar = this.a.b;
        if (bdarVar != null) {
            bdarVar.m();
        }
        dead deadVar = i > this.a.c ? dead.LEFT : dead.RIGHT;
        bdbb bdbbVar = this.a;
        bdbbVar.c = i;
        cqkx.p(bdbbVar);
        bdbb bdbbVar2 = this.a;
        bdbbVar2.b = bdbbVar2.g(bdbbVar2.c);
        bdar bdarVar2 = this.a.b;
        if (bdarVar2 != null) {
            bdarVar2.l();
            if (z) {
                this.b.n(cjql.a, new cjte(deaf.SWIPE, deadVar), this.a.b.k());
            }
        }
        this.a.Qf();
        this.c.a(i, z);
    }

    @Override // defpackage.jco
    public final void b(int i) {
    }
}
