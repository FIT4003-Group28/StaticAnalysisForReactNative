package defpackage;
/* compiled from: PG */
/* renamed from: acom  reason: default package */
/* loaded from: classes.dex */
final class acom implements acbr {
    final /* synthetic */ acor a;
    private boolean b;
    private boolean c;

    public acom(acor acorVar) {
        this.a = acorVar;
    }

    @Override // defpackage.acbr
    public final void a(acbt acbtVar) {
        acor acorVar = this.a;
        if (acbtVar == acorVar.m) {
            this.b = true;
        }
        if (acbtVar == acorVar.o) {
            this.c = true;
        }
        if (!this.b || !this.c) {
            return;
        }
        this.b = false;
        this.c = false;
        acorVar.b.removeCallbacks(acorVar.r);
        acor acorVar2 = this.a;
        acorVar2.b.post(acorVar2.q);
    }
}
