package com.facebook.yoga;
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public final float f6574a;

    /* renamed from: b  reason: collision with root package name */
    public final u f6575b;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6576a = new int[u.values().length];

        static {
            try {
                f6576a[u.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6576a[u.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6576a[u.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6576a[u.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        new v(Float.NaN, u.UNDEFINED);
        new v(0.0f, u.POINT);
        new v(Float.NaN, u.AUTO);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(float f2, int i) {
        this(f2, u.a(i));
    }

    public v(float f2, u uVar) {
        this.f6574a = f2;
        this.f6575b = uVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f6575b;
            if (uVar != vVar.f6575b) {
                return false;
            }
            return uVar == u.UNDEFINED || uVar == u.AUTO || Float.compare(this.f6574a, vVar.f6574a) == 0;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f6574a) + this.f6575b.a();
    }

    public String toString() {
        int i = a.f6576a[this.f6575b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Float.toString(this.f6574a);
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                return "auto";
            }
            return this.f6574a + "%";
        }
        return "undefined";
    }
}
