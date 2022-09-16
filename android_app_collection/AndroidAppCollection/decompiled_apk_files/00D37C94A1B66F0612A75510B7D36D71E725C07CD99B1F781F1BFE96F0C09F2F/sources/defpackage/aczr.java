package defpackage;
/* compiled from: PG */
/* renamed from: aczr  reason: default package */
/* loaded from: classes.dex */
public final class aczr {
    public static final String a;
    public final aczq b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;

    static {
        a = zep.a("aczr".length() != 0 ? "MDX.".concat("aczr") : new String("MDX."));
    }

    public aczr() {
    }

    public aczr(aczq aczqVar, String str, String str2, int i, boolean z, int i2, boolean z2, boolean z3, String str3, boolean z4) {
        this.b = aczqVar;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = z2;
        this.i = z3;
        this.j = str3;
        this.k = z4;
    }

    public static aczp a() {
        aczp aczpVar = new aczp();
        aczpVar.c = "YouTube";
        aczpVar.e(0);
        aczpVar.i = "urn:x-cast:com.google.youtube.mdx";
        aczpVar.b(false);
        aczpVar.d(0);
        aczpVar.a(false);
        aczpVar.c();
        aczpVar.j = false;
        return aczpVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aczr) {
            aczr aczrVar = (aczr) obj;
            if (this.b.equals(aczrVar.b) && this.c.equals(aczrVar.c) && this.d.equals(aczrVar.d) && this.e == aczrVar.e && this.f == aczrVar.f && this.g == aczrVar.g && this.h == aczrVar.h && this.i == aczrVar.i && this.j.equals(aczrVar.j) && this.k == aczrVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ this.j.hashCode()) * 1000003;
        if (true == this.k) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        String str2 = this.d;
        int i = this.e;
        boolean z = this.f;
        int i2 = this.g;
        boolean z2 = this.h;
        boolean z3 = this.i;
        String str3 = this.j;
        boolean z4 = this.k;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 268 + length2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("MdxModuleConfig{castAppIdConfigs=");
        sb.append(valueOf);
        sb.append(", theme=");
        sb.append(str);
        sb.append(", dialAppName=");
        sb.append(str2);
        sb.append(", remoteNotificationIconResId=");
        sb.append(i);
        sb.append(", lockscreenAdSupported=");
        sb.append(z);
        sb.append(", multiUserSession=");
        sb.append(i2);
        sb.append(", forceQueueingEnabled=");
        sb.append(z2);
        sb.append(", mdxPlaybackQueueEnabled=");
        sb.append(z3);
        sb.append(", castDataChannelNameSpace=");
        sb.append(str3);
        sb.append(", mdxLoopModeEnabled=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
