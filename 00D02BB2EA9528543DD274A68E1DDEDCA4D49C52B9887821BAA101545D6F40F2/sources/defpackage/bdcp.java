package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdcp  reason: default package */
/* loaded from: classes3.dex */
public class bdcp implements bdak {
    public final Activity a;
    public bczw b = bczw.c(dwfl.w, "");
    public dcdc<jho> c = dcdc.e();
    public final bdbm d;
    private final cafi e;
    private final dxio<afha> f;

    public bdcp(Activity activity, cafi cafiVar, dxio dxioVar, bdbm bdbmVar) {
        this.a = activity;
        this.e = cafiVar;
        this.f = dxioVar;
        this.d = bdbmVar;
    }

    private final String e() {
        dwfl a = this.b.a();
        dwfh dwfhVar = a.k;
        if (dwfhVar == null) {
            dwfhVar = dwfh.d;
        }
        if ((dwfhVar.a & 2) == 0) {
            dwfh dwfhVar2 = a.k;
            if (dwfhVar2 == null) {
                dwfhVar2 = dwfh.d;
            }
            return dwfhVar2.b;
        }
        dwfh dwfhVar3 = a.k;
        if (dwfhVar3 == null) {
            dwfhVar3 = dwfh.d;
        }
        dnpq dnpqVar = dwfhVar3.c;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return dnpqVar.d;
    }

    @Override // defpackage.jbk
    public jib NC() {
        String str;
        jhz jhzVar = new jhz();
        jhzVar.a = e();
        jhzVar.g(14);
        jhzVar.u = ibl.b();
        jhzVar.C = 2;
        String b = this.b.b();
        dizh dizhVar = this.b.a().p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dizp dizpVar = dizhVar.h;
        if (dizpVar == null) {
            dizpVar = dizp.c;
        }
        if ((dizpVar.a & 1) != 0) {
            int i = (int) dizpVar.b;
            str = this.a.getResources().getQuantityString(R.plurals.PROFILE_ACTIVITY_NUMBER_OF_PHOTO_VIEWS, i, Integer.valueOf(i));
        } else {
            str = "";
        }
        if (!dbsj.d(b) && !dbsj.d(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 3 + String.valueOf(str).length());
            sb.append(b);
            sb.append(" · ");
            sb.append(str);
            b = sb.toString();
        } else if (dbsj.d(b)) {
            b = dbsj.d(str) ? "" : str;
        }
        jhzVar.b = b;
        jhzVar.v = ibl.b();
        jhzVar.x = false;
        jhzVar.q = cqta.f();
        jhzVar.i = cqrt.g(2131231591, ibl.b());
        jhzVar.j = cqrt.l(R.string.CLOSE_BUTTON);
        jhzVar.f(new View.OnClickListener(this) { // from class: bdco
            private final bdcp a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a.onBackPressed();
            }
        });
        jhzVar.z = 1;
        jhzVar.d(this.c);
        jhzVar.f = ibl.b();
        return jhzVar.b();
    }

    @Override // defpackage.bdak
    @dzsi
    public jic b() {
        dwfl a = this.b.a();
        dwfh dwfhVar = a.k;
        if (dwfhVar == null) {
            dwfhVar = dwfh.d;
        }
        dnpq dnpqVar = dwfhVar.c;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        String str = dnpqVar.e;
        if (str.isEmpty()) {
            return null;
        }
        return new jic(str, jfv.b(a), null, 0, WebImageView.b);
    }

    @Override // defpackage.bdak
    public cqkl c() {
        dwfh dwfhVar = this.b.a().k;
        if (dwfhVar == null) {
            dwfhVar = dwfh.d;
        }
        dnpq dnpqVar = dwfhVar.c;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        String str = dnpqVar.c;
        if (dbsj.d(str)) {
            return cqkl.a;
        }
        Runnable b = bmek.b(this.a, this.e, this.f, str);
        if (b != null) {
            b.run();
        } else {
            this.f.a().k(this.a, str, 1);
        }
        return cqkl.a;
    }

    @Override // defpackage.bdak
    public Boolean d() {
        boolean z;
        bczw bczwVar = this.b;
        boolean z2 = true;
        if (bczwVar != null) {
            dwfh dwfhVar = bczwVar.a().k;
            if (dwfhVar == null) {
                dwfhVar = dwfh.d;
            }
            dnpq dnpqVar = dwfhVar.c;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
            if (!dnpqVar.e.isEmpty()) {
                z = true;
                if (Boolean.valueOf(z).booleanValue() || !Boolean.valueOf(!dbsj.d(e())).booleanValue()) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }
        z = false;
        if (Boolean.valueOf(z).booleanValue()) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
