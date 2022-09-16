package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: adwk  reason: default package */
/* loaded from: classes2.dex */
public class adwk implements jad {
    private final gga a;
    private final dxio<apyz> b;
    private final ilo c;
    private final cjtd d;

    public adwk(gga ggaVar, dxio<apyz> dxioVar, ilo iloVar, cjta cjtaVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = iloVar;
        this.d = cjtaVar.b(dtxr.bG);
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jad
    public cqkl c() {
        try {
            this.b.a().m(this.c, apzb.COMMUNITY_FEED);
        } catch (RuntimeException e) {
            bvoo.i(e);
        }
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return this.d;
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.a.getString(R.string.YOUR_EXPLORE_MESSAGE_BUSINESS);
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
