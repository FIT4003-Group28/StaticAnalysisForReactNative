package defpackage;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dadi  reason: default package */
/* loaded from: classes.dex */
public final class dadi implements dadk {
    private final float a;

    public dadi(float f) {
        this.a = f;
    }

    @Override // defpackage.dadk
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dadi) && this.a == ((dadi) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
