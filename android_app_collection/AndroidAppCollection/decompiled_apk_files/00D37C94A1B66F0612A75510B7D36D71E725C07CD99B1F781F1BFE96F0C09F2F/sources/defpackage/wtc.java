package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wtc  reason: default package */
/* loaded from: classes4.dex */
public final class wtc implements wlk {
    public final azqb a;
    public final Set b = new HashSet();
    public String c;
    public PlayerResponseModel d;
    public ajbf e;
    private final azqb f;
    private final azqb g;

    public wtc(azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.f = azqbVar;
        this.g = azqbVar2;
        this.a = azqbVar3;
    }

    @Override // defpackage.wlk
    public final void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
        aika aikaVar2 = aika.NEW;
        int ordinal = aikaVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2 || !playerResponseModel.c().aw()) {
                return;
            }
            this.c = str;
            this.d = playerResponseModel;
            this.e = ajbfVar;
            ajbk d = ajbfVar.d();
            if (d == null) {
                return;
            }
            d.p((wth) this.g.get());
            d.o((wth) this.g.get());
            return;
        }
        this.c = null;
        this.d = null;
        this.e = null;
        this.b.clear();
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
    public final /* synthetic */ void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qG(String str, long j, long j2, long j3, boolean z) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qK(String str, int i) {
    }

    @Override // defpackage.wlk
    public final void qM(ahgc ahgcVar) {
        PlayerResponseModel playerResponseModel;
        String str;
        final aeso a = ahgcVar.a();
        if (a == null || this.b.contains(a.a)) {
            return;
        }
        int i = a.b;
        if ((i != 0 && i != 1) || a.a() == -1 || (playerResponseModel = this.d) == null || !playerResponseModel.c().aw()) {
            return;
        }
        Iterator it = this.d.C().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            aoyb aoybVar = (aoyb) it.next();
            int d = aoyt.d(aoybVar.d);
            if (d != 0 && d == 7) {
                str = aoybVar.e;
                break;
            }
        }
        if (str == null) {
            return;
        }
        this.b.add(a.a);
        if (this.e.d() != null) {
            this.e.d().c(new ajbg(a.a(), a.a() + a.d, 2, 4, null));
        }
        ((wtm) this.f.get()).a(5, xcb.a(this.c, this.d), new wtl() { // from class: wtb
            @Override // defpackage.wtl
            public final List a() {
                wtc wtcVar = wtc.this;
                aeso aesoVar = a;
                ajbf ajbfVar = wtcVar.e;
                PlayerResponseModel playerResponseModel2 = wtcVar.d;
                String str2 = wtcVar.c;
                wwd wwdVar = (wwd) wtcVar.a.get();
                int size = wtcVar.b.size();
                String b = wwdVar.b.b(apcd.SLOT_TYPE_PLAYER_BYTES);
                return Arrays.asList(xdu.j(b, apcd.SLOT_TYPE_PLAYER_BYTES, amuk.r(new xcr(wwdVar.b.c(apcf.TRIGGER_TYPE_LIVE_STREAM_BREAK_STARTED), apcf.TRIGGER_TYPE_LIVE_STREAM_BREAK_STARTED, aesoVar.a)), amuk.r(xea.a(wwdVar.b.c(apcf.TRIGGER_TYPE_SLOT_ID_SCHEDULED), b)), amuk.r(xdg.a(wwdVar.b.c(apcf.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str2)), xac.a(amuk.v(new xaw(aesoVar), new xbw(ajbfVar), new xat(playerResponseModel2), new xas(str2), new xae(size)))));
            }
        });
    }
}
