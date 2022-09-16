package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zhg  reason: default package */
/* loaded from: classes7.dex */
public class zhg implements zbm {
    final /* synthetic */ zhh a;
    private final GmmNotice b;
    private final dozz c;

    public zhg(zhh zhhVar, GmmNotice gmmNotice) {
        this.a = zhhVar;
        this.b = gmmNotice;
        this.c = gmmNotice.c();
    }

    private final boolean h() {
        if (this.a.e.size() <= 1 && this.c.i.isEmpty() && this.c.h.isEmpty()) {
            dozy b = dozy.b(this.b.c().f);
            if (b == null) {
                b = dozy.UNKNOWN;
            }
            if (!b.equals(dozy.BUSYNESS) || this.b.d() == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.zbm
    public cqtd a() {
        return yzx.a(this.c, this.a.b, alca.d(this.b));
    }

    @Override // defpackage.zbm
    public CharSequence b() {
        dsrj<dpce> dsrjVar = this.c.m;
        String str = null;
        if (!dsrjVar.isEmpty()) {
            String s = alcf.s(dsrjVar);
            if (!bvpb.c(s)) {
                dbsk.s(s);
                str = s;
            }
        }
        if (str == null) {
            str = this.c.g;
        }
        dwag d = this.b.d();
        if (d != null) {
            dvvo dvvoVar = d.a;
            if (dvvoVar == null) {
                dvvoVar = dvvo.e;
            }
            if ((dvvoVar.a & 2) != 0) {
                String string = this.a.a.getResources().getString(R.string.WAIT_TIMES_LIVE);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) string).append((CharSequence) this.a.a.getResources().getString(R.string.WAIT_TIMES_SEPARATOR)).append((CharSequence) str);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(ibm.T().b(this.a.a)), 0, string.length(), 33);
                return spannableStringBuilder;
            }
        }
        return str;
    }

    @Override // defpackage.zbm
    public Boolean c() {
        if (h()) {
            return true;
        }
        dnpq dnpqVar = this.c.j;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return Boolean.valueOf(!dnpqVar.c.isEmpty());
    }

    @Override // defpackage.zbm
    public CharSequence d() {
        return this.a.c();
    }

    @Override // defpackage.zbm
    @dzsi
    public CharSequence e() {
        dsrj<dpce> dsrjVar = this.c.o;
        if (dsrjVar.isEmpty()) {
            return null;
        }
        return alcf.s(dsrjVar);
    }

    @Override // defpackage.zbm
    public cjtd f() {
        cjta b = cjtd.b();
        dozy b2 = dozy.b(this.c.f);
        if (b2 == null) {
            b2 = dozy.UNKNOWN;
        }
        if (b2.equals(dozy.BUSYNESS)) {
            b.d = dtxn.cE;
        } else {
            b.d = dtxn.cF;
        }
        dozz dozzVar = this.c;
        if ((dozzVar.a & 2) != 0) {
            b.g(dozzVar.d);
        }
        return b.a();
    }

    @Override // defpackage.zbm
    public cqkl g() {
        if (!c().booleanValue()) {
            return cqkl.a;
        }
        if (h()) {
            zhh zhhVar = this.a;
            zhhVar.c.q(null, zhhVar.e, qda.DESCENDING_SEVERITY, dtxn.cG);
        } else {
            afha afhaVar = this.a.d;
            dnpq dnpqVar = this.c.j;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
            afhaVar.r(dnpqVar.c, 4);
        }
        return cqkl.a;
    }
}
