package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: nqr  reason: default package */
/* loaded from: classes3.dex */
public final class nqr implements aiza, nxd {
    public final aynx a;
    public nqq b;
    private final aizb c;
    private final azpa d;
    private final azpa e;

    public nqr(nzy nzyVar, ezh ezhVar, aizb aizbVar, aacz aaczVar) {
        this.c = aizbVar;
        azpa as = azpa.as(false);
        this.d = as;
        azpa as2 = azpa.as(false);
        this.e = as2;
        aizbVar.a(this);
        final boolean aE = eog.aE(aaczVar);
        nzyVar.e(this);
        this.a = aynx.sn(ezhVar.h().i(aynq.LATEST), as, as2, new ayqc() { // from class: nqp
            @Override // defpackage.ayqc
            public final Object a(Object obj, Object obj2, Object obj3) {
                ezx ezxVar = (ezx) obj;
                Boolean bool = (Boolean) obj2;
                Boolean bool2 = (Boolean) obj3;
                if (!aE || ezxVar != ezx.WATCH_WHILE_FULLSCREEN) {
                    return nqq.PORTRAIT_WATCH_PANEL;
                }
                if (!bool.booleanValue() || bool2.booleanValue()) {
                    return nqq.PORTRAIT_WATCH_PANEL;
                }
                return nqq.LANDSCAPE_PLAYER_OVERLAY;
            }
        }).q(new ayqb() { // from class: nqo
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                nqr.this.b = (nqq) obj;
            }
        }).n().h(nps.d);
    }

    @Override // defpackage.aiza
    public final void d(int i, int i2) {
        this.e.c(Boolean.valueOf(this.c.b));
    }

    @Override // defpackage.nxd
    public final void ph(nxe nxeVar) {
        Rect t = nxeVar.t();
        this.d.c(Boolean.valueOf(t.width() >= t.height()));
    }
}
