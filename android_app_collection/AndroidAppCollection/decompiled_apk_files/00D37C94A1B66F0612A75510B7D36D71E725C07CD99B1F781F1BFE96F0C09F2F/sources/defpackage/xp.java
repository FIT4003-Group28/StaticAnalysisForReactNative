package defpackage;

import android.database.Observable;
/* compiled from: PG */
/* renamed from: xp  reason: default package */
/* loaded from: classes4.dex */
public final class xp extends Observable {
    public final void a() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((lg) this.mObservers.get(size)).c();
            } else {
                return;
            }
        }
    }

    public final void b(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((lg) this.mObservers.get(size)).h(i, i2);
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
                ((lg) this.mObservers.get(size)).e(i, i2, obj);
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
                ((lg) this.mObservers.get(size)).f(i, i2);
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
                ((lg) this.mObservers.get(size)).g(i, i2);
            } else {
                return;
            }
        }
    }

    public final boolean g() {
        return !this.mObservers.isEmpty();
    }
}
