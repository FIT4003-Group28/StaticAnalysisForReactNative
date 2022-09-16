package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: auv  reason: default package */
/* loaded from: classes2.dex */
public final class auv {
    final int a;
    final int b;
    final String c;

    public auv(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.y;
        this.b = preference.z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof auv)) {
            return false;
        }
        auv auvVar = (auv) obj;
        return this.a == auvVar.a && this.b == auvVar.b && TextUtils.equals(this.c, auvVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
