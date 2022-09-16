package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
/* compiled from: PG */
/* renamed from: wgw  reason: default package */
/* loaded from: classes4.dex */
public final class wgw extends wgn implements wgi, ynl {
    public yzj af;
    public aasc ag;
    public yni ah;
    public acti ai;
    public ajmy aj;
    public whp ak;
    public wge al;
    public ajrh am;
    public afvn an;
    public vzk ao;
    public aafo ap;
    public boolean aq;
    private wgv ar;

    @Override // defpackage.dp
    public final void W() {
        this.ah.m(this);
        super.W();
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        this.aq = true;
        this.ah.g(this);
        this.ar.d();
    }

    @Override // defpackage.wgi
    public final void aG(wgh wghVar) {
        this.ah.d(wghVar);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                this.aq = false;
                ku();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwb.class};
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        this.aq = bundle.getBoolean("inProgress", false);
        mN(1, 0);
        if (bundle.containsKey("endpoint")) {
            try {
                byte[] byteArray = bundle.getByteArray("endpoint");
                byteArray.getClass();
                aoos b = aoos.b();
                this.ae = (apzg) aopi.parseFrom(apzg.a, byteArray, b);
            } catch (aopx unused) {
            }
        }
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mR() {
        Dialog dialog = this.d;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
        }
        super.mR();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        apzg apzgVar;
        apzg apzgVar2 = this.ae;
        auvx auvxVar = apzgVar2 == null ? null : (auvx) apzgVar2.qm(SignInEndpointOuterClass.signInEndpoint);
        if (auvxVar == null || (auvxVar.b & 2) == 0) {
            apzgVar = null;
        } else {
            apzg apzgVar3 = auvxVar.c;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            apzgVar = apzgVar3;
        }
        wgx wgxVar = new wgx(mJ(), this.af, this.ai, this.aj, this.am);
        wgv wgvVar = new wgv(wgxVar, mJ(), this.ak, this.ag, this.ao, this.an, this.al, this, apzgVar, this.ap, this.aq);
        this.ar = wgvVar;
        wgxVar.f = wgvVar;
        this.ai.d(acuo.a(14586), this.ae, null);
        return wgxVar.d;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.ar.b();
    }

    @Override // defpackage.dh, defpackage.dp
    public final void oz(Bundle bundle) {
        super.oz(bundle);
        bundle.putBoolean("inProgress", this.ar.e);
        apzg apzgVar = this.ae;
        if (apzgVar != null) {
            bundle.putByteArray("endpoint", apzgVar.toByteArray());
        }
    }
}
