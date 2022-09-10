package defpackage;

import com.google.android.apps.gmm.locationsharing.api.Profile;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aiih  reason: default package */
/* loaded from: classes2.dex */
public final class aiih extends aiig {
    private static final eaow a = eaow.d(10);

    public aiih(eapd eapdVar, Profile profile) {
        super(eapdVar, profile, a);
    }

    public static aiih c(aimp aimpVar) {
        eapd eapdVar = new eapd(aimpVar.b);
        aiml aimlVar = aimpVar.c;
        if (aimlVar == null) {
            aimlVar = aiml.i;
        }
        return new aiih(eapdVar, aiij.i(aimlVar));
    }

    @Override // defpackage.aiig
    public final aimj a(aimj aimjVar) {
        if (!this.c.a().c.equals(ahwj.GAIA)) {
            return aimjVar;
        }
        int h = h(i(), aimjVar.a);
        dsqp dsqpVar = (dsqp) aimjVar.cu(5);
        dsqpVar.bC(aimjVar);
        aimi aimiVar = (aimi) dsqpVar;
        if (h != -1) {
            aimiVar.b(h);
        }
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
        aimpVar.d = 4;
        aimpVar.a = 4 | aimpVar.a;
        return f.bK();
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof aiih)) {
            return false;
        }
        aiih aiihVar = (aiih) obj;
        return dbsd.a(this.d, aiihVar.d) && dbsd.a(this.b, aiihVar.b) && dbsd.a(this.c, aiihVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.b, this.c});
    }
}
