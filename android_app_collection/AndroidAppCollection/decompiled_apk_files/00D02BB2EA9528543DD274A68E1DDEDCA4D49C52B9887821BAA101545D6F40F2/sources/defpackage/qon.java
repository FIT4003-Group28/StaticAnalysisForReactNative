package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qon  reason: default package */
/* loaded from: classes7.dex */
public final class qon implements acnw {
    final /* synthetic */ qop a;

    public qon(qop qopVar) {
        this.a = qopVar;
    }

    @Override // defpackage.acnw
    public final void a(int i, int i2, boolean z, boolean z2) {
        qop qopVar = this.a;
        cqkp cqkpVar = qopVar.k;
        if (i2 == i || cqkpVar == null) {
            return;
        }
        qopVar.l.get(i).z();
        this.a.l.get(i2).x(cqkpVar);
        this.a.l.get(i2).y();
        qop qopVar2 = this.a;
        qopVar2.r = true;
        qopVar2.p();
        if (!z2 || !z) {
            return;
        }
        qop qopVar3 = this.a;
        qopVar3.i.m(new cjte(deaf.SWIPE), cjtd.a(qopVar3.h.p()));
    }
}
