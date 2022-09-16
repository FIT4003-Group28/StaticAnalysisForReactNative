package defpackage;

import com.google.android.libraries.social.populous.core.MatchInfo;
import java.util.List;
/* compiled from: PG */
/* renamed from: czcp  reason: default package */
/* loaded from: classes5.dex */
final class czcp extends czcx {
    private final dcdc<dudl> a;
    private final dcdc<dudl> b;
    private final dcdc<Integer> c;
    private final czcw d;
    private final List<MatchInfo> e;
    private final List<MatchInfo> f;

    public czcp(dcdc<dudl> dcdcVar, dcdc<dudl> dcdcVar2, dcdc<Integer> dcdcVar3, czcw czcwVar, List<MatchInfo> list, List<MatchInfo> list2) {
        this.a = dcdcVar;
        this.b = dcdcVar2;
        this.c = dcdcVar3;
        this.d = czcwVar;
        this.e = list;
        this.f = list2;
    }

    @Override // defpackage.czcx
    public final dcdc<dudl> a() {
        return this.a;
    }

    @Override // defpackage.czcx
    public final dcdc<dudl> b() {
        return this.b;
    }

    @Override // defpackage.czcx
    public final dcdc<Integer> c() {
        return this.c;
    }

    @Override // defpackage.czcx
    public final czcw d() {
        return this.d;
    }

    @Override // defpackage.czcx
    public final List<MatchInfo> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czcx) {
            czcx czcxVar = (czcx) obj;
            if (dchl.m(this.a, czcxVar.a()) && dchl.m(this.b, czcxVar.b()) && dchl.m(this.c, czcxVar.c()) && this.d.equals(czcxVar.d()) && this.e.equals(czcxVar.e()) && this.f.equals(czcxVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.czcx
    public final List<MatchInfo> f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 135 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("MatchingField{fieldTokens=");
        sb.append(valueOf);
        sb.append(", canonicalFieldTokens=");
        sb.append(valueOf2);
        sb.append(", canonicalIgnoredCharIndexes=");
        sb.append(valueOf3);
        sb.append(", matchInfoUpdateFn=");
        sb.append(valueOf4);
        sb.append(", matchInfos=");
        sb.append(valueOf5);
        sb.append(", canonicalMatchInfos=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
