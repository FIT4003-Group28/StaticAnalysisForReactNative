package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: otn  reason: default package */
/* loaded from: classes4.dex */
public final class otn implements Runnable {
    final /* synthetic */ otq a;
    final /* synthetic */ ots b;

    public otn(ots otsVar, otq otqVar) {
        this.b = otsVar;
        this.a = otqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.b(this.a);
    }
}
