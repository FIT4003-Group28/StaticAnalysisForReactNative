package defpackage;

import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.google.android.apps.gmm.notification.api.intent.NotificationIntentConverter$NotificationIntent;
import com.google.android.apps.gmm.notification.log.api.NotificationLogger$IntentMetadata;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: auky  reason: default package */
/* loaded from: classes2.dex */
final class auky extends auof {
    private final ib a;
    private final aule b;
    private final String c;
    private final String d;
    @dzsi
    private final btlu e;
    private final auso f;
    private final pau g;
    private final ault h;
    private final Application i;
    @dzsi
    private final cjsa j;

    public auky(ib ibVar, aule auleVar, String str, String str2, btlu btluVar, pau pauVar, cjsa cjsaVar, dxio dxioVar, aunx aunxVar, auhz auhzVar, auso ausoVar, ault aultVar, Application application) {
        super(dxioVar, auhzVar, auleVar.a().t());
        this.a = ibVar;
        this.b = auleVar;
        this.c = str;
        this.d = str2;
        this.e = btluVar;
        this.g = pauVar;
        this.j = cjsaVar;
        this.f = ausoVar;
        this.h = aultVar;
        this.i = application;
    }

    private final void a(RemoteViews remoteViews, auoc... auocVarArr) {
        aulr j;
        cjrc cjrcVar;
        dccx F = dcdc.F();
        for (auoc auocVar : auocVarArr) {
            cjtd f = this.f.f(this.b.a(), this.e, auocVar.d(), auocVar.i(), this.b.c().c().e, auocVar.g(), this.j);
            F.g(f);
            boolean e = auocVar.e();
            NotificationLogger$IntentMetadata c = NotificationLogger$IntentMetadata.c(auhv.NOTIFICATION_REMOTE_VIEWS_CLICK, e);
            cjsa cjsaVar = this.j;
            String str = (cjsaVar == null || (cjrcVar = cjsaVar.a) == null) ? null : cjrcVar.a;
            auhy h = NotificationIntentConverter$NotificationIntent.h();
            auht auhtVar = (auht) h;
            auhtVar.a = dbsg.i(Integer.valueOf(this.b.a().a));
            h.c(auocVar.b());
            h.b(auocVar.a());
            auhtVar.b = dbsg.j(f.d);
            auhtVar.c = dbsg.j(f.e);
            auhtVar.d = dbsg.j(str);
            remoteViews.setOnClickPendingIntent(auocVar.c(), aush.a(this.i, h.a(), c, null, f, this.b.c().e().f(), this.g, auocVar.f() ? new ausg(this.c, this.d) : null, this.b.c().a(), this.b.c().a(), this.b.c().b().c(""), e));
        }
        if (auocVarArr.length > 0) {
            auuh c2 = auuh.c(this.b.c().b().f(), this.b.c().a());
            aulu e2 = this.h.e(c2);
            if (e2 != null) {
                F.i(e2.g());
            }
            if (e2 != null) {
                j = e2.i();
            } else {
                j = aulu.j();
                j.a = c2;
            }
            j.b = this.c;
            j.c(F.f());
            this.h.a(c2, j.a());
        }
    }

    @Override // defpackage.auof
    public final void A(long j) {
        this.a.z(j);
    }

    @Override // defpackage.auof
    public final void B(auoe auoeVar) {
    }

    @Override // defpackage.auof
    public final void C(boolean z) {
    }

    @Override // defpackage.auof
    public final void D(int i) {
    }

    @Override // defpackage.auof
    public final void E(Intent intent, auhw auhwVar) {
    }

    @Override // defpackage.auof
    public final void F(CharSequence charSequence) {
        this.a.k(charSequence);
    }

    @Override // defpackage.auof
    public final void G(CharSequence charSequence) {
    }

    @Override // defpackage.auof
    public final void H(int i) {
    }

    @Override // defpackage.auof
    public final void I() {
        this.a.w = true;
    }

    @Override // defpackage.auof
    public final void J(int i) {
    }

    @Override // defpackage.auof
    public final void K(boolean z) {
    }

    @Override // defpackage.auof
    public final void L(ih ihVar) {
        this.a.v(ihVar);
    }

    @Override // defpackage.auof
    public final void M(@dzsi CharSequence charSequence) {
        this.a.w(charSequence);
    }

    @Override // defpackage.auof
    public final void N(CharSequence charSequence) {
    }

    @Override // defpackage.auof
    public final void O(long j) {
    }

    @Override // defpackage.auof
    public final void b(Bundle bundle) {
        aulr j;
        auuh c = auuh.c(this.b.c().b().f(), this.b.c().a());
        aulu e = this.h.e(c);
        if (e != null) {
            j = e.i();
        } else {
            j = aulu.j();
            j.a = c;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("multiple_streams");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            j.d(dcbg.b(parcelableArrayList).s(aulp.a).z());
        }
        this.h.a(c, j.a());
    }

    @Override // defpackage.auof
    public final void i(RemoteViews remoteViews, auoc... auocVarArr) {
        a(remoteViews, auocVarArr);
        this.a.F = remoteViews;
    }

    @Override // defpackage.auof
    public final void k(RemoteViews remoteViews, auoc... auocVarArr) {
        a(remoteViews, auocVarArr);
        this.a.E = remoteViews;
    }

    @Override // defpackage.auof
    public final void n(akqi akqiVar) {
    }

    @Override // defpackage.auof
    public final void o(String str) {
    }

    @Override // defpackage.auof
    public final void p(Bitmap bitmap) {
        this.a.o(bitmap);
    }

    @Override // defpackage.auof
    public final void w(int i) {
        this.a.t(i);
    }

    @Override // defpackage.auof
    public final void x(String str) {
        this.a.v = str;
    }
}
