package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cliz  reason: default package */
/* loaded from: classes5.dex */
final class cliz extends clku {
    private final int a;
    private final String b;
    private final int c;
    private final boolean d;

    public cliz(int i, String str, int i2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = z;
    }

    @Override // defpackage.clku
    public final int a() {
        return this.a;
    }

    @Override // defpackage.clku
    public final String b() {
        return this.b;
    }

    @Override // defpackage.clku
    public final int c() {
        return this.c;
    }

    @Override // defpackage.clku
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof clku) {
            clku clkuVar = (clku) obj;
            if (this.a == clkuVar.a() && this.b.equals(clkuVar.b()) && this.c == clkuVar.c() && this.d == clkuVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        int i2 = this.c;
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle);
        sb.append("ErrorDetails{internalErrorCode=");
        sb.append(i);
        sb.append(", errorMessage=");
        sb.append(str);
        sb.append(", httpStatusCode=");
        sb.append(i2);
        sb.append(", retryableAsIs=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
