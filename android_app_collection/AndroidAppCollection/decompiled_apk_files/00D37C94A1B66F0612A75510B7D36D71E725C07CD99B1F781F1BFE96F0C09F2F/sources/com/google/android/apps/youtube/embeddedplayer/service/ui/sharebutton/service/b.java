package com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.service;

import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.service.f;
import com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements d, ynl {
    public ahia a;
    public ahhw b;
    public PlayerResponseModel c;
    public apoj d;
    public boolean e;
    public final rvx f;
    private final f h;
    private final Context i;

    public b(f fVar, rvx rvxVar, Context context, byte[] bArr) {
        this.h = fVar;
        this.f = rvxVar;
        this.i = context;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        aube aubeVar;
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    ahhw ahhwVar = (ahhw) obj;
                    this.b = ahhwVar;
                    this.c = ahhwVar.b();
                    a();
                    return null;
                } else if (i == 2) {
                    this.a = (ahia) obj;
                    a();
                    return null;
                } else {
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
                }
            }
            WatchNextResponseModel a = ((ahhm) obj).a();
            if (a == null || (aubeVar = a.i) == null) {
                this.d = null;
                a();
                return null;
            }
            aubf aubfVar = aubeVar.e;
            if (aubfVar == null) {
                aubfVar = aubf.a;
            }
            if ((aubfVar.b & 1) != 0) {
                aubf aubfVar2 = aubeVar.e;
                if (aubfVar2 == null) {
                    aubfVar2 = aubf.a;
                }
                apoj apojVar = aubfVar2.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
                this.d = apojVar;
            } else {
                this.d = null;
            }
            a();
            return null;
        }
        return new Class[]{ahhm.class, ahhw.class, ahia.class};
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d
    public final void s() {
        apoj apojVar = this.d;
        PlayerResponseModel playerResponseModel = this.c;
        if (apojVar == null || playerResponseModel == null) {
            return;
        }
        zgt.H(this.i, playerResponseModel.A(), zgt.h(playerResponseModel.B()));
        if ((apojVar.b & 32768) == 0) {
            return;
        }
        this.h.j(apojVar.t.I());
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.sharebutton.shared.d
    public final void t() {
        apoj apojVar = this.d;
        if (apojVar != null) {
            this.h.q(apojVar.t.I());
        } else {
            afus.b(2, 4, "Share button renderer not received.");
        }
    }

    public final void a() {
        if (!this.e) {
            ahia ahiaVar = this.a;
            boolean z = false;
            if (ahiaVar != null && this.b != null && (((!ahiaVar.c() && !this.a.e() && !this.a.f() && this.a.a() != 7 && this.a.a() != 4) || !this.b.c().h()) && this.d != null)) {
                z = true;
            }
            if (this.f.e(R.id.player_share_button) == z) {
                return;
            }
            this.f.d(R.id.player_share_button, z);
            apoj apojVar = this.d;
            if (apojVar == null) {
                return;
            }
            this.h.q(apojVar.t.I());
        }
    }
}
