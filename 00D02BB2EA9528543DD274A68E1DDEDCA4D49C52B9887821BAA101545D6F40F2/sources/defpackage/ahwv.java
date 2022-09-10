package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahwv  reason: default package */
/* loaded from: classes2.dex */
public final class ahwv extends ges {
    public String a;
    public ahxx b;
    public efg c;
    public cqkj d;
    public ahxy e;
    private cqkf<ahxj> f;

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        cqkf<ahxj> cqkfVar = this.f;
        if (cqkfVar != null) {
            cqkfVar.e(null);
        }
        this.f = null;
        super.Qe();
    }

    @Override // defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final boolean z = this.o.getBoolean("shouldEnableReportingKey");
        final PendingIntent pendingIntent = (PendingIntent) this.o.getParcelable("returnIntentKey");
        dbsk.s(pendingIntent);
        ahxy ahxyVar = this.e;
        m x = x();
        String g = g();
        Runnable runnable = new Runnable(this) { // from class: ahwt
            private final ahwv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ahwv ahwvVar = this.a;
                gga ggaVar = ahwvVar.aE;
                if (!ahwvVar.aD || ggaVar == null) {
                    return;
                }
                ggaVar.g().f();
            }
        };
        dzsj<gga> dzsjVar = ahxyVar.a;
        ajsa a = ahxyVar.b.a();
        ahxy.a(a, 2);
        akai a2 = ahxyVar.c.a();
        ahxy.a(a2, 3);
        akfc a3 = ahxyVar.d.a();
        ahxy.a(a3, 4);
        akfa a4 = ahxyVar.e.a();
        ahxy.a(a4, 5);
        cqhn a5 = ahxyVar.f.a();
        ahxy.a(a5, 6);
        cqhu a6 = ahxyVar.g.a();
        ahxy.a(a6, 7);
        Executor a7 = ahxyVar.h.a();
        ahxy.a(a7, 8);
        Executor a8 = ahxyVar.i.a();
        ahxy.a(a8, 9);
        ajmq a9 = ahxyVar.j.a();
        ahxy.a(a9, 10);
        ahzd a10 = ahxyVar.k.a();
        ahxy.a(a10, 11);
        ahzh a11 = ahxyVar.l.a();
        ahxy.a(a11, 12);
        cpv a12 = ahxyVar.m.a();
        ahxy.a(a12, 13);
        ajln a13 = ahxyVar.n.a();
        ahxy.a(a13, 14);
        ahxy.a(x, 15);
        ahxy.a(g, 16);
        ahxy.a(pendingIntent, 18);
        ahxy.a(runnable, 19);
        this.b = new ahxx(dzsjVar, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, x, g, z, pendingIntent, runnable);
        cqkf<ahxj> e = this.d.e(new ahxi());
        e.e(this.b);
        View c = e.c();
        c.post(new Runnable(this, z, pendingIntent) { // from class: ahwu
            private final ahwv a;
            private final boolean b;
            private final PendingIntent c;

            {
                this.a = this;
                this.b = z;
                this.c = pendingIntent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ahwv ahwvVar = this.a;
                boolean z2 = this.b;
                PendingIntent pendingIntent2 = this.c;
                ahxx ahxxVar = ahwvVar.b;
                if (ahxxVar != null) {
                    ahxxVar.g(ahwvVar.g(), z2, pendingIntent2);
                }
            }
        });
        this.f = e;
        return c;
    }

    public final String g() {
        if (this.a == null) {
            String string = this.o.getString("obfuscatedGaiaIdKey");
            dbsk.s(string);
            this.a = string;
        }
        String str = this.a;
        dbsk.s(str);
        return str;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("obfuscatedGaiaIdKey");
            dbsk.s(string);
            this.a = string;
        }
        super.l(bundle);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        efg efgVar = this.c;
        egj egjVar = new egj(this);
        egjVar.w(this.P);
        egjVar.ag(null);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        bundle.putString("obfuscatedGaiaIdKey", g());
        super.t(bundle);
    }
}
