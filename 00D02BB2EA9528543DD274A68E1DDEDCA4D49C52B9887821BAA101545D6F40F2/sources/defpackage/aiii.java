package defpackage;

import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aiii  reason: default package */
/* loaded from: classes2.dex */
public final class aiii extends aiig {
    private static final eaow a = eaow.a(30);

    public aiii(eapd eapdVar, Profile profile) {
        super(eapdVar, profile, a);
    }

    public static aiii c(aimp aimpVar) {
        eapd eapdVar = new eapd(aimpVar.b);
        aiml aimlVar = aimpVar.c;
        if (aimlVar == null) {
            aimlVar = aiml.i;
        }
        return new aiii(eapdVar, aiij.i(aimlVar));
    }

    @Override // defpackage.aiig
    public final aimj a(aimj aimjVar) {
        int h;
        if (this.c.a().c.equals(ahwj.GAIA) && (h = h(i(), aimjVar.a)) != -1) {
            dsqp dsqpVar = (dsqp) aimjVar.cu(5);
            dsqpVar.bC(aimjVar);
            aimi aimiVar = (aimi) dsqpVar;
            aiml aimlVar = aimjVar.a.get(h);
            dsqp dsqpVar2 = (dsqp) aimlVar.cu(5);
            dsqpVar2.bC(aimlVar);
            aimk aimkVar = (aimk) dsqpVar2;
            aimiVar.b(h);
            if (aimkVar.c) {
                aimkVar.bF();
                aimkVar.c = false;
            }
            aiml aimlVar2 = (aiml) aimkVar.b;
            aiml aimlVar3 = aiml.i;
            aimlVar2.a &= -65;
            aimlVar2.h = false;
            dbsk.s(aimkVar);
            aimiVar.a(aimkVar.bK());
            return aimiVar.bK();
        }
        return aimjVar;
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
        int i = aimpVar.a | 4;
        aimpVar.a = i;
        aimpVar.a = i | 8;
        aimpVar.e = true;
        return f.bK();
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof aiii)) {
            return false;
        }
        aiii aiiiVar = (aiii) obj;
        return dbsd.a(this.d, aiiiVar.d) && dbsd.a(this.b, aiiiVar.b) && dbsd.a(this.c, aiiiVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.b, this.c});
    }
}
