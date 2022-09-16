package defpackage;
/* compiled from: PG */
/* renamed from: alto  reason: default package */
/* loaded from: classes.dex */
final class alto implements Runnable {
    public final akpq a;
    public final akzh b;
    final /* synthetic */ altp c;

    public alto(altp altpVar, akzh akzhVar, akpq akpqVar) {
        this.c = altpVar;
        this.b = akzhVar;
        this.a = akpqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this);
        this.c.m(this.b);
    }
}
