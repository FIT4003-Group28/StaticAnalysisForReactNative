package defpackage;

import androidx.preference.Preference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btee  reason: default package */
/* loaded from: classes4.dex */
public final class btee implements aub {
    final /* synthetic */ btem a;

    public btee(btem btemVar) {
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
            this.a.ag.ai(bvjk.z, null);
            this.a.ao.i(cjtd.a(dtxw.cr));
        } else if (ordinal == 1) {
            this.a.ag.ai(bvjk.z, dowa.KILOMETERS);
            this.a.ao.i(cjtd.a(dtxw.cs));
        } else if (ordinal == 2) {
            this.a.ag.ai(bvjk.z, dowa.MILES);
            this.a.ao.i(cjtd.a(dtxw.ct));
        }
        this.a.ai.b(new btar());
        return true;
    }
}
