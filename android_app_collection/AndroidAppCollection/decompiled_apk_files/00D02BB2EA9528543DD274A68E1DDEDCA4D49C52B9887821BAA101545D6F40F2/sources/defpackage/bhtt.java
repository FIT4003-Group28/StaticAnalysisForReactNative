package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bhtt  reason: default package */
/* loaded from: classes3.dex */
public final class bhtt implements cjyu<bhtu> {
    private final bhuh a;

    public bhtt(bhuh bhuhVar) {
        this.a = bhuhVar;
    }

    @Override // defpackage.cjyu
    public final /* bridge */ /* synthetic */ bhtu a(Context context, cjzt cjztVar, dtkx dtkxVar, dtlf dtlfVar) {
        dtku dtkuVar = dtkxVar.b;
        if (dtkuVar == null) {
            dtkuVar = dtku.p;
        }
        dtof dtofVar = dtkuVar.d;
        if (dtofVar == null) {
            dtofVar = dtof.i;
        }
        int i = dtofVar.c;
        ily ilyVar = new ily();
        dvyw dvywVar = dtofVar.b;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        ilyVar.E(dvywVar);
        ilo d = ilyVar.d();
        return this.a.a(d.by().get(i), d.bf(), false, bwrs.a(d), bhts.a);
    }
}
