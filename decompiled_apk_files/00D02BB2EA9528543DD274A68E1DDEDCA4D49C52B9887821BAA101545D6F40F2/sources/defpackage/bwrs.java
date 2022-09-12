package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bwrs  reason: default package */
/* loaded from: classes.dex */
public class bwrs<T extends Serializable> implements Serializable {
    private static final dcqe c = dcqe.c("bwrs");
    bwqj a;
    private transient T d;
    private transient boolean e;
    private transient boolean f;
    private transient bvrb g;
    public transient String b = "";
    private transient List<bwrr<? super T>> h = dcdc.e();

    public bwrs(@dzsi bwqj bwqjVar, @dzsi T t, boolean z, boolean z2) {
        if (bwqjVar != null) {
            this.a = bwqjVar;
        }
        this.d = t;
        this.e = z;
        this.f = z2;
    }

    public static <T extends Serializable> bwrs<T> a(@dzsi T t) {
        return new bwrs<>(null, t, true, true);
    }

    @dzsi
    public static <T extends Serializable> T b(@dzsi bwrs<T> bwrsVar) {
        if (bwrsVar != null) {
            return bwrsVar.c();
        }
        return null;
    }

    private final void k() {
        if (this.h.isEmpty()) {
            return;
        }
        if (this.g == null) {
            bvoo.h("scheduleNotifyStorageListeners: storageListeners is non-empty, but threadPoolService is null", new Object[0]);
            return;
        }
        final T t = this.d;
        final ArrayList c2 = dchl.c(this.h);
        Runnable runnable = new Runnable(this, t, c2) { // from class: bwrp
            private final bwrs a;
            private final Serializable b;
            private final List c;

            {
                this.a = this;
                this.b = t;
                this.c = c2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.j(this.b, this.c);
            }
        };
        if (bvrj.UI_THREAD.b()) {
            runnable.run();
        } else {
            this.g.b(runnable, bvrj.UI_THREAD);
        }
    }

    private final synchronized boolean l(bwrr<? super T> bwrrVar) {
        return this.h.contains(bwrrVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        if (!(objectInputStream instanceof bwrt)) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
            sb.append("Deserialize StorageReferences using GmmStorage#getSerializable: ");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
        objectInputStream.defaultReadObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        if (!(objectOutputStream instanceof bwru)) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
            sb.append("Serialize StorageReferences using GmmStorage#putSerializable: ");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
        objectOutputStream.defaultWriteObject();
    }

    @dzsi
    public final synchronized T c() {
        while (!this.e) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return this.d;
    }

    public final synchronized void d(T t) {
        this.d = t;
        this.f = true;
        if (!this.e) {
            this.e = true;
            notifyAll();
        }
        k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(bwqv bwqvVar) {
        bwqvVar.a(this, bwqi.BUNDLED);
        if (this.f) {
            this.f = false;
            bwqj bwqjVar = this.a;
            dbsk.s(bwqjVar);
            bwqvVar.u(bwqjVar, this.d);
            return;
        }
        dbsk.s(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void f(@dzsi Serializable serializable) {
        bvrj.GMM_STORAGE.c();
        if (this.e) {
            return;
        }
        this.d = serializable;
        this.e = true;
        notifyAll();
        k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(bwrr<? super T> bwrrVar, bvrb bvrbVar) {
        h(bwrrVar, bvrbVar, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void h(final bwrr<? super T> bwrrVar, bvrb bvrbVar, boolean z) {
        if (this.g == null) {
            this.g = bvrbVar;
            this.h = dchl.a();
        }
        this.h.add(bwrrVar);
        if (z) {
            if (!this.e) {
                return;
            }
            final T t = this.d;
            Runnable runnable = new Runnable(this, t, bwrrVar) { // from class: bwrq
                private final bwrs a;
                private final Serializable b;
                private final bwrr c;

                {
                    this.a = this;
                    this.b = t;
                    this.c = bwrrVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.j(this.b, dcdc.f(this.c));
                }
            };
            if (bvrj.UI_THREAD.b()) {
                runnable.run();
            } else {
                bvrbVar.b(runnable, bvrj.UI_THREAD);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void i(bwrr<? super T> bwrrVar) {
        if (this.h.isEmpty() || !this.h.remove(bwrrVar)) {
            bvoo.h("StorageListener is not found.", new Object[0]);
        }
    }

    public final void j(@dzsi T t, List<bwrr<? super T>> list) {
        bvrj.UI_THREAD.c();
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
        sb.append("StorageReference.notifyStorageListeners(");
        sb.append(str);
        sb.append(")");
        sb.toString();
        for (bwrr<? super T> bwrrVar : list) {
            if (l(bwrrVar)) {
                bwrrVar.PV(t);
            }
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("StorageReference(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
