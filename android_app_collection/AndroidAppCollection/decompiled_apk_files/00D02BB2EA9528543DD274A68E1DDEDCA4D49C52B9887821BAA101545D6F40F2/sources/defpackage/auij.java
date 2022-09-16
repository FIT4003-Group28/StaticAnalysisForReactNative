package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: auij  reason: default package */
/* loaded from: classes.dex */
final class auij extends aujd {
    private final int a;
    private final boolean b;
    private final int c;

    public auij(int i, int i2, boolean z) {
        this.a = i;
        this.c = i2;
        this.b = z;
    }

    @Override // defpackage.aujd
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aujd
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.aujd
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aujd) {
            aujd aujdVar = (aujd) obj;
            if (this.a == aujdVar.a()) {
                int i = this.c;
                int c = aujdVar.c();
                if (i == 0) {
                    throw null;
                }
                if (i == c && this.b == aujdVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        int i2 = this.c;
        if (i2 != 0) {
            return ((i ^ i2) * 1000003) ^ (true != this.b ? 1237 : 1231);
        }
        throw null;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.c;
        String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "AUTO_TRIGGERED" : "MANUALLY_TRIGGERED" : "DISABLED";
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(str.length() + R.styleable.AppCompatTheme_viewInflaterClass);
        sb.append("NotificationTypeParams{notificationId=");
        sb.append(i);
        sb.append(", notificationOptOutUiState=");
        sb.append(str);
        sb.append(", isUserPreferenceSyncedToServer=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
