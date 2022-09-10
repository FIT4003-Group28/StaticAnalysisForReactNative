package defpackage;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bnxp  reason: default package */
/* loaded from: classes3.dex */
public final class bnxp implements DialogInterface.OnCancelListener, bnyn {
    @dzsi
    public btzc a;
    @dzsi
    public ProgressDialog b;
    public final ff c;
    public final akpm d;
    public final bnyo e;
    @dzsi
    public cqd f;
    private final String g;

    public bnxp(ff ffVar, String str, akpm akpmVar, bnyo bnyoVar) {
        this.c = ffVar;
        this.g = str;
        this.d = akpmVar;
        this.e = bnyoVar;
    }

    @Override // defpackage.bnyn
    public final /* bridge */ /* synthetic */ void Rb(dssj dssjVar, @dzsi dssj dssjVar2) {
        cqd cqdVar;
        boolean z;
        dwjr dwjrVar = (dwjr) dssjVar;
        dwjt dwjtVar = (dwjt) dssjVar2;
        ProgressDialog progressDialog = this.b;
        if (progressDialog != null) {
            progressDialog.hide();
        }
        if (dwjtVar != null && (cqdVar = this.f) != null) {
            cqe cqeVar = cqdVar.b;
            cqb cqbVar = cqdVar.a;
            Iterator<dosd> it = dwjtVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                dosc b = dosc.b(it.next().b);
                if (b == null) {
                    b = dosc.TYPE_COPYRIGHTS;
                }
                if (b == dosc.TYPE_RAP_ADD_A_PLACE) {
                    cqeVar.e(cqbVar);
                    z = true;
                    break;
                }
            }
            this.f = null;
            if (z) {
                return;
            }
        }
        String str = this.g;
        bnyw bnywVar = new bnyw();
        Bundle bundle = new Bundle();
        bundle.putString("errorMessage", str);
        bnywVar.B(bundle);
        bnywVar.aJ(this.c);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        btzc btzcVar = this.a;
        if (btzcVar != null) {
            btzcVar.a();
        }
    }
}
