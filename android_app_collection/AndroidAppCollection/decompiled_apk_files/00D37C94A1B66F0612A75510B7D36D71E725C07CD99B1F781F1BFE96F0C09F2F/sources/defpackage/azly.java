package defpackage;
/* compiled from: PG */
/* renamed from: azly  reason: default package */
/* loaded from: classes2.dex */
public final class azly extends ayos {
    final ayov a;
    final ayor b;

    public azly(ayov ayovVar, ayor ayorVar) {
        this.a = ayovVar;
        this.b = ayorVar;
    }

    @Override // defpackage.ayos
    protected final void X(ayot ayotVar) {
        azlx azlxVar = new azlx(ayotVar, this.a);
        ayotVar.sj(azlxVar);
        ayqi.i(azlxVar.b, this.b.f(azlxVar));
    }
}
