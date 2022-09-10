package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: ksb  reason: default package */
/* loaded from: classes7.dex */
public class ksb implements krv {
    public final kqp a;
    public final krw b;
    private final noo c;
    private boolean d;
    private boolean e;
    @dzsi
    private String f;

    public ksb(krw krwVar, noo nooVar, kqp kqpVar) {
        this.b = krwVar;
        dbsk.s(nooVar);
        this.c = nooVar;
        this.a = kqpVar;
    }

    @Override // defpackage.krv
    public cqkl a() {
        this.c.b();
        return cqkl.a;
    }

    @Override // defpackage.krv
    public Boolean b() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.krv
    public cqgl c() {
        return new cqgl(this) { // from class: kry
            private final ksb a;

            {
                this.a = this;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                ksb ksbVar = this.a;
                ksbVar.k(charSequence.toString());
                krw krwVar = ksbVar.b;
                if (charSequence.toString() != null) {
                    krb krbVar = (krb) krwVar;
                    nct nctVar = krbVar.a.f;
                    String charSequence2 = charSequence.toString();
                    krc krcVar = krbVar.a;
                    nctVar.c(charSequence2, krcVar.r, krcVar.k);
                }
            }
        };
    }

    @Override // defpackage.krv
    public TextView.OnEditorActionListener d() {
        final krb krbVar = (krb) this.b;
        return new TextView.OnEditorActionListener(krbVar) { // from class: kra
            private final krb a;

            {
                this.a = krbVar;
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                krb krbVar2 = this.a;
                if (i == 3) {
                    krc krcVar = krbVar2.a;
                    krcVar.m(krcVar.q.l(), dtyi.L, deaf.INPUT_TEXT);
                    return true;
                }
                return false;
            }
        };
    }

    @Override // defpackage.krv
    public View.OnClickListener e() {
        return new View.OnClickListener(this) { // from class: krz
            private final ksb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ksb ksbVar = this.a;
                ksbVar.b.b(ksbVar.a, view);
            }
        };
    }

    @Override // defpackage.krv
    public View.OnClickListener f() {
        return new View.OnClickListener(this) { // from class: ksa
            private final ksb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ksb ksbVar = this.a;
                ksbVar.b.a(ksbVar.a, view);
            }
        };
    }

    public void g() {
        this.c.b();
    }

    public void h(boolean z) {
        this.d = z;
    }

    public void i(boolean z) {
        this.e = z;
    }

    public Boolean j() {
        return Boolean.valueOf(this.e);
    }

    public void k(@dzsi String str) {
        this.f = str;
    }

    @dzsi
    public String l() {
        return this.f;
    }
}
