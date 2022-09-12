package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpcl  reason: default package */
/* loaded from: classes3.dex */
public final class bpcl implements degu<Boolean> {
    final /* synthetic */ bpcq a;

    public bpcl(bpcq bpcqVar) {
        this.a = bpcqVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bvoo.f(new RuntimeException(th));
        this.a.e(false);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        this.a.e(bool.booleanValue());
    }
}
