package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: klu  reason: default package */
/* loaded from: classes7.dex */
public class klu implements klh {
    private final CharSequence a;
    private final String b;
    private final int c;
    private final cqtd d;
    private final cqtd e;
    private final klt f;
    private final View.OnFocusChangeListener g;
    private final ddho h;
    private final int i;
    private final int j;

    public klu(CharSequence charSequence, String str, int i, int i2, cqtd cqtdVar, cqtd cqtdVar2, klt kltVar, View.OnFocusChangeListener onFocusChangeListener, ddho ddhoVar, int i3) {
        this.a = charSequence;
        this.b = str;
        this.c = i;
        this.i = i2;
        this.d = cqtdVar;
        this.e = cqtdVar2;
        this.f = kltVar;
        this.g = onFocusChangeListener;
        this.h = ddhoVar;
        this.j = i3;
    }

    @Override // defpackage.klh
    public cqtd a() {
        return this.d;
    }

    @Override // defpackage.klh
    public cqtd b() {
        return this.e;
    }

    @Override // defpackage.klh
    public CharSequence c() {
        return this.a;
    }

    @Override // defpackage.klh
    public cqkl d() {
        astd s = aste.s();
        assw asswVar = (assw) s;
        asswVar.b = this.b;
        asswVar.c = dpvf.b(this.c);
        s.d(this.a.toString());
        s.f(this.h);
        s.j(mex.a());
        this.f.a(s.a(), this.i);
        return cqkl.a;
    }

    @Override // defpackage.klh
    public View.OnFocusChangeListener e() {
        return this.g;
    }

    @Override // defpackage.klh
    @dzsi
    public cjtd f() {
        cjta b = cjtd.b();
        b.d = this.h;
        b.i(this.j);
        return b.a();
    }
}
