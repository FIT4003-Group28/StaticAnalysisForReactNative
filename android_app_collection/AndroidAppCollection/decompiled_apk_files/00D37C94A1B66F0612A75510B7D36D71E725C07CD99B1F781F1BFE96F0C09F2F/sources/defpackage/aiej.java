package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aiej  reason: default package */
/* loaded from: classes.dex */
public final class aiej implements aafl {
    private final afvn a;
    private final aids b;
    private final afmt c;
    private final afvd d;

    public aiej(afvn afvnVar, aids aidsVar, afvd afvdVar, afmt afmtVar) {
        this.a = afvnVar;
        this.b = aidsVar;
        this.d = afvdVar;
        this.c = afmtVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        afmv afmvVar;
        augi augiVar = (augi) apzgVar.qm(augi.b);
        String str = augiVar.d;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "ReelPrefetchWatchCommandResolver.resolve taskId=".concat(valueOf);
        }
        ampq a = this.d.a(this.a.c());
        if (!a.h()) {
            return;
        }
        aaox aaoxVar = (aaox) a.c();
        aids aidsVar = this.b;
        aijl d = PlaybackStartDescriptor.d();
        d.a = apzgVar;
        PlaybackStartDescriptor a2 = d.a();
        aijt a3 = aiju.a();
        atyk atykVar = augiVar.m;
        if (atykVar == null) {
            atykVar = atyk.a;
        }
        int ca = awwc.ca(atykVar.d);
        if (ca == 0) {
            ca = 1;
        }
        a3.a = ca;
        atyk atykVar2 = augiVar.m;
        if (atykVar2 == null) {
            atykVar2 = atyk.a;
        }
        a3.b(atykVar2.c);
        aiju a4 = a3.a();
        aiei aieiVar = new aiei(str, aaoxVar);
        atzc atzcVar = augiVar.k;
        if (atzcVar == null) {
            atzcVar = atzc.a;
        }
        long j = atzcVar.b;
        atzc atzcVar2 = augiVar.k;
        if (atzcVar2 == null) {
            atzcVar2 = atzc.a;
        }
        int cc = awwc.cc(atzcVar2.c);
        if (cc == 0) {
            cc = 1;
        }
        int i = cc - 1;
        if (i == 0) {
            afmvVar = afmv.a;
        } else if (i == 1) {
            afmvVar = null;
        } else if (i != 2) {
            afmvVar = this.c.b();
        } else {
            afmvVar = this.c.get();
        }
        aidsVar.b(a2, a4, aieiVar, j, afmvVar);
    }
}
