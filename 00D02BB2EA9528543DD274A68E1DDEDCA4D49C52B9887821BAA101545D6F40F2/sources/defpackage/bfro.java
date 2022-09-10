package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bfro  reason: default package */
/* loaded from: classes3.dex */
public class bfro implements bfrd {
    private final Activity a;
    private final afec b;
    private final dxio<cwv> c;
    private final dnnr d;
    private final dnnn e;
    private final boolean f;
    private final bfrb g;
    private final dcdc<bfrc> h;
    private final bfre i;
    private final cjtd j;

    public bfro(Activity activity, btvo btvoVar, bfrl bfrlVar, bfrj bfrjVar, afec afecVar, dxio<cwv> dxioVar, dnnr dnnrVar, dnnn dnnnVar, boolean z, boolean z2, int i, cjtd cjtdVar) {
        this.a = activity;
        this.b = afecVar;
        this.c = dxioVar;
        this.d = dnnrVar;
        this.e = dnnnVar;
        this.f = z2;
        cjta b = cjtd.b();
        b.d = dtxy.dH;
        b.i(i);
        this.j = b.a();
        Resources a = bfrjVar.a.a();
        int i2 = 1;
        bfrj.a(a, 1);
        int i3 = 2;
        bfrj.a(dnnrVar, 2);
        bfrj.a(cjtdVar, 4);
        this.g = new bfri(a, dnnrVar, z, cjtdVar);
        dccx F = dcdc.F();
        for (dqxq dqxqVar : dnnrVar.l) {
            String str = dnnrVar.b;
            Activity activity2 = (Activity) ((dxjd) bfrlVar.a).a;
            bfrl.a(activity2, i2);
            dxio a2 = ((dxjh) bfrlVar.b).a();
            bfrl.a(a2, i3);
            bfrl.a(dqxqVar, 3);
            bfrl.a(str, 5);
            bfrl.a(dnnnVar, 7);
            dccx dccxVar = F;
            dccxVar.g(new bfrk(activity2, a2, dqxqVar, z, str, i, dnnnVar));
            F = dccxVar;
            i2 = 1;
            i3 = 2;
        }
        this.h = F.f();
        this.i = new bfre(i == 1 ? 2 : 1, dnnrVar, dnnnVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String s(Activity activity, dqxo dqxoVar, dbsg<dqxc> dbsgVar) {
        dccx F = dcdc.F();
        if (dbsgVar.a()) {
            int i = dbsgVar.b().b;
            F.g(activity.getResources().getQuantityString(R.plurals.HOTEL_OCCUPANCY_RATE_LABEL, i, Integer.valueOf(i)));
        }
        for (dqxm dqxmVar : dqxoVar.a) {
            int i2 = dqxmVar.a;
            int i3 = 4;
            if (i2 == 0) {
                i3 = 5;
            } else if (i2 == 1) {
                i3 = 1;
            } else if (i2 == 2) {
                i3 = 2;
            } else if (i2 == 3) {
                i3 = 3;
            } else if (i2 != 4) {
                i3 = 0;
            }
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 0) {
                F.g(activity.getString(R.string.HOTEL_RATE_FEATURE_FREE_WIFI));
            } else if (i4 == 1) {
                F.g(activity.getString(R.string.HOTEL_RATE_FEATURE_FREE_BREAKFAST));
            } else if (i4 == 2) {
                F.g(activity.getString(R.string.HOTEL_RATE_FEATURE_FREE_PARKING));
            } else if (i4 == 3) {
                F.g(activity.getString(R.string.HOTEL_RATE_FEATURE_FREE_CANCELLATION));
            }
        }
        return TextUtils.join("  •  ", F.f());
    }

    @Override // defpackage.bfrd
    public jic a() {
        String str = this.d.f;
        if (dbsj.d(str)) {
            return new jic(null, ckqc.FULLY_QUALIFIED, 2131232998);
        }
        if (str.startsWith("//")) {
            String valueOf = String.valueOf(str);
            str = valueOf.length() != 0 ? "https:".concat(valueOf) : new String("https:");
        }
        return new jic(str, ckqc.FULLY_QUALIFIED, 0);
    }

    @Override // defpackage.bfrd
    public CharSequence b() {
        return this.d.b;
    }

    @Override // defpackage.bfrd
    @dzsi
    public CharSequence c() {
        dcbg s = dcbg.b(this.d.i).o(bfrm.a).s(bfrn.a);
        if (s.y()) {
            return null;
        }
        return TextUtils.join("  •  ", s);
    }

    @Override // defpackage.bfrd
    public Boolean d() {
        boolean z = false;
        if (!this.i.a(3)) {
            return false;
        }
        CharSequence c = c();
        if (c != null && !c.toString().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfrd
    public Boolean e() {
        boolean z = false;
        if (!this.i.a(0)) {
            return false;
        }
        CharSequence c = c();
        if (c != null && !c.toString().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfrd
    public cqkl f() {
        if (!this.d.h || this.b.a()) {
            cwv a = this.c.a();
            dnpq dnpqVar = this.d.e;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
            a.a(dnpqVar.c);
            return cqkl.a;
        }
        cwv a2 = this.c.a();
        dnpq dnpqVar2 = this.d.e;
        if (dnpqVar2 == null) {
            dnpqVar2 = dnpq.g;
        }
        a2.b(dnpqVar2.c, dtxr.cp);
        return cqkl.a;
    }

    @Override // defpackage.bfrd
    @dzsi
    public cjtd g() {
        return this.j;
    }

    @Override // defpackage.bfrd
    public Boolean h() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.bfrd
    public bfrb j() {
        return this.g;
    }

    @Override // defpackage.bfrd
    @dzsi
    public aeqj k() {
        return this.g.d();
    }

    @Override // defpackage.bfrd
    public Boolean l() {
        aeqj k = k();
        boolean z = false;
        if (k != null && k.a().equals(0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfrd
    public Boolean m() {
        aeqj k = k();
        boolean z = false;
        if (k != null && k.a().equals(2)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfrd
    public Boolean n() {
        return Boolean.valueOf(this.i.a(1));
    }

    @Override // defpackage.bfrd
    public Boolean o() {
        return Boolean.valueOf(this.d.g);
    }

    @Override // defpackage.bfrd
    public Boolean p() {
        boolean z = false;
        if (!this.i.a(2)) {
            return false;
        }
        String q = q();
        if (q != null && !q.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfrd
    @dzsi
    public String q() {
        dbsg dbsgVar;
        dnnr dnnrVar = this.d;
        boolean z = false;
        if ((dnnrVar.a & 32768) != 0) {
            dqxc dqxcVar = dnnrVar.k;
            if (dqxcVar == null) {
                dqxcVar = dqxc.c;
            }
            if (bfre.b(dqxcVar, this.e)) {
                z = true;
            }
        }
        dnnr dnnrVar2 = this.d;
        if ((dnnrVar2.a & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 0 && !z) {
            return null;
        }
        Activity activity = this.a;
        dqxo dqxoVar = dnnrVar2.m;
        if (dqxoVar == null) {
            dqxoVar = dqxo.b;
        }
        if (z) {
            dqxc dqxcVar2 = this.d.k;
            if (dqxcVar2 == null) {
                dqxcVar2 = dqxc.c;
            }
            dbsgVar = dbsg.i(dqxcVar2);
        } else {
            dbsgVar = dbpy.a;
        }
        return s(activity, dqxoVar, dbsgVar);
    }

    @Override // defpackage.bfrd
    /* renamed from: r */
    public dcdc<bfrc> i() {
        return this.h;
    }
}
