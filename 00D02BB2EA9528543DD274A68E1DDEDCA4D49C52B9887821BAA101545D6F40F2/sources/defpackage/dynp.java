package defpackage;
/* compiled from: PG */
/* renamed from: dynp  reason: default package */
/* loaded from: classes6.dex */
final class dynp implements Runnable {
    final /* synthetic */ dyvk a;
    final /* synthetic */ dynu b;

    public dynp(dynu dynuVar, dyvk dyvkVar) {
        this.b = dynuVar;
        this.a = dyvkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.c(this.a);
    }
}
