package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: otp  reason: default package */
/* loaded from: classes4.dex */
public final class otp implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ ots d;

    public otp(ots otsVar, String str, long j, long j2) {
        this.d = otsVar;
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.c.c(this.a, this.b, this.c);
    }
}
