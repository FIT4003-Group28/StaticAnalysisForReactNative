package defpackage;
/* compiled from: PG */
/* renamed from: azae  reason: default package */
/* loaded from: classes2.dex */
public final class azae extends ayua {
    final aypx c;
    final bamd d;

    public azae(aynx aynxVar, aypx aypxVar, bamd bamdVar) {
        super(aynxVar);
        this.c = aypxVar;
        this.d = bamdVar;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        azqa azqaVar = new azqa(bameVar);
        azad azadVar = new azad(azqaVar, this.c);
        azqaVar.f(azadVar);
        this.d.ad(new azac(azadVar));
        this.b.ac(azadVar);
    }
}
