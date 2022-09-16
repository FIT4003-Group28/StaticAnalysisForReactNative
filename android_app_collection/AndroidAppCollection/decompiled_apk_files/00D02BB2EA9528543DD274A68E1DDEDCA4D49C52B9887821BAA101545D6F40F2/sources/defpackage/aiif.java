package defpackage;

import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aiif  reason: default package */
/* loaded from: classes2.dex */
public final class aiif extends aiig {
    private static final eaow a = eaow.c(5);

    public aiif(eapd eapdVar, Profile profile) {
        super(eapdVar, profile, a);
    }

    public static aiif c(aimp aimpVar) {
        eapd eapdVar = new eapd(aimpVar.b);
        aiml aimlVar = aimpVar.c;
        if (aimlVar == null) {
            aimlVar = aiml.i;
        }
        return new aiif(eapdVar, aiij.i(aimlVar));
    }

    @Override // defpackage.aiig
    public final aimj a(aimj aimjVar) {
        aimk aimkVar;
        if (!this.c.a().c.equals(ahwj.GAIA)) {
            return aimjVar;
        }
        int h = h(i(), aimjVar.a);
        dsqp dsqpVar = (dsqp) aimjVar.cu(5);
        dsqpVar.bC(aimjVar);
        aimi aimiVar = (aimi) dsqpVar;
        if (h != -1) {
            aiml aimlVar = aimjVar.a.get(h);
            dsqp dsqpVar2 = (dsqp) aimlVar.cu(5);
            dsqpVar2.bC(aimlVar);
            aimkVar = (aimk) dsqpVar2;
            aimkVar.bC(i());
            aimiVar.b(h);
        } else {
            aiml i = i();
            dsqp dsqpVar3 = (dsqp) i.cu(5);
            dsqpVar3.bC(i);
            aimkVar = (aimk) dsqpVar3;
        }
        if (aimkVar.c) {
            aimkVar.bF();
            aimkVar.c = false;
        }
        aiml aimlVar2 = (aiml) aimkVar.b;
        aiml aimlVar3 = aiml.i;
        aimlVar2.a |= 32;
        aimlVar2.g = true;
        dbsk.s(aimkVar);
        aimiVar.a(aimkVar.bK());
        return aimiVar.bK();
    }

    @Override // defpackage.aiig
    public final aimp b() {
        aimm f = f();
        if (f.c) {
            f.bF();
            f.c = false;
        }
        aimp aimpVar = (aimp) f.b;
        aimp aimpVar2 = aimp.f;
        aimpVar.d = 2;
        aimpVar.a |= 4;
        return f.bK();
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof aiif)) {
            return false;
        }
        aiif aiifVar = (aiif) obj;
        return dbsd.a(this.d, aiifVar.d) && dbsd.a(this.b, aiifVar.b) && dbsd.a(this.c, aiifVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.b, this.c});
    }
}
