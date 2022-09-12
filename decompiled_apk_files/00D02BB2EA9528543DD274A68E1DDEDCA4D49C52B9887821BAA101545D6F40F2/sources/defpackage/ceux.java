package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: ceux  reason: default package */
/* loaded from: classes4.dex */
public class ceux implements cetj {
    private final ceuz a;
    private final int b;

    public ceux(ceuz ceuzVar, int i) {
        this.a = ceuzVar;
        this.b = i;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.cetj
    public Boolean b() {
        return false;
    }

    @Override // defpackage.jad
    public cqkl c() {
        this.a.f();
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(dtxl.fE);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return String.format(Locale.US, " +%d ", Integer.valueOf(this.b));
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }
}
