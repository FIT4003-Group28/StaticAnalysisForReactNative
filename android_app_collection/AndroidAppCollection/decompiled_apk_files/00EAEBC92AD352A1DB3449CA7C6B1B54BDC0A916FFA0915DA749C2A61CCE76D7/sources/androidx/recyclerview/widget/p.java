package androidx.recyclerview.widget;

import android.view.View;
/* loaded from: classes.dex */
class p {

    /* renamed from: a  reason: collision with root package name */
    final b f2132a;

    /* renamed from: b  reason: collision with root package name */
    a f2133b = new a();

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f2134a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f2135b;

        /* renamed from: c  reason: collision with root package name */
        int f2136c;

        /* renamed from: d  reason: collision with root package name */
        int f2137d;

        /* renamed from: e  reason: collision with root package name */
        int f2138e;

        a() {
        }

        int a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        void a(int i) {
            this.f2134a = i | this.f2134a;
        }

        void a(int i, int i2, int i3, int i4) {
            this.f2135b = i;
            this.f2136c = i2;
            this.f2137d = i3;
            this.f2138e = i4;
        }

        boolean a() {
            int i = this.f2134a;
            if ((i & 7) == 0 || (i & (a(this.f2137d, this.f2135b) << 0)) != 0) {
                int i2 = this.f2134a;
                if ((i2 & 112) != 0 && (i2 & (a(this.f2137d, this.f2136c) << 4)) == 0) {
                    return false;
                }
                int i3 = this.f2134a;
                if ((i3 & 1792) != 0 && (i3 & (a(this.f2138e, this.f2135b) << 8)) == 0) {
                    return false;
                }
                int i4 = this.f2134a;
                return (i4 & 28672) == 0 || (i4 & (a(this.f2138e, this.f2136c) << 12)) != 0;
            }
            return false;
        }

        void b() {
            this.f2134a = 0;
        }
    }

    /* loaded from: classes.dex */
    interface b {
        int a();

        int a(View view);

        View a(int i);

        int b();

        int b(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(b bVar) {
        this.f2132a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(int i, int i2, int i3, int i4) {
        int b2 = this.f2132a.b();
        int a2 = this.f2132a.a();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a3 = this.f2132a.a(i);
            this.f2133b.a(b2, a2, this.f2132a.a(a3), this.f2132a.b(a3));
            if (i3 != 0) {
                this.f2133b.b();
                this.f2133b.a(i3);
                if (this.f2133b.a()) {
                    return a3;
                }
            }
            if (i4 != 0) {
                this.f2133b.b();
                this.f2133b.a(i4);
                if (this.f2133b.a()) {
                    view = a3;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(View view, int i) {
        this.f2133b.a(this.f2132a.b(), this.f2132a.a(), this.f2132a.a(view), this.f2132a.b(view));
        if (i != 0) {
            this.f2133b.b();
            this.f2133b.a(i);
            return this.f2133b.a();
        }
        return false;
    }
}
