package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsri  reason: default package */
/* loaded from: classes4.dex */
public class bsri extends iwl {
    private final gga a;

    public bsri(gga ggaVar, eeu eeuVar, btrm btrmVar, dzsj<afwt> dzsjVar, dzsj<axxi> dzsjVar2, dxio<apyz> dxioVar, dxio<bvkx> dxioVar2, dxio<axwq> dxioVar3, acyp acypVar, btvo btvoVar) {
        super(ggaVar, eeuVar, dzsjVar, dzsjVar2, dxioVar, btrmVar, dxioVar2, dxioVar3, acypVar, null, null);
        this.a = ggaVar;
    }

    @Override // defpackage.iwl, defpackage.izi
    public cqtd c() {
        return cqrt.f(2131231588);
    }

    @Override // defpackage.iwl, defpackage.izi
    public Boolean d() {
        return true;
    }

    @Override // defpackage.iwl, defpackage.izi
    public cqkl e() {
        if (!this.a.g().J()) {
            this.a.s();
        }
        return cqkl.a;
    }

    @Override // defpackage.iwl, defpackage.izi
    public cjtd h() {
        return cjtd.a(dtxv.F);
    }

    @Override // defpackage.iwl, defpackage.izi
    public Boolean i() {
        return false;
    }

    @Override // defpackage.iwl, defpackage.izi
    /* renamed from: k */
    public String f() {
        return this.a.getString(R.string.ACCESSIBILITY_BACK_BUTTON);
    }
}
