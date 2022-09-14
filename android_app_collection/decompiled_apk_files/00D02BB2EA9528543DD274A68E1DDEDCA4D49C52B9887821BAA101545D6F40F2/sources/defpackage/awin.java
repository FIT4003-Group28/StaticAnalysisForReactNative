package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: awin  reason: default package */
/* loaded from: classes3.dex */
final class awin extends awif {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public awin(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // defpackage.awif
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.awif
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.awif
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof awif) {
            awif awifVar = (awif) obj;
            if (this.a == awifVar.a() && this.b == awifVar.b() && this.c == awifVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
        sb.append("AutoUpdateDeviceConstraints{requiresCharging=");
        sb.append(z);
        sb.append(", requiresDeviceIdle=");
        sb.append(z2);
        sb.append(", requiresUnmeteredNetwork=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
