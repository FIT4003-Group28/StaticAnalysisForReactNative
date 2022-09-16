package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bsrc  reason: default package */
/* loaded from: classes4.dex */
public class bsrc implements bssp {
    private final bsqk a;
    private final dxio<brba> b;

    public bsrc(@dzsi Runnable runnable, bsql bsqlVar, dxio<brba> dxioVar) {
        this.a = bsqlVar.a(null, runnable);
        this.b = dxioVar;
    }

    public void a(@dzsi brln brlnVar, @dzsi brlu brluVar) {
        this.a.a(brlnVar, brluVar);
    }

    public void b() {
        bsqk bsqkVar = this.a;
        bsqkVar.b = null;
        bsqkVar.c = null;
    }

    public Boolean c() {
        return this.a.k();
    }

    @Override // defpackage.bssp
    public Boolean d() {
        return this.a.l();
    }

    @Override // defpackage.bssp
    public Boolean e() {
        return this.a.m();
    }

    @Override // defpackage.bssp
    public Boolean f() {
        return this.a.g();
    }

    @Override // defpackage.bssp
    public Boolean g() {
        return Boolean.valueOf(this.b.a().H());
    }

    @Override // defpackage.bssp
    public Boolean h() {
        return this.a.o();
    }

    @Override // defpackage.bssp
    public View.OnClickListener i() {
        return this.a.f();
    }

    @Override // defpackage.bssp
    public Boolean j() {
        g().booleanValue();
        return false;
    }

    @Override // defpackage.bssp
    public Boolean k() {
        return this.a.n();
    }

    @Override // defpackage.bssp
    public Boolean l() {
        return this.a.e();
    }

    @Override // defpackage.bssp
    public CharSequence m() {
        return this.a.h();
    }

    @Override // defpackage.bssp
    public cqkl n() {
        this.a.i();
        return cqkl.a;
    }

    @Override // defpackage.bssp
    public cjtd o() {
        return this.a.j();
    }

    @Override // defpackage.bssp
    public CharSequence p() {
        return this.a.c();
    }

    @Override // defpackage.bssp
    @dzsi
    public CharSequence q() {
        return this.a.d();
    }

    @Override // defpackage.bssp
    @dzsi
    public CharSequence r() {
        bsqk bsqkVar = this.a;
        if (bsqkVar.m().booleanValue()) {
            return bsqkVar.a.getString(R.string.RESTRICTION_EDIT_TIMELINE);
        }
        if (bsqkVar.l().booleanValue()) {
            return bsqkVar.a.getString(R.string.RESTRICTION_EDIT_FILTERS);
        }
        return null;
    }

    @Override // defpackage.bssp
    public cqkl s() {
        Runnable runnable;
        bsqk bsqkVar = this.a;
        if (bsqkVar.m().booleanValue()) {
            bsqkVar.b();
        } else if (bsqkVar.l().booleanValue() && (runnable = bsqkVar.c) != null) {
            runnable.run();
        }
        return cqkl.a;
    }
}
