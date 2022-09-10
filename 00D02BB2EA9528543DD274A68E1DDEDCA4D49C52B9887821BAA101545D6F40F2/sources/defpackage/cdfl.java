package defpackage;

import android.app.Application;
import android.util.DisplayMetrics;
import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cdfl  reason: default package */
/* loaded from: classes4.dex */
class cdfl implements cdfj {
    private final cdfk a;
    private final cdbf b;
    @dzsi
    private final cdbb c;
    private final dwfl d;
    private final int e;
    private final int f;
    private final jic g;
    private final Application h;
    private final bbut i;
    private final String j;
    private final ckqc k;

    public cdfl(cdfk cdfkVar, cdbf cdbfVar, @dzsi cdbb cdbbVar, dwfl dwflVar, int i, int i2, Application application, cqhn cqhnVar, bbut bbutVar) {
        this.a = cdfkVar;
        this.b = cdbfVar;
        this.c = cdbbVar;
        this.d = dwflVar;
        this.e = i;
        this.f = i2;
        this.h = application;
        this.i = bbutVar;
        this.j = dwflVar.d;
        if (cdbfVar.b.get(i).d()) {
            this.k = ckqc.FULLY_QUALIFIED;
        } else {
            this.k = ckqc.FIFE;
        }
        this.g = new jic(dwflVar.h, this.k, R.drawable.generic_image_placeholder);
    }

    @Override // defpackage.cdfj
    public jic a() {
        return this.g;
    }

    @Override // defpackage.cdfj
    public dwfl b() {
        return this.d;
    }

    @Override // defpackage.cdfj
    public Boolean c() {
        return this.b.f(this.j);
    }

    @Override // defpackage.cdfj
    public cqkl d() {
        cdbf cdbfVar = this.b;
        String str = this.j;
        cdbfVar.g(str, !cdbfVar.f(str).booleanValue());
        cqkx.p(this);
        this.a.C(this.j);
        return cqkl.a;
    }

    @Override // defpackage.cdfj
    public cjtd e() {
        cjta b = cjtd.b();
        dwfl dwflVar = this.d;
        b.b = dwflVar.b;
        b.g(dwflVar.c);
        b.d = dtxy.pb;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = c().booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        return b.a();
    }

    @Override // defpackage.cdfj
    public cjtd f() {
        cjta b = cjtd.b();
        dwfl dwflVar = this.d;
        b.b = dwflVar.b;
        b.g(dwflVar.c);
        b.d = dtxy.oP;
        return b.a();
    }

    @Override // defpackage.cdfj
    public cqkl g() {
        DisplayMetrics displayMetrics = this.h.getResources().getDisplayMetrics();
        int max = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
        dccx dccxVar = new dccx();
        List<dwfl> e = this.b.e(this.e);
        int i = 0;
        for (int i2 = 0; i2 < e.size(); i2++) {
            dwfl dwflVar = e.get(i2);
            String a = this.k.a(dwflVar.h, max, max, null);
            String h = this.b.h(dwflVar.d);
            dwfi bZ = dwfl.w.bZ();
            String str = dwflVar.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwfl dwflVar2 = (dwfl) bZ.b;
            str.getClass();
            int i3 = dwflVar2.a | 4;
            dwflVar2.a = i3;
            dwflVar2.d = str;
            a.getClass();
            dwflVar2.a = i3 | 128;
            dwflVar2.h = a;
            dwfl dwflVar3 = (dwfl) bZ.b;
            dwflVar3.i = 2;
            int i4 = dwflVar3.a | 256;
            dwflVar3.a = i4;
            h.getClass();
            dwflVar3.a = i4 | 32;
            dwflVar3.g = h;
            dwfh dwfhVar = dwflVar.k;
            if (dwfhVar == null) {
                dwfhVar = dwfh.d;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwfl dwflVar4 = (dwfl) bZ.b;
            dwfhVar.getClass();
            dwflVar4.k = dwfhVar;
            dwflVar4.a |= 1024;
            dccxVar.g(bZ.bK());
            if (true == dwflVar.d.equals(this.d.d)) {
                i = i2;
            }
        }
        bbut bbutVar = this.i;
        ckni ckniVar = new ckni(dccxVar.f(), null, null, dcep.K(this.b.c));
        bbtv v = bbty.v();
        v.c(dbsg.i(bbtw.DONT_SEND_YET));
        v.d(false);
        v.e(false);
        v.m(true);
        bbutVar.o(ckniVar, i, v.a(), this.c);
        return cqkl.a;
    }

    @Override // defpackage.cdfj
    public CharSequence h() {
        return this.h.getString(true != this.b.f(this.j).booleanValue() ? R.string.TODO_PHOTO_ACCESSIBILITY_SELECT_PHOTO_WITH_PLACE : R.string.TODO_PHOTO_ACCESSIBILITY_UNSELECT_PHOTO_WITH_PLACE, new Object[]{Integer.valueOf(this.f + 1), this.b.d(this.e).n()});
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, Integer.valueOf(this.e)});
    }

    @Override // defpackage.cdfj
    public CharSequence i() {
        return this.h.getString(R.string.TODO_PHOTO_ACCESSIBILITY_EXPAND_PHOTO_WITH_PLACE, new Object[]{Integer.valueOf(this.f + 1), this.b.d(this.e).n()});
    }
}
