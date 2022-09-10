package defpackage;

import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aiid  reason: default package */
/* loaded from: classes2.dex */
public final class aiid extends aiig {
    private static final eaow a = eaow.a(30);

    public aiid(eapd eapdVar, Profile profile) {
        super(eapdVar, profile, a);
    }

    public static aiid c(aimp aimpVar) {
        eapd eapdVar = new eapd(aimpVar.b);
        aiml aimlVar = aimpVar.c;
        if (aimlVar == null) {
            aimlVar = aiml.i;
        }
        return new aiid(eapdVar, aiij.i(aimlVar));
    }

    @Override // defpackage.aiig
    public final aimj a(aimj aimjVar) {
        if (!this.c.a().c.equals(ahwj.GAIA)) {
            return aimjVar;
        }
        aiml i = i();
        int h = h(i, aimjVar.a);
        if (h == -1) {
            dsqp dsqpVar = (dsqp) aimjVar.cu(5);
            dsqpVar.bC(aimjVar);
            aimi aimiVar = (aimi) dsqpVar;
            aimiVar.a(i);
            return aimiVar.bK();
        }
        aiml aimlVar = aimjVar.a.get(h);
        if (i.equals(aimlVar)) {
            return aimjVar;
        }
        dsqp dsqpVar2 = (dsqp) aimjVar.cu(5);
        dsqpVar2.bC(aimjVar);
        aimi aimiVar2 = (aimi) dsqpVar2;
        aimiVar2.b(h);
        dsqp dsqpVar3 = (dsqp) aimlVar.cu(5);
        dsqpVar3.bC(aimlVar);
        aimk aimkVar = (aimk) dsqpVar3;
        aimkVar.bC(i);
        if (aimkVar.c) {
            aimkVar.bF();
            aimkVar.c = false;
        }
        aiml aimlVar2 = (aiml) aimkVar.b;
        aimlVar2.a &= -33;
        aimlVar2.g = false;
        aimiVar2.a(aimkVar.bK());
        return aimiVar2.bK();
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
        aimpVar.d = 1;
        aimpVar.a |= 4;
        return f.bK();
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof aiid)) {
            return false;
        }
        aiid aiidVar = (aiid) obj;
        return dbsd.a(this.d, aiidVar.d) && dbsd.a(this.b, aiidVar.b) && dbsd.a(this.c, aiidVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.b, this.c});
    }
}
