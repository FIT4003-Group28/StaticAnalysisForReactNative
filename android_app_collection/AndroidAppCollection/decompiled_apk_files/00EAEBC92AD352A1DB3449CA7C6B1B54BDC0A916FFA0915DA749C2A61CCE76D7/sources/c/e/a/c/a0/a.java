package c.e.a.c.a0;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f4656a;

    public a(float f2) {
        this.f4656a = f2;
    }

    @Override // c.e.a.c.a0.c
    public float a(RectF rectF) {
        return this.f4656a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f4656a == ((a) obj).f4656a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4656a)});
    }
}
