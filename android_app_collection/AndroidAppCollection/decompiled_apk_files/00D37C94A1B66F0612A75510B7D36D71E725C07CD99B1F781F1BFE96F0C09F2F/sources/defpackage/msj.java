package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: msj  reason: default package */
/* loaded from: classes3.dex */
final class msj extends mfs {
    public final snc a;
    private final ajrp b;

    public msj(Context context, ajmy ajmyVar, View view, aafo aafoVar, jkv jkvVar, ftb ftbVar, kua kuaVar, snc sncVar, akem akemVar) {
        super(context, ajmyVar, new ajsn(), view, aafoVar, jkvVar, ftbVar, kuaVar);
        aafoVar.getClass();
        view.getClass();
        this.b = new ajrp(aafoVar, view);
        this.a = sncVar;
        akemVar.b(this.i, akemVar.a(this.i, null));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.i;
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, awar awarVar) {
        avxe avxeVar = awarVar.C;
        if (avxeVar == null) {
            avxeVar = avxe.a;
        }
        apzg apzgVar = null;
        if ((avxeVar.b & 1) != 0) {
            avxe avxeVar2 = awarVar.C;
            if (avxeVar2 == null) {
                avxeVar2 = avxe.a;
            }
            C(ajrsVar, avxeVar2);
            s(ajrsVar, null);
        }
        ajrp ajrpVar = this.b;
        acti actiVar = ajrsVar.a;
        if ((awarVar.b & 32768) != 0 && (apzgVar = awarVar.n) == null) {
            apzgVar = apzg.a;
        }
        ajrpVar.b(actiVar, apzgVar, ajrsVar.e(), this);
    }

    @Override // defpackage.mfs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.b.c();
    }
}
