package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: brbf  reason: default package */
/* loaded from: classes4.dex */
public class brbf implements jad {
    final /* synthetic */ brbg a;
    private boolean b = false;
    private boolean c = false;

    public brbf(brbg brbgVar) {
        this.a = brbgVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return Boolean.valueOf(this.c);
    }

    public void b(boolean z) {
        this.c = z;
        cqkx.p(this);
    }

    @Override // defpackage.jad
    public cqkl c() {
        j(false);
        this.a.b.a();
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.b;
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.a.c.getString(R.string.SEARCH_THIS_AREA);
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
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }

    public void j(boolean z) {
        this.b = z;
        cqkx.p(this);
    }
}
