package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;
/* compiled from: PG */
/* renamed from: bjv  reason: default package */
/* loaded from: classes2.dex */
final class bjv {
    final int a;
    final int b;
    final String c;

    public bjv(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.B;
        this.b = preference.C;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bjv)) {
            return false;
        }
        bjv bjvVar = (bjv) obj;
        return this.a == bjvVar.a && this.b == bjvVar.b && TextUtils.equals(this.c, bjvVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
