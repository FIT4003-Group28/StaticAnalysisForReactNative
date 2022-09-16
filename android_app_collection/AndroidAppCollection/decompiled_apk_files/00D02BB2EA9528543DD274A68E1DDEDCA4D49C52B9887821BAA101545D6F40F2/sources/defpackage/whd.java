package defpackage;

import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: whd  reason: default package */
/* loaded from: classes7.dex */
public final class whd extends whp {
    public final int a;
    public final cqss b;
    public final int c;
    public final int d;

    public whd(int i, cqss cqssVar, int i2, int i3) {
        this.a = i;
        this.b = cqssVar;
        this.c = i2;
        this.d = i3;
    }

    @Override // defpackage.whp
    public final int a() {
        return this.a;
    }

    @Override // defpackage.whp
    public final cqss b() {
        return this.b;
    }

    @Override // defpackage.whp
    public final int c() {
        return this.c;
    }

    @Override // defpackage.whp
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof whp) {
            whp whpVar = (whp) obj;
            if (this.a == whpVar.a() && this.b.equals(whpVar.b()) && this.c == whpVar.c() && this.d == whpVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        int i2 = this.c;
        int i3 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_windowFixedWidthMinor);
        sb.append("ButtonConfig{iconResourceId=");
        sb.append(i);
        sb.append(", iconTintColor=");
        sb.append(valueOf);
        sb.append(", contentDescriptionStringId=");
        sb.append(i2);
        sb.append(", displayTextId=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
