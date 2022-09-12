package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: book  reason: default package */
/* loaded from: classes3.dex */
public final class book implements Runnable {
    final /* synthetic */ boou a;
    final /* synthetic */ boou b;
    final /* synthetic */ boon c;

    public book(boon boonVar, boou boouVar, boou boouVar2) {
        this.c = boonVar;
        this.a = boouVar;
        this.b = boouVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a();
        this.a.W(this.b);
    }
}
