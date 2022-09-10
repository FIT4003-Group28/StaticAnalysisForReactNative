package defpackage;

import android.net.Uri;
import defpackage.dssj;
/* compiled from: PG */
/* renamed from: czjs  reason: default package */
/* loaded from: classes5.dex */
final class czjs<T extends dssj> extends czko<T> {
    private final Uri a;
    private final T b;
    private final czju<T> c;
    private final dcdc<czkg<T>> d;
    private final czlz<T> e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    public czjs(Uri uri, T t, czju<T> czjuVar, dcdc<czkg<T>> dcdcVar, czlz<T> czlzVar, boolean z, boolean z2, boolean z3) {
        this.a = uri;
        this.b = t;
        this.c = czjuVar;
        this.d = dcdcVar;
        this.e = czlzVar;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    @Override // defpackage.czko
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.czko
    public final T b() {
        return this.b;
    }

    @Override // defpackage.czko
    public final czju<T> c() {
        return this.c;
    }

    @Override // defpackage.czko
    public final dcdc<czkg<T>> d() {
        return this.d;
    }

    @Override // defpackage.czko
    public final czlz<T> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czko) {
            czko czkoVar = (czko) obj;
            if (this.a.equals(czkoVar.a()) && this.b.equals(czkoVar.b()) && this.c.equals(czkoVar.c()) && dchl.m(this.d, czkoVar.d()) && this.e.equals(czkoVar.e()) && this.f == czkoVar.f() && this.g == czkoVar.g() && this.h == czkoVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.czko
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.czko
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.czko
    public final boolean h() {
        return this.h;
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
