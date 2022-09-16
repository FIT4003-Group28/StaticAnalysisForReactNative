package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: zsm  reason: default package */
/* loaded from: classes7.dex */
public final class zsm implements cjyu<zej> {
    @Override // defpackage.cjyu
    @dzsi
    public final /* bridge */ /* synthetic */ zej a(Context context, cjzt cjztVar, dtkx dtkxVar, dtlf dtlfVar) {
        dtku dtkuVar = dtkxVar.b;
        if (dtkuVar == null) {
            dtkuVar = dtku.p;
        }
        dtqq dtqqVar = dtkuVar.g;
        if (dtqqVar == null) {
            dtqqVar = dtqq.d;
        }
        cjta cjtaVar = new cjta();
        cjtaVar.b = cjztVar.b;
        cjtaVar.g(dtqqVar.c);
        dvnp dvnpVar = cjztVar.e;
        if (dvnpVar != null) {
            cjtaVar.f = dvnpVar;
        }
        vtn qa = ((vtm) btsr.a(vtm.class)).qa();
        doqf doqfVar = dtqqVar.a;
        if (doqfVar == null) {
            doqfVar = doqf.b;
        }
        zsf e = zsh.e(qa, doqfVar);
        if (e == null) {
            return null;
        }
        return new zsl(e, cjtaVar.a(), cjztVar, dtqqVar);
    }
}
