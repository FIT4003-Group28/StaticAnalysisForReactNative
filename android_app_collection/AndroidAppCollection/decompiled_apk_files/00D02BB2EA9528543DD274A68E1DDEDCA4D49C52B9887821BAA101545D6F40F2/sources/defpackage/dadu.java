package defpackage;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dadu  reason: default package */
/* loaded from: classes.dex */
public final class dadu implements dadk {
    private final float a;

    public dadu(float f) {
        this.a = f;
    }

    @Override // defpackage.dadk
    public final float a(RectF rectF) {
        return this.a * rectF.height();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dadu) && this.a == ((dadu) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
