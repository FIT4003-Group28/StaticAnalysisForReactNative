package defpackage;
/* compiled from: PG */
/* renamed from: doos  reason: default package */
/* loaded from: classes.dex */
public enum doos implements dsrb {
    PNG(0),
    JPG(1);
    
    public final int c;

    doos(int i) {
        this.c = i;
    }

    public static doos b(int i) {
        if (i != 0) {
            if (i == 1) {
                return JPG;
            }
            return null;
        }
        return PNG;
    }

    public static dsrd c() {
        return door.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
