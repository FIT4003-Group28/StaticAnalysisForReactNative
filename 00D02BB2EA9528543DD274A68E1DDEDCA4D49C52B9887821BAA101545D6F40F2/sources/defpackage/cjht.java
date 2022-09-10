package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjht  reason: default package */
/* loaded from: classes4.dex */
public final class cjht extends cjhn {
    public cjtd a;
    public View.OnClickListener b;
    public cqss c;
    public Boolean d;
    public Boolean e;
    public CharSequence f;
    public cqss g;
    public jhp h;
    public CharSequence i;
    public View.OnClickListener j;
    public Boolean k;
    public dccx<cjhe> l;
    public dcdc<cjhe> m;
    private cjtd n;
    private cjtd o;
    private dcdc<cjew> p;

    @Override // defpackage.cjhn
    public final cjho a() {
        dccx<cjhe> dccxVar = this.l;
        if (dccxVar != null) {
            this.m = dccxVar.f();
        } else if (this.m == null) {
            this.m = dcdc.e();
        }
        String str = this.c == null ? " backgroundColor" : "";
        if (this.d == null) {
            str = str.concat(" showRoundedCorners");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" showBorder");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" screenReaderFocusable");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" actionButtonList");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cjhu(this.n, this.o, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.p, this.m);
    }

    @Override // defpackage.cjhn
    public final void b(dcdc<cjew> dcdcVar) {
        if (dcdcVar != null) {
            this.p = dcdcVar;
            return;
        }
        throw new NullPointerException("Null actionButtonList");
    }

    @Override // defpackage.cjhn
    public final void c(@dzsi cjtd cjtdVar) {
        this.n = cjtdVar;
    }

    @Override // defpackage.cjhn
    public final void d(@dzsi cjtd cjtdVar) {
        this.o = cjtdVar;
    }
}
