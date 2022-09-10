package defpackage;

import android.app.Service;
/* compiled from: PG */
/* renamed from: crxc  reason: default package */
/* loaded from: classes5.dex */
public final class crxc extends crxf {
    public Service a;
    private crvv b;
    private crvc c;
    private crxk d;
    private crxb e;
    private crvt f;

    @Override // defpackage.crxf
    public final void b(crvv crvvVar) {
        if (crvvVar != null) {
            this.b = crvvVar;
            return;
        }
        throw new NullPointerException("Null apiaryClient");
    }

    @Override // defpackage.crxf
    public final void c(crvc crvcVar) {
        if (crvcVar != null) {
            this.c = crvcVar;
            return;
        }
        throw new NullPointerException("Null authTokenRetriever");
    }

    @Override // defpackage.crxf
    public final void d(crvt crvtVar) {
        if (crvtVar != null) {
            this.f = crvtVar;
            return;
        }
        throw new NullPointerException("Null clearcutReporter");
    }

    @Override // defpackage.crxf
    public final void e(crxb crxbVar) {
        if (crxbVar != null) {
            this.e = crxbVar;
            return;
        }
        throw new NullPointerException("Null requestInfo");
    }

    @Override // defpackage.crxf
    public final void f(crxk crxkVar) {
        if (crxkVar != null) {
            this.d = crxkVar;
            return;
        }
        throw new NullPointerException("Null taskContext");
    }

    @Override // defpackage.crxf
    public final crxg a() {
        String str = this.a == null ? " service" : "";
        if (this.b == null) {
            str = str.concat(" apiaryClient");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" authTokenRetriever");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" taskContext");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" requestInfo");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" clearcutReporter");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new crxd(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
