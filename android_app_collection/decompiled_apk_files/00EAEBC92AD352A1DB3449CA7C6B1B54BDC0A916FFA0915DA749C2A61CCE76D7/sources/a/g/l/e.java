package a.g.l;

import java.util.Locale;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a.g.l.d f303a = new C0012e(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final a.g.l.d f304b = new C0012e(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final a.g.l.d f305c = new C0012e(b.f309a, false);

    /* renamed from: d  reason: collision with root package name */
    public static final a.g.l.d f306d = new C0012e(b.f309a, true);

    /* loaded from: classes.dex */
    private static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        static final a f307b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f308a;

        private a(boolean z) {
            this.f308a = z;
        }

        @Override // a.g.l.e.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a2 = e.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a2 != 0) {
                    if (a2 != 1) {
                        continue;
                        i++;
                    } else if (!this.f308a) {
                        return 1;
                    }
                } else if (this.f308a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f308a ? 1 : 0;
            }
            return 2;
        }
    }

    /* loaded from: classes.dex */
    private static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        static final b f309a = new b();

        private b() {
        }

        @Override // a.g.l.e.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = e.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* loaded from: classes.dex */
    private static abstract class d implements a.g.l.d {

        /* renamed from: a  reason: collision with root package name */
        private final c f310a;

        d(c cVar) {
            this.f310a = cVar;
        }

        private boolean b(CharSequence charSequence, int i, int i2) {
            int a2 = this.f310a.a(charSequence, i, i2);
            if (a2 != 0) {
                if (a2 == 1) {
                    return false;
                }
                return a();
            }
            return true;
        }

        protected abstract boolean a();

        @Override // a.g.l.d
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.f310a == null ? a() : b(charSequence, i, i2);
        }
    }

    /* renamed from: a.g.l.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0012e extends d {

        /* renamed from: b  reason: collision with root package name */
        private final boolean f311b;

        C0012e(c cVar, boolean z) {
            super(cVar);
            this.f311b = z;
        }

        @Override // a.g.l.e.d
        protected boolean a() {
            return this.f311b;
        }
    }

    /* loaded from: classes.dex */
    private static class f extends d {

        /* renamed from: b  reason: collision with root package name */
        static final f f312b = new f();

        f() {
            super(null);
        }

        @Override // a.g.l.e.d
        protected boolean a() {
            return a.g.l.f.b(Locale.getDefault()) == 1;
        }
    }

    static {
        new C0012e(a.f307b, false);
        f fVar = f.f312b;
    }

    static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
