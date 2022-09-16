package defpackage;
/* compiled from: PG */
/* renamed from: axhp  reason: default package */
/* loaded from: classes2.dex */
public final class axhp {
    public static final axhp a = new axhp();
    public final boolean b;
    public final String c;
    public final int d;
    public final boolean e;
    public final axgr f;

    private axhp() {
        this.b = false;
        this.c = "";
        this.d = 0;
        this.e = false;
        this.f = null;
    }

    public axhp(String str, int i, boolean z, axgr axgrVar) {
        this.b = true;
        this.c = str;
        this.d = i;
        this.e = z;
        this.f = axgrVar;
    }

    public final String toString() {
        if (this.b) {
            String str = this.c;
            String hexString = Integer.toHexString(this.d);
            boolean z = this.e;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(hexString).length());
            sb.append(str);
            sb.append(" Color format: 0x");
            sb.append(hexString);
            sb.append(" isH264HighProfileSupported: ");
            sb.append(z);
            return sb.toString();
        }
        return "Unsupported codec";
    }
}
