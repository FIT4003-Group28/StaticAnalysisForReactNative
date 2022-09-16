package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
/* compiled from: PG */
/* renamed from: pzl  reason: default package */
/* loaded from: classes4.dex */
public final class pzl extends qgf {
    public final Context a;
    public final qai b;
    public final qbm c;
    public final qem d;

    public pzl() {
    }

    public pzl(Context context, String str) {
        qem qemVar = new qem();
        this.d = qemVar;
        this.a = context;
        this.b = qai.a;
        this.c = (qbm) new qan(qar.a(), context, new AdSizeParcel("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false), str, qemVar).d(context);
    }

    @Override // defpackage.qgf
    public final void a(pzf pzfVar) {
        try {
            qbm qbmVar = this.c;
            if (qbmVar == null) {
                return;
            }
            qbmVar.p(new qbv(pzfVar));
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgf
    public final void b(boolean z) {
        try {
            qbm qbmVar = this.c;
            if (qbmVar == null) {
                return;
            }
            qbmVar.q(z);
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.qgf
    public final void c() {
        qfl.e("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        try {
            qbm qbmVar = this.c;
            if (qbmVar == null) {
                return;
            }
            qbmVar.s(rac.a(null));
        } catch (RemoteException e) {
            qfl.h("#007 Could not call remote method.", e);
        }
    }
}
