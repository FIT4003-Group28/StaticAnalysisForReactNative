package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: s  reason: default package */
/* loaded from: classes.dex */
public final class s implements Runnable {
    final /* synthetic */ v a;

    public s(v vVar) {
        this.a = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.a.a) {
            obj = this.a.e;
            this.a.e = v.b;
        }
        this.a.g(obj);
    }
}
