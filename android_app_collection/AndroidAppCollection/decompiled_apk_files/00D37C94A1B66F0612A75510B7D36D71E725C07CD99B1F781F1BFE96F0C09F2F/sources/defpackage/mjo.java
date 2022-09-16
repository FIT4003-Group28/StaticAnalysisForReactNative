package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: mjo  reason: default package */
/* loaded from: classes3.dex */
final class mjo extends kqs {
    private final ajrp o;

    public mjo(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, int i, ajrx ajrxVar, ajxz ajxzVar, ftb ftbVar) {
        super(context, ajmyVar, ajycVar, i, ajxzVar, null, null, ftbVar);
        this.o = new ajrp(aafoVar, ajrxVar);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajru
    /* renamed from: n */
    public final void oK(ajrs ajrsVar, arer arerVar) {
        apzg apzgVar;
        ajrp ajrpVar = this.o;
        acti actiVar = ajrsVar.a;
        if ((arerVar.b & 512) != 0) {
            apzgVar = arerVar.i;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
    }

    @Override // defpackage.kqs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.o.c();
    }
}
