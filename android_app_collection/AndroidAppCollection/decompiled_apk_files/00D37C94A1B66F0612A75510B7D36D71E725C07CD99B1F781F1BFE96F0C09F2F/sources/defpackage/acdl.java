package defpackage;
/* compiled from: PG */
/* renamed from: acdl  reason: default package */
/* loaded from: classes.dex */
final class acdl extends Thread {
    final /* synthetic */ acdn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acdl(acdn acdnVar) {
        super("rtmpOutput");
        this.a = acdnVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.a.b();
    }
}
