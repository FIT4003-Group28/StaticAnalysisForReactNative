package defpackage;

import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aiie  reason: default package */
/* loaded from: classes2.dex */
public final class aiie extends aiig {
    private static final eaow e = eaow.a(30);
    public final boolean a;

    public aiie(eapd eapdVar, Profile profile, boolean z) {
        super(eapdVar, profile, e);
        this.a = z;
    }

    public static aiie c(aimp aimpVar) {
        eapd eapdVar = new eapd(aimpVar.b);
        aiml aimlVar = aimpVar.c;
        if (aimlVar == null) {
            aimlVar = aiml.i;
        }
        Profile i = aiij.i(aimlVar);
        int a = aimo.a(aimpVar.d);
        boolean z = false;
        if (a != 0 && a == 4) {
            z = true;
        }
        return new aiie(eapdVar, i, z);
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
            if (aimkVar.c) {
                aimkVar.bF();
                aimkVar.c = false;
            }
            aiml aimlVar2 = (aiml) aimkVar.b;
            aiml aimlVar3 = aiml.i;
            aimlVar2.a &= -33;
            aimlVar2.g = false;
            aimiVar.b(h);
        } else {
            aiml i = i();
            dsqp dsqpVar3 = (dsqp) i.cu(5);
            dsqpVar3.bC(i);
            aimkVar = (aimk) dsqpVar3;
        }
        if (this.a) {
            if (aimkVar.c) {
                aimkVar.bF();
                aimkVar.c = false;
            }
            aiml aimlVar4 = (aiml) aimkVar.b;
            aiml aimlVar5 = aiml.i;
            aimlVar4.a |= 64;
            aimlVar4.h = true;
        } else {
            if (aimkVar.c) {
                aimkVar.bF();
                aimkVar.c = false;
            }
            aiml aimlVar6 = (aiml) aimkVar.b;
            aiml aimlVar7 = aiml.i;
            aimlVar6.a &= -65;
            aimlVar6.h = false;
        }
        dbsk.s(aimkVar);
        aimiVar.a(aimkVar.bK());
        return aimiVar.bK();
    }

    @Override // defpackage.aiig
    public final aimp b() {
        aimm f = f();
        int i = this.a ? 4 : 2;
        if (f.c) {
            f.bF();
            f.c = false;
        }
        aimp aimpVar = (aimp) f.b;
        aimp aimpVar2 = aimp.f;
        aimpVar.d = i - 1;
        aimpVar.a |= 4;
        return f.bK();
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof aiie)) {
            return false;
        }
        aiie aiieVar = (aiie) obj;
        return dbsd.a(this.d, aiieVar.d) && dbsd.a(Boolean.valueOf(this.a), Boolean.valueOf(aiieVar.a)) && dbsd.a(this.b, aiieVar.b) && dbsd.a(this.c, aiieVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.b, this.c, Boolean.valueOf(this.a)});
    }
}
