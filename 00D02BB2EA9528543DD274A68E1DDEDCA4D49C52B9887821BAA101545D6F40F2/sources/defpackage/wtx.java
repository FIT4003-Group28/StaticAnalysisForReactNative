package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: wtx  reason: default package */
/* loaded from: classes7.dex */
public final class wtx extends gen {
    public cqkj a;
    public wuc b;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gen
    public final /* bridge */ /* synthetic */ Dialog i(Bundle bundle) {
        Context H = H();
        Bundle bundle2 = this.o;
        dbsk.s(bundle2);
        wuc wucVar = this.b;
        drgz drgzVar = (drgz) dsuv.c(bundle2, "fare_breakdown", drgz.b, dsqa.b());
        String string = bundle2.getString("disclaimer");
        Activity activity = (Activity) ((dxjd) wucVar.a).a;
        wuc.a(activity, 1);
        wuc.a(this, 2);
        wuc.a(drgzVar, 3);
        return new wtv(H, new wub(activity, this, drgzVar, string), this.a);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxn.dw;
    }
}
