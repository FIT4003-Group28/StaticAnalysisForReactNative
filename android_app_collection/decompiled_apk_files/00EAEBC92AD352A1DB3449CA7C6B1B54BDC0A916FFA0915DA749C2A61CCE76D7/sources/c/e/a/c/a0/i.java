package c.e.a.c.a0;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f4677a;

    public i(float f2) {
        this.f4677a = f2;
    }

    @Override // c.e.a.c.a0.c
    public float a(RectF rectF) {
        return this.f4677a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f4677a == ((i) obj).f4677a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4677a)});
    }
}
