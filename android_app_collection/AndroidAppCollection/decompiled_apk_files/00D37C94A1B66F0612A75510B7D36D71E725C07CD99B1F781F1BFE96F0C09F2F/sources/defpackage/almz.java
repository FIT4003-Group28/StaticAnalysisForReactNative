package defpackage;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: almz  reason: default package */
/* loaded from: classes.dex */
public final class almz implements alms {
    private final float a;

    public almz(float f) {
        this.a = f;
    }

    @Override // defpackage.alms
    public final float a(RectF rectF) {
        return this.a * rectF.height();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof almz) && this.a == ((almz) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
