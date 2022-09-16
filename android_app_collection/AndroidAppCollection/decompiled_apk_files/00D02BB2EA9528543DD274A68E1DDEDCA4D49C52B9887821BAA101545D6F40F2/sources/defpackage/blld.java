package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: blld  reason: default package */
/* loaded from: classes3.dex */
public class blld implements blku {
    private static final jat b = new iwd(0, Float.valueOf(0.0f), cqrt.f(2131231747));
    @dzsi
    bwrs<ilo> a;
    private final Activity c;
    private final dxio<bkpi> e;
    private final btvo f;
    private final blkj g;
    private int j;
    private bnil m;
    private final bnil p;
    private final List<jat> d = dchl.a();
    private float h = Float.NaN;
    private String i = "";
    private boolean k = false;
    private boolean l = false;
    @dzsi
    private String n = null;
    @dzsi
    private cjtd o = null;

    public blld(Activity activity, btvo btvoVar, dxio<bkpi> dxioVar, blkj blkjVar) {
        this.c = activity;
        this.f = btvoVar;
        this.e = dxioVar;
        this.g = blkjVar;
        bnjw bnjwVar = new bnjw(activity.getText(R.string.REVIEW_SUMMARY_TITLE), null, cjtd.a(dtxy.lU));
        this.p = bnjwVar;
        this.m = bnjwVar;
    }

    @Override // defpackage.blku
    public jat a(Integer num) {
        return this.k ? this.d.get(num.intValue()) : b;
    }

    @Override // defpackage.blku
    public Boolean b() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.blku
    public Float c() {
        return Float.valueOf(this.h);
    }

    @Override // defpackage.blku
    public String d() {
        return this.i;
    }

    @Override // defpackage.blku
    @dzsi
    public String e() {
        return this.n;
    }

    @Override // defpackage.blku
    public Boolean f() {
        boolean z = false;
        if (this.l && this.a != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.blku
    public cqkl g() {
        bwrs<ilo> bwrsVar = this.a;
        if (f().booleanValue() && bwrsVar != null) {
            this.e.a().b(bwrsVar, dbpy.a, dbpy.a, dbpy.a, false, dbpy.a);
        }
        return cqkl.a;
    }

    @Override // defpackage.blku
    @dzsi
    public cjtd h() {
        return this.o;
    }

    @Override // defpackage.blku
    public bnil i() {
        return this.m;
    }

    @Override // defpackage.blku
    @dzsi
    public acpa j() {
        bnil bnilVar = this.m;
        if (bnilVar == null) {
            return null;
        }
        return bnilVar.a();
    }

    public void k() {
        this.a = null;
        this.h = Float.NaN;
        this.i = "";
        this.j = 0;
        this.k = false;
        this.l = false;
        this.n = null;
        this.o = null;
        this.m = this.p;
    }

    public void l(Context context, bwrs<ilo> bwrsVar) {
        this.a = bwrsVar;
        this.d.clear();
        ilo c = bwrsVar.c();
        if (c == null) {
            k();
            return;
        }
        int X = c.X();
        this.j = X;
        int i = 0;
        this.l = X > 0;
        if (!this.f.getEnableFeatureParameters().S || (c.h().c & 536870912) == 0) {
            Resources resources = context.getResources();
            int i2 = this.j;
            this.i = resources.getQuantityString(R.plurals.REVIEW_COUNT_SHORT, i2, Integer.valueOf(i2));
            Resources resources2 = context.getResources();
            int i3 = this.j;
            this.n = resources2.getQuantityString(R.plurals.REVIEW_COUNT_LONG, i3, Integer.valueOf(i3));
        } else {
            this.i = "";
            this.n = null;
        }
        int[] iArr = c.A;
        if (iArr == null) {
            doco bo = c.bo();
            if ((bo.a & 4) != 0) {
                dgjo dgjoVar = bo.e;
                if (dgjoVar == null) {
                    dgjoVar = dgjo.f;
                }
                c.A = new int[]{dgjoVar.a, dgjoVar.b, dgjoVar.c, dgjoVar.d, dgjoVar.e};
                iArr = c.A;
            } else {
                c.A = new int[0];
                iArr = c.A;
            }
        }
        if (iArr.length != 5 || !c.ae() || c.X() <= 0) {
            this.k = false;
            return;
        }
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < 5; i6++) {
            i5 = Math.max(iArr[i6], i5);
            i4 += iArr[i6];
        }
        if (i4 <= 0) {
            this.k = false;
            return;
        }
        while (i < 5) {
            int i7 = iArr[i];
            i++;
            this.d.add(new iwd(Integer.valueOf(i), Float.valueOf(i7 / i5), cqrt.f(2131231747)));
        }
        this.k = true;
        this.h = c.af();
        cjta c2 = cjtd.c(c.bZ());
        c2.d = dtxy.eY;
        this.o = c2.a();
        cjtd cjtdVar = cjtd.b;
        if (c.f) {
            cjta c3 = cjtd.c(c.bY());
            c3.d = dtxy.lU;
            cjtdVar = c3.a();
        }
        this.m = new bnjw(this.c.getText(R.string.REVIEW_SUMMARY_TITLE), blmj.a(this.c, this.g.c(c)), cjtdVar);
    }
}
