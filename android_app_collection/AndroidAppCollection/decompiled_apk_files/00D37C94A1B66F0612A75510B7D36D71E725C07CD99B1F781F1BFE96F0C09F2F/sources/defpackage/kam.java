package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.PowerManager;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: kam  reason: default package */
/* loaded from: classes3.dex */
public final class kam {
    public final acrr a;
    public final yrj b;
    public final AudioManager c;
    public final PowerManager d;
    public final aijf e;
    public final enw f;
    public final aynx g;

    public kam(Context context, acrr acrrVar, yrj yrjVar, aijf aijfVar, enw enwVar, airw airwVar, Set set) {
        this.a = acrrVar;
        this.b = yrjVar;
        this.e = aijfVar;
        this.f = enwVar;
        this.c = (AudioManager) context.getSystemService("audio");
        this.d = (PowerManager) context.getSystemService("power");
        amuf f = amuk.f();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f.h(((kaq) it.next()).a());
        }
        aynx D = aynx.D(f.g());
        aisp G = airwVar.G();
        this.g = D.U(aynx.e(G.a.u(jgs.q).C(new ayqe() { // from class: kai
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                kam kamVar = kam.this;
                ahhw ahhwVar = (ahhw) obj;
                int i = 4;
                if (kamVar.c.isWiredHeadsetOn()) {
                    i = 3;
                } else if (!kamVar.c.isBluetoothA2dpOn() && !kamVar.c.isBluetoothScoOn()) {
                    i = 2;
                }
                boolean z = false;
                if (ahhwVar.c().equals(aika.NEW) || ahhwVar.c().equals(aika.ENDED)) {
                    return new kal(i, "", false, false);
                }
                PlayerResponseModel b = ahhwVar.b();
                boolean z2 = b != null && b.E();
                if (b != null && aijr.g(b.t())) {
                    z = true;
                }
                return new kal(i, ahhwVar.e(), z2, z);
            }
        }), G.i.C(jnx.n), eho.m), eho.n);
    }
}
