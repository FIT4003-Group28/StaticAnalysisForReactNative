package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxws  reason: default package */
/* loaded from: classes4.dex */
public class bxws implements jbf {
    private final eeu a;
    private final dzsj<avik> b;
    private final dltm c;
    private final avzp d;

    public bxws(eeu eeuVar, dzsj<avik> dzsjVar, avzp avzpVar, dltm dltmVar) {
        this.a = eeuVar;
        this.b = dzsjVar;
        this.d = avzpVar;
        this.c = dltmVar;
    }

    @Override // defpackage.jbf
    public cqtd d() {
        return cqrt.i(iup.e(R.raw.ic_offline_check), ibl.b());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        if (!this.a.b()) {
            return cqkl.a;
        }
        this.b.a().l(this.c);
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    public cjtd h() {
        return cjtd.a(dtyb.cs);
    }

    @Override // defpackage.jbf
    public CharSequence l() {
        return this.d.b(this.c);
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        return this.c.a;
    }
}
