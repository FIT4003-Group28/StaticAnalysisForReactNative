package defpackage;

import com.google.android.filament.R;
import javax.security.auth.x500.X500Principal;
/* compiled from: PG */
/* renamed from: dyxi  reason: default package */
/* loaded from: classes6.dex */
final class dyxi {
    public final String a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public char[] g;

    public dyxi(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.a = name;
        this.b = name.length();
    }

    public final String a() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        char c2;
        char c3;
        int i5;
        char c4;
        char c5;
        while (true) {
            i = this.c;
            i2 = this.b;
            if (i >= i2 || this.g[i] != ' ') {
                break;
            }
            this.c = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.d = i;
        this.c = i + 1;
        while (true) {
            i3 = this.c;
            i4 = this.b;
            if (i3 >= i4 || (c5 = this.g[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.c = i3 + 1;
        }
        if (i3 >= i4) {
            String valueOf = String.valueOf(this.a);
            throw new IllegalStateException(valueOf.length() != 0 ? "Unexpected end of DN: ".concat(valueOf) : new String("Unexpected end of DN: "));
        }
        this.e = i3;
        if (this.g[i3] == ' ') {
            while (true) {
                i3 = this.c;
                i5 = this.b;
                if (i3 >= i5 || (c4 = this.g[i3]) == '=' || c4 != ' ') {
                    break;
                }
                this.c = i3 + 1;
            }
            if (this.g[i3] != '=' || i3 == i5) {
                String valueOf2 = String.valueOf(this.a);
                throw new IllegalStateException(valueOf2.length() != 0 ? "Unexpected end of DN: ".concat(valueOf2) : new String("Unexpected end of DN: "));
            }
        }
        this.c = i3 + 1;
        while (true) {
            int i6 = this.c;
            if (i6 >= this.b || this.g[i6] != ' ') {
                break;
            }
            this.c = i6 + 1;
        }
        int i7 = this.e;
        int i8 = this.d;
        if (i7 - i8 > 4) {
            char[] cArr = this.g;
            if (cArr[i8 + 3] == '.' && (((c = cArr[i8]) == 'O' || c == 'o') && (((c2 = cArr[i8 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i8 + 2]) == 'D' || c3 == 'd')))) {
                i8 += 4;
                this.d = i8;
            }
        }
        return new String(this.g, i8, i7 - i8);
    }

    public final int c(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.b) {
            String valueOf = String.valueOf(this.a);
            throw new IllegalStateException(valueOf.length() != 0 ? "Malformed DN: ".concat(valueOf) : new String("Malformed DN: "));
        }
        char[] cArr = this.g;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else if (c < 'A' || c > 'F') {
            String valueOf2 = String.valueOf(this.a);
            throw new IllegalStateException(valueOf2.length() != 0 ? "Malformed DN: ".concat(valueOf2) : new String("Malformed DN: "));
        } else {
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else if (c2 < 'A' || c2 > 'F') {
            String valueOf3 = String.valueOf(this.a);
            throw new IllegalStateException(valueOf3.length() != 0 ? "Malformed DN: ".concat(valueOf3) : new String("Malformed DN: "));
        } else {
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    public final char b() {
        int i;
        int i2;
        int i3 = this.c + 1;
        this.c = i3;
        if (i3 == this.b) {
            String valueOf = String.valueOf(this.a);
            throw new IllegalStateException(valueOf.length() != 0 ? "Unexpected end of DN: ".concat(valueOf) : new String("Unexpected end of DN: "));
        }
        char c = this.g[i3];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    break;
                default:
                    switch (c) {
                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                            break;
                        default:
                            int c2 = c(i3);
                            this.c++;
                            if (c2 >= 128) {
                                if (c2 >= 192 && c2 <= 247) {
                                    if (c2 <= 223) {
                                        i = c2 & 31;
                                        i2 = 1;
                                    } else if (c2 <= 239) {
                                        i = c2 & 15;
                                        i2 = 2;
                                    } else {
                                        i = c2 & 7;
                                        i2 = 3;
                                    }
                                    for (int i4 = 0; i4 < i2; i4++) {
                                        int i5 = this.c + 1;
                                        this.c = i5;
                                        if (i5 != this.b && this.g[i5] == '\\') {
                                            int i6 = i5 + 1;
                                            this.c = i6;
                                            int c3 = c(i6);
                                            this.c++;
                                            if ((c3 & 192) == 128) {
                                                i = (i << 6) + (c3 & 63);
                                            }
                                        }
                                    }
                                    c2 = (char) i;
                                }
                                c2 = 63;
                            }
                            return (char) c2;
                    }
            }
        }
        return c;
    }
}
