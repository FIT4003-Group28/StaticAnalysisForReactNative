package defpackage;
/* compiled from: PG */
/* renamed from: amec  reason: default package */
/* loaded from: classes2.dex */
public final class amec extends byn {
    private final ckcw b;
    private final boolean c;

    public amec(long j, ckcw ckcwVar, boolean z) {
        super(j);
        this.b = ckcwVar;
        this.c = z;
    }

    @Override // defpackage.byn
    public final synchronized bxd<?> c(btw btwVar) {
        bxd<?> bxdVar;
        bxdVar = (bxd) super.h(btwVar);
        if (this.c) {
            ((ckcm) this.b.a(ckja.ao)).a(bxdVar != null);
        }
        return bxdVar;
    }

    @Override // defpackage.byn
    public final /* bridge */ /* synthetic */ void d(btw btwVar, bxd bxdVar) {
        bxd bxdVar2 = (bxd) super.g(btwVar, bxdVar);
    }
}
