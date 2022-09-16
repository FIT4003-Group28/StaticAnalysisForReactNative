package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: p  reason: default package */
/* loaded from: classes4.dex */
public final class p implements Runnable {
    final /* synthetic */ s a;

    public p(s sVar) {
        this.a = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.a.b) {
            obj = this.a.d;
            this.a.d = s.a;
        }
        this.a.k(obj);
    }
}
