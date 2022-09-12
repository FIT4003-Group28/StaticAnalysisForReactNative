package defpackage;

import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: cnem  reason: default package */
/* loaded from: classes5.dex */
final class cnem<V> {
    private final cnek<V> a;
    private final cnel<V> b;
    private V c = null;

    public cnem(cnek<V> cnekVar, cnel<V> cnelVar) {
        this.a = cnekVar;
        this.b = cnelVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(cnel<V> cnelVar) {
        if (this.c == null) {
            this.c = this.a.a();
        }
        cnelVar.a(this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(cnej<V> cnejVar) {
        V v = this.c;
        if (v != null) {
            cnejVar.a(v);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        V v = this.c;
        if (v != null) {
            try {
                this.b.a(v);
            } catch (RemoteException | IllegalStateException unused) {
            }
            this.c = null;
        }
    }
}
