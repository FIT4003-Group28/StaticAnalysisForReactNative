package a.g.l;

import android.text.SpannableStringBuilder;
import java.util.Locale;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    static final d f273d = e.f305c;

    /* renamed from: e  reason: collision with root package name */
    private static final String f274e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    private static final String f275f = Character.toString(8207);

    /* renamed from: g  reason: collision with root package name */
    static final a f276g = new a(false, 2, f273d);

    /* renamed from: h  reason: collision with root package name */
    static final a f277h = new a(true, 2, f273d);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f278a;

    /* renamed from: b  reason: collision with root package name */
    private final int f279b;

    /* renamed from: c  reason: collision with root package name */
    private final d f280c;

    /* renamed from: a.g.l.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0010a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f281a;

        /* renamed from: b  reason: collision with root package name */
        private int f282b;

        /* renamed from: c  reason: collision with root package name */
        private d f283c;

        public C0010a() {
            b(a.a(Locale.getDefault()));
        }

        private static a a(boolean z) {
            return z ? a.f277h : a.f276g;
        }

        private void b(boolean z) {
            this.f281a = z;
            this.f283c = a.f273d;
            this.f282b = 2;
        }

        public a a() {
            return (this.f282b == 2 && this.f283c == a.f273d) ? a(this.f281a) : new a(this.f281a, this.f282b, this.f283c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f284f = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        private final CharSequence f285a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f286b;

        /* renamed from: c  reason: collision with root package name */
        private final int f287c;

        /* renamed from: d  reason: collision with root package name */
        private int f288d;

        /* renamed from: e  reason: collision with root package name */
        private char f289e;

        static {
            for (int i = 0; i < 1792; i++) {
                f284f[i] = Character.getDirectionality(i);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.f285a = charSequence;
            this.f286b = z;
            this.f287c = charSequence.length();
        }

        private static byte a(char c2) {
            return c2 < 1792 ? f284f[c2] : Character.getDirectionality(c2);
        }

        private byte e() {
            char c2;
            int i = this.f288d;
            do {
                int i2 = this.f288d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f285a;
                int i3 = i2 - 1;
                this.f288d = i3;
                this.f289e = charSequence.charAt(i3);
                c2 = this.f289e;
                if (c2 == '&') {
                    return (byte) 12;
                }
            } while (c2 != ';');
            this.f288d = i;
            this.f289e = ';';
            return (byte) 13;
        }

        private byte f() {
            char charAt;
            do {
                int i = this.f288d;
                if (i >= this.f287c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f285a;
                this.f288d = i + 1;
                charAt = charSequence.charAt(i);
                this.f289e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte g() {
            char charAt;
            int i = this.f288d;
            while (true) {
                int i2 = this.f288d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f285a;
                int i3 = i2 - 1;
                this.f288d = i3;
                this.f289e = charSequence.charAt(i3);
                char c2 = this.f289e;
                if (c2 == '<') {
                    return (byte) 12;
                }
                if (c2 == '>') {
                    break;
                } else if (c2 == '\"' || c2 == '\'') {
                    char c3 = this.f289e;
                    do {
                        int i4 = this.f288d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.f285a;
                            int i5 = i4 - 1;
                            this.f288d = i5;
                            charAt = charSequence2.charAt(i5);
                            this.f289e = charAt;
                        }
                    } while (charAt != c3);
                }
            }
            this.f288d = i;
            this.f289e = '>';
            return (byte) 13;
        }

        private byte h() {
            char charAt;
            int i = this.f288d;
            while (true) {
                int i2 = this.f288d;
                if (i2 >= this.f287c) {
                    this.f288d = i;
                    this.f289e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f285a;
                this.f288d = i2 + 1;
                this.f289e = charSequence.charAt(i2);
                char c2 = this.f289e;
                if (c2 == '>') {
                    return (byte) 12;
                }
                if (c2 == '\"' || c2 == '\'') {
                    char c3 = this.f289e;
                    do {
                        int i3 = this.f288d;
                        if (i3 < this.f287c) {
                            CharSequence charSequence2 = this.f285a;
                            this.f288d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f289e = charAt;
                        }
                    } while (charAt != c3);
                }
            }
        }

        byte a() {
            this.f289e = this.f285a.charAt(this.f288d - 1);
            if (Character.isLowSurrogate(this.f289e)) {
                int codePointBefore = Character.codePointBefore(this.f285a, this.f288d);
                this.f288d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f288d--;
            byte a2 = a(this.f289e);
            if (!this.f286b) {
                return a2;
            }
            char c2 = this.f289e;
            return c2 == '>' ? g() : c2 == ';' ? e() : a2;
        }

        byte b() {
            this.f289e = this.f285a.charAt(this.f288d);
            if (Character.isHighSurrogate(this.f289e)) {
                int codePointAt = Character.codePointAt(this.f285a, this.f288d);
                this.f288d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f288d++;
            byte a2 = a(this.f289e);
            if (!this.f286b) {
                return a2;
            }
            char c2 = this.f289e;
            return c2 == '<' ? h() : c2 == '&' ? f() : a2;
        }

        int c() {
            this.f288d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f288d < this.f287c && i == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f288d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        int d() {
            this.f288d = this.f287c;
            int i = 0;
            int i2 = 0;
            while (this.f288d > 0) {
                byte a2 = a();
                if (a2 != 0) {
                    if (a2 == 1 || a2 == 2) {
                        if (i2 == 0) {
                            return 1;
                        }
                        if (i == 0) {
                            i = i2;
                        }
                    } else if (a2 != 9) {
                        switch (a2) {
                            case 14:
                            case 15:
                                if (i == i2) {
                                    return -1;
                                }
                                i2--;
                                break;
                            case 16:
                            case 17:
                                if (i == i2) {
                                    return 1;
                                }
                                i2--;
                                break;
                            case 18:
                                i2++;
                                break;
                            default:
                                if (i != 0) {
                                    break;
                                } else {
                                    i = i2;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i2 == 0) {
                    return -1;
                } else {
                    if (i == 0) {
                        i = i2;
                    }
                }
            }
            return 0;
        }
    }

    a(boolean z, int i, d dVar) {
        this.f278a = z;
        this.f279b = i;
        this.f280c = dVar;
    }

    private String a(CharSequence charSequence, d dVar) {
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        return (this.f278a || (!a2 && c(charSequence) != 1)) ? this.f278a ? (!a2 || c(charSequence) == -1) ? f275f : "" : "" : f274e;
    }

    static boolean a(Locale locale) {
        return f.b(locale) == 1;
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).c();
    }

    public static a b() {
        return new C0010a().a();
    }

    private String b(CharSequence charSequence, d dVar) {
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        return (this.f278a || (!a2 && b(charSequence) != 1)) ? this.f278a ? (!a2 || b(charSequence) == -1) ? f275f : "" : "" : f274e;
    }

    private static int c(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public CharSequence a(CharSequence charSequence) {
        return a(charSequence, this.f280c, true);
    }

    public CharSequence a(CharSequence charSequence, d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a2 = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (a() && z) {
            spannableStringBuilder.append((CharSequence) b(charSequence, a2 ? e.f304b : e.f303a));
        }
        if (a2 != this.f278a) {
            spannableStringBuilder.append(a2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) a(charSequence, a2 ? e.f304b : e.f303a));
        }
        return spannableStringBuilder;
    }

    public boolean a() {
        return (this.f279b & 2) != 0;
    }
}
