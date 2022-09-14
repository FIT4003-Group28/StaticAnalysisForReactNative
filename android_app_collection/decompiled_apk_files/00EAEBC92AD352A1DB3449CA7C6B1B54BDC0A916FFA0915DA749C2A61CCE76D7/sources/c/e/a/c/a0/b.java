package c.e.a.c.a0;

import android.graphics.RectF;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final c f4657a;

    /* renamed from: b  reason: collision with root package name */
    private final float f4658b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f4657a;
            f2 += ((b) cVar).f4658b;
        }
        this.f4657a = cVar;
        this.f4658b = f2;
    }

    @Override // c.e.a.c.a0.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f4657a.a(rectF) + this.f4658b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4657a.equals(bVar.f4657a) && this.f4658b == bVar.f4658b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4657a, Float.valueOf(this.f4658b)});
    }
}
