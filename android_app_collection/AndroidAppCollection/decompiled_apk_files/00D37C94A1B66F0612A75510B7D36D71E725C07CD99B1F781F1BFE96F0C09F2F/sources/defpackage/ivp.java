package defpackage;
/* compiled from: PG */
/* renamed from: ivp  reason: default package */
/* loaded from: classes3.dex */
final class ivp implements akev {
    final /* synthetic */ Runnable a;
    final /* synthetic */ ivq b;

    public ivp(ivq ivqVar, Runnable runnable) {
        this.b = ivqVar;
        this.a = runnable;
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void le(Object obj, int i) {
        akfq akfqVar = (akfq) obj;
        this.a.run();
    }

    @Override // defpackage.akev
    public final /* bridge */ /* synthetic */ void lf(Object obj) {
        akfq akfqVar = (akfq) obj;
        ivq ivqVar = this.b;
        ivqVar.a.b(ivqVar.b.h);
    }
}
