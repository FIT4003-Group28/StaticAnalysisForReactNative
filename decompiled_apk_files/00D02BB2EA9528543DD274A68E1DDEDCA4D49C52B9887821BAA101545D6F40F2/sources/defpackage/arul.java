package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: arul  reason: default package */
/* loaded from: classes2.dex */
final class arul extends arun {
    private final String a;
    private final arwz b;
    private final int c;
    private final int d;

    public arul(String str, arwz arwzVar, int i, int i2) {
        if (str != null) {
            this.a = str;
            if (arwzVar != null) {
                this.b = arwzVar;
                this.c = i;
                this.d = i2;
                return;
            }
            throw new NullPointerException("Null controlTypePreference");
        }
        throw new NullPointerException("Null packageName");
    }

    @Override // defpackage.arun
    public final String a() {
        return this.a;
    }

    @Override // defpackage.arun
    public final arwz b() {
        return this.b;
    }

    @Override // defpackage.arun
    public final int c() {
        return this.c;
    }

    @Override // defpackage.arun
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof arun) {
            arun arunVar = (arun) obj;
            if (this.a.equals(arunVar.a()) && this.b.equals(arunVar.b()) && this.c == arunVar.c() && this.d == arunVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        int i = this.c;
        int i2 = this.d;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowActionBar + String.valueOf(valueOf).length());
        sb.append("MediaBrowserAllowlistEntry{packageName=");
        sb.append(str);
        sb.append(", controlTypePreference=");
        sb.append(valueOf);
        sb.append(", colorResId=");
        sb.append(i);
        sb.append(", touchColorResId=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
