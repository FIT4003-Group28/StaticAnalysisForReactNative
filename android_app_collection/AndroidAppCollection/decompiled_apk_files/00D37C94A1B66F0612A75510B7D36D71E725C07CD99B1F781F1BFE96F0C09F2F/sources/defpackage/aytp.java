package defpackage;
/* compiled from: PG */
/* renamed from: aytp  reason: default package */
/* loaded from: classes2.dex */
public final class aytp extends aynr {
    final aynu a;
    final ayor b;

    public aytp(aynu aynuVar, ayor ayorVar) {
        this.a = aynuVar;
        this.b = ayorVar;
    }

    @Override // defpackage.aynr
    protected final void V(ayns aynsVar) {
        ayto aytoVar = new ayto(aynsVar, this.a);
        aynsVar.sj(aytoVar);
        ayqi.i(aytoVar.b, this.b.f(aytoVar));
    }
}
