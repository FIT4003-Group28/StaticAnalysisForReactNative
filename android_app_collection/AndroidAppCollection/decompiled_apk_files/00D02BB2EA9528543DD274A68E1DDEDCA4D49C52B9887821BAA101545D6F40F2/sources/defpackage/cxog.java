package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: cxog  reason: default package */
/* loaded from: classes5.dex */
public final class cxog<T> {
    private T a;
    private WeakReference<T> b;
    private boolean c = false;
    private boolean d = true;

    public final synchronized T a() {
        if (!this.c) {
            this.c = true;
            cxoi.a(this);
        }
        T t = this.a;
        if (t != null) {
            return t;
        }
        WeakReference<T> weakReference = this.b;
        T t2 = weakReference == null ? null : weakReference.get();
        if (t2 == null) {
            t2 = (T) cztc.d();
            if (this.d) {
                this.a = t2;
                this.b = null;
            } else {
                this.b = new WeakReference<>(t2);
            }
        }
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        if (this.a != null) {
            return;
        }
        WeakReference<T> weakReference = this.b;
        T t = weakReference == null ? null : weakReference.get();
        if (t != null) {
            this.a = t;
        } else {
            this.b = null;
        }
    }
}
