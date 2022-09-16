package defpackage;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bpdi  reason: default package */
/* loaded from: classes3.dex */
public class bpdi extends gen {
    public cqkj a;
    public bpdl b;
    private boxe c;

    @Override // defpackage.gen
    public final Dialog i(@dzsi Bundle bundle) {
        cqkf c = this.a.c(new bpmr(), null);
        if (bundle == null) {
            bundle = this.o;
        }
        boxe boxeVar = (boxe) bundle.getSerializable("SCHEDULE_MODEL_KEY");
        this.c = boxeVar;
        bpdl bpdlVar = this.b;
        bpdl.a(this, 1);
        bpdl.a(boxeVar, 2);
        cqhn a = bpdlVar.a.a();
        bpdl.a(a, 3);
        cztz a2 = bpdlVar.b.a();
        bpdl.a(a2, 4);
        bptc a3 = bpdlVar.c.a();
        bpdl.a(a3, 5);
        c.e(new bpdk(this, boxeVar, a, a2, a3));
        Dialog dialog = new Dialog(J());
        dialog.setContentView(c.c());
        return dialog;
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.cJ;
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putSerializable("SCHEDULE_MODEL_KEY", this.c);
    }
}
