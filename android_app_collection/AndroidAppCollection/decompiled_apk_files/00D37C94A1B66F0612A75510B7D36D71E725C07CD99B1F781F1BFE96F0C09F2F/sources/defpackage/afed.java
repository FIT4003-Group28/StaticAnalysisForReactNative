package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: afed  reason: default package */
/* loaded from: classes.dex */
final class afed implements afip {
    public boolean a;
    private final float b;
    private final boolean c;
    private final int d;
    private final String e;
    private final String f;

    public afed(float f, boolean z, int i, String str, String str2) {
        afms.d(str != null);
        this.b = f;
        this.c = z;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.a = false;
    }

    @Override // defpackage.afip
    public final String a(long j) {
        return String.format(Locale.US, "t.%.3f;m.%.3f;g.%d;tt.%d;np.%d;c.%s;ad.%s", Float.valueOf(((float) j) / 1000.0f), Float.valueOf(this.b / 1000.0f), Integer.valueOf(this.c ? 1 : 0), Integer.valueOf(this.d), Integer.valueOf(this.a ? 1 : 0), this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof afed) {
            return a(0L).equals(((afed) obj).a(0L));
        }
        return false;
    }

    public final int hashCode() {
        return a(0L).hashCode();
    }

    public final String toString() {
        return a(0L);
    }
}
