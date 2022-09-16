package defpackage;

import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lea  reason: default package */
/* loaded from: classes3.dex */
public final class lea implements akip {
    final /* synthetic */ lec a;

    public lea(lec lecVar) {
        this.a = lecVar;
    }

    @Override // defpackage.akip
    public final void a(int i) {
        if (i > 0 && eog.z(this.a.a) && this.a.i.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
            lec lecVar = this.a;
            if (!lecVar.t) {
                lecVar.t = true;
                lecVar.i.t("voz_ss", asny.LATENCY_ACTION_VOICE_ASSISTANT);
            }
        }
        this.a.c.f(i);
    }

    @Override // defpackage.akip
    public final void b() {
        if (eog.z(this.a.a) && this.a.i.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
            lec lecVar = this.a;
            lecVar.u = true;
            lecVar.i.t("voz_mf", asny.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        lec lecVar2 = this.a;
        lecVar2.n = false;
        akiq akiqVar = lecVar2.j;
        if (akiqVar != null) {
            akiqVar.d();
        }
        this.a.c.l();
    }

    @Override // defpackage.akip
    public final void c() {
        this.a.c.m();
    }

    @Override // defpackage.akip
    public final void d(List list) {
        if (!this.a.s && !list.isEmpty() && this.a.i.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.a.i.t("voz_ftr", asny.LATENCY_ACTION_VOICE_ASSISTANT);
            this.a.s = true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amnw amnwVar = (amnw) it.next();
            double d = amnwVar.c;
            if (d == 1.0d) {
                this.a.q = true;
            }
            if (d >= 0.8d) {
                if (eog.z(this.a.a) && this.a.i.m(asny.LATENCY_ACTION_VOICE_ASSISTANT)) {
                    lec lecVar = this.a;
                    if (!lecVar.u) {
                        lecVar.i.t("voz_sf", asny.LATENCY_ACTION_VOICE_ASSISTANT);
                    }
                }
                this.a.c.n(amnwVar.b);
            } else {
                this.a.c.p(amnwVar.b);
            }
        }
    }
}
