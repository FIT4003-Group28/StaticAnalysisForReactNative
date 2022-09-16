package defpackage;
/* compiled from: PG */
/* renamed from: dquc  reason: default package */
/* loaded from: classes6.dex */
public enum dquc implements dsrb {
    PNG(0),
    SVG(1),
    JPG(2);
    
    public final int d;

    dquc(int i) {
        this.d = i;
    }

    public static dquc b(int i) {
        if (i != 0) {
            if (i == 1) {
                return SVG;
            }
            if (i == 2) {
                return JPG;
            }
            return null;
        }
        return PNG;
    }

    public static dsrd c() {
        return dqub.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
