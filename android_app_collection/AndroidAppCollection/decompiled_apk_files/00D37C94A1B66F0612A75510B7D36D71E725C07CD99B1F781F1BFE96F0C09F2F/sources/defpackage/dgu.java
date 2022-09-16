package defpackage;

import android.graphics.PathEffect;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dgu  reason: default package */
/* loaded from: classes3.dex */
public final class dgu {
    public float a;
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PathEffect i;
    public float[] j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dgu dguVar = (dgu) obj;
            if (dguVar.a == this.a && dguVar.b == this.b && dguVar.c == this.c && dguVar.d == this.d && this.e == dguVar.e && this.f == dguVar.f && this.g == dguVar.g && this.h == dguVar.h && hz.u(null, null) && Arrays.equals(this.j, dguVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((int) this.a) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 961) + Arrays.hashCode(this.j);
    }
}
