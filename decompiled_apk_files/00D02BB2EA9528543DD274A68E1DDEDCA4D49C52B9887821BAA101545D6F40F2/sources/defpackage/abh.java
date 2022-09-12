package defpackage;

import android.database.Observable;
/* compiled from: PG */
/* renamed from: abh  reason: default package */
/* loaded from: classes.dex */
public final class abh extends Observable<abi> {
    public final boolean a() {
        return !this.mObservers.isEmpty();
    }

    public final void b() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((abi) this.mObservers.get(size)).a();
            } else {
                return;
            }
        }
    }

    public final void c(int i, int i2) {
        d(i, i2, null);
    }

    public final void d(int i, int i2, Object obj) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((abi) this.mObservers.get(size)).c(i, i2, obj);
            } else {
                return;
            }
        }
    }

    public final void e(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((abi) this.mObservers.get(size)).d(i, i2);
            } else {
                return;
            }
        }
    }

    public final void f(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((abi) this.mObservers.get(size)).e(i, i2);
            } else {
                return;
            }
        }
    }

    public final void g(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((abi) this.mObservers.get(size)).f(i, i2);
            } else {
                return;
            }
        }
    }
}
