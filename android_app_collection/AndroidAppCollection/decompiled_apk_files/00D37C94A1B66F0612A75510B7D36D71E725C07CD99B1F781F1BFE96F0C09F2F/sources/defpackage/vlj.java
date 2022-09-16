package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: vlj  reason: default package */
/* loaded from: classes4.dex */
public final class vlj {
    public final Uri a;
    public final aoqu b;
    public final vkt c;
    public final amuk d;
    public final vmr e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public vlj() {
    }

    public vlj(Uri uri, aoqu aoquVar, vkt vktVar, amuk amukVar, vmr vmrVar, boolean z, boolean z2, boolean z3) {
        this.a = uri;
        this.b = aoquVar;
        this.c = vktVar;
        this.d = amukVar;
        this.e = vmrVar;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public static vli a() {
        vli vliVar = new vli();
        vliVar.h(vmi.a);
        vliVar.d(vnh.a);
        vliVar.a = false;
        vliVar.c();
        vliVar.g(true);
        return vliVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vlj) {
            vlj vljVar = (vlj) obj;
            if (this.a.equals(vljVar.a) && this.b.equals(vljVar.b) && this.c.equals(vljVar.c) && amxp.v(this.d, vljVar.d) && this.e.equals(vljVar.e) && this.f == vljVar.f && this.g == vljVar.g && this.h == vljVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        if (true == this.h) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 162 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("ProtoDataStoreConfig{uri=");
        sb.append(valueOf);
        sb.append(", schema=");
        sb.append(valueOf2);
        sb.append(", handler=");
        sb.append(valueOf3);
        sb.append(", migrations=");
        sb.append(valueOf4);
        sb.append(", variantConfig=");
        sb.append(valueOf5);
        sb.append(", useGeneratedExtensionRegistry=");
        sb.append(z);
        sb.append(", updateSequencingBugFix=");
        sb.append(z2);
        sb.append(", enableTracing=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
