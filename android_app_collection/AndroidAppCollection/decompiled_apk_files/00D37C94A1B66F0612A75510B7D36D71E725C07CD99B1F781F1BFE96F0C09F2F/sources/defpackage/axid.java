package defpackage;
/* compiled from: PG */
/* renamed from: axid  reason: default package */
/* loaded from: classes2.dex */
public final class axid {
    public static final axid a = new axid();
    public final boolean b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final axgs f;
    public final boolean g;

    private axid() {
        this.b = false;
        this.c = "";
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = false;
    }

    public axid(String str, Integer num, Integer num2, axgs axgsVar, boolean z) {
        this.b = true;
        this.c = str;
        this.d = num;
        this.e = num2;
        this.f = axgsVar;
        this.g = z;
    }

    public final String toString() {
        String str;
        if (!this.b) {
            return "Unsupported codec";
        }
        Integer num = this.d;
        String str2 = "N/A";
        if (num != null) {
            String valueOf = String.valueOf(Integer.toHexString(num.intValue()));
            str = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        } else {
            str = str2;
        }
        Integer num2 = this.e;
        if (num2 != null) {
            String valueOf2 = String.valueOf(Integer.toHexString(num2.intValue()));
            str2 = valueOf2.length() != 0 ? "0x".concat(valueOf2) : new String("0x");
        }
        String str3 = this.c;
        boolean z = this.g;
        axgp b = axgp.b(this.f.e);
        if (b == null) {
            b = axgp.NONE;
        }
        int i = b.d;
        axgs axgsVar = this.f;
        int i2 = axgsVar.f;
        int i3 = axgsVar.g;
        long j = axgsVar.h;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 245 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append(str3);
        sb.append(" Surface color format: ");
        sb.append(str);
        sb.append(" YUV color format: ");
        sb.append(str2);
        sb.append(" isH264HighProfileSupported: ");
        sb.append(z);
        sb.append(" bitrateAdjusterType ");
        sb.append(i);
        sb.append(" periodicKeyframeIntervalSec ");
        sb.append(i2);
        sb.append(" forcedKeyframeIntervalSec ");
        sb.append(i3);
        sb.append(" maxFrameGapBeforeRequestingKeyframeNs ");
        sb.append(j);
        return sb.toString();
    }
}
