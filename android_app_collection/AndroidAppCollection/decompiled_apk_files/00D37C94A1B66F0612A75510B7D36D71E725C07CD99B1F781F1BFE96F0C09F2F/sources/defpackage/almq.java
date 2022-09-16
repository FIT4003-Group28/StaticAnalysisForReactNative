package defpackage;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: almq  reason: default package */
/* loaded from: classes.dex */
public final class almq implements alms {
    private final float a;

    public almq(float f) {
        this.a = f;
    }

    @Override // defpackage.alms
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof almq) && this.a == ((almq) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
