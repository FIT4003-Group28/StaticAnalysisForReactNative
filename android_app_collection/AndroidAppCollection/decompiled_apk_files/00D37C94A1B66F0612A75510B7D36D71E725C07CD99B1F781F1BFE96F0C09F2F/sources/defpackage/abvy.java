package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abvy  reason: default package */
/* loaded from: classes.dex */
public final class abvy implements tct {
    private final acho a;

    public abvy(acho achoVar) {
        this.a = achoVar;
    }

    @Override // defpackage.tct
    public final aooq a() {
        return apbk.b;
    }

    @Override // defpackage.tct
    public final /* bridge */ /* synthetic */ aynr b(Object obj, tcs tcsVar) {
        apbk apbkVar = (apbk) obj;
        achn achnVar = this.a.a;
        if (achnVar != null) {
            int i = apbkVar.c;
            if ((i & 1) == 0 || (i & 2) == 0) {
                zag.q(((ackp) achnVar).rb(), R.string.lc_add_participant_failed, 0);
            }
            ackp ackpVar = (ackp) achnVar;
            ackpVar.ao = apbkVar.e;
            ackpVar.o(apbkVar.d, 400);
        }
        return aynr.f();
    }

    @Override // defpackage.tct
    public final /* synthetic */ void c() {
    }
}
