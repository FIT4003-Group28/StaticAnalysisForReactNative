package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;
/* compiled from: PG */
/* renamed from: dzg  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dzg implements Runnable {
    public final /* synthetic */ dzs a;
    private final /* synthetic */ int b;

    public /* synthetic */ dzg(dzs dzsVar) {
        this.a = dzsVar;
    }

    public /* synthetic */ dzg(dzs dzsVar, int i) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, byte[] bArr) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, char[] cArr) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, float[] fArr) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, int[] iArr) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, short[] sArr) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, boolean[] zArr) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, byte[][] bArr) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, char[][] cArr) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, float[][] fArr) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, int[][] iArr) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, short[][] sArr) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, boolean[][] zArr) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, byte[][][] bArr) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, char[][][] cArr) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, int[][][] iArr) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, short[][][] sArr) {
        this.b = i;
        this.a = dzsVar;
    }

    public dzg(dzs dzsVar, int i, boolean[][][] zArr) {
        this.b = i;
        this.a = dzsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((aksw) this.a.V.get()).b();
                return;
            case 1:
                this.a.e(false);
                return;
            case 2:
                dzs dzsVar = this.a;
                ((efz) dzsVar.aO.get()).f(((edw) dzsVar.au.get()).a());
                return;
            case 3:
                ((acrr) this.a.aF.get()).a();
                return;
            case 4:
                ((aidn) this.a.aD.get()).a((aidi) this.a.aE.get());
                this.a.c();
                return;
            case 5:
                ((akum) this.a.u.get()).b();
                this.a.c();
                return;
            case 6:
                dqt.s(this.a.bc);
                dpc.a(this.a.bc);
                return;
            case 7:
                ((yqw) this.a.P.get()).c();
                this.a.c();
                return;
            case 8:
                ((jdl) this.a.F.get()).b();
                return;
            case 9:
                ((aggc) this.a.H.get()).a();
                return;
            case 10:
                ((akws) this.a.aJ.get()).a();
                return;
            case 11:
                dzs dzsVar2 = this.a;
                new yvz(dzsVar2.bc, (ywa) dzsVar2.ar.get(), (yni) dzsVar2.h.get()).a();
                dzsVar2.c();
                this.a.c();
                return;
            case 12:
                ((aacr) this.a.aj.get()).a();
                this.a.c();
                return;
            case 13:
                aaaw.d((aavp) this.a.C.get());
                vwl.a((yjs) this.a.ao.get(), (aacz) this.a.at.get());
                return;
            case 14:
                agbo.e((aadd) this.a.as.get(), (yjs) this.a.ao.get(), (snc) this.a.aG.get(), 0, false);
                azqb azqbVar = this.a.al;
                azqbVar.getClass();
                agbl.c((aadd) this.a.as.get(), (yjs) this.a.ao.get(), new dzk(azqbVar));
                this.a.c();
                return;
            case 15:
                ((acss) this.a.A.get()).c();
                return;
            case 16:
                if (!eog.aI((aacz) this.a.at.get())) {
                    return;
                }
                ((aacg) this.a.aK.get()).b();
                return;
            case 17:
                this.a.aC.get();
                return;
            case 18:
                if (!((yrj) this.a.ap.get()).n()) {
                    return;
                }
                ComponentName componentName = new ComponentName(this.a.bc, "com.google.android.youtube.ManageNetworkUsageActivity");
                PackageManager packageManager = this.a.bc.getPackageManager();
                if (packageManager.getComponentEnabledSetting(componentName) == 1) {
                    return;
                }
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
                return;
            case 19:
                yqi yqiVar = (yqi) this.a.aP.get();
                if (!yqiVar.a()) {
                    return;
                }
                afxg afxgVar = (afxg) this.a.B.get();
                for (Uri uri : yqiVar.b) {
                    afxgVar.a(uri);
                }
                return;
            default:
                if (!YouTubeBackupAgent.f((zen) this.a.av.get())) {
                    return;
                }
                YouTubeBackupAgent.g(this.a.bc);
                dzs dzsVar3 = this.a;
                dzsVar3.b = YouTubeBackupAgent.a(dzsVar3.bc);
                return;
        }
    }
}
