package defpackage;

import android.media.AudioAttributes;
/* compiled from: PG */
/* renamed from: aso  reason: default package */
/* loaded from: classes2.dex */
public final class aso {
    public static final aso a = new asn().a();
    public final int b;
    public final int c;
    private AudioAttributes d;

    public aso(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final AudioAttributes a() {
        if (this.d == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.b).setFlags(0).setUsage(this.c);
            if (pxi.a >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            this.d = usage.build();
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aso asoVar = (aso) obj;
            if (this.b == asoVar.b && this.c == asoVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b + 527) * 961) + this.c) * 31) + 1;
    }
}
