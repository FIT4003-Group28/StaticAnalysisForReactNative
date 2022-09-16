package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bopt  reason: default package */
/* loaded from: classes3.dex */
public class bopt implements boqs {
    private final bokk a;
    public final Context b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final Integer g;
    private final int h;
    private final cjtd i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    @dzsi
    private final bomt m;
    private final cqjg n;
    private final boolean o;
    private boolean p = false;
    private final Boolean q;
    private final Integer r;

    public bopt(Context context, bokk bokkVar, String str, String str2, String str3, String str4, Integer num, int i, ddho ddhoVar, @dzsi String str5, boolean z, boolean z2, boolean z3, @dzsi bomt bomtVar, cqjg cqjgVar, boolean z4, @dzsi String str6, boolean z5, int i2) {
        this.b = context;
        this.a = bokkVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = num;
        this.h = i;
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.g(str5);
        this.i = b.a();
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = bomtVar;
        this.n = cqjgVar;
        this.o = z4;
        this.q = Boolean.valueOf(z5);
        this.r = Integer.valueOf(i2);
    }

    @Override // defpackage.boqs
    public Boolean A() {
        return Boolean.valueOf(!i().isEmpty());
    }

    @Override // defpackage.boqs
    public Boolean B() {
        return Boolean.valueOf(this.o);
    }

    public Context C() {
        return this.b;
    }

    @Override // defpackage.boqs
    public String D() {
        return this.b.getString(R.string.CLEAR_BUTTON_WITH_VALUE_CONTENT_DESCRIPTION, this.f, i());
    }

    @Override // defpackage.boqs
    public Boolean E() {
        return this.q;
    }

    @Override // defpackage.boqs
    public Integer F() {
        return this.r;
    }

    public Boolean RG() {
        return Boolean.valueOf(!this.a.e.isEmpty());
    }

    @Override // defpackage.boqs
    public Boolean e() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.boqm
    public cqtd f() {
        return cqrt.f(this.h);
    }

    @Override // defpackage.boqm
    public String g() {
        return this.c;
    }

    @Override // defpackage.boqm
    public String h() {
        return RG().booleanValue() ? this.d : this.e;
    }

    @Override // defpackage.boqm
    public String i() {
        return this.a.h.booleanValue() ? this.a.f : this.a.e;
    }

    @Override // defpackage.boqm
    public Boolean j() {
        return this.a.d;
    }

    @Override // defpackage.boqm
    public String k() {
        return this.a.e;
    }

    @Override // defpackage.boqm
    public Boolean l() {
        return Boolean.valueOf(!this.a.c().isEmpty());
    }

    @Override // defpackage.boqm
    public String m() {
        return this.a.f;
    }

    @Override // defpackage.boqm
    public Boolean n() {
        return this.a.h;
    }

    @Override // defpackage.boqm
    public cjtd o() {
        return this.i;
    }

    @Override // defpackage.boqm
    public Boolean p() {
        return this.a.i;
    }

    @Override // defpackage.boqm
    @dzsi
    public String q() {
        return this.a.j;
    }

    @Override // defpackage.boqs
    public Integer r() {
        return this.g;
    }

    @Override // defpackage.boqs
    public cqgl s() {
        return new cqgl(this) { // from class: bopr
            private final bopt a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                this.a.t(charSequence, false);
            }
        };
    }

    public final void t(CharSequence charSequence, boolean z) {
        if (z || (!this.a.f.contentEquals(charSequence) && !i().contentEquals(charSequence))) {
            this.a.f = charSequence.toString();
            boolean z2 = !this.a.e.isEmpty() || !this.a.f.isEmpty();
            if (this.l) {
                bokk bokkVar = this.a;
                z2 = !bokkVar.f.contentEquals(bokkVar.e);
            }
            this.a.h = Boolean.valueOf(z2);
            if (!this.a.f.isEmpty() || !this.k) {
                if (p().booleanValue()) {
                    x(false);
                }
            } else {
                x(true);
                y(this.b.getString(R.string.FORM_FIELD_REQUIRED));
            }
            this.p = true;
            cqkx.p(this);
        }
    }

    @Override // defpackage.boqs
    public View.OnFocusChangeListener u() {
        return new View.OnFocusChangeListener(this) { // from class: bops
            private final bopt a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.a.v(z);
            }
        };
    }

    public void v(boolean z) {
        if (!z) {
            bomt bomtVar = this.m;
            if (bomtVar == null) {
                return;
            }
            bomtVar.a();
            return;
        }
        bomt bomtVar2 = this.m;
        if (bomtVar2 != null) {
            bomtVar2.b = this.n;
        }
        if (this.p || !this.a.c().isEmpty()) {
            return;
        }
        bokk bokkVar = this.a;
        bokkVar.f = bokkVar.e;
        cqkx.p(this);
    }

    @Override // defpackage.boqs
    public Boolean w() {
        bokk bokkVar = this.a;
        return Boolean.valueOf(!bokkVar.e.contentEquals(bokkVar.c()));
    }

    public void x(Boolean bool) {
        this.a.i = bool;
    }

    public void y(String str) {
        this.a.j = str;
    }

    @Override // defpackage.boqs
    public cqkl z() {
        t("", true);
        bomt bomtVar = this.m;
        if (bomtVar != null) {
            bomtVar.b(this.n);
        }
        return cqkl.a;
    }
}
