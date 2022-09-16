package defpackage;

import android.app.Application;
import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Build;
import android.widget.RemoteViews;
import com.google.android.apps.gmm.notification.log.api.NotificationLogger$IntentMetadata;
import com.google.android.apps.maps.R;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: augj  reason: default package */
/* loaded from: classes.dex */
public final class augj {
    @dzsi
    public final Integer A;
    @dzsi
    public final Integer B;
    @dzsi
    public final Boolean C;
    @dzsi
    public final Integer D;
    @dzsi
    public final CharSequence E;
    @dzsi
    public final Boolean F;
    @dzsi
    public final Long G;
    @dzsi
    public final Boolean H;
    @dzsi
    public final Boolean I;
    @dzsi
    public final Boolean J;
    @dzsi
    public final Integer K;
    @dzsi
    public final String L;
    public final int M;
    @dzsi
    public final String N;
    @dzsi
    public final id O;
    @dzsi
    public final Integer P;
    @dzsi
    public final String Q;
    @dzsi
    public final pau R;
    public final dcdn<aufx, augf> S;
    public final dcdn<aufx, cjtd> T;
    public final dced<RemoteViews, auoc> U;
    public final dcdn<auoc, cjtd> V;
    @dzsi
    public final int W;
    private final Application X;
    private Notification Y;
    public final int a;
    @dzsi
    public final aujb b;
    public final cjtd c;
    @dzsi
    public final akqi d;
    @dzsi
    public final String e;
    @dzsi
    public final String f;
    public final int g;
    @dzsi
    public final btlu h;
    public final boolean i;
    @dzsi
    public final CharSequence j;
    @dzsi
    public final CharSequence k;
    @dzsi
    public final CharSequence l;
    public final dcdc<cjtd> m;
    @dzsi
    public final auhx n;
    @dzsi
    public final auhx o;
    public final long p;
    public final boolean q;
    @dzsi
    public final ih r;
    public boolean s;
    public final dbsg<ausn> t;
    @dzsi
    public final RemoteViews u;
    @dzsi
    public final RemoteViews v;
    @dzsi
    public final RemoteViews w;
    @dzsi
    public final Integer x;
    @dzsi
    public final Bitmap y;
    @dzsi
    public final Boolean z;

    public augj(augc augcVar, augh aughVar, dbsg<ausn> dbsgVar, EnumMap<aufx, augf> enumMap, dcka<RemoteViews, auoc> dckaVar) {
        boolean z = false;
        this.s = false;
        this.c = aughVar.a;
        this.T = aughVar.b;
        this.V = aughVar.c;
        dccx F = dcdc.F();
        F.i(aughVar.b.values());
        F.i(aughVar.c.values());
        this.m = F.f();
        this.t = dbsgVar;
        this.S = dcdn.r(enumMap);
        this.U = dced.k(dckaVar);
        this.X = augcVar.Q;
        this.a = augcVar.M;
        this.d = augcVar.T;
        this.e = augcVar.e;
        this.h = augcVar.S;
        RemoteViews remoteViews = augcVar.i;
        this.i = (remoteViews == null && augcVar.j == null) ? z : true;
        this.j = augcVar.f;
        this.s = augcVar.D;
        this.b = augcVar.b;
        this.g = augcVar.c;
        this.f = augcVar.d;
        this.W = augcVar.U;
        this.n = augcVar.F;
        this.p = augcVar.P;
        this.q = augcVar.O;
        this.r = augcVar.s;
        this.k = augcVar.g;
        this.l = augcVar.h;
        this.u = remoteViews;
        this.v = augcVar.j;
        this.w = augcVar.k;
        this.x = augcVar.l;
        this.y = augcVar.m;
        this.z = augcVar.n;
        this.A = augcVar.o;
        this.B = augcVar.p;
        this.C = augcVar.q;
        this.D = augcVar.r;
        this.E = augcVar.t;
        this.F = augcVar.u;
        this.G = augcVar.w;
        this.H = augcVar.x;
        this.I = augcVar.y;
        this.J = augcVar.z;
        this.K = augcVar.A;
        this.L = augcVar.B;
        this.M = augcVar.v;
        this.N = augcVar.C;
        this.O = augcVar.E;
        this.o = augcVar.G;
        this.P = augcVar.H;
        this.Q = augcVar.I;
        this.R = augcVar.R;
    }

