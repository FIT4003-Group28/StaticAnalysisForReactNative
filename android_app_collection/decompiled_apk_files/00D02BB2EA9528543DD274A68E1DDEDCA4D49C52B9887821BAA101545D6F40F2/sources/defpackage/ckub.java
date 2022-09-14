package defpackage;
/* compiled from: PG */
/* renamed from: ckub  reason: default package */
/* loaded from: classes4.dex */
public final class ckub implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ckuc b;

    public ckub(ckuc ckucVar, String str) {
        this.b = ckucVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ckuf ckufVar = this.b.a;
        String str = this.a;
        if (!ckufVar.i) {
            return;
        }
        ckufVar.c(str);
        ckufVar.d(str);
    }
}
