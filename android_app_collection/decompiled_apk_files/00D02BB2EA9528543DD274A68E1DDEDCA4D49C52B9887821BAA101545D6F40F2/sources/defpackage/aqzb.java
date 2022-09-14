package defpackage;
/* compiled from: PG */
/* renamed from: aqzb  reason: default package */
/* loaded from: classes2.dex */
final class aqzb implements axrw {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ aqzc c;

    public aqzb(aqzc aqzcVar, boolean z, boolean z2) {
        this.c = aqzcVar;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.axrw
    public final void a(int i) {
        if (i == 0) {
            aqza aqzaVar = new aqza(this);
            if (this.b) {
                this.c.k.a().j(aqzaVar);
            } else {
                this.c.k.a().f(this.c.p.h().b(), aqzaVar);
            }
        }
    }
}
