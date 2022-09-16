package defpackage;

import com.google.android.libraries.youtube.ads.model.PlayerAd;
/* compiled from: PG */
/* renamed from: fvd  reason: default package */
/* loaded from: classes3.dex */
public final class fvd {
    public atds a;
    public apzj b;

    public static boolean c(PlayerAd playerAd, wzq wzqVar) {
        if (playerAd == null) {
            return false;
        }
        return playerAd.aa() ? wzqVar == wzq.USER_SKIPPED || wzqVar == wzq.USER_MUTED : wzqVar != wzq.VIDEO_ERROR;
    }

    public final void a(apzj apzjVar) {
        if (apzjVar != null) {
            aweu aweuVar = apzjVar.e;
            if (aweuVar == null) {
                aweuVar = aweu.a;
            }
            int Q = awwc.Q(aweuVar.b);
            if (Q == 0 || Q != 3) {
                return;
            }
        }
        this.b = apzjVar;
    }

    public final void b(atds atdsVar) {
        int N;
        if (atdsVar == null || ((N = almu.N(atdsVar.h)) != 0 && N == 3)) {
            this.a = atdsVar;
        }
    }
}
