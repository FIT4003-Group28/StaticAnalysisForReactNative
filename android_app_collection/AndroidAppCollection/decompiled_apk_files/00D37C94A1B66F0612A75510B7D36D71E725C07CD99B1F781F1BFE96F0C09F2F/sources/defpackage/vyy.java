package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
/* compiled from: PG */
/* renamed from: vyy  reason: default package */
/* loaded from: classes4.dex */
public final class vyy extends vzb implements wgi, ynl {
    public yzj af;
    public aasc ag;
    public vzk ah;
    public wge ai;
    public azqb aj;
    public akbk ak;
    public yni al;
    public afvn am;
    public acti an;
    public ajmy ao;
    public whp ap;
    public ajrh aq;
    public ajxz ar;
    public boolean as;
    public vyw at;
    private wgv au;

    public static vyy aF(apzg apzgVar) {
        Bundle bundle = new Bundle();
        if (apzgVar != null) {
            bundle.putByteArray("endpoint", apzgVar.toByteArray());
        }
        vyy vyyVar = new vyy();
        vyyVar.ae(bundle);
        return vyyVar;
    }

    @Override // defpackage.dp
    public final void W() {
        this.al.m(this);
        super.W();
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        this.as = true;
        this.al.g(this);
        this.au.d();
    }

    @Override // defpackage.vwy
    public final void aE(apzg apzgVar) {
        this.ae = apzgVar;
        this.an.d(acuo.a(14586), apzgVar, null);
    }

    @Override // defpackage.wgi
    public final void aG(wgh wghVar) {
        if (wghVar.a() == wgg.CANCELLED) {
            ku();
        }
        this.al.d(wghVar);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                ku();
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                this.as = false;
                ku();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{afwb.class, afwd.class};
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        this.as = bundle.getBoolean("inProgress", false);
        mN(1, 2132083899);
        if (bundle.containsKey("endpoint")) {
            try {
                aE((apzg) aopi.parseFrom(apzg.a, bundle.getByteArray("endpoint"), aoos.b()));
            } catch (aopx unused) {
            }
        }
        n(true);
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
        vza vzaVar = new vza(mJ(), this.af, this.an, this.ao, this.aq, this.at, this.aj, this.ar, this.ak);
        wgv wgvVar = new wgv(vzaVar, mJ(), this.ap, this.ag, this.ah, this.ai, this.am, this, this.at, apzgVar, (aafo) this.aj.get(), this.as);
        this.au = wgvVar;
        vzaVar.f = wgvVar;
        return vzaVar.a;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.au.b();
    }

    @Override // defpackage.dh, defpackage.dp
    public final void oz(Bundle bundle) {
        super.oz(bundle);
        apzg apzgVar = this.ae;
        if (apzgVar != null) {
            bundle.putByteArray("endpoint", apzgVar.toByteArray());
        }
        bundle.putBoolean("inProgress", this.au.e);
    }
}
