package defpackage;

import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: wqw  reason: default package */
/* loaded from: classes4.dex */
public final class wqw {
    final /* synthetic */ wqx a;

    public wqw(wqx wqxVar) {
        this.a = wqxVar;
    }

    public final PlayerAd a() {
        return this.a.e;
    }

    public final PlayerResponseModel b() {
        return this.a.d;
    }

    public final String c() {
        return this.a.c;
    }

    public final void d(wzq wzqVar) {
        this.a.f = null;
        int a = xci.a(wzqVar);
        if (a == 0) {
            this.a.qJ(0);
            wqx wqxVar = this.a;
            wqxVar.a.j(wqxVar.b);
        } else if (a == 1) {
            this.a.a.i(new wuo("Custom display error"));
        } else if (a == 2) {
            wqx wqxVar2 = this.a;
            wqxVar2.g.b(wqxVar2.b, 2);
        } else {
            wqz wqzVar = this.a.a;
            StringBuilder sb = new StringBuilder(53);
            sb.append("Unrecognized scenario for custom display: ");
            sb.append(a);
            wqzVar.i(new wuo(sb.toString()));
        }
    }
}