    public final Notification a(dbsg<cjql> dbsgVar) {
        Notification notification;
        auir a;
        synchronized (this) {
            if (this.Y == null) {
                Application application = this.X;
                final ib ibVar = new ib(application);
                if (ako.a()) {
                    aujb aujbVar = this.b;
                    String b = (aujbVar == null || (a = aujbVar.a()) == null) ? null : a.b(this.M);
                    if (b == null) {
                        b = "OtherChannel";
                    }
                    ibVar.G = b;
                }
                cjsh cjshVar = dbsgVar.a() ? dbsgVar.b().b : null;
                cjtd cjtdVar = this.c;
                dcdn<aufx, cjtd> dcdnVar = this.T;
                dcpd<Map.Entry<aufx, augf>> it = this.S.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<aufx, augf> next = it.next();
                    augf value = next.getValue();
                    cjtd cjtdVar2 = dcdnVar.get(next.getKey());
                    dbsk.s(cjtdVar2);
                    boolean e = value.e();
                    dcdn<aufx, cjtd> dcdnVar2 = dcdnVar;
                    dcpd<Map.Entry<aufx, augf>> dcpdVar = it;
                    hx hxVar = new hx(value.a(), value.b(), auhf.b(value.d(), cjshVar, cjtdVar2, NotificationLogger$IntentMetadata.c(auhv.NOTIFICATION_ACTION_CLICK, e), e, application, this));
                    dbsg<ip> c = value.c();
                    if (c.a()) {
                        hxVar.b(c.b());
                    }
                    ibVar.f(hxVar.a());
                    dcdnVar = dcdnVar2;
                    it = dcpdVar;
                }
                dced<RemoteViews, auoc> dcedVar = this.U;
                dcpd<RemoteViews> it2 = dcedVar.J().iterator();
                while (it2.hasNext()) {
                    RemoteViews next2 = it2.next();
                    for (auoc auocVar : dcedVar.h(next2)) {
                        boolean e2 = auocVar.e();
                        dcdn<auoc, cjtd> dcdnVar3 = this.V;
                        auhx auhxVar = new auhx(auocVar.a(), auocVar.b());
                        cjtd cjtdVar3 = dcdnVar3.get(auocVar);
                        dbsk.s(cjtdVar3);
                        next2.setOnClickPendingIntent(auocVar.c(), auhf.b(auhxVar, cjshVar, cjtdVar3, NotificationLogger$IntentMetadata.c(auhv.NOTIFICATION_REMOTE_VIEWS_CLICK, e2), e2, application, this));
                    }
                }
                auhx auhxVar2 = this.o;
                boolean z = true;
                if (auhxVar2 == null) {
                    ibVar.n(auhf.b(null, cjshVar, cjtdVar, NotificationLogger$IntentMetadata.c(auhv.NOTIFICATION_SWIPE, true), false, application, this));
                } else {
                    ibVar.n(auhf.b(auhxVar2, cjshVar, cjtdVar, NotificationLogger$IntentMetadata.c(auhv.NOTIFICATION_SWIPE, true), false, application, this));
                }
                auhx auhxVar3 = this.n;
                if (auhxVar3 != null) {
                    Boolean bool = this.F;
                    auhv auhvVar = auhv.NOTIFICATION_CONTENT_CLICK;
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                    ibVar.g = auhf.b(auhxVar3, cjshVar, cjtdVar, NotificationLogger$IntentMetadata.c(auhvVar, z), false, application, this);
                }
                auhf.a(this.j, new auhe(ibVar) { // from class: augk
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.l((CharSequence) obj);
                    }
                });
                auhf.a(this.k, new auhe(ibVar) { // from class: augv
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.k((CharSequence) obj);
                    }
                });
                auhf.a(this.l, new auhe(ibVar) { // from class: augw
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.w((CharSequence) obj);
                    }
                });
                auhf.a(this.u, new auhe(ibVar) { // from class: augx
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.j((RemoteViews) obj);
                    }
                });
                auhf.a(this.v, new auhe(ibVar) { // from class: augy
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.E = (RemoteViews) obj;
                    }
                });
                auhf.a(this.w, new auhe(ibVar) { // from class: augz
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.F = (RemoteViews) obj;
                    }
                });
                auhf.a(this.y, new auhe(ibVar) { // from class: auha
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.o((Bitmap) obj);
                    }
                });
                auhf.a(this.z, new auhe(ibVar) { // from class: auhb
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.q(((Boolean) obj).booleanValue());
                    }
                });
                auhf.a(this.E, new auhe(ibVar) { // from class: auhc
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.x((CharSequence) obj);
                    }
                });
                auhf.a(this.F, new auhe(ibVar) { // from class: auhd
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.h(((Boolean) obj).booleanValue());
                    }
                });
                auhf.a(this.G, new auhe(ibVar) { // from class: augl
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.z(((Long) obj).longValue());
                    }
                });
                auhf.a(this.H, new auhe(ibVar) { // from class: augm
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.l = ((Boolean) obj).booleanValue();
                    }
                });
                auhf.a(this.I, new auhe(ibVar) { // from class: augn
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.w = ((Boolean) obj).booleanValue();
                    }
                });
                auhf.a(this.J, new auhe(ibVar) { // from class: augo
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.r(((Boolean) obj).booleanValue());
                    }
                });
                auhf.a(this.K, new auhe(ibVar) { // from class: augp
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.m(((Integer) obj).intValue());
                    }
                });
                auhf.a(this.L, new auhe(ibVar) { // from class: augq
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.z = (String) obj;
                    }
                });
                ibVar.k = this.M;
                Integer num = this.x;
                ibVar.t(num != null ? num.intValue() : 2131232784);
                Integer num2 = this.A;
                Integer num3 = this.B;
                Boolean bool2 = this.C;
                if (num2 != null && num3 != null && bool2 != null) {
                    ibVar.s(num2.intValue(), num3.intValue(), bool2.booleanValue());
                }
                Integer num4 = this.D;
                ibVar.B = num4 != null ? num4.intValue() : application.getResources().getColor(R.color.quantum_googblue);
                String str = this.N;
                if (Build.VERSION.SDK_INT >= 24 && str != null) {
                    ibVar.t = str;
                    ibVar.u = this.s;
                }
                auhf.a(this.O, new auhe(ibVar) { // from class: augr
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.g((id) obj);
                    }
                });
                auhf.a(this.P, new auhe(ibVar) { // from class: augs
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.C = ((Integer) obj).intValue();
                    }
                });
                auhf.a(this.Q, new auhe(ibVar) { // from class: augt
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.v = (String) obj;
                    }
                });
                auhf.a(this.r, new auhe(ibVar) { // from class: augu
                    private final ib a;

                    {
                        this.a = ibVar;
                    }

                    @Override // defpackage.auhe
                    public final void a(Object obj) {
                        this.a.v((ih) obj);
                    }
                });
                this.Y = ibVar.b();
            }
            notification = this.Y;
        }
        return notification;
    }
}
