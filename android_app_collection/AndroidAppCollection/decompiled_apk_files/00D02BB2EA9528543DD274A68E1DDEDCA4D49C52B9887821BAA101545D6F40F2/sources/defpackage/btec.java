package defpackage;

import androidx.preference.Preference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btec  reason: default package */
/* loaded from: classes4.dex */
public final class btec implements aub {
    final /* synthetic */ btem a;

    public btec(btem btemVar) {
        this.a = btemVar;
    }

    @Override // defpackage.aub
    public final boolean a(Preference preference, Object obj) {
        dowa dowaVar = dowa.KILOMETERS;
        aufa aufaVar = aufa.AUTO;
        cres cresVar = cres.LOUDER;
        dowl dowlVar = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
        btdw btdwVar = btdw.START;
        int ordinal = ((btdw) obj).ordinal();
        if (ordinal == 0) {
            this.a.ag.ai(bvjk.eL, cres.SOFTER);
            this.a.ao.i(cjtd.a(dtxw.aU));
        } else if (ordinal == 1) {
            this.a.ag.ai(bvjk.eL, cres.NORMAL);
            this.a.ao.i(cjtd.a(dtxw.aT));
        } else if (ordinal == 2) {
            this.a.ag.ai(bvjk.eL, cres.LOUDER);
            this.a.ao.i(cjtd.a(dtxw.aS));
        }
        return true;
    }
}
