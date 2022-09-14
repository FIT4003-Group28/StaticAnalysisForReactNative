package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: dbc  reason: default package */
/* loaded from: classes5.dex */
public final class dbc {
    public final Activity a;
    public final bvsl b;
    @dzsi
    public dowa d;
    @dzsi
    dfep e;
    @dzsi
    public dgb f;
    public final cqat g;
    public final View h;
    private final dfeh i;
    private final dbty<Bitmap> j;
    private final int k;
    @dzsi
    private dtj l;
    @dzsi
    private dfeq<dfha> m;
    @dzsi
    private dbb n;
    private int o = 1;
    public boolean c = false;

    public dbc(cqat cqatVar, bvsl bvslVar, final Activity activity, dfeh dfehVar, int i, czz czzVar) {
        boolean z = true;
        this.g = cqatVar;
        this.a = activity;
        this.b = bvslVar;
        this.i = dfehVar;
        dbsk.a(i < 0 ? false : z);
        this.k = i;
        this.j = dbud.a(new dbty(activity) { // from class: daz
            private final Activity a;

            {
                this.a = activity;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return BitmapFactory.decodeResource(this.a.getResources(), R.drawable.destination_pin);
            }
        });
        this.h = ((dnz) czzVar).a;
    }

    private final void c() {
        boolean z = true;
        dbsk.l(this.e == null);
        dtj dtjVar = this.l;
        dbsk.s(dtjVar);
        dfeh dfehVar = this.i;
        int i = this.k;
        int i2 = this.o;
        dfgn bZ = dfgo.d.bZ();
        duhe duheVar = dtjVar.b;
        if (duheVar == null) {
            duheVar = duhe.c;
        }
        double d = duheVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfgo dfgoVar = (dfgo) bZ.b;
        dfgoVar.a |= 1;
        dfgoVar.b = d;
        duhe duheVar2 = dtjVar.b;
        if (duheVar2 == null) {
            duheVar2 = duhe.c;
        }
        double d2 = duheVar2.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfgo dfgoVar2 = (dfgo) bZ.b;
        dfgoVar2.a |= 2;
        dfgoVar2.c = d2;
        dfgo bK = bZ.bK();
        dfgw bZ2 = dfgx.g.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dfgx dfgxVar = (dfgx) bZ2.b;
        bK.getClass();
        dfgxVar.b = bK;
        dfgxVar.a |= 1;
        dgau b = dgau.b(dtjVar.f);
        if (b == null) {
            b = dgau.MANEUVER_UNKNOWN;
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dfgx dfgxVar2 = (dfgx) bZ2.b;
        dfgxVar2.c = b.F;
        int i3 = dfgxVar2.a | 2;
        dfgxVar2.a = i3;
        float f = dtjVar.e;
        dfgxVar2.a = i3 | 4;
        dfgxVar2.d = f;
        int e = e(i2);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dfgx dfgxVar3 = (dfgx) bZ2.b;
        dfgxVar3.e = e - 1;
        int i4 = dfgxVar3.a | 8;
        dfgxVar3.a = i4;
        dfgxVar3.a = i4 | 16;
        dfgxVar3.f = i;
        final dfep b2 = dfehVar.b(bZ2.bK());
        String str = dtjVar.c;
        if (str.isEmpty()) {
            str = this.a.getString(R.string.ARLO_STEP_CONTINUE);
        }
        dgau b3 = dgau.b(dtjVar.f);
        if (b3 == null) {
            b3 = dgau.MANEUVER_UNKNOWN;
        }
        Bitmap a = b3 == dgau.DESTINATION ? this.j.a() : null;
        if (amb.a(this.a.getResources().getConfiguration().locale) != 1) {
            z = false;
        }
        final dfkn dfknVar = new dfkn(str, a, z);
        dfeq<dfha> dfeqVar = new dfeq(this, b2, dfknVar) { // from class: dba
            private final dbc a;
            private final dfep b;
            private final dfkn c;

            {
                this.a = this;
                this.b = b2;
                this.c = dfknVar;
            }

            @Override // defpackage.dfeq
            public final void n(Object obj) {
                dbc dbcVar = this.a;
                dfep dfepVar = this.b;
                dfkn dfknVar2 = this.c;
                dfha dfhaVar = (dfha) obj;
                if (dfepVar == dbcVar.e && dfhaVar != null) {
                    dfknVar2.a = dbcVar.a.getString(R.string.ARLO_STEP_NODE_DISTANCE, new Object[]{dbcVar.b.c(Math.round(dfhaVar.a), dbcVar.d, false, true)});
                    dfepVar.e(dfknVar2.a());
                }
            }
        };
        b2.a(dfeqVar);
        b2.e(dfknVar.a());
        dbb dbbVar = new dbb(this, b2);
        b2.c(dbbVar);
        this.m = dfeqVar;
        this.n = dbbVar;
        this.e = b2;
    }

    private final void d() {
        dfep dfepVar = this.e;
        if (dfepVar == null) {
            return;
        }
        dfeq<dfha> dfeqVar = this.m;
        if (dfeqVar != null) {
            dfepVar.b(dfeqVar);
            this.m = null;
        }
        dbb dbbVar = this.n;
        if (dbbVar != null) {
            dfepVar.d(dbbVar);
            this.n = null;
        }
        dfepVar.g();
        this.e = null;
    }

    public final void a() {
        d();
        this.c = true;
    }

    public final void b(@dzsi dtj dtjVar, int i) {
        boolean a = dbsd.a(this.l, dtjVar);
        if (!a || this.o != i) {
            dfep dfepVar = this.e;
            boolean z = (dtjVar == null || i == 1) ? false : true;
            this.l = dtjVar;
            this.o = i;
            if (!a) {
                if (dfepVar != null) {
                    d();
                }
                if (!z) {
                    return;
                }
                c();
                return;
            }
            if (dfepVar != null && z) {
                dbsk.s(dfepVar);
                dfhb bZ = dfhc.c.bZ();
                int e = e(this.o);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dfhc dfhcVar = (dfhc) bZ.b;
                dfhcVar.b = e - 1;
                dfhcVar.a |= 1;
                dfepVar.f(bZ.bK());
            }
            if (dfepVar == null && z) {
                c();
            }
            if (dfepVar == null || z) {
                return;
            }
            d();
        }
    }

    private static int e(int i) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                return 2;
            }
            if (i2 == 2) {
                return 3;
            }
            if (i2 != 3) {
                throw new IllegalArgumentException("Unsupported step state");
            }
            return 4;
        }
        throw null;
    }
}
