package c.d.h.f;

import c.d.d.d.i;
import java.util.Arrays;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private a f3102a = a.BITMAP_ONLY;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3103b = false;

    /* renamed from: c  reason: collision with root package name */
    private float[] f3104c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f3105d = 0;

    /* renamed from: e  reason: collision with root package name */
    private float f3106e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    private int f3107f = 0;

    /* renamed from: g  reason: collision with root package name */
    private float f3108g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f3109h = false;
    private boolean i = false;

    /* loaded from: classes.dex */
    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static d b(float f2) {
        d dVar = new d();
        dVar.a(f2);
        return dVar;
    }

    private float[] j() {
        if (this.f3104c == null) {
            this.f3104c = new float[8];
        }
        return this.f3104c;
    }

    public int a() {
        return this.f3107f;
    }

    public d a(float f2) {
        Arrays.fill(j(), f2);
        return this;
    }

    public d a(float f2, float f3, float f4, float f5) {
        float[] j = j();
        j[1] = f2;
        j[0] = f2;
        j[3] = f3;
        j[2] = f3;
        j[5] = f4;
        j[4] = f4;
        j[7] = f5;
        j[6] = f5;
        return this;
    }

    public d a(int i) {
        this.f3105d = i;
        this.f3102a = a.OVERLAY_COLOR;
        return this;
    }

    public d a(int i, float f2) {
        i.a(f2 >= 0.0f, "the border width cannot be < 0");
        this.f3106e = f2;
        this.f3107f = i;
        return this;
    }

    public d a(a aVar) {
        this.f3102a = aVar;
        return this;
    }

    public float b() {
        return this.f3106e;
    }

    public float[] c() {
        return this.f3104c;
    }

    public int d() {
        return this.f3105d;
    }

    public float e() {
        return this.f3108g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f3103b != dVar.f3103b || this.f3105d != dVar.f3105d || Float.compare(dVar.f3106e, this.f3106e) != 0 || this.f3107f != dVar.f3107f || Float.compare(dVar.f3108g, this.f3108g) != 0 || this.f3102a != dVar.f3102a || this.f3109h != dVar.f3109h || this.i != dVar.i) {
            return false;
        }
        return Arrays.equals(this.f3104c, dVar.f3104c);
    }

    public boolean f() {
        return this.i;
    }

    public boolean g() {
        return this.f3103b;
    }

    public a h() {
        return this.f3102a;
    }

    public int hashCode() {
        a aVar = this.f3102a;
        int i = 0;
        int hashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f3103b ? 1 : 0)) * 31;
        float[] fArr = this.f3104c;
        int hashCode2 = (((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f3105d) * 31;
        float f2 = this.f3106e;
        int floatToIntBits = (((hashCode2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + this.f3107f) * 31;
        float f3 = this.f3108g;
        if (f3 != 0.0f) {
            i = Float.floatToIntBits(f3);
        }
        return ((((floatToIntBits + i) * 31) + (this.f3109h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }

    public boolean i() {
        return this.f3109h;
    }
}
