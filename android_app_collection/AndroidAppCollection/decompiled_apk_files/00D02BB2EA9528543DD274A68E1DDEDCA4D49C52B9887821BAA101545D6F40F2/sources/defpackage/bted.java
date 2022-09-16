package defpackage;

import androidx.preference.Preference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bted  reason: default package */
/* loaded from: classes4.dex */
public final class bted implements aub {
    final /* synthetic */ btem a;

    public bted(btem btemVar) {
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
            this.a.ag.ai(bvjk.aS, aufa.AUTO);
            this.a.as.e(aufa.AUTO);
            this.a.ao.i(cjtd.a(dtxw.aW));
        } else if (ordinal == 1) {
            this.a.ag.ai(bvjk.aS, aufa.FORCE_DAY);
            this.a.as.e(aufa.FORCE_DAY);
            this.a.ao.i(cjtd.a(dtxw.aX));
        } else if (ordinal == 2) {
            this.a.ag.ai(bvjk.aS, aufa.FORCE_NIGHT);
            this.a.as.e(aufa.FORCE_NIGHT);
            this.a.ao.i(cjtd.a(dtxw.aY));
        }
        return true;
    }
}
