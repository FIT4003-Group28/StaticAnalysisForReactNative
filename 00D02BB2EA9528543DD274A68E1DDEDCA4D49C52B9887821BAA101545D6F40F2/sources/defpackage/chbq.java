package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: chbq  reason: default package */
/* loaded from: classes4.dex */
public class chbq implements cagf {
    private final chbp a;
    private final dwqy b;
    private final jic c;

    public chbq(chbp chbpVar, dwqy dwqyVar) {
        this.a = chbpVar;
        this.b = dwqyVar;
        this.c = new jic(dwqyVar.c, ckqc.FIFE, (cqtd) null, 0);
    }

    @Override // defpackage.cagf
    public String a() {
        return this.b.a;
    }

    @Override // defpackage.cagf
    public String b() {
        return this.b.b;
    }

    @Override // defpackage.cagf
    public Integer c() {
        return Integer.valueOf((int) R.string.UGC_TASKS_MORE_QUESTIONS);
    }

    @Override // defpackage.cagf
    public jic d() {
        return this.c;
    }

    @Override // defpackage.cagf
    public Boolean e() {
        return false;
    }

    @Override // defpackage.cagf
    public cqkl f() {
        cgdi cgdiVar = (cgdi) this.a;
        cgdiVar.a.dismiss();
        cgdiVar.b.aU();
        return cqkl.a;
    }
}
