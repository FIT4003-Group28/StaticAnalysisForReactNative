package defpackage;

import android.content.DialogInterface;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: bteo  reason: default package */
/* loaded from: classes4.dex */
final class bteo implements DialogInterface.OnClickListener {
    final /* synthetic */ bteq a;

    public bteo(bteq bteqVar) {
        this.a = bteqVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        bteq bteqVar = this.a;
        if (bteqVar.aj != null) {
            dowl f = bteqVar.af.f(vpc.JAKARTA);
            vpd vpdVar = bteqVar.af;
            vpc vpcVar = vpc.JAKARTA;
            btey bteyVar = bteqVar.aj;
            dbsk.s(bteyVar);
            boolean booleanValue = bteyVar.d().booleanValue();
            btey bteyVar2 = bteqVar.aj;
            dbsk.s(bteyVar2);
            vpdVar.h(vpcVar, booleanValue, bteyVar2.e().booleanValue());
            dowl f2 = bteqVar.af.f(vpc.JAKARTA);
            if (f != f2) {
                EnumMap k = dcjz.k(vux.class);
                k.put((EnumMap) vux.AVOID_ODD_EVEN_ROADS, (vux) Integer.valueOf(f2.t));
                bteqVar.ai.b(sri.a(k));
            }
        }
        dialogInterface.dismiss();
    }
}
