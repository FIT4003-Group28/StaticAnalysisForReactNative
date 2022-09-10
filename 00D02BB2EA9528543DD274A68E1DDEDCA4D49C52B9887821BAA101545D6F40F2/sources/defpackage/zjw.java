package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zjw  reason: default package */
/* loaded from: classes7.dex */
class zjw implements jam {
    public final cjqq a;
    @dzsi
    public final String b;
    public final boolean c;
    public final boolean d;
    @dzsi
    public cjql e;
    @dzsi
    public cjql f;
    private final Activity g;
    private final CharSequence h;
    private final vmx i;
    private final cjqy j;
    @dzsi
    private final CharSequence k;

    public zjw(Activity activity, vmx vmxVar, cjqq cjqqVar, cjqy cjqyVar, CharSequence charSequence, @dzsi CharSequence charSequence2, boolean z, boolean z2, @dzsi String str) {
        this.g = activity;
        this.a = cjqqVar;
        this.j = cjqyVar;
        this.h = charSequence;
        this.i = vmxVar;
        this.c = z;
        this.k = charSequence2;
        this.d = z2;
        this.b = str;
    }

    @Override // defpackage.jam
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jam
    public CharSequence b() {
        return this.h;
    }

    @Override // defpackage.jam
    public cjtd c() {
        cjta b = cjtd.b();
        b.d = dtxn.bl;
        b.b = this.b;
        return b.a();
    }

    @Override // defpackage.jam
    public Boolean d() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.jam
    public cqfc e() {
        return new cqfc(this) { // from class: zjv
            private final zjw a;

            {
                this.a = this;
            }

            @Override // defpackage.cqfc
            public final void a(View view, boolean z) {
                zjw zjwVar = this.a;
                cjqp f = zjwVar.a.f(view);
                if (zjwVar.c) {
                    cjta b = cjtd.b();
                    b.d = dtxn.bm;
                    b.b = zjwVar.b;
                    zjwVar.e = f.d(b.a());
                }
                if (zjwVar.d) {
                    cjta b2 = cjtd.b();
                    b2.d = dtxn.cD;
                    zjwVar.f = f.d(b2.a());
                }
            }
        };
    }

    @Override // defpackage.jam
    public cqkl f() {
        dnqh dnqhVar;
        cjql cjqlVar = this.e;
        if (cjqlVar != null) {
            cjqy cjqyVar = this.j;
            cjta b = cjtd.b();
            b.d = dtxn.bm;
            b.b = this.b;
            dnqhVar = yys.a(cjqyVar.j(cjqlVar, b.a()));
        } else {
            dnqhVar = null;
        }
        this.i.a(dnqhVar);
        return cqkl.a;
    }

    @Override // defpackage.jam
    public cjtd g() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public Boolean h() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.jam
    public cqkl i() {
        dnqh dnqhVar;
        cjql cjqlVar = this.f;
        if (cjqlVar != null) {
            cjqy cjqyVar = this.j;
            cjta b = cjtd.b();
            b.d = dtxn.cD;
            dnqhVar = yys.a(cjqyVar.j(cjqlVar, b.a()));
        } else {
            dnqhVar = null;
        }
        this.i.f(dnqhVar);
        return cqkl.a;
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence j() {
        if (this.d) {
            return this.g.getString(R.string.TBP_ERROR_GET_OFFLINE_DIRECTIONS);
        }
        return null;
    }

    @Override // defpackage.jam
    public Boolean k() {
        return jak.a();
    }

    @Override // defpackage.jam
    public cjtd l() {
        return cjtd.b;
    }

    @Override // defpackage.jam
    public cqtd m() {
        return null;
    }

    @Override // defpackage.jam
    @dzsi
    public CharSequence n() {
        return this.k;
    }

    @Override // defpackage.jam
    public cqtd o() {
        return null;
    }
}
