package defpackage;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: axqx  reason: default package */
/* loaded from: classes3.dex */
public class axqx extends gen {
    public cqkj a;
    public axrw b;
    axrd c;

    @Override // defpackage.ges
    public final void Nv() {
        ((axqy) btsx.b(axqy.class, this)).cw(this);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void al() {
        super.al();
        boolean aU = aU();
        aT();
        if (aU) {
            this.b.a(-1);
        }
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        cqkf c = this.a.c(new axrc(), null);
        c.e(this.c);
        Dialog dialog = new Dialog(J());
        dialog.getWindow().requestFeature(1);
        dialog.setContentView(c.c());
        return dialog;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.c = new axre(J(), this.b, this, this.o.getString("PERMISSION_TYPE_KEY"));
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxu.cM;
    }
}
