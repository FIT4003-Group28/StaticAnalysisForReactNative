package defpackage;

import android.os.Parcelable;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
/* compiled from: PG */
/* renamed from: bvvo  reason: default package */
/* loaded from: classes4.dex */
final class bvvo extends bvvs {
    private final bvxu a;
    private final Class<? extends cqiw<bvxg>> b;
    private final WebViewCallbacks c;
    private final dbsg<Parcelable> d;

    public bvvo(bvxu bvxuVar, @dzsi Class<? extends cqiw<bvxg>> cls, @dzsi WebViewCallbacks webViewCallbacks, dbsg<Parcelable> dbsgVar) {
        this.a = bvxuVar;
        this.b = cls;
        this.c = webViewCallbacks;
        this.d = dbsgVar;
    }

    @Override // defpackage.bvvs
    public final bvxu a() {
        return this.a;
    }

    @Override // defpackage.bvvs
    @dzsi
    public final Class<? extends cqiw<bvxg>> b() {
        return this.b;
    }

    @Override // defpackage.bvvs
    @dzsi
    public final WebViewCallbacks c() {
        return this.c;
    }

    @Override // defpackage.bvvs
    public final dbsg<Parcelable> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        Class<? extends cqiw<bvxg>> cls;
        WebViewCallbacks webViewCallbacks;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bvvs) {
            bvvs bvvsVar = (bvvs) obj;
            if (this.a.equals(bvvsVar.a()) && ((cls = this.b) != null ? cls.equals(bvvsVar.b()) : bvvsVar.b() == null) && ((webViewCallbacks = this.c) != null ? webViewCallbacks.equals(bvvsVar.c()) : bvvsVar.c() == null) && this.d.equals(bvvsVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        bvxu bvxuVar = this.a;
        int i = bvxuVar.bC;
        if (i == 0) {
            i = dsst.a.b(bvxuVar).c(bvxuVar);
            bvxuVar.bC = i;
        }
        int i2 = (i ^ 1000003) * 1000003;
        Class<? extends cqiw<bvxg>> cls = this.b;
        int i3 = 0;
        int hashCode = (i2 ^ (cls == null ? 0 : cls.hashCode())) * 1000003;
        WebViewCallbacks webViewCallbacks = this.c;
        if (webViewCallbacks != null) {
            i3 = webViewCallbacks.hashCode();
        }
        return this.d.hashCode() ^ ((hashCode ^ i3) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 87 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("WebViewConfig{webViewProperties=");
        sb.append(valueOf);
        sb.append(", loadingLayoutClass=");
        sb.append(valueOf2);
        sb.append(", webViewCallbacks=");
        sb.append(valueOf3);
        sb.append(", customParam=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
