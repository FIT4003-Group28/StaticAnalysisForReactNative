package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ugw  reason: default package */
/* loaded from: classes4.dex */
public final class ugw implements ugk {
    private final uhh a;
    private final ucs b;
    private final ues c;

    public ugw(ucs ucsVar, uhh uhhVar, ues uesVar) {
        this.b = ucsVar;
        this.a = uhhVar;
        this.c = uesVar;
    }

    @Override // defpackage.ugk
    public final void a(String str, aoqu aoquVar, Throwable th) {
        uev.g("BatchUpdateThreadStateCallback", "Failed to updated thread state for account: %s.", str);
        if (aoquVar != null) {
            for (aokm aokmVar : ((aokn) aoquVar).d) {
                uep c = this.c.c(17);
                ((ueu) c).l = str;
                c.h(aokmVar.c);
                c.i();
            }
        }
    }

    @Override // defpackage.ugk
    public final void b(String str, aoqu aoquVar, aoqu aoquVar2) {
        uev.e("BatchUpdateThreadStateCallback", "Successfully updated thread state for account: %s.", str);
        ArrayList arrayList = new ArrayList();
        for (aokm aokmVar : ((aokn) aoquVar).d) {
            uep a = this.c.a(aojw.SUCCEED_TO_UPDATE_THREAD_STATE);
            ((ueu) a).l = str;
            a.h(aokmVar.c);
            a.i();
            aomr aomrVar = aokmVar.d;
            if (aomrVar == null) {
                aomrVar = aomr.a;
            }
            int G = akel.G(aomrVar.f);
            if (G != 0 && G == 3) {
                arrayList.addAll(aokmVar.c);
            }
        }
        if (!arrayList.isEmpty()) {
            try {
                this.a.b(this.b.b(str), arrayList, null);
            } catch (ucr e) {
                uev.c("BatchUpdateThreadStateCallback", e, "Account not found in scheduled callback.", new Object[0]);
            }
        }
    }
}
