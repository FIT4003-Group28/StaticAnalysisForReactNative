package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: mjq  reason: default package */
/* loaded from: classes3.dex */
final class mjq extends kqs {
    private final ajrp o;

    public mjq(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, int i, ajrx ajrxVar, ajxz ajxzVar) {
        super(context, ajmyVar, ajycVar, i, ajxzVar);
        this.o = new ajrp(aafoVar, ajrxVar);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajru
    /* renamed from: n */
    public final void oK(ajrs ajrsVar, arev arevVar) {
        apzg apzgVar;
        ajrp ajrpVar = this.o;
        acti actiVar = ajrsVar.a;
        if ((arevVar.b & 16) != 0) {
            apzgVar = arevVar.e;
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
