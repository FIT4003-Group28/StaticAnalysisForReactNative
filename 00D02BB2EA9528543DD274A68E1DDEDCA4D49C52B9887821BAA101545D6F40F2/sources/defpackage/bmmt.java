package defpackage;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmmt  reason: default package */
/* loaded from: classes3.dex */
public class bmmt implements bmml {
    private final gga a;
    private final dxio<afha> b;
    private final bmms c;
    private final dxio<begg> d;
    private final bwrs<ilo> e;
    private final boolean f;
    @dzsi
    private List<bmmk> g;

    public bmmt(gga ggaVar, dxio<afha> dxioVar, bmms bmmsVar, dxio<begg> dxioVar2, bwrs<ilo> bwrsVar, boolean z) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = bmmsVar;
        this.d = dxioVar2;
        this.e = bwrsVar;
        this.f = z;
    }

    @dzsi
    private final String k() {
        dfyz l = l();
        if ((l.a & 1) != 0) {
            dgbo dgboVar = l.c;
            if (dgboVar == null) {
                dgboVar = dgbo.e;
            }
            return dgboVar.c;
        }
        return null;
    }

    private final dfyz l() {
        ilo c = this.e.c();
        dbsk.s(c);
        dfyz cU = c.cU();
        dbsk.s(cU);
        return cU;
    }

    private final List<bmmk> m() {
        if (this.g == null) {
            dccx F = dcdc.F();
            for (dfyx dfyxVar : l().b) {
                if (dfyxVar.d.size() != 0) {
                    for (dfyr dfyrVar : dfyxVar.d) {
                        bmms bmmsVar = this.c;
                        String str = dfyxVar.c;
                        String str2 = dfyrVar.a;
                        String k = k();
                        int a = dfyu.a(dfyxVar.b);
                        F.g(bmmsVar.a(str, str2, k, a != 0 && a == 2, this.e));
                    }
                } else {
                    bmms bmmsVar2 = this.c;
                    String str3 = dfyxVar.c;
                    String k2 = k();
                    int a2 = dfyu.a(dfyxVar.b);
                    F.g(bmmsVar2.a(str3, "", k2, a2 != 0 && a2 == 2, this.e));
                }
            }
            this.g = F.f();
        }
        return this.g;
    }

    @Override // defpackage.bmml
    public Boolean a() {
        ilo c = this.e.c();
        dbsk.s(c);
        boolean z = true;
        if (!bmmj.a(c) && (l().a & 1) == 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmml
    public Spanned b() {
        String string;
        dfyz l = l();
        dgbo dgboVar = l.c;
        if (dgboVar == null) {
            dgboVar = dgbo.e;
        }
        String str = dgboVar.c;
        String str2 = l.d;
        if (dbsj.d(str) || dbsj.d(str2)) {
            string = this.a.getString(R.string.ADMISSION_PRICES_EXPLANATION);
        } else {
            ilo c = this.e.c();
            dbsk.s(c);
            if (bmmj.a(c)) {
                string = this.a.getString(R.string.ADMISSION_PRICES_EXPLANATION_WITH_WEBSITE, new Object[]{str, str2});
            } else {
                string = this.a.getString(R.string.ADMISSION_PRICES_EXPLANATION_WITH_WEBSITE_NO_TICKET_REQUIRED, new Object[]{str, str2});
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(string, 63);
        }
        return Html.fromHtml(string);
    }

    @Override // defpackage.bmml
    public cqkl c() {
        String k = k();
        if (k != null) {
            this.b.a().k(this.a, k, 1);
        }
        return cqkl.a;
    }

    @Override // defpackage.bmml
    public Boolean d() {
        boolean z = true;
        if (1 != (l().a & 1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmml
    public cjtd e() {
        ilo c = this.e.c();
        dbsk.s(c);
        cjta c2 = cjtd.c(c.bZ());
        c2.d = dtxy.hv;
        return c2.a();
    }

    @Override // defpackage.bmml
    public List<bmmk> f() {
        List<bmmk> m = m();
        return (!this.f || m.size() <= 4) ? m : m.subList(0, 3);
    }

    @Override // defpackage.bmml
    public acpa g() {
        return new acpc(this.a.getString(R.string.ADMISSION_PRICES_TOOLTIP_CONTENT), this.a.getString(R.string.ADMISSION_PRICES_TOOLTIP_CONTENT_DESCRIPTION), acpc.c);
    }

    @Override // defpackage.bmml
    public Boolean h() {
        boolean z = false;
        if (this.f && m().size() > 4) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bmml
    public cqkl i() {
        this.d.a().k(bege.TICKETS);
        return cqkl.a;
    }

    @Override // defpackage.bmml
    public cjtd j() {
        ilo c = this.e.c();
        dbsk.s(c);
        cjta c2 = cjtd.c(c.bZ());
        c2.d = dtxy.ht;
        return c2.a();
    }
}
