package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: akyf  reason: default package */
/* loaded from: classes.dex */
public final class akyf {
    public String a;
    public Uri b;
    public Uri c;
    public alda d;
    public avuk e;
    public arxl f;
    public String g;
    public Bitmap h;
    public awbb i;
    public alcx j;
    public alcp k;
    public amuk l;
    public int m;
    private Boolean n;
    private Boolean o;
    private Boolean p;

    public akyf() {
    }

    public akyf(akyg akygVar) {
        this.a = akygVar.a;
        this.b = akygVar.b;
        this.c = akygVar.c;
        this.m = akygVar.p;
        this.d = akygVar.d;
        this.e = akygVar.e;
        this.f = akygVar.f;
        this.g = akygVar.g;
        this.h = akygVar.h;
        this.i = akygVar.i;
        this.j = akygVar.j;
        this.k = akygVar.k;
        this.l = akygVar.l;
        this.n = Boolean.valueOf(akygVar.m);
        this.o = Boolean.valueOf(akygVar.n);
        this.p = Boolean.valueOf(akygVar.o);
    }

    public final void b(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    public final void d(boolean z) {
        this.p = Boolean.valueOf(z);
    }

    public final akyg a() {
        Boolean bool = this.n;
        if (bool == null || this.o == null || this.p == null) {
            StringBuilder sb = new StringBuilder();
            if (this.n == null) {
                sb.append(" confirmed");
            }
            if (this.o == null) {
                sb.append(" creationFailed");
            }
            if (this.p == null) {
                sb.append(" unconfirmedFlowFailed");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new akyg(this.a, this.b, this.c, this.m, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, bool.booleanValue(), this.o.booleanValue(), this.p.booleanValue());
    }
}
