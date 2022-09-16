package defpackage;

import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cxbp  reason: default package */
/* loaded from: classes5.dex */
public final class cxbp extends cxbw {
    private final int a;
    private final dcdc<Pattern> b;
    private final int c;

    public cxbp(int i, int i2, dcdc<Pattern> dcdcVar) {
        this.c = i;
        this.a = i2;
        this.b = dcdcVar;
    }

    @Override // defpackage.cxbw, defpackage.cwuw
    public final int b() {
        return this.c;
    }

    @Override // defpackage.cxbw
    public final int c() {
        return this.a;
    }

    @Override // defpackage.cxbw
    public final dcdc<Pattern> d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cxbw)) {
            return false;
        }
        cxbw cxbwVar = (cxbw) obj;
        int i = this.c;
        int b = cxbwVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && this.a == cxbwVar.c() && dchl.m(this.b, cxbwVar.d());
    }

    public final int hashCode() {
        int i = this.c;
        cwux.b(i);
        return ((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String a = cwux.a(this.c);
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(a.length() + 83 + String.valueOf(valueOf).length());
        sb.append("DirStatsConfigurations{enablement=");
        sb.append(a);
        sb.append(", maxFolderDepth=");
        sb.append(i);
        sb.append(", listFilesPatterns=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
