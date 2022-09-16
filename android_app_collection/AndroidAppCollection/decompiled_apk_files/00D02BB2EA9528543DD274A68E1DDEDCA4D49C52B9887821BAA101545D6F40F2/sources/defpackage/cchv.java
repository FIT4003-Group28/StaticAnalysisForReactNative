package defpackage;

import android.app.AlertDialog;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cchv  reason: default package */
/* loaded from: classes4.dex */
final class cchv implements cgrd<duwb> {
    private final cchj a;

    public cchv(cchj cchjVar) {
        this.a = cchjVar;
    }

    @Override // defpackage.cgrd
    public final void a(btzy btzyVar) {
        cchj cchjVar = this.a;
        cchjVar.g.n(cchi.NOT_CHECKED);
        if (!cchjVar.aD) {
            return;
        }
        ppw.b(cchjVar.J(), new cchf(cchjVar), new cchg(cchjVar));
    }

    @Override // defpackage.cgrd
    public final void b() {
        this.a.q();
    }

    @Override // defpackage.cgrd
    public final /* bridge */ /* synthetic */ void c(duwb duwbVar) {
        duwb duwbVar2 = duwbVar;
        cchj cchjVar = this.a;
        if (!cchjVar.aD) {
            cchjVar.g.n(cchi.NOT_CHECKED);
        } else if (!duwbVar2.b) {
            cchjVar.g.n(cchi.NOT_ELIGIBLE);
            cchjVar.c.s(1);
            AlertDialog create = new AlertDialog.Builder(cchjVar.J()).setMessage(duwbVar2.c).setPositiveButton(R.string.OK_BUTTON, new cchh(cchjVar)).create();
            create.setCanceledOnTouchOutside(false);
            create.show();
        } else {
            cchjVar.g.n(cchi.ELIGIBLE);
            if ((duwbVar2.a & 4) == 0) {
                return;
            }
            cchl cchlVar = cchjVar.g;
            dpvk dpvkVar = duwbVar2.d;
            if (dpvkVar == null) {
                dpvkVar = dpvk.d;
            }
            if ((cchlVar.b.a & 2) != 0) {
                return;
            }
            cchlVar.p(dpvkVar);
        }
    }
}
