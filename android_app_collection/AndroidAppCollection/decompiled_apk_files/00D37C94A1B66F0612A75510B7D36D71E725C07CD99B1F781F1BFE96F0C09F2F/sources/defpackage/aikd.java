package defpackage;
/* compiled from: PG */
/* renamed from: aikd  reason: default package */
/* loaded from: classes.dex */
public final class aikd extends ymg {
    public final boolean a;
    public String b;
    public String d;
    public final auad e;
    public final Throwable f;
    public final String g;
    public final String h;
    public final int i;
    private final int j;

    public aikd(int i, int i2, String str) {
        this(i, false, i2, str, null);
    }

    public final boolean a() {
        int i = this.j - 1;
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            return aiqa.e(this.i, 3, 2, 5, 6, 7, 13, 11);
        }
        return true;
    }

    public aikd(int i, boolean z, int i2, String str, Throwable th) {
        this(i, z, i2, str, th, null);
    }

    public aikd(int i, boolean z, int i2, String str, Throwable th, String str2) {
        this(i, z, i2, str, th, str2, null);
    }

    public aikd(int i, boolean z, int i2, String str, Throwable th, String str2, String str3) {
        this(i, z, i2, str, th, str2, str3, null);
    }

    public aikd(int i, boolean z, int i2, String str, Throwable th, String str2, String str3, auad auadVar) {
        this.i = i;
        this.a = z;
        this.j = i2;
        this.d = str;
        this.f = th;
        this.g = str2;
        this.h = str3;
        this.e = auadVar;
    }

    public aikd(int i, boolean z, String str) {
        this(i, z, 1, str, null);
    }

    public aikd(int i, String str, String str2) {
        this(i, true, 1, str, null, str2);
    }

    public aikd(int i, boolean z, String str, Throwable th) {
        this(i, z, 1, str, th);
    }

    public aikd(int i, Throwable th) {
        this(i, true, 1, null, th);
    }
}
