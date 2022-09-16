package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
/* compiled from: PG */
/* renamed from: abpw  reason: default package */
/* loaded from: classes.dex */
public final class abpw extends abpi implements abpt {
    public Editable A;
    private final View B;
    private final EditText C;
    private final boolean D;
    public final abpu y;
    public assk z;

    public abpw(Context context, ajmy ajmyVar, ajxz ajxzVar, aafo aafoVar, abks abksVar, abkj abkjVar, zhf zhfVar, ajvj ajvjVar, abjx abjxVar, abpu abpuVar, ajsk ajskVar, akge akgeVar, abka abkaVar, abse abseVar, abhy abhyVar, View view, final boolean z, acti actiVar, byte[] bArr) {
        super(context, ajmyVar, ajxzVar, aafoVar, abksVar, abkjVar, ajvjVar, abjxVar, zhfVar, ajskVar, akgeVar, abkaVar, abhyVar, view, !z, false, actiVar);
        this.y = abpuVar;
        this.D = z;
        if (!abpuVar.c.contains(this)) {
            abpuVar.c.add(this);
        }
        EditText r = r();
        r.getClass();
        this.C = r;
        View l = l();
        l.getClass();
        this.B = l;
        r.setOnClickListener(new View.OnClickListener() { // from class: abpv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                abpw abpwVar = abpw.this;
                boolean z2 = z;
                abiz abizVar = abpwVar.v;
                if (abizVar != null) {
                    abizVar.a();
                }
                abpwVar.y.k(abpwVar.z, abpwVar.A, false, z2);
                abpwVar.l().setVisibility(8);
            }
        });
        r.setFocusable(false);
        l.setVisibility(0);
    }

    @Override // defpackage.abop
    public final void C() {
        super.C();
        this.A = null;
    }

    @Override // defpackage.abop
    protected final void I() {
        abpu abpuVar = this.y;
        if (abpuVar != null) {
            abpuVar.k(this.z, this.A, true, this.D);
            l().setVisibility(8);
        }
    }

    @Override // defpackage.abop
    protected final boolean J() {
        return this.D;
    }

    @Override // defpackage.abpt
    public final void a(Editable editable) {
        if (this.y != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable);
            this.B.setVisibility(0);
            this.A = spannableStringBuilder;
            if (this.D) {
                this.C.setHint(i());
            } else {
                this.C.setText(editable);
            }
        }
    }

    @Override // defpackage.abop, defpackage.abko
    public final void c() {
        super.c();
        this.A = null;
    }

    @Override // defpackage.abop, defpackage.abko
    public final void d(assk asskVar) {
        super.d(asskVar);
        this.z = asskVar;
        this.y.j();
    }

    @Override // defpackage.abop, defpackage.abko
    public final void f() {
        super.f();
        abpu abpuVar = this.y;
        abpuVar.b.setText((CharSequence) null);
        abpuVar.i = false;
        abpuVar.j();
        this.A = null;
    }

    @Override // defpackage.abop
    protected final Spanned i() {
        return !TextUtils.isEmpty(this.A) ? this.A : this.o;
    }

    @Override // defpackage.abop
    protected final void y(asss asssVar) {
        if (this.D) {
            D(false);
        } else {
            super.y(asssVar);
        }
    }

    @Override // defpackage.abop
    protected final void z(atfa atfaVar) {
        if (this.D) {
            D(false);
        } else {
            super.z(atfaVar);
        }
    }
}
