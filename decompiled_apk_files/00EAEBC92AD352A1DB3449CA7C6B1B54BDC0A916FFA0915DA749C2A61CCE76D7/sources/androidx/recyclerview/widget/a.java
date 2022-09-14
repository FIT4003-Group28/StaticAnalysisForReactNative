package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a implements j.a {

    /* renamed from: a  reason: collision with root package name */
    private androidx.core.util.e<b> f2023a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f2024b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b> f2025c;

    /* renamed from: d  reason: collision with root package name */
    final InterfaceC0053a f2026d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f2027e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f2028f;

    /* renamed from: g  reason: collision with root package name */
    final j f2029g;

    /* renamed from: h  reason: collision with root package name */
    private int f2030h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0053a {
        RecyclerView.d0 a(int i);

        void a(int i, int i2);

        void a(int i, int i2, Object obj);

        void a(b bVar);

        void b(int i, int i2);

        void b(b bVar);

        void c(int i, int i2);

        void d(int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        int f2031a;

        /* renamed from: b  reason: collision with root package name */
        int f2032b;

        /* renamed from: c  reason: collision with root package name */
        Object f2033c;

        /* renamed from: d  reason: collision with root package name */
        int f2034d;

        b(int i, int i2, int i3, Object obj) {
            this.f2031a = i;
            this.f2032b = i2;
            this.f2034d = i3;
            this.f2033c = obj;
        }

        String a() {
            int i = this.f2031a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f2031a;
            if (i != bVar.f2031a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f2034d - this.f2032b) == 1 && this.f2034d == bVar.f2032b && this.f2032b == bVar.f2034d) {
                return true;
            }
            if (this.f2034d != bVar.f2034d || this.f2032b != bVar.f2032b) {
                return false;
            }
            Object obj2 = this.f2033c;
            Object obj3 = bVar.f2033c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2031a * 31) + this.f2032b) * 31) + this.f2034d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f2032b + "c:" + this.f2034d + ",p:" + this.f2033c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(InterfaceC0053a interfaceC0053a) {
        this(interfaceC0053a, false);
    }

    a(InterfaceC0053a interfaceC0053a, boolean z) {
        this.f2023a = new Pools$SimplePool(30);
        this.f2024b = new ArrayList<>();
        this.f2025c = new ArrayList<>();
        this.f2030h = 0;
        this.f2026d = interfaceC0053a;
        this.f2028f = z;
        this.f2029g = new j(this);
    }

    private int b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        for (int size = this.f2025c.size() - 1; size >= 0; size--) {
            b bVar = this.f2025c.get(size);
            int i7 = bVar.f2031a;
            if (i7 == 8) {
                int i8 = bVar.f2032b;
                int i9 = bVar.f2034d;
                if (i8 >= i9) {
                    i9 = i8;
                    i8 = i9;
                }
                if (i < i8 || i > i9) {
                    int i10 = bVar.f2032b;
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.f2032b = i10 + 1;
                            i4 = bVar.f2034d + 1;
                        } else if (i2 == 2) {
                            bVar.f2032b = i10 - 1;
                            i4 = bVar.f2034d - 1;
                        }
                        bVar.f2034d = i4;
                    }
                } else {
                    int i11 = bVar.f2032b;
                    if (i8 == i11) {
                        if (i2 == 1) {
                            i6 = bVar.f2034d + 1;
                        } else {
                            if (i2 == 2) {
                                i6 = bVar.f2034d - 1;
                            }
                            i++;
                        }
                        bVar.f2034d = i6;
                        i++;
                    } else {
                        if (i2 == 1) {
                            i5 = i11 + 1;
                        } else {
                            if (i2 == 2) {
                                i5 = i11 - 1;
                            }
                            i--;
                        }
                        bVar.f2032b = i5;
                        i--;
                    }
                }
            } else {
                int i12 = bVar.f2032b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.f2032b = i3;
                } else if (i7 == 1) {
                    i -= bVar.f2034d;
                } else if (i7 == 2) {
                    i += bVar.f2034d;
                }
            }
        }
        for (int size2 = this.f2025c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f2025c.get(size2);
            if (bVar2.f2031a == 8) {
                int i13 = bVar2.f2034d;
                if (i13 != bVar2.f2032b && i13 >= 0) {
                }
                this.f2025c.remove(size2);
                a(bVar2);
            } else {
                if (bVar2.f2034d > 0) {
                }
                this.f2025c.remove(size2);
                a(bVar2);
            }
        }
        return i;
    }

    private void b(b bVar) {
        g(bVar);
    }

    private void c(b bVar) {
        g(bVar);
    }

    private void d(b bVar) {
        boolean z;
        char c2;
        int i = bVar.f2032b;
        int i2 = bVar.f2034d + i;
        int i3 = 0;
        char c3 = 65535;
        int i4 = i;
        while (i4 < i2) {
            if (this.f2026d.a(i4) != null || d(i4)) {
                if (c3 == 0) {
                    f(a(2, i, i3, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    g(a(2, i, i3, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 0;
            }
            if (z) {
                i4 -= i3;
                i2 -= i3;
                i3 = 1;
            } else {
                i3++;
            }
            i4++;
            c3 = c2;
        }
        if (i3 != bVar.f2034d) {
            a(bVar);
            bVar = a(2, i, i3, null);
        }
        if (c3 == 0) {
            f(bVar);
        } else {
            g(bVar);
        }
    }

    private boolean d(int i) {
        int size = this.f2025c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f2025c.get(i2);
            int i3 = bVar.f2031a;
            if (i3 == 8) {
                if (a(bVar.f2034d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f2032b;
                int i5 = bVar.f2034d + i4;
                while (i4 < i5) {
                    if (a(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void e(b bVar) {
        int i = bVar.f2032b;
        int i2 = bVar.f2034d + i;
        int i3 = i;
        int i4 = 0;
        char c2 = 65535;
        while (i < i2) {
            if (this.f2026d.a(i) != null || d(i)) {
                if (c2 == 0) {
                    f(a(4, i3, i4, bVar.f2033c));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    g(a(4, i3, i4, bVar.f2033c));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f2034d) {
            Object obj = bVar.f2033c;
            a(bVar);
            bVar = a(4, i3, i4, obj);
        }
        if (c2 == 0) {
            f(bVar);
        } else {
            g(bVar);
        }
    }

    private void f(b bVar) {
        int i;
        int i2 = bVar.f2031a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b2 = b(bVar.f2032b, i2);
        int i3 = bVar.f2032b;
        int i4 = bVar.f2031a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        } else {
            i = 1;
        }
        int i5 = b2;
        int i6 = i3;
        int i7 = 1;
        for (int i8 = 1; i8 < bVar.f2034d; i8++) {
            int b3 = b(bVar.f2032b + (i * i8), bVar.f2031a);
            int i9 = bVar.f2031a;
            if (i9 == 2 ? b3 == i5 : i9 == 4 && b3 == i5 + 1) {
                i7++;
            } else {
                b a2 = a(bVar.f2031a, i5, i7, bVar.f2033c);
                a(a2, i6);
                a(a2);
                if (bVar.f2031a == 4) {
                    i6 += i7;
                }
                i5 = b3;
                i7 = 1;
            }
        }
        Object obj = bVar.f2033c;
        a(bVar);
        if (i7 <= 0) {
            return;
        }
        b a3 = a(bVar.f2031a, i5, i7, obj);
        a(a3, i6);
        a(a3);
    }

    private void g(b bVar) {
        this.f2025c.add(bVar);
        int i = bVar.f2031a;
        if (i == 1) {
            this.f2026d.c(bVar.f2032b, bVar.f2034d);
        } else if (i == 2) {
            this.f2026d.b(bVar.f2032b, bVar.f2034d);
        } else if (i == 4) {
            this.f2026d.a(bVar.f2032b, bVar.f2034d, bVar.f2033c);
        } else if (i == 8) {
            this.f2026d.a(bVar.f2032b, bVar.f2034d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public int a(int i) {
        int size = this.f2024b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f2024b.get(i2);
            int i3 = bVar.f2031a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f2032b;
                    if (i4 <= i) {
                        int i5 = bVar.f2034d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f2032b;
                    if (i6 == i) {
                        i = bVar.f2034d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f2034d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f2032b <= i) {
                i += bVar.f2034d;
            }
        }
        return i;
    }

    int a(int i, int i2) {
        int size = this.f2025c.size();
        while (i2 < size) {
            b bVar = this.f2025c.get(i2);
            int i3 = bVar.f2031a;
            if (i3 == 8) {
                int i4 = bVar.f2032b;
                if (i4 == i) {
                    i = bVar.f2034d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f2034d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f2032b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f2034d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f2034d;
                }
            }
            i2++;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.j.a
    public b a(int i, int i2, int i3, Object obj) {
        b a2 = this.f2023a.a();
        if (a2 == null) {
            return new b(i, i2, i3, obj);
        }
        a2.f2031a = i;
        a2.f2032b = i2;
        a2.f2034d = i3;
        a2.f2033c = obj;
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        int size = this.f2025c.size();
        for (int i = 0; i < size; i++) {
            this.f2026d.a(this.f2025c.get(i));
        }
        a(this.f2025c);
        this.f2030h = 0;
    }

    @Override // androidx.recyclerview.widget.j.a
    public void a(b bVar) {
        if (!this.f2028f) {
            bVar.f2033c = null;
            this.f2023a.a(bVar);
        }
    }

    void a(b bVar, int i) {
        this.f2026d.b(bVar);
        int i2 = bVar.f2031a;
        if (i2 == 2) {
            this.f2026d.d(i, bVar.f2034d);
        } else if (i2 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        } else {
            this.f2026d.a(i, bVar.f2034d, bVar.f2033c);
        }
    }

    void a(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(list.get(i));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i) {
        return a(i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        a();
        int size = this.f2024b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f2024b.get(i);
            int i2 = bVar.f2031a;
            if (i2 == 1) {
                this.f2026d.a(bVar);
                this.f2026d.c(bVar.f2032b, bVar.f2034d);
            } else if (i2 == 2) {
                this.f2026d.a(bVar);
                this.f2026d.d(bVar.f2032b, bVar.f2034d);
            } else if (i2 == 4) {
                this.f2026d.a(bVar);
                this.f2026d.a(bVar.f2032b, bVar.f2034d, bVar.f2033c);
            } else if (i2 == 8) {
                this.f2026d.a(bVar);
                this.f2026d.a(bVar.f2032b, bVar.f2034d);
            }
            Runnable runnable = this.f2027e;
            if (runnable != null) {
                runnable.run();
            }
        }
        a(this.f2024b);
        this.f2030h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f2024b.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(int i) {
        return (i & this.f2030h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return !this.f2025c.isEmpty() && !this.f2024b.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        this.f2029g.a(this.f2024b);
        int size = this.f2024b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f2024b.get(i);
            int i2 = bVar.f2031a;
            if (i2 == 1) {
                b(bVar);
            } else if (i2 == 2) {
                d(bVar);
            } else if (i2 == 4) {
                e(bVar);
            } else if (i2 == 8) {
                c(bVar);
            }
            Runnable runnable = this.f2027e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f2024b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        a(this.f2024b);
        a(this.f2025c);
        this.f2030h = 0;
    }
}
