package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: auzx  reason: default package */
/* loaded from: classes2.dex */
public final class auzx implements Runnable {
    final /* synthetic */ gga a;
    final /* synthetic */ avac b;
    final /* synthetic */ bvjj c;
    final /* synthetic */ auhi d;
    final /* synthetic */ Integer e;

    public auzx(gga ggaVar, avac avacVar, bvjj bvjjVar, auhi auhiVar, Integer num) {
        this.a = ggaVar;
        this.b = avacVar;
        this.c = bvjjVar;
        this.d = auhiVar;
        this.e = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (gei.a(this.a, this.b)) {
            avac.bn(this.c, this.d.h(this.e.intValue()), 1);
        }
    }
}
