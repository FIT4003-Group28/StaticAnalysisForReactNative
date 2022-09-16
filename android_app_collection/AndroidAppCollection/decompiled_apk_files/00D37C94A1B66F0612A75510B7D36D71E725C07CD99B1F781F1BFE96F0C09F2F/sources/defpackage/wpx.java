package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
@wwb(a = apcb.LAYOUT_TYPE_COMPANION, b = apcd.SLOT_TYPE_BELOW_PLAYER, c = {xbk.class}, d = {xat.class})
/* renamed from: wpx  reason: default package */
/* loaded from: classes4.dex */
public final class wpx implements wqg {
    private final wqf a;
    private final wlt b;
    private final xdu c;
    private final xci d;
    private final PlayerResponseModel e;

    public wpx(wqf wqfVar, wlt wltVar, xdu xduVar, xci xciVar) {
        this.a = wqfVar;
        this.b = wltVar;
        this.c = xduVar;
        this.d = xciVar;
        this.e = (PlayerResponseModel) xduVar.d(xat.class);
    }

    @Override // defpackage.wqg
    public final xci a() {
        throw null;
    }

    @Override // defpackage.wqg
    public final void b() {
    }

    @Override // defpackage.wqg
    public final void qH() {
    }

    @Override // defpackage.wqg
    public final void qI() {
        wlt wltVar = this.b;
        xci xciVar = this.d;
        String str = xciVar.a;
        wkh wkhVar = (wkh) wltVar;
        wkhVar.c();
        wkhVar.d(wkhVar.a(this.e, str, (asit) xciVar.i.f()));
        wkhVar.d = true;
        wke wkeVar = wkhVar.b;
        if (wkeVar != null) {
            wkeVar.f();
        }
        this.a.a(this.c, this.d);
    }

    @Override // defpackage.wqg
    public final void qJ(int i) {
        ((wkh) this.b).c();
        this.a.d(this.c, this.d, i);
    }
}
