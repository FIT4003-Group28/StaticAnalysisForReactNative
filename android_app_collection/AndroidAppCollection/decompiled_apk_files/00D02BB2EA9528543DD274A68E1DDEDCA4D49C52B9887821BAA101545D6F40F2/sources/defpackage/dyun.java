package defpackage;
/* compiled from: PG */
/* renamed from: dyun  reason: default package */
/* loaded from: classes6.dex */
final class dyun implements Runnable {
    final /* synthetic */ dyur a;
    final /* synthetic */ dyuq b;

    public dyun(dyuq dyuqVar, dyur dyurVar) {
        this.b = dyuqVar;
        this.a = dyurVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.u(this.a);
    }
}
