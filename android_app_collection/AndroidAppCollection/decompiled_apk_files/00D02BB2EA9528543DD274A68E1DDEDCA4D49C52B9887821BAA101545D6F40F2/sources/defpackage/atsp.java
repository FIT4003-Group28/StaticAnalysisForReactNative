package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: atsp  reason: default package */
/* loaded from: classes2.dex */
public final class atsp implements cree {
    boolean a = false;
    final /* synthetic */ atss b;

    public atsp(atss atssVar) {
        this.b = atssVar;
    }

    @Override // defpackage.cree
    public final void a(cred credVar) {
        atxy atxyVar;
        atss atssVar = this.b;
        if (atssVar.o) {
            return;
        }
        atssVar.w.c();
        if (((credVar == cred.CANCELLED && !this.a) || credVar == cred.NEVER_PLAYED) && !this.b.w.h()) {
            atss atssVar2 = this.b;
            atssVar2.w.d(atssVar2.x);
        }
        if (this.a && credVar.ordinal() == 2) {
            this.b.w();
        }
        atss atssVar3 = this.b;
        atssVar3.y = true;
        if (!atssVar3.w.c() || (atxyVar = this.b.u) == null) {
            return;
        }
        atxyVar.a();
    }

    @Override // defpackage.cree
    public final void b(long j) {
        atss atssVar = this.b;
        if (atssVar.o) {
            return;
        }
        long j2 = atssVar.x;
        if (j != -1) {
            j2 = Math.max(j, j2);
            this.b.v();
            this.a = true;
        }
        this.b.w.d(j2);
    }
}
