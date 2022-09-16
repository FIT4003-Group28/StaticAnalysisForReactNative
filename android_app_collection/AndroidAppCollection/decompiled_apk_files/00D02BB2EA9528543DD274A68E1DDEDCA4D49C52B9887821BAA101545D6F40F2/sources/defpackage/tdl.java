package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: tdl  reason: default package */
/* loaded from: classes7.dex */
public class tdl extends tdz implements tdb {
    private final tak a;
    private final tvz b;
    private final CharSequence c;
    @dzsi
    private final twd d;
    @dzsi
    private final twc e;
    @dzsi
    private final suo f;

    public tdl(Activity activity, qhn qhnVar, cqhn cqhnVar, vtn vtnVar, tao taoVar, suq suqVar, twn twnVar, qho qhoVar, tlv tlvVar, amve amveVar) {
        SpannableStringBuilder append;
        Resources resources;
        dgas bK;
        this.a = taoVar.a(amveVar);
        boolean z = true;
        if (amsr.b(amveVar).equals(amsq.DOCKED_BIKESHARING)) {
            qhy b = qhoVar.b(amveVar);
            dbsk.s(b);
            this.e = null;
            this.d = new two(amveVar);
            this.c = "";
            this.b = twh.b(b.a());
        } else {
            qib a = qhoVar.a(amveVar);
            dbsk.s(a);
            this.e = twnVar.a(a);
            this.d = null;
            this.b = twh.b(a.a());
            qic j = a.j();
            if (j == null) {
                append = null;
            } else {
                append = new SpannableStringBuilder().append((CharSequence) " ").append((CharSequence) "walking icon").append((CharSequence) " ");
                String b2 = j.b();
                Drawable b3 = b2 != null ? vtnVar.b(b2, vtj.TRANSIT_AUTO, null) : null;
                if (b3 != null) {
                    b3.setColorFilter(akm.c(activity, R.color.mod_grey650), PorterDuff.Mode.SRC_IN);
                    append.setSpan(new ImageSpan(b3, 1), 0, append.length(), 256);
                }
                Resources resources2 = activity.getResources();
                dgas a2 = j.a();
                dsqp dsqpVar = (dsqp) a2.cu(5);
                dsqpVar.bC(a2);
                dgar dgarVar = (dgar) dsqpVar;
                if ((a2.a & 4) != 0) {
                    resources = resources2;
                    if (bvtb.a(a2.d) == 0) {
                        if (dgarVar.c) {
                            dgarVar.bF();
                            dgarVar.c = false;
                        }
                        dgas dgasVar = (dgas) dgarVar.b;
                        dgasVar.a |= 4;
                        dgasVar.d = 60;
                    }
                } else {
                    resources = resources2;
                }
                if ((a2.a & 1) == 0 || bvtb.a(a2.b) != 0) {
                    bK = dgarVar.bK();
                } else {
                    dsqp dsqpVar2 = (dsqp) a2.cu(5);
                    dsqpVar2.bC(a2);
                    dgar dgarVar2 = (dgar) dsqpVar2;
                    if (dgarVar2.c) {
                        dgarVar2.bF();
                        dgarVar2.c = false;
                    }
                    dgas dgasVar2 = (dgas) dgarVar2.b;
                    dgasVar2.a |= 1;
                    dgasVar2.b = 60;
                    bK = dgarVar2.bK();
                }
                CharSequence d = bvtb.d(resources, bK, bvsz.ABBREVIATED, new bvsw());
                if (d != null) {
                    append.append(d);
                }
            }
            this.c = stf.c(activity, append, a.c().e(), qhnVar.a(a.c().f(), activity));
        }
        twc twcVar = this.e;
        this.f = tlvVar.d().j().a() ? suqVar.a((twcVar == null || cqjv.v(twcVar.b()).booleanValue()) ? false : z) : null;
    }

    @Override // defpackage.tdb
    public tak a() {
        return this.a;
    }

    @Override // defpackage.tdb
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.tdb
    @dzsi
    public twc c() {
        return this.e;
    }

    @Override // defpackage.tdb
    public tvz d() {
        return this.b;
    }

    @Override // defpackage.tdb
    @dzsi
    public twd e() {
        return this.d;
    }

    @Override // defpackage.tdb
    @dzsi
    public suo f() {
        return this.f;
    }

    @Override // defpackage.tdz, defpackage.tdh
    public Boolean i() {
        return Boolean.valueOf(f() != null);
    }

    @Override // defpackage.tdz, defpackage.tdh
    public Boolean j() {
        return true;
    }
}
