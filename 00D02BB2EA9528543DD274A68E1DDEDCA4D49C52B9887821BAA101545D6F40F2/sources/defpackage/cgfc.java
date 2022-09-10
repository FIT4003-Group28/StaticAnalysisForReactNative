package defpackage;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cgfc  reason: default package */
/* loaded from: classes4.dex */
public final class cgfc extends gen {
    public cqkj a;
    private final boov b = new cgfb(this);

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        cgwt cgwtVar = new cgwt(this.b, J());
        cqkf c = this.a.c(new cgff(), null);
        c.e(cgwtVar);
        Dialog dialog = new Dialog(J(), 16973840);
        dialog.setContentView(c.c());
        return dialog;
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyd.s;
    }
}
