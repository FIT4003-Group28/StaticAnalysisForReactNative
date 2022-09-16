package defpackage;
/* compiled from: PG */
/* renamed from: cgdj  reason: default package */
/* loaded from: classes4.dex */
public final class cgdj implements Runnable {
    final /* synthetic */ cgwg a;
    final /* synthetic */ cgwi b;
    final /* synthetic */ cgdv c;

    public cgdj(cgdv cgdvVar, cgwg cgwgVar, cgwi cgwiVar) {
        this.c = cgdvVar;
        this.a = cgwgVar;
        this.b = cgwiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.aV(this.a, this.b);
    }
}
