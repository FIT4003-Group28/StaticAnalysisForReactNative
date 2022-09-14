package defpackage;

import android.content.DialogInterface;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: btds  reason: default package */
/* loaded from: classes4.dex */
final class btds implements DialogInterface.OnClickListener {
    final /* synthetic */ btdu a;

    public btds(btdu btduVar) {
        this.a = btduVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        btdu btduVar = this.a;
        vqy vqyVar = btduVar.ag;
        if (vqyVar != null) {
            dowl e = vqyVar.e();
            dowl f = btduVar.ae.f(btduVar.aQ());
            btduVar.ae.g(btduVar.aQ(), e);
            if (f != e) {
                EnumMap k = dcjz.k(vux.class);
                k.put((EnumMap) btduVar.aP(), (vux) Integer.valueOf(e.t));
                btduVar.af.b(sri.a(k));
            }
        }
        dialogInterface.dismiss();
    }
}
