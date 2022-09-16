package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: chkf  reason: default package */
/* loaded from: classes4.dex */
public class chkf implements chmm {
    private final Resources a;
    private final int b;
    private final dwmy c;
    @dzsi
    private final String d;
    private final chke e;
    private final jic f;
    private String g;

    public chkf(Resources resources, String str, int i, dwmz dwmzVar, @dzsi String str2, chke chkeVar) {
        this.a = resources;
        this.g = str;
        this.b = i;
        dsqp dsqpVar = (dsqp) dwmzVar.cu(5);
        dsqpVar.bC(dwmzVar);
        this.c = (dwmy) dsqpVar;
        this.d = str2;
        this.e = chkeVar;
        dwfl dwflVar = dwmzVar.b;
        this.f = new jic((dwflVar == null ? dwfl.w : dwflVar).h, ckqc.FIFE, R.drawable.generic_image_placeholder);
    }

    public dwmz a() {
        return this.c.bK();
    }

    public void b(String str) {
        this.g = str;
    }

    public void c(boolean z) {
        dwmy dwmyVar = this.c;
        if (dwmyVar.c) {
            dwmyVar.bF();
            dwmyVar.c = false;
        }
        dwmz dwmzVar = (dwmz) dwmyVar.b;
        dwmz dwmzVar2 = dwmz.d;
        dwmzVar.a |= 4;
        dwmzVar.c = z;
    }

    public void d(dwfl dwflVar) {
        dwmy dwmyVar = this.c;
        if (dwmyVar.c) {
            dwmyVar.bF();
            dwmyVar.c = false;
        }
        dwmz dwmzVar = (dwmz) dwmyVar.b;
        dwmz dwmzVar2 = dwmz.d;
        dwflVar.getClass();
        dwmzVar.b = dwflVar;
        dwmzVar.a |= 2;
    }

    @Override // defpackage.chmm
    public jic e() {
        return this.f;
    }

    @Override // defpackage.chmm
    public Boolean f() {
        return Boolean.valueOf(((dwmz) this.c.b).c);
    }

    @Override // defpackage.chmm
    public cqkl g() {
        c(!f().booleanValue());
        cqkx.p(this);
        this.e.c();
        return cqkl.a;
    }

    @Override // defpackage.chmm
    public cjtd h() {
        cjta b = cjtd.b();
        b.g(this.d);
        b.d = dtyc.B;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = f().booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
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

    @Override // defpackage.chmm
    public cqkl i() {
        this.e.b(this.b);
        return cqkl.a;
    }

    @Override // defpackage.chmm
    public cjtd j() {
        cjta b = cjtd.b();
        b.g(this.d);
        b.d = dtyc.w;
        return b.a();
    }

    @Override // defpackage.chmm
    public String k() {
        return this.a.getString(true != f().booleanValue() ? R.string.TODO_PHOTO_ACCESSIBILITY_SELECT_PHOTO_WITH_PLACE : R.string.TODO_PHOTO_ACCESSIBILITY_UNSELECT_PHOTO_WITH_PLACE, Integer.valueOf(this.b + 1), this.g);
    }

    @Override // defpackage.chmm
    public String l() {
        return this.a.getString(R.string.TODO_PHOTO_ACCESSIBILITY_EXPAND_PHOTO_WITH_PLACE, Integer.valueOf(this.b + 1), this.g);
    }
}
