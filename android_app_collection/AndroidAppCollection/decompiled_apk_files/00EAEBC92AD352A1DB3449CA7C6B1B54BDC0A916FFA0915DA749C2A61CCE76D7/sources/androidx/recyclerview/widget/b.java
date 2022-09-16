package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    final InterfaceC0054b f2035a;

    /* renamed from: b  reason: collision with root package name */
    final a f2036b = new a();

    /* renamed from: c  reason: collision with root package name */
    final List<View> f2037c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f2038a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f2039b;

        a() {
        }

        private void b() {
            if (this.f2039b == null) {
                this.f2039b = new a();
            }
        }

        void a() {
            this.f2038a = 0L;
            a aVar = this.f2039b;
            if (aVar != null) {
                aVar.a();
            }
        }

        void a(int i) {
            if (i < 64) {
                this.f2038a &= ~(1 << i);
                return;
            }
            a aVar = this.f2039b;
            if (aVar == null) {
                return;
            }
            aVar.a(i - 64);
        }

        void a(int i, boolean z) {
            if (i >= 64) {
                b();
                this.f2039b.a(i - 64, z);
                return;
            }
            boolean z2 = (this.f2038a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f2038a;
            this.f2038a = ((j2 & (~j)) << 1) | (j2 & j);
            if (z) {
                e(i);
            } else {
                a(i);
            }
            if (!z2 && this.f2039b == null) {
                return;
            }
            b();
            this.f2039b.a(0, z2);
        }

        int b(int i) {
            a aVar = this.f2039b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f2038a) : Long.bitCount(this.f2038a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f2038a & ((1 << i) - 1)) : aVar.b(i - 64) + Long.bitCount(this.f2038a);
        }

        boolean c(int i) {
            if (i < 64) {
                return (this.f2038a & (1 << i)) != 0;
            }
            b();
            return this.f2039b.c(i - 64);
        }

        boolean d(int i) {
            if (i >= 64) {
                b();
                return this.f2039b.d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f2038a & j) != 0;
            this.f2038a &= ~j;
            long j2 = j - 1;
            long j3 = this.f2038a;
            this.f2038a = Long.rotateRight(j3 & (~j2), 1) | (j3 & j2);
            a aVar = this.f2039b;
            if (aVar != null) {
                if (aVar.c(0)) {
                    e(63);
                }
                this.f2039b.d(0);
            }
            return z;
        }

        void e(int i) {
            if (i < 64) {
                this.f2038a |= 1 << i;
                return;
            }
            b();
            this.f2039b.e(i - 64);
        }

        public String toString() {
            if (this.f2039b == null) {
                return Long.toBinaryString(this.f2038a);
            }
            return this.f2039b.toString() + "xx" + Long.toBinaryString(this.f2038a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0054b {
        int a();

        View a(int i);

        void a(View view);

        void a(View view, int i);

        void a(View view, int i, ViewGroup.LayoutParams layoutParams);

        RecyclerView.d0 b(View view);

        void b();

        void b(int i);

        void c(int i);

        void c(View view);

        int d(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(InterfaceC0054b interfaceC0054b) {
        this.f2035a = interfaceC0054b;
    }

    private int f(int i) {
        if (i < 0) {
            return -1;
        }
        int a2 = this.f2035a.a();
        int i2 = i;
        while (i2 < a2) {
            int b2 = i - (i2 - this.f2036b.b(i2));
            if (b2 == 0) {
                while (this.f2036b.c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    private void g(View view) {
        this.f2037c.add(view);
        this.f2035a.a(view);
    }

    private boolean h(View view) {
        if (this.f2037c.remove(view)) {
            this.f2035a.c(view);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f2035a.a() - this.f2037c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        int f2 = f(i);
        this.f2036b.d(f2);
        this.f2035a.b(f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view) {
        int d2 = this.f2035a.d(view);
        if (d2 >= 0) {
            this.f2036b.e(d2);
            g(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int a2 = i < 0 ? this.f2035a.a() : f(i);
        this.f2036b.a(a2, z);
        if (z) {
            g(view);
        }
        this.f2035a.a(view, a2, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int i, boolean z) {
        int a2 = i < 0 ? this.f2035a.a() : f(i);
        this.f2036b.a(a2, z);
        if (z) {
            g(view);
        }
        this.f2035a.a(view, a2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, boolean z) {
        a(view, -1, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f2035a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(View view) {
        int d2 = this.f2035a.d(view);
        if (d2 != -1 && !this.f2036b.c(d2)) {
            return d2 - this.f2036b.b(d2);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View b(int i) {
        int size = this.f2037c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2037c.get(i2);
            RecyclerView.d0 b2 = this.f2035a.b(view);
            if (b2.i() == i && !b2.o() && !b2.q()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View c(int i) {
        return this.f2035a.a(f(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f2036b.a();
        for (int size = this.f2037c.size() - 1; size >= 0; size--) {
            this.f2035a.c(this.f2037c.get(size));
            this.f2037c.remove(size);
        }
        this.f2035a.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(View view) {
        return this.f2037c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View d(int i) {
        return this.f2035a.a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(View view) {
        int d2 = this.f2035a.d(view);
        if (d2 < 0) {
            return;
        }
        if (this.f2036b.d(d2)) {
            h(view);
        }
        this.f2035a.c(d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(int i) {
        int f2 = f(i);
        View a2 = this.f2035a.a(f2);
        if (a2 == null) {
            return;
        }
        if (this.f2036b.d(f2)) {
            h(a2);
        }
        this.f2035a.c(f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(View view) {
        int d2 = this.f2035a.d(view);
        if (d2 == -1) {
            h(view);
            return true;
        } else if (!this.f2036b.c(d2)) {
            return false;
        } else {
            this.f2036b.d(d2);
            h(view);
            this.f2035a.c(d2);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(View view) {
        int d2 = this.f2035a.d(view);
        if (d2 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f2036b.c(d2)) {
            this.f2036b.a(d2);
            h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f2036b.toString() + ", hidden list:" + this.f2037c.size();
    }
}
