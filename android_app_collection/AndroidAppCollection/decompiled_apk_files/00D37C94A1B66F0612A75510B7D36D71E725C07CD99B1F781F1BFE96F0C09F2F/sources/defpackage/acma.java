package defpackage;

import android.app.AlertDialog;
import android.view.View;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acma  reason: default package */
/* loaded from: classes.dex */
public final class acma implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ acmb b;

    public acma(acmb acmbVar, int i) {
        this.b = acmbVar;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a < this.b.b.c.size()) {
            ashz ashzVar = this.b.b;
            aunb aunbVar = ((ashy) ashzVar.c.get(this.a)).k;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(ConfirmDialogRendererOuterClass.confirmDialogRenderer)) {
                return;
            }
            acmb acmbVar = this.b;
            if (acmbVar.d == null || acmbVar.c == null) {
                return;
            }
            ashz ashzVar2 = acmbVar.b;
            aunb aunbVar2 = ((ashy) ashzVar2.c.get(this.a)).k;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            aqft aqftVar = (aqft) aunbVar2.qm(ConfirmDialogRendererOuterClass.confirmDialogRenderer);
            if (aqftVar == null || aqftVar.g.size() <= 0 || (aqftVar.b & 64) == 0) {
                return;
            }
            apok apokVar = aqftVar.i;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((apokVar.b & 1) == 0) {
                return;
            }
            acmb acmbVar2 = this.b;
            String charSequence = ajjh.j(aqftVar, acmbVar2.c).toString();
            apok apokVar2 = aqftVar.i;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            arag aragVar = apojVar.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            new AlertDialog.Builder(acmbVar2.a).setMessage(charSequence).setNegativeButton(ajgl.b(aragVar), new gzj(12)).create().show();
        }
    }
}
