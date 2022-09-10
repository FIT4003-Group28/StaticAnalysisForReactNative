package defpackage;

import com.google.android.libraries.social.populous.core.AffinityContext;
import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
/* compiled from: PG */
/* renamed from: cytf  reason: default package */
/* loaded from: classes5.dex */
final class cytf extends cyto {
    private final AffinityContext a;
    private final dcdc<cyvs> b;
    private final cydx c;
    private final Long d;
    private final boolean e;
    private final AutocompletionCallbackMetadata f;
    private final boolean g;
    private final int h;

    public cytf(@dzsi AffinityContext affinityContext, dcdc<cyvs> dcdcVar, @dzsi cydx cydxVar, @dzsi Long l, boolean z, @dzsi AutocompletionCallbackMetadata autocompletionCallbackMetadata, boolean z2, int i) {
        this.a = affinityContext;
        this.b = dcdcVar;
        this.c = cydxVar;
        this.d = l;
        this.e = z;
        this.f = autocompletionCallbackMetadata;
        this.g = z2;
        this.h = i;
    }

    @Override // defpackage.cyto
    @dzsi
    public final AffinityContext a() {
        return this.a;
    }

    @Override // defpackage.cyto
    public final dcdc<cyvs> b() {
        return this.b;
    }

    @Override // defpackage.cyto
    @dzsi
    public final cydx c() {
        return this.c;
    }

    @Override // defpackage.cyto
    @dzsi
    public final Long d() {
        return this.d;
    }

    @Override // defpackage.cyto
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        cydx cydxVar;
        Long l;
        AutocompletionCallbackMetadata autocompletionCallbackMetadata;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyto) {
            cyto cytoVar = (cyto) obj;
            AffinityContext affinityContext = this.a;
            if (affinityContext != null ? affinityContext.equals(cytoVar.a()) : cytoVar.a() == null) {
                if (dchl.m(this.b, cytoVar.b()) && ((cydxVar = this.c) != null ? cydxVar.equals(cytoVar.c()) : cytoVar.c() == null) && ((l = this.d) != null ? l.equals(cytoVar.d()) : cytoVar.d() == null) && this.e == cytoVar.e() && ((autocompletionCallbackMetadata = this.f) != null ? autocompletionCallbackMetadata.equals(cytoVar.f()) : cytoVar.f() == null) && this.g == cytoVar.g()) {
                    int i = this.h;
                    int h = cytoVar.h();
                    if (i == 0) {
                        throw null;
                    }
                    if (i == h) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.cyto
    @dzsi
    public final AutocompletionCallbackMetadata f() {
        return this.f;
    }

    @Override // defpackage.cyto
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.cyto
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        AffinityContext affinityContext = this.a;
        int i = 0;
        int hashCode = ((((affinityContext == null ? 0 : affinityContext.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        cydx cydxVar = this.c;
        int hashCode2 = (hashCode ^ (cydxVar == null ? 0 : cydxVar.hashCode())) * 1000003;
        Long l = this.d;
        int i2 = 1237;
        int hashCode3 = (((hashCode2 ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        AutocompletionCallbackMetadata autocompletionCallbackMetadata = this.f;
        if (autocompletionCallbackMetadata != null) {
            i = autocompletionCallbackMetadata.hashCode();
        }
        int i3 = (hashCode3 ^ i) * 1000003;
        if (true == this.g) {
            i2 = 1231;
        }
        return ((i3 ^ i2) * 1000003) ^ eaxf.a(this.h);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        boolean z = this.e;
        String valueOf5 = String.valueOf(this.f);
        boolean z2 = this.g;
        int i = this.h;
        String valueOf6 = String.valueOf(i != 0 ? eaxf.b(i) : "null");
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 177 + length2 + length3 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("QueryResult{affinityContext=");
        sb.append(valueOf);
        sb.append(", internalResults=");
        sb.append(valueOf2);
        sb.append(", callbackError=");
        sb.append(valueOf3);
        sb.append(", cacheLastUpdatedTime=");
        sb.append(valueOf4);
        sb.append(", isLastCallback=");
        sb.append(z);
        sb.append(", callbackMetadata=");
        sb.append(valueOf5);
        sb.append(", containsPartialResults=");
        sb.append(z2);
        sb.append(", resultsSourceType=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
