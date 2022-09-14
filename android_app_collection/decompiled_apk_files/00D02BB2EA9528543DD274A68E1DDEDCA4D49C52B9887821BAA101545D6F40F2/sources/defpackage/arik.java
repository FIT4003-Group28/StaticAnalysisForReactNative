package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: arik  reason: default package */
/* loaded from: classes2.dex */
public class arik implements jav, arhg {
    private final Resources a;
    private final arhz b;
    private final dxio<arfm> c;
    private dvcj d;
    private dcdc<aric> e = dcdc.e();
    private final cqtd f = cqrt.f(17170445);

    public arik(Activity activity, arhz arhzVar, dxio<arfm> dxioVar) {
        this.b = arhzVar;
        this.c = dxioVar;
        this.a = activity.getResources();
    }

    @Override // defpackage.jav
    @dzsi
    public String A() {
        return c();
    }

    @Override // defpackage.jav
    @dzsi
    public String B() {
        return null;
    }

    @Override // defpackage.jav
    @dzsi
    public String C() {
        return null;
    }

    @Override // defpackage.arhg
    public void D(dvcj dvcjVar) {
        this.d = dvcjVar;
        this.e = this.b.a(dvcjVar.c);
        cqkx.p(this);
    }

    @Override // defpackage.arhg
    public void E(String str) {
    }

    public Integer F() {
        return Integer.valueOf(!this.e.isEmpty() ? 1 : 0);
    }

    @Override // defpackage.jav
    public cjtd a() {
        return null;
    }

    @Override // defpackage.jav
    public jic b() {
        return this.e.get(0).a();
    }

    @Override // defpackage.jav
    @dzsi
    public String c() {
        int size = this.e.size();
        dcdc<aric> dcdcVar = this.e;
        if (!dcdcVar.isEmpty()) {
            int size2 = dcdcVar.size();
            int i = 0;
            while (i < size2) {
                int i2 = i + 1;
                if (!dcdcVar.get(i).d().booleanValue()) {
                    i = i2;
                }
            }
            return this.a.getQuantityString(R.plurals.PHOTOS, size, Integer.valueOf(size));
        }
        dcdc<aric> dcdcVar2 = this.e;
        if (!dcdcVar2.isEmpty()) {
            int size3 = dcdcVar2.size();
            int i3 = 0;
            while (i3 < size3) {
                int i4 = i3 + 1;
                if (dcdcVar2.get(i3).d().booleanValue()) {
                    i3 = i4;
                }
            }
            return this.a.getQuantityString(R.plurals.MY_MAPS_VIDEO_COUNT, size, Integer.valueOf(size));
        }
        return this.a.getQuantityString(R.plurals.MY_MAPS_PHOTO_VIDEO_COUNT, size, Integer.valueOf(size));
    }

    @Override // defpackage.jav
    @dzsi
    public cjtd d() {
        return cjtd.a(dtxv.eC);
    }

    @Override // defpackage.jav
    @dzsi
    public jic e() {
        return null;
    }

    @Override // defpackage.jav
    @dzsi
    public String f() {
        return null;
    }

    @Override // defpackage.jav
    @dzsi
    public cjtd g() {
        return null;
    }

    @Override // defpackage.jav
    @dzsi
    public jic h() {
        return null;
    }

    @Override // defpackage.jav
    @dzsi
    public String i() {
        return null;
    }

    @Override // defpackage.jav
    @dzsi
    public cjtd j() {
        return null;
    }

    @Override // defpackage.jav
    public Boolean k() {
        boolean z = true;
        if (F().intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jav
    public Boolean l() {
        return false;
    }

    @Override // defpackage.jav
    public Boolean m() {
        return false;
    }

    @Override // defpackage.jav
    public Boolean n() {
        return false;
    }

    @Override // defpackage.jav
    public Boolean o() {
        return true;
    }

    @Override // defpackage.jav
    public cqkl p() {
        this.c.a().B(this.d);
        return cqkl.a;
    }

    @Override // defpackage.jav
    public Boolean q() {
        return false;
    }

    @Override // defpackage.jav
    public cqkl r() {
        return cqkl.a;
    }

    @Override // defpackage.jav
    public Boolean s() {
        return false;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
    }

    @Override // defpackage.bega
    public void u() {
    }

    @Override // defpackage.jav
    public cqkl v() {
        return cqkl.a;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return k();
    }

    @Override // defpackage.jav
    public cqtd x() {
        return this.f;
    }

    @Override // defpackage.jav
    public cqtd y() {
        return null;
    }

    @Override // defpackage.jav
    public cqtd z() {
        return null;
    }
}
