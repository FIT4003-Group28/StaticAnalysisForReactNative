package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxcs  reason: default package */
/* loaded from: classes4.dex */
public class bxcs implements bxcb {
    public final bxcr a;
    public final begg b;
    private final ff c;
    private final huc d;
    private final bxcu e;
    @dzsi
    private iib f;

    public bxcs(ff ffVar, cqhn cqhnVar, bxcr bxcrVar, begg beggVar, huc hucVar, bxcu bxcuVar) {
        this.c = ffVar;
        this.a = bxcrVar;
        this.b = beggVar;
        this.d = hucVar;
        this.e = bxcuVar;
    }

    public static int d(int i, DisplayMetrics displayMetrics) {
        return Math.round(TypedValue.applyDimension(1, i, displayMetrics));
    }

    public static int e(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels - d(56, displayMetrics);
    }

    @Override // defpackage.bxcb
    public void a() {
        final dcdc<dwfl> b;
        bwzx c = bwzx.c(this.c);
        bwzw bwzwVar = c.d;
        if (bwzwVar == null) {
            return;
        }
        bwzv bwzvVar = c.a;
        if (bwzvVar != null) {
            b = bwzwVar.c().h(bwzvVar);
        } else {
            b = bwzwVar.b();
        }
        final ilo a = bwzwVar.a();
        if (b.isEmpty()) {
            this.f = null;
            cqkx.p(this);
            return;
        }
        dccx F = dcdc.F();
        final int i = 0;
        while (i < b.size()) {
            dwfl dwflVar = b.get(i);
            bwwy bwwyVar = new bwwy();
            bxcu bxcuVar = this.e;
            Runnable runnable = new Runnable(this, a, b, i) { // from class: bxcn
                private final bxcs a;
                private final ilo b;
                private final dcdc c;
                private final int d;

                {
                    this.a = this;
                    this.b = a;
                    this.c = b;
                    this.d = i;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bxcs bxcsVar = this.a;
                    ilo iloVar = this.b;
                    dcdc dcdcVar = this.c;
                    int i2 = this.d;
                    bxcr bxcrVar = bxcsVar.a;
                    btvo btvoVar = bxcrVar.a;
                    bwqv bwqvVar = bxcrVar.b;
                    bwrs a2 = iloVar == null ? null : bwrs.a(iloVar);
                    ckne ckneVar = new ckne(dcdcVar);
                    boolean z = iloVar != null;
                    bbtv v = bbty.v();
                    v.k(z);
                    bcpq.q(btvoVar, bwqvVar, a2, ckneVar, v.a(), i2, null).aJ(bxcrVar.c);
                }
            };
            int i2 = i + 1;
            int size = b.size();
            boolean d = bwzwVar.d();
            Activity activity = (Activity) ((dxjd) bxcuVar.a).a;
            bxcu.a(activity, 1);
            dxio a2 = ((dxjh) bxcuVar.b).a();
            bxcu.a(a2, 2);
            cafi a3 = bxcuVar.c.a();
            bxcu.a(a3, 3);
            cqat a4 = bxcuVar.d.a();
            bxcu.a(a4, 4);
            cjmt a5 = bxcuVar.e.a();
            bxcu.a(a5, 5);
            bxcu.a(bxcuVar.f.a(), 6);
            bxcu.a(runnable, 7);
            bxcu.a(dwflVar, 8);
            ilo iloVar = a;
            ilo iloVar2 = a;
            dccx dccxVar = F;
            dccxVar.g(cqgr.fT(bwwyVar, new bxcq(activity, a2, a3, a4, a5, runnable, dwflVar, iloVar, i2, size, d)));
            F = dccxVar;
            i = i2;
            a = iloVar2;
            b = b;
            bwzwVar = bwzwVar;
        }
        final ilo iloVar3 = a;
        final cjtd a6 = cjtd.a(dtyb.ei);
        iic j = iid.j();
        ifj ifjVar = (ifj) j;
        ifjVar.f = a6;
        ifjVar.e = this.d.a(new htz(a6) { // from class: bxco
            private final cjtd a;

            {
                this.a = a6;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a;
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        });
        j.e(F.f());
        if (iloVar3 != null) {
            j.g(iia.g(new jbl(this, iloVar3) { // from class: bxcp
                private final bxcs a;
                private final ilo b;

                {
                    this.a = this;
                    this.b = iloVar3;
                }

                @Override // defpackage.jbl
                public final void a() {
                    bxcs bxcsVar = this.a;
                    ilo iloVar4 = this.b;
                    begg beggVar = bxcsVar.b;
                    begj begjVar = new begj();
                    begjVar.b(iloVar4);
                    begjVar.e = bege.PHOTOS;
                    begjVar.n = true;
                    begjVar.c = jjn.EXPANDED;
                    begjVar.z = true;
                    begjVar.x = true;
                    beggVar.n(begjVar, false, null);
                }
            }, cjtd.a(dtyb.el), this.c.getString(R.string.STREETVIEW_MORE_PHOTOS), true, cqrp.c(e(this.c) * 0.6f)));
        }
        this.f = j.f();
        cqkx.p(this);
    }

    @Override // defpackage.bxcb
    public cqkl b() {
        this.c.g().e();
        return cqkl.a;
    }

    @Override // defpackage.bxcb
    @dzsi
    public iib c() {
        return this.f;
    }
}
