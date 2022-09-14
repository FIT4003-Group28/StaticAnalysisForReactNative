package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import com.google.android.apps.gmm.directions.savedtrips.api.C$AutoValue_SavedTrip;
import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: zqu  reason: default package */
/* loaded from: classes7.dex */
public class zqu implements zeu {
    public final dpiz a;
    @dzsi
    public final CharSequence b;
    public final cqtd c;
    private final qbt d;
    @dzsi
    private final whr e;
    private zfn f;
    @dzsi
    private final SavedTrip g;
    private final dcdc<zdu> h;
    private final zqn i;
    private final dcdc<zes> j;
    private final cjtd k;
    @dzsi
    private final cjtd l;

    public zqu(wgh wghVar, whs whsVar, qbt qbtVar, whm whmVar, Context context, amvh amvhVar, amvh amvhVar2, dpiz dpizVar, int i, vtj vtjVar) {
        SavedTrip savedTrip;
        ddhj ddhjVar;
        this.d = qbtVar;
        String str = null;
        if ((dpizVar.a & 16) != 0) {
            String str2 = dpizVar.g;
            dqvj dqvjVar = dqvj.TRANSIT;
            dpiy dpiyVar = dpizVar.f;
            savedTrip = SavedTrip.d(str2, SavedTrip.Data.j(amvhVar, amvhVar2, dqvjVar, 1, (dpiyVar == null ? dpiy.c : dpiyVar).a, dbpy.a, 2));
        } else {
            savedTrip = null;
        }
        this.g = savedTrip;
        cjta b = cjtd.b();
        b.d = dtyb.ak;
        if (wghVar.a()) {
            ddhjVar = ddhj.VISIBILITY_VISIBLE;
        } else {
            ddhjVar = ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
        }
        b.w(ddhjVar);
        this.l = b.a();
        if (wghVar.a() && wghVar.c() && savedTrip != null) {
            this.e = whsVar.a(whmVar.a(((C$AutoValue_SavedTrip) savedTrip).b), true, new zqp());
        } else {
            this.e = null;
        }
        this.f = zfn.DIRECTIONS_RESULT_TRIPCARD;
        dqvj c = dqvj.c(dpizVar.c);
        this.i = zqn.d(context, c == null ? dqvj.DRIVE : c);
        this.a = dpizVar;
        dozz dozzVar = dpizVar.d;
        doza b2 = doza.b((dozzVar == null ? dozz.y : dozzVar).e);
        this.c = cqrt.f(alca.b(b2 == null ? doza.INFORMATION : b2));
        ddho ddhoVar = dtxn.eg;
        cjta b3 = cjtd.b();
        b3.i(i);
        b3.g(dpizVar.b);
        b3.d = ddhoVar;
        this.k = b3.a();
        dpiy dpiyVar2 = dpizVar.f;
        if (!(dpiyVar2 == null ? dpiy.c : dpiyVar2).b.isEmpty()) {
            Object[] objArr = new Object[1];
            dpiy dpiyVar3 = dpizVar.f;
            objArr[0] = (dpiyVar3 == null ? dpiy.c : dpiyVar3).b.get(0).b;
            str = context.getString(R.string.TRANSIT_FROM_STATION, objArr);
        }
        this.b = str;
        this.j = dcdc.g(new zqs(this), new zqr(this));
        this.h = zsa.b(dpizVar.e, vtjVar);
    }

    @Override // defpackage.zfp
    public zfn M() {
        return this.f;
    }

    @Override // defpackage.zfp
    @dzsi
    public dqvj N() {
        return ((zgp) this.i).a;
    }

    @Override // defpackage.zfp
    @dzsi
    public String O() {
        throw null;
    }

    @Override // defpackage.zfp
    @dzsi
    public cqtd P() {
        throw null;
    }

    @Override // defpackage.zfp
    @dzsi
    public String Q() {
        return null;
    }

    @Override // defpackage.zfp
    @dzsi
    public String R() {
        return null;
    }

    @Override // defpackage.zfp
    @dzsi
    public String S() {
        return null;
    }

    @Override // defpackage.zfp
    public cqkl T() {
        qbt qbtVar = this.d;
        dozz dozzVar = this.a.d;
        if (dozzVar == null) {
            dozzVar = dozz.y;
        }
        qbtVar.S(dcdc.f(GmmNotice.f(dozzVar)), this.g);
        return cqkl.a;
    }

    @Override // defpackage.zfp
    public Boolean U() {
        return false;
    }

    @Override // defpackage.zfp
    public Integer V() {
        return -1;
    }

    @Override // defpackage.zfp
    public Boolean W() {
        return false;
    }

    @Override // defpackage.zfp
    public Boolean X() {
        return false;
    }

    @Override // defpackage.zfp
    public cqkl Y() {
        return cqkl.a;
    }

    @Override // defpackage.zfp
    public cjtd Z(ddho ddhoVar) {
        cjta c = cjtd.c(this.k);
        c.d = ddhoVar;
        return c.a();
    }

    @Override // defpackage.zeu
    @dzsi
    public String a() {
        return null;
    }

    @Override // defpackage.zfp
    public cjtd ab() {
        return this.k;
    }

    @Override // defpackage.zeu
    @dzsi
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.zeu
    public dcdc<zdu> c() {
        return this.h;
    }

    @Override // defpackage.zeu
    @dzsi
    public String d() {
        return null;
    }

    @Override // defpackage.zeu
    public Boolean e() {
        return false;
    }

    @Override // defpackage.zeu
    @dzsi
    public String f() {
        return null;
    }

    @Override // defpackage.zeu
    @dzsi
    public String g() {
        return null;
    }

    @Override // defpackage.zeu
    public Boolean h() {
        return false;
    }

    @Override // defpackage.zeu
    @dzsi
    public String i() {
        return null;
    }

    @Override // defpackage.zeu
    public Boolean j() {
        return false;
    }

    @Override // defpackage.zca
    @dzsi
    public CharSequence k() {
        return null;
    }

    @Override // defpackage.zca
    public boolean l() {
        return false;
    }

    @Override // defpackage.zca
    public void m(Context context) {
    }

    @Override // defpackage.zca
    public boolean n() {
        return false;
    }

    @Override // defpackage.zca
    public boolean o() {
        return false;
    }

    @Override // defpackage.zeu
    @dzsi
    public cqtd p() {
        return this.c;
    }

    @Override // defpackage.zeu
    public Boolean q() {
        return true;
    }

    @Override // defpackage.zeu
    public zdi r() {
        return new zqq();
    }

    @Override // defpackage.zeu
    public Boolean s() {
        return false;
    }

    @Override // defpackage.zeu
    @dzsi
    public zei t() {
        return null;
    }

    @Override // defpackage.zeu
    @dzsi
    public zbi u() {
        return null;
    }

    @Override // defpackage.zeu
    public List<zes> v() {
        return this.j;
    }

    @Override // defpackage.zeu
    @dzsi
    public whc w() {
        return this.e;
    }

    @Override // defpackage.zeu
    @dzsi
    public cjtd x() {
        return this.l;
    }

    @Override // defpackage.zfp
    @dzsi
    /* renamed from: y */
    public zei aa() {
        return null;
    }
}
