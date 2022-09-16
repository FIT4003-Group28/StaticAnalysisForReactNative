package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
/* compiled from: PG */
/* renamed from: vwx  reason: default package */
/* loaded from: classes4.dex */
public final class vwx extends vwu implements AdapterView.OnItemClickListener {
    public afvt ae;
    public yni af;
    public afve ag;
    public apzg ah;

    @Override // defpackage.vew
    protected final /* bridge */ /* synthetic */ ListAdapter aG() {
        vev vevVar = new vev(mJ());
        vww vwwVar = new vww(mJ().getString(R.string.turn_off_incognito));
        vwwVar.e = akf.a(mJ(), 2131232541);
        vwwVar.f(zhn.j(mJ(), R.attr.ytTextPrimary).orElse(-16777216));
        vevVar.add(vwwVar);
        return vevVar;
    }

    @Override // defpackage.vew
    protected final AdapterView.OnItemClickListener aI() {
        return this;
    }

    @Override // defpackage.vew
    protected final String aJ() {
        return null;
    }

    @Override // defpackage.vew, defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        if (bundle.containsKey("endpoint")) {
            try {
                this.ah = (apzg) aopi.parseFrom(apzg.a, bundle.getByteArray("endpoint"), aoos.b());
            } catch (aopx unused) {
            }
        }
    }

    @Override // defpackage.vew, defpackage.dh, defpackage.dp
    public final void mS() {
        View view = this.O;
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
        }
        super.mS();
    }

    @Override // defpackage.vew
    protected final int mv() {
        return 0;
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.af.d(new wgh(wgg.CANCELLED, false, null));
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        apzg apzgVar = this.ah;
        apzg apzgVar2 = null;
        auvx auvxVar = apzgVar == null ? null : (auvx) apzgVar.qm(SignInEndpointOuterClass.signInEndpoint);
        if (auvxVar != null && (auvxVar.b & 2) != 0 && (apzgVar2 = auvxVar.c) == null) {
            apzgVar2 = apzg.a;
        }
        this.ae.f(this.ag, apzgVar2);
        dismiss();
    }

    @Override // defpackage.dh, defpackage.dp
    public final void oz(Bundle bundle) {
        super.oz(bundle);
        apzg apzgVar = this.ah;
        if (apzgVar != null) {
            bundle.putByteArray("endpoint", apzgVar.toByteArray());
        }
    }
}
