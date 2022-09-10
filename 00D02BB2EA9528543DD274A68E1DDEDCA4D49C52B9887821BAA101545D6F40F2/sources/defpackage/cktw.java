package defpackage;

import android.app.Application;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.gmm.wearable.api.WearableLocationEvent;
import com.google.android.apps.gmm.wearable.api.WearableLocationStatusEvent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
/* compiled from: PG */
/* renamed from: cktw  reason: default package */
/* loaded from: classes4.dex */
public final class cktw implements ckuq {
    public final Application a;
    public final bvsl b;
    public final btrm c;
    public final crfm d;
    public final ckuu e;
    public final ckuv f;
    @dzsi
    public final cktk g;
    public final cktp h;
    public final dzsj<srv> i;
    @dzsi
    public ckuf m;
    @dzsi
    public ckth n;
    @dzsi
    public ckum o;
    @dzsi
    public ckuj p;
    @dzsi
    public ckuy q;
    public boolean r;
    @dzsi
    public String s;
    public final Runnable t;
    private final bvrb u;
    private final asik v;
    private final ckup w;
    private final cpgo y;
    private final cnon<cpjg> z;
    public final Handler j = new Handler(Looper.getMainLooper());
    public final Object k = new Object();
    public final Object l = new Object();
    private final bzgj x = new bzgj();

    public cktw(Application application, cqat cqatVar, bvsl bvslVar, btrm btrmVar, bvjj bvjjVar, bttf bttfVar, ahjq ahjqVar, crfm crfmVar, bvrb bvrbVar, asik asikVar, cjqy cjqyVar, dzsj<srv> dzsjVar, ahth ahthVar, qeg qegVar) {
        ckup ckupVar;
        cktt ckttVar = new cktt(this);
        this.y = ckttVar;
        cktu cktuVar = new cktu(this);
        this.z = cktuVar;
        this.t = new cktv(this);
        dbsk.s(application);
        this.a = application;
        dbsk.s(cqatVar);
        dbsk.s(bvslVar);
        this.b = bvslVar;
        dbsk.s(btrmVar);
        this.c = btrmVar;
        dbsk.s(bvjjVar);
        dbsk.s(bttfVar);
        dbsk.s(ahjqVar);
        dbsk.s(crfmVar);
        this.d = crfmVar;
        dbsk.s(bvrbVar);
        this.u = bvrbVar;
        dbsk.s(asikVar);
        this.v = asikVar;
        dbsk.s(dzsjVar);
        this.i = dzsjVar;
        dbsk.s(ahthVar);
        dbsk.s(qegVar);
        ckuu ckuuVar = new ckuu(application);
        this.e = ckuuVar;
        ckuv ckuvVar = new ckuv(new ckur(ckuuVar));
        this.f = ckuvVar;
        this.g = new cktk(btrmVar, ckuvVar);
        this.h = new cktp(ckuuVar, cjqyVar, bvrbVar);
        dbsk.s(bvrbVar);
        synchronized (ckup.a) {
            if (ckup.b == null) {
                ckup.b = new ckup(bvrbVar);
            }
            ckupVar = ckup.b;
        }
        this.w = ckupVar;
        GoogleApiClient googleApiClient = ckuuVar.a;
        if (googleApiClient == null) {
            return;
        }
        Api<cpgq> api = cpgr.a;
        IntentFilter intentFilter = new IntentFilter("com.google.android.gms.wearable.NODE_CHANGED");
        intentFilter.addDataScheme("wear");
        intentFilter.addDataAuthority("*", null);
        cpjf cpjfVar = new cpjf(new IntentFilter[]{intentFilter});
        int i = cphi.a;
        googleApiClient.enqueue(new cphi(googleApiClient, ckttVar, googleApiClient.registerListener(ckttVar), cpjfVar));
        googleApiClient.enqueue(new cpje(googleApiClient)).i(cktuVar);
    }

    public static Location d(ckxf ckxfVar) {
        Location location = new Location(WearableLocationEvent.PROVIDER);
        location.setAccuracy(ckxfVar.e);
        location.setBearing(ckxfVar.f);
        location.setAltitude(ckxfVar.c);
        location.setSpeed(ckxfVar.g);
        location.setTime(ckxfVar.d);
        ckvz ckvzVar = ckxfVar.b;
        if (ckvzVar == null) {
            ckvzVar = ckvz.d;
        }
        location.setLatitude(ckvzVar.b);
        ckvz ckvzVar2 = ckxfVar.b;
        if (ckvzVar2 == null) {
            ckvzVar2 = ckvz.d;
        }
        location.setLongitude(ckvzVar2.c);
        if ((ckxfVar.a & 64) != 0) {
            Bundle bundle = new Bundle();
            bundle.putInt(ahsm.SATELLITE_BUNDLE_STRING, ckxfVar.h);
            location.setExtras(bundle);
        }
        return location;
    }

    @Override // defpackage.ckuq
    public final void a(final arzw arzwVar) {
        synchronized (this.l) {
            this.j.removeCallbacks(this.t);
            boolean z = true;
            this.r = true;
            String str = this.s;
            if (str != null) {
                this.f.d(false, null, true, str);
                this.s = null;
            }
            ckuf ckufVar = new ckuf(this.c, this.u, this.f, new dzsj(this, arzwVar) { // from class: cktq
                private final cktw a;
                private final arzw b;

                {
                    this.a = this;
                    this.b = arzwVar;
                }

                @Override // defpackage.dzsj
                public final Object a() {
                    cktw cktwVar = this.a;
                    return new ckti(cktwVar.a, cktwVar.b, this.b);
                }
            }, new dzsj(this, arzwVar) { // from class: cktr
                private final cktw a;
                private final arzw b;

                {
                    this.a = this;
                    this.b = arzwVar;
                }

                @Override // defpackage.dzsj
                public final Object a() {
                    cktw cktwVar = this.a;
                    return new cksw(cktwVar.a, this.b);
                }
            }, new cktd(this.f, this.c, this.v), this.w, this.a);
            this.m = ckufVar;
            cktd cktdVar = ckufVar.f;
            cktc cktcVar = ckufVar.m;
            synchronized (cktdVar.a) {
                if (cktdVar.b != null) {
                    z = false;
                }
                dbsk.l(z);
                dbsk.s(cktcVar);
                cktdVar.b = cktcVar;
            }
            ckuv ckuvVar = cktdVar.c;
            ckta cktaVar = cktdVar.i;
            dbsk.s(cktaVar);
            ckuvVar.a.add(cktaVar);
            cktdVar.i.a();
        }
    }

    @Override // defpackage.ckuq
    public final void b() {
        synchronized (this.l) {
            if (!this.r) {
                return;
            }
            this.r = false;
            this.c.b(new WearableLocationStatusEvent(false));
            cktd cktdVar = this.m.f;
            synchronized (cktdVar.a) {
                dbsk.s(cktdVar.b);
                dbsk.l(!cktdVar.e);
                cktdVar.e = true;
                if (cktdVar.f) {
                    cktdVar.f = false;
                    cktdVar.a();
                }
            }
            ckuv ckuvVar = cktdVar.c;
            ckta cktaVar = cktdVar.i;
            dbsk.s(cktaVar);
            dbsk.l(ckuvVar.a.remove(cktaVar));
            this.m = null;
            this.w.b();
            this.f.d(false, null, true, null);
        }
    }

    public final void c() {
        if (this.n == null) {
            this.n = new ckth(this.a);
        }
    }

    @Override // defpackage.ckuq
    public final void e(byte[] bArr) {
        this.f.b("/navigation_alert", bArr);
    }
}
