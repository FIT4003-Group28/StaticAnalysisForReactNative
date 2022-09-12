package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ivn  reason: default package */
/* loaded from: classes6.dex */
public abstract class ivn implements jbh {
    private String a;
    private final int b;
    @dzsi
    private String c;
    private String d;
    private final boolean e;
    private final boolean f;
    private boolean g;
    private final cjtd h;
    private cjtd i;

    public ivn(String str, int i, @dzsi String str2, String str3, cjtd cjtdVar, cjtd cjtdVar2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.h = cjtdVar;
        this.i = cjtdVar2;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhm jhmVar = new jhm();
        jhmVar.g = new jhn(this) { // from class: ivl
            private final ivn a;

            {
                this.a = this;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                this.a.b(cjqmVar);
            }
        };
        jhmVar.h = 2;
        String str = this.d;
        jhmVar.b = str;
        jhmVar.a = str;
        jhmVar.d = ibm.p();
        jhmVar.n = this.g;
        jhmVar.f = this.i;
        if (this.e) {
            jhmVar.c = iut.a(cqrt.f(2131231742));
        }
        jhz a = jhz.a();
        a.a = this.a;
        a.C = this.b;
        a.b = this.c;
        a.D = 1;
        a.f(new View.OnClickListener(this) { // from class: ivm
            private final ivn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a();
            }
        });
        a.o = this.h;
        a.c(jhmVar.c());
        if (this.f) {
            a.i = cqrt.g(2131231591, ibm.p());
            a.j = cqrt.l(R.string.CLOSE_BUTTON);
        }
        return a.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a();

    @Override // defpackage.jbh
    public abstract void b(cjqm cjqmVar);

    public void d(boolean z) {
        this.g = z;
        cqkx.p(this);
    }

    public void e(String str) {
        this.a = str;
        cqkx.p(this);
    }

    public void f(String str) {
        this.c = str;
        cqkx.p(this);
    }

    public void g(cjtd cjtdVar) {
        this.i = cjtdVar;
        cqkx.p(this);
    }

    public boolean h() {
        return this.g;
    }

    public void i(String str) {
        this.d = str;
    }
}
