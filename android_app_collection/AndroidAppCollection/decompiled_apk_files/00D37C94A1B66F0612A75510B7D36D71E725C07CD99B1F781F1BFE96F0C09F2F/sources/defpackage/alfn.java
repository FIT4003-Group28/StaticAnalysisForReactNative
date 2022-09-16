package defpackage;
/* compiled from: PG */
/* renamed from: alfn  reason: default package */
/* loaded from: classes.dex */
final class alfn implements ankb {
    final /* synthetic */ awyp a;
    final /* synthetic */ String b;
    final /* synthetic */ alfp c;

    public alfn(alfp alfpVar, awyp awypVar, String str) {
        this.c = alfpVar;
        this.a = awypVar;
        this.b = str;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        this.a.f();
        this.c.s(this.b, this.a, Double.POSITIVE_INFINITY);
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        akzs akzsVar = (akzs) obj;
    }
}
