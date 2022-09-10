package defpackage;

import com.google.android.libraries.social.populous.core.AffinityContext;
import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
/* compiled from: PG */
/* renamed from: czfc  reason: default package */
/* loaded from: classes5.dex */
final class czfc extends czfo {
    private final AffinityContext a;
    private final dcdc<cyxj> b;
    private final dcdc<cywi> c;
    private final dcdc<cywm> d;
    private final cyes e;
    private final Long f;
    private final AutocompletionCallbackMetadata g;
    private final boolean h;

    public czfc(AffinityContext affinityContext, dcdc<cyxj> dcdcVar, dcdc<cywi> dcdcVar2, dcdc<cywm> dcdcVar3, cyes cyesVar, @dzsi Long l, AutocompletionCallbackMetadata autocompletionCallbackMetadata, boolean z) {
        this.a = affinityContext;
        this.b = dcdcVar;
        this.c = dcdcVar2;
        this.d = dcdcVar3;
        this.e = cyesVar;
        this.f = l;
        this.g = autocompletionCallbackMetadata;
        this.h = z;
    }

    @Override // defpackage.czfo
    public final AffinityContext a() {
        return this.a;
    }

    @Override // defpackage.czfo
    public final dcdc<cyxj> b() {
        return this.b;
    }

    @Override // defpackage.czfo
    public final dcdc<cywi> c() {
        return this.c;
    }

    @Override // defpackage.czfo
    public final dcdc<cywm> d() {
        return this.d;
    }

    @Override // defpackage.czfo
    public final cyes e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof czfo) {
            czfo czfoVar = (czfo) obj;
            if (this.a.equals(czfoVar.a()) && dchl.m(this.b, czfoVar.b()) && dchl.m(this.c, czfoVar.c()) && dchl.m(this.d, czfoVar.d()) && this.e.equals(czfoVar.e()) && ((l = this.f) != null ? l.equals(czfoVar.f()) : czfoVar.f() == null) && this.g.equals(czfoVar.g()) && this.h == czfoVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.czfo
    @dzsi
    public final Long f() {
        return this.f;
    }

    @Override // defpackage.czfo
    public final AutocompletionCallbackMetadata g() {
        return this.g;
    }

    @Override // defpackage.czfo
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        Long l = this.f;
        return ((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        boolean z = this.h;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        StringBuilder sb = new StringBuilder(length + 152 + length2 + length3 + length4 + length5 + String.valueOf(valueOf6).length() + String.valueOf(valueOf7).length());
        sb.append("TopNResult{affinityContext=");
        sb.append(valueOf);
        sb.append(", scoringParams=");
        sb.append(valueOf2);
        sb.append(", items=");
        sb.append(valueOf3);
        sb.append(", peopleStackItems=");
        sb.append(valueOf4);
        sb.append(", status=");
        sb.append(valueOf5);
        sb.append(", cacheLastUpdatedTime=");
        sb.append(valueOf6);
        sb.append(", callbackMetadata=");
        sb.append(valueOf7);
        sb.append(", containsPartialResults=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
