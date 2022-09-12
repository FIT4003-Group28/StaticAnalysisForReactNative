package defpackage;
/* compiled from: PG */
/* renamed from: afjp  reason: default package */
/* loaded from: classes2.dex */
final class afjp implements Runnable {
    final /* synthetic */ afjr a;

    public afjp(afjr afjrVar) {
        this.a = afjrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a.c.a()) {
            this.a.a.a().k();
        }
    }
}
