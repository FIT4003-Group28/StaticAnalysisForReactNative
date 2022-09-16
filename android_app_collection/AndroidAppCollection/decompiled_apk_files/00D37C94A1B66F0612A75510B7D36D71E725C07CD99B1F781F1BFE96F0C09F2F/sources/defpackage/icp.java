package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: icp  reason: default package */
/* loaded from: classes3.dex */
final class icp {
    private final ifu a;
    private final acuu b;
    private boolean c;

    public icp(acuu acuuVar, ifu ifuVar) {
        this.b = acuuVar;
        this.a = ifuVar;
    }

    public final void a(acti actiVar) {
        if (this.c) {
            actiVar.t();
            this.c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Optional optional, acti actiVar, apzg apzgVar, String str, String str2, boolean z, boolean z2) {
        Bundle bundle;
        atnp w;
        asjj asjjVar;
        aopa y = hqp.y(apzgVar);
        if (((atnp) y.instance).c.isEmpty() || ((atnp) y.instance).d == actj.MOBILE_BACK_BUTTON.II) {
            acuu acuuVar = this.b;
            String str3 = (acuuVar == null || (bundle = acuuVar.a) == null || (w = hqp.w(acuu.c(bundle))) == null) ? null : w.c;
            if (str3 != null) {
                y.copyOnWrite();
                atnp atnpVar = (atnp) y.instance;
                atnpVar.b |= 1;
                atnpVar.c = str3;
            }
        }
        aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
        aopcVar.e(atno.b, (atnp) y.mo39build());
        apzg apzgVar2 = (apzg) aopcVar.mo39build();
        if (!TextUtils.isEmpty(str)) {
            aopa createBuilder = asjj.a.createBuilder();
            aopa createBuilder2 = asjp.a.createBuilder();
            createBuilder2.copyOnWrite();
            asjp asjpVar = (asjp) createBuilder2.instance;
            str.getClass();
            asjpVar.b |= 1;
            asjpVar.c = str;
            createBuilder.copyOnWrite();
            asjj asjjVar2 = (asjj) createBuilder.instance;
            asjp asjpVar2 = (asjp) createBuilder2.mo39build();
            asjpVar2.getClass();
            asjjVar2.j = asjpVar2;
            asjjVar2.b |= 64;
            asjjVar = (asjj) createBuilder.mo39build();
        } else {
            asjjVar = null;
        }
        actiVar.e(acuo.a(37414), acuc.DEFAULT, apzgVar2, null, asjjVar);
        this.c = true;
        if (z && !TextUtils.isEmpty(str2)) {
            actiVar.r(str2);
        }
        Bundle a = acuu.a(actiVar);
        if (a != null) {
            this.b.a = a;
        }
        actiVar.n(new acte(actj.MOBILE_BACK_BUTTON));
        actiVar.n(new acte(actj.LIGHTWEIGHT_PLAYER_AUTO_DISMISS));
        actiVar.n(new acte(actj.LIGHTWEIGHT_PLAYER_DISMISS_BUTTON));
        actiVar.n(new acte(actj.LIGHTWEIGHT_PLAYER_PREVIOUS_REEL_BUTTON));
        actiVar.n(new acte(actj.LIGHTWEIGHT_PLAYER_NEXT_REEL_BUTTON));
        actiVar.n(new acte(actj.LIGHTWEIGHT_PLAYER_AUTOPLAY_REEL_NAV));
        ifu ifuVar = this.a;
        ifuVar.c();
        ArrayList b = ifuVar.m.b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            ((ifv) b.get(i)).aR();
        }
        if (!optional.isPresent()) {
            zep.b("No reel navigator.");
            return;
        }
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar2.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
        long a2 = ((gtc) optional.get()).a(reelWatchEndpointOuterClass$ReelWatchEndpoint);
        if (a2 == Long.MIN_VALUE) {
            zep.b("No reel watch endpoint.");
            return;
        }
        hyl hylVar = ifuVar.b;
        if (hylVar.b.containsKey(reelWatchEndpointOuterClass$ReelWatchEndpoint)) {
            xdo xdoVar = (xdo) hylVar.b.get(reelWatchEndpointOuterClass$ReelWatchEndpoint);
            for (ecx ecxVar : hylVar.a) {
                ecxVar.f(xdoVar, str2);
            }
        }
        aafd aafdVar = ifuVar.m;
        amqo amqoVar = ifuVar.g;
        snc sncVar = ifuVar.c;
        gtc gtcVar = (gtc) optional.get();
        igh ighVar = ifuVar.a;
        hqp hqpVar = ifuVar.n;
        ifuVar.l = new ifr(str2, a2, aafdVar, amqoVar, sncVar, gtcVar, ighVar, ifuVar.d, ifuVar.e, ifuVar.h, ifuVar.f, ifuVar.i, ifuVar.j, new HashMap(), null);
        ifuVar.a.d(apzgVar2, str2, false, z2, ifuVar.l);
        ArrayList b2 = ifuVar.m.b();
        int size2 = b2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((ifv) b2.get(i2)).aW(apzgVar2);
        }
    }
}
