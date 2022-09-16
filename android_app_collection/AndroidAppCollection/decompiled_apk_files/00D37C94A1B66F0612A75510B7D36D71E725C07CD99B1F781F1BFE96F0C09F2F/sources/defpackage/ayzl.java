package defpackage;
/* compiled from: PG */
/* renamed from: ayzl  reason: default package */
/* loaded from: classes2.dex */
public final class ayzl extends ayua {
    final ayor c;
    final boolean d;

    public ayzl(aynx aynxVar, ayor ayorVar, boolean z) {
        super(aynxVar);
        this.c = ayorVar;
        this.d = z;
    }

    @Override // defpackage.aynx
    public final void ae(bame bameVar) {
        ayoq a = this.c.a();
        ayzk ayzkVar = new ayzk(bameVar, a, this.b, this.d);
        bameVar.f(ayzkVar);
        a.a(ayzkVar);
    }
}
