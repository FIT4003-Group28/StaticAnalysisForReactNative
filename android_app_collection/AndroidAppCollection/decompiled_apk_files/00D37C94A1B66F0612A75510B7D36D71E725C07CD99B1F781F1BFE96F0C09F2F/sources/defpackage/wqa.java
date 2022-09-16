package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.List;
/* compiled from: PG */
@wwb(a = apcb.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, b = apcd.SLOT_TYPE_IN_PLAYER, c = {xav.class})
/* renamed from: wqa  reason: default package */
/* loaded from: classes4.dex */
public final class wqa implements wqg, wlk, wlv {
    xgr a = xgr.a;
    private final wqf b;
    private final wxc c;
    private final wlw d;
    private final wll e;
    private final aiji f;
    private final xdu g;
    private final xci h;
    private final aunb i;
    private final wmt j;
    private final wmv k;

    public wqa(wqf wqfVar, wxc wxcVar, wlw wlwVar, wll wllVar, wmt wmtVar, wmv wmvVar, aiji aijiVar, xdu xduVar, xci xciVar) {
        this.b = wqfVar;
        this.c = wxcVar;
        this.d = wlwVar;
        this.e = wllVar;
        this.j = wmtVar;
        this.k = wmvVar;
        this.f = aijiVar;
        this.g = xduVar;
        this.h = xciVar;
        this.i = (aunb) xciVar.e(xav.class);
    }

    private final void i() {
        if (wpt.h(this.a)) {
            this.k.a(new acte(this.a.d));
            this.a = wpt.f(this.a);
        }
    }

    @Override // defpackage.wqg
    public final xci a() {
        throw null;
    }

    @Override // defpackage.wqg
    public final void b() {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qD(afkn afknVar) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qE(String str) {
    }

    @Override // defpackage.wlk
    public final void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
        xgr c = wpt.c(this.a, aijsVar);
        this.a = c;
        if (c.j) {
            this.d.r(c.k, c.g);
            i();
        }
    }

    @Override // defpackage.wlk
    public final void qG(String str, long j, long j2, long j3, boolean z) {
        xgr a = wpt.a(this.a, j);
        this.a = a;
        if (a.j) {
            this.d.r(a.k, a.g);
            i();
        }
    }

    @Override // defpackage.wqg
    public final void qH() {
    }

    @Override // defpackage.wqg
    public final void qI() {
        xgr e = wpt.e(this.f.g(), this.i);
        this.a = e;
        if (e.b.h()) {
            this.e.a(this);
            this.d.o(this);
            this.d.p((aoqu) this.a.b.c());
            this.d.q(true);
            return;
        }
        this.b.c(this.g, this.h, new wuo("Null CTA renderer for discovery InPlayer"));
    }

    @Override // defpackage.wqg
    public final void qJ(int i) {
        wpt.g(this.a, this.c);
        this.d.g();
        this.e.c(this);
        this.b.d(this.g, this.h, i);
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qK(String str, int i) {
    }

    @Override // defpackage.wlv
    public final void qL(Object obj, List list) {
        if (this.c.d(obj)) {
            return;
        }
        this.a = wpt.b(this.a, obj);
        this.j.a(list, actk.h(obj, false));
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }
}
