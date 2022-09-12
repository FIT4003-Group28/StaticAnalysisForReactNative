package defpackage;

import android.net.Uri;
import defpackage.dssj;
/* compiled from: PG */
/* renamed from: czjr  reason: default package */
/* loaded from: classes5.dex */
final class czjr<T extends dssj> extends czkn<T> {
    public Boolean a;
    public Boolean b;
    private Uri c;
    private T d;
    private czju<T> e;
    private dcdc<czkg<T>> f;
    private czlz<T> g;
    private Boolean h;

    @Override // defpackage.czkn
    public final czko<T> a() {
        if (this.f == null) {
            this.f = dcdc.e();
        }
        String str = this.c == null ? " uri" : "";
        if (this.d == null) {
            str = str.concat(" schema");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" handler");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" variantConfig");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" useGeneratedExtensionRegistry");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" updateSequencingBugFix");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" enableTracing");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new czjs(this.c, this.d, this.e, this.f, this.g, this.a.booleanValue(), this.b.booleanValue(), this.h.booleanValue());
    }

    @Override // defpackage.czkn
    public final void b() {
        this.h = false;
    }

    @Override // defpackage.czkn
    public final void c(czju<T> czjuVar) {
        if (czjuVar != null) {
            this.e = czjuVar;
            return;
        }
        throw new NullPointerException("Null handler");
    }

    @Override // defpackage.czkn
    public final void d(T t) {
        if (t != null) {
            this.d = t;
            return;
        }
        throw new NullPointerException("Null schema");
    }

    @Override // defpackage.czkn
    public final void e(Uri uri) {
        if (uri != null) {
            this.c = uri;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    @Override // defpackage.czkn
    public final void f(czlz<T> czlzVar) {
        if (czlzVar != null) {
            this.g = czlzVar;
            return;
        }
        throw new NullPointerException("Null variantConfig");
    }
}
