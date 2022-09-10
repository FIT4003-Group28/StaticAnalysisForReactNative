package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: brx  reason: default package */
/* loaded from: classes.dex */
public final class brx implements Runnable {
    final /* synthetic */ bsa a;

    public brx(bsa bsaVar) {
        this.a = bsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bsa bsaVar = this.a;
        bsaVar.c.a(bsaVar);
    }
}
