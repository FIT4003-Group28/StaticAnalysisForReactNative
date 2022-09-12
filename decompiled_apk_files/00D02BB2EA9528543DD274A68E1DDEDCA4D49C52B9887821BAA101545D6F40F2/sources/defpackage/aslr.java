package defpackage;
/* compiled from: PG */
/* renamed from: aslr  reason: default package */
/* loaded from: classes2.dex */
final class aslr implements Runnable {
    final /* synthetic */ asls a;

    public aslr(asls aslsVar) {
        this.a = aslsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        asls aslsVar = this.a;
        if (this == aslsVar.a) {
            aslsVar.a();
        }
    }
}
