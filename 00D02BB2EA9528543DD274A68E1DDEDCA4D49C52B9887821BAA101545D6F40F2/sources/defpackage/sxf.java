package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: sxf  reason: default package */
/* loaded from: classes7.dex */
public class sxf implements sun {
    private final String a;
    private final Runnable b;
    private final cjtd c;

    public sxf(final Activity activity, final dxio<afha> dxioVar, final qfw qfwVar, final qhy qhyVar, amsy amsyVar, cjtd cjtdVar) {
        final boolean a = amsr.a(amsyVar);
        String c = qhyVar.c();
        this.a = c == null ? activity.getResources().getString(R.string.BIKESHARING_LAUNCH_EXTERNAL_APP) : c;
        this.b = new Runnable(qhyVar, a, qfwVar, dxioVar, activity) { // from class: sxd
            private final qhy a;
            private final boolean b;
            private final qfw c;
            private final dxio d;
            private final Activity e;

            {
                this.a = qhyVar;
                this.b = a;
                this.c = qfwVar;
                this.d = dxioVar;
                this.e = activity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                qhy qhyVar2 = this.a;
                boolean z = this.b;
                qfw qfwVar2 = this.c;
                dxio dxioVar2 = this.d;
                Activity activity2 = this.e;
                Intent b = qhyVar2.b();
                if (b != null) {
                    if (z) {
                        qfwVar2.a(qhyVar2.a().c());
                    }
                    ((afha) dxioVar2.a()).f(activity2, b, 4);
                }
            }
        };
        this.c = cjtdVar;
    }

    @Override // defpackage.sun
    public cqtd a() {
        return cqrt.f(2131232660);
    }

    @Override // defpackage.sun
    public String b() {
        return this.a;
    }

    @Override // defpackage.sun
    public String c() {
        return sum.a(this);
    }

    @Override // defpackage.sun
    @dzsi
    public cjtd d() {
        return this.c;
    }

    @Override // defpackage.sun
    public cqkl e() {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.sun
    public Boolean f() {
        return true;
    }

    @Override // defpackage.sun
    public Boolean g() {
        return sum.b();
    }

    public sxf(final Activity activity, final dxio<afha> dxioVar, final qfw qfwVar, final qib qibVar, amsy amsyVar, cjtd cjtdVar) {
        final boolean a = amsr.a(amsyVar);
        String b = qibVar.b();
        this.a = b == null ? activity.getResources().getString(R.string.BIKESHARING_UNLOCK_IN_X, qibVar.a().a()) : b;
        this.b = new Runnable(qibVar, a, qfwVar, dxioVar, activity) { // from class: sxe
            private final qib a;
            private final boolean b;
            private final qfw c;
            private final dxio d;
            private final Activity e;

            {
                this.a = qibVar;
                this.b = a;
                this.c = qfwVar;
                this.d = dxioVar;
                this.e = activity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                qib qibVar2 = this.a;
                boolean z = this.b;
                qfw qfwVar2 = this.c;
                dxio dxioVar2 = this.d;
                Activity activity2 = this.e;
                Intent b2 = qibVar2.c().b();
                if (b2 != null) {
                    if (z) {
                        qfwVar2.a(qibVar2.a().c());
                    }
                    ((afha) dxioVar2.a()).f(activity2, b2, 4);
                }
            }
        };
        this.c = cjtdVar;
    }

    public sxf(final Activity activity, final dxio<afha> dxioVar, final wuv wuvVar) {
        cjtd a;
        String f = wuvVar.f();
        this.a = f == null ? activity.getResources().getString(R.string.DIRECTIONS_TAXI_LAUNCH_EXTERNAL_APP) : f;
        this.b = new Runnable(wuvVar, dxioVar, activity) { // from class: sxc
            private final wuv a;
            private final dxio b;
            private final Activity c;

            {
                this.a = wuvVar;
                this.b = dxioVar;
                this.c = activity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                wuv wuvVar2 = this.a;
                dxio dxioVar2 = this.b;
                Activity activity2 = this.c;
                Intent c = wuvVar2.c();
                if (c != null) {
                    ((afha) dxioVar2.a()).f(activity2, c, 4);
                }
            }
        };
        cjta d = wuvVar.d();
        if (d != null) {
            a = d.b(dtxn.cW);
        } else {
            a = cjtd.a(dtxn.cW);
        }
        this.c = a;
    }
}
