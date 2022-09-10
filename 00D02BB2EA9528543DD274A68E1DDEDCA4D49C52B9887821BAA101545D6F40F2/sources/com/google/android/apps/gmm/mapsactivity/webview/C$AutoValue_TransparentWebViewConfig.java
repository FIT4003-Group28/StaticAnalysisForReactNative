package com.google.android.apps.gmm.mapsactivity.webview;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.mapsactivity.webview.$AutoValue_TransparentWebViewConfig  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_TransparentWebViewConfig extends TransparentWebViewConfig {
    public final String a;
    public final dszg b;
    public final dbsg<gfs> c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final dbsg<ckpa> g;
    public final int h;

    public C$AutoValue_TransparentWebViewConfig(String str, dszg dszgVar, dbsg<gfs> dbsgVar, boolean z, boolean z2, boolean z3, dbsg<ckpa> dbsgVar2, int i) {
        if (str != null) {
            this.a = str;
            if (dszgVar != null) {
                this.b = dszgVar;
                if (dbsgVar != null) {
                    this.c = dbsgVar;
                    this.d = z;
                    this.e = z2;
                    this.f = z3;
                    if (dbsgVar2 != null) {
                        this.g = dbsgVar2;
                        this.h = i;
                        return;
                    }
                    throw new NullPointerException("Null systemHealthEventSpanName");
                }
                throw new NullPointerException("Null fragmentSearchTag");
            }
            throw new NullPointerException("Null feature");
        }
        throw new NullPointerException("Null url");
    }

    @Override // com.google.android.apps.gmm.mapsactivity.webview.TransparentWebViewConfig
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.mapsactivity.webview.TransparentWebViewConfig
    public final dszg b() {
        return this.b;
    }

    @Override // com.google.android.apps.gmm.mapsactivity.webview.TransparentWebViewConfig
    public final dbsg<gfs> c() {
        return this.c;
    }

    @Override // com.google.android.apps.gmm.mapsactivity.webview.TransparentWebViewConfig
    public final boolean d() {
        return this.d;
    }

    @Override // com.google.android.apps.gmm.mapsactivity.webview.TransparentWebViewConfig
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TransparentWebViewConfig) {
            TransparentWebViewConfig transparentWebViewConfig = (TransparentWebViewConfig) obj;
            if (this.a.equals(transparentWebViewConfig.a()) && this.b.equals(transparentWebViewConfig.b()) && this.c.equals(transparentWebViewConfig.c()) && this.d == transparentWebViewConfig.d() && this.e == transparentWebViewConfig.e() && this.f == transparentWebViewConfig.f() && this.g.equals(transparentWebViewConfig.g()) && this.h == transparentWebViewConfig.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.gmm.mapsactivity.webview.TransparentWebViewConfig
    public final boolean f() {
        return this.f;
    }

    @Override // com.google.android.apps.gmm.mapsactivity.webview.TransparentWebViewConfig
    public final dbsg<ckpa> g() {
        return this.g;
    }

    @Override // com.google.android.apps.gmm.mapsactivity.webview.TransparentWebViewConfig
    public final int h() {
        return this.h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i = 1231;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        String valueOf3 = String.valueOf(this.g);
        int i = this.h;
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 178 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("TransparentWebViewConfig{url=");
        sb.append(str);
        sb.append(", feature=");
        sb.append(valueOf);
        sb.append(", fragmentSearchTag=");
        sb.append(valueOf2);
        sb.append(", mapInteractionEnabled=");
        sb.append(z);
        sb.append(", showOverlays=");
        sb.append(z2);
        sb.append(", darkLaunch=");
        sb.append(z3);
        sb.append(", systemHealthEventSpanName=");
        sb.append(valueOf3);
        sb.append(", timeoutMs=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
