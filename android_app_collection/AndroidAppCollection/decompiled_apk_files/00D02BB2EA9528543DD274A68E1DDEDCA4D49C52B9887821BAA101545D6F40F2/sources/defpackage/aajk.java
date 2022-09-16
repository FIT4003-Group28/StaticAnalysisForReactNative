package defpackage;

import android.app.ProgressDialog;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aajk  reason: default package */
/* loaded from: classes2.dex */
public class aajk {
    public final gga a;
    public final chhr b;
    public final chhs c;
    public final gdc d;
    private final Executor e;
    @dzsi
    private ProgressDialog f;
    private final bujr g;

    public aajk(gga ggaVar, bujr bujrVar, Executor executor, chhr chhrVar, chht chhtVar, gdc gdcVar) {
        this.a = ggaVar;
        this.g = bujrVar;
        this.e = executor;
        this.b = chhrVar;
        this.c = chhtVar.a(dhpj.UNKNOWN_CONTRIBUTION_SOURCE);
        this.d = gdcVar;
    }

    public final void a(bdhk bdhkVar, String str, boolean z) {
        ProgressDialog progressDialog = new ProgressDialog(this.a, 0);
        this.f = progressDialog;
        progressDialog.setMessage(this.a.getString(R.string.SENDING));
        this.f.show();
        dhlm bZ = dhlp.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhlp dhlpVar = (dhlp) bZ.b;
        str.getClass();
        dhlpVar.a |= 1;
        dhlpVar.b = str;
        dnqg bZ2 = dnqh.p.bZ();
        dnmu dnmuVar = dnmu.PROPERTY_GMM;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ2.b;
        dnqhVar.l = dnmuVar.ap;
        dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        dnqh bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhlp dhlpVar2 = (dhlp) bZ.b;
        bK.getClass();
        dhlpVar2.d = bK;
        dhlpVar2.a |= 2;
        for (String str2 : bdhkVar.a().keySet()) {
            dhln bZ3 = dhlo.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dhlo dhloVar = (dhlo) bZ3.b;
            str2.getClass();
            dhloVar.a |= 1;
            dhloVar.b = str2;
            dhlo bK2 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhlp dhlpVar3 = (dhlp) bZ.b;
            bK2.getClass();
            dsrj<dhlo> dsrjVar = dhlpVar3.c;
            if (!dsrjVar.a()) {
                dhlpVar3.c = dsqw.cl(dsrjVar);
            }
            dhlpVar3.c.add(bK2);
        }
        this.g.b(bZ.bK(), new aajj(this, z), this.e);
    }

    public final void b() {
        ProgressDialog progressDialog = this.f;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f = null;
        }
    }
}
