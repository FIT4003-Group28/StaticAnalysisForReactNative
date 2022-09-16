package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.android.libraries.youtube.ads.ui.EditTextWithHelpIcon;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mvf  reason: default package */
/* loaded from: classes3.dex */
public final class mvf implements muj {
    public final Context a;
    public final EditTextWithHelpIcon b;
    public final aafo c;
    public final acti d;
    public final arbc e;
    public final arbe f;
    public final boolean g;
    public boolean h = false;
    public boolean i = false;
    private final View j;
    private final TextInputLayout k;
    private final TextWatcher l;
    private final Drawable m;
    private final boolean n;
    private arag o;

    public mvf(Context context, aafo aafoVar, acti actiVar, ViewGroup viewGroup, arbc arbcVar, arbe arbeVar, aadd aaddVar) {
        this.c = aafoVar;
        this.d = actiVar;
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.formfill_text_input, viewGroup, false);
        this.j = inflate;
        this.b = (EditTextWithHelpIcon) inflate.findViewById(R.id.edit_text);
        this.k = (TextInputLayout) inflate.findViewById(R.id.text_input_layout);
        this.l = new mve(this);
        this.e = arbcVar;
        this.f = arbeVar;
        this.m = context.getResources().getDrawable(2131232537);
        this.n = xrz.c(aaddVar);
        this.g = xrz.i(aaddVar);
    }

    @Override // defpackage.muj
    public final View a() {
        return this.j;
    }

    @Override // defpackage.muj
    public final asip b(asip asipVar) {
        aopa mo52toBuilder = asipVar.mo52toBuilder();
        if (h()) {
            int d = arey.d(this.f.c);
            if (d == 0 || d != 2) {
                int d2 = arey.d(this.f.c);
                if (d2 != 0 && d2 == 3) {
                    mo52toBuilder.copyOnWrite();
                    asip.b((asip) mo52toBuilder.instance);
                }
            } else {
                mo52toBuilder.copyOnWrite();
                asip.a((asip) mo52toBuilder.instance);
            }
        }
        if (this.f.e.length() > 0) {
            int d3 = arey.d(this.f.c);
            if (d3 == 0 || d3 != 2) {
                int d4 = arey.d(this.f.c);
                if (d4 != 0 && d4 == 3) {
                    mo52toBuilder.copyOnWrite();
                    asip.e((asip) mo52toBuilder.instance);
                }
            } else {
                mo52toBuilder.copyOnWrite();
                asip.d((asip) mo52toBuilder.instance);
            }
        }
        return (asip) mo52toBuilder.mo39build();
    }

    @Override // defpackage.muj
    public final asjg c(asjg asjgVar) {
        aopa mo52toBuilder = asjgVar.mo52toBuilder();
        if (h()) {
            int d = arey.d(this.f.c);
            if (d == 0 || d != 2) {
                int d2 = arey.d(this.f.c);
                if (d2 != 0 && d2 == 3) {
                    mo52toBuilder.copyOnWrite();
                    asjg.b((asjg) mo52toBuilder.instance);
                }
            } else {
                mo52toBuilder.copyOnWrite();
                asjg.a((asjg) mo52toBuilder.instance);
            }
        }
        if (this.f.e.length() > 0) {
            int d3 = arey.d(this.f.c);
            if (d3 == 0 || d3 != 2) {
                int d4 = arey.d(this.f.c);
                if (d4 != 0 && d4 == 3) {
                    mo52toBuilder.copyOnWrite();
                    asjg.e((asjg) mo52toBuilder.instance);
                }
            } else {
                mo52toBuilder.copyOnWrite();
                asjg.d((asjg) mo52toBuilder.instance);
            }
        }
        return (asjg) mo52toBuilder.mo39build();
    }

    @Override // defpackage.muj
    public final View d() {
        arag aragVar;
        arag aragVar2;
        this.b.setOnFocusChangeListener(new mvd(this));
        this.b.setOnClickListener(new View.OnClickListener() { // from class: mva
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mvf.this.i();
            }
        });
        this.b.setImeOptions(5);
        this.b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: mvb
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                mvf mvfVar = mvf.this;
                ((InputMethodManager) mvfVar.a.getSystemService("input_method")).hideSoftInputFromWindow(textView.getRootView().getWindowToken(), 2);
                mvfVar.b.clearFocus();
                return true;
            }
        });
        TextInputLayout textInputLayout = this.k;
        arbe arbeVar = this.f;
        if ((arbeVar.b & 2) != 0) {
            aragVar = arbeVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textInputLayout.B(ajgl.b(aragVar));
        TextInputLayout textInputLayout2 = this.k;
        arbe arbeVar2 = this.f;
        if ((arbeVar2.b & 16) != 0) {
            aragVar2 = arbeVar2.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textInputLayout2.z(ajgl.b(aragVar2));
        arbe arbeVar3 = this.f;
        if ((arbeVar3.b & 128) != 0) {
            this.i = true;
            this.b.setText(arbeVar3.j);
        } else {
            this.b.setText(arbeVar3.e);
        }
        this.b.addTextChangedListener(this.l);
        int d = arey.d(this.f.c);
        if (d == 0) {
            d = 1;
        }
        int i = d - 1;
        if (i == 1) {
            this.b.setInputType(33);
        } else if (i != 2) {
            return null;
        } else {
            this.b.setInputType(1);
        }
        if ((this.f.b & 32) != 0) {
            this.b.b(this.m, new xjh() { // from class: mvc
                @Override // defpackage.xjh
                public final void a() {
                    mvf mvfVar = mvf.this;
                    aafo aafoVar = mvfVar.c;
                    apzg apzgVar = mvfVar.f.h;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, actk.f(mvfVar.f));
                }
            });
        }
        this.d.u(new acte(this.f.k), null);
        return this.j;
    }

    @Override // defpackage.muj
    public final String f() {
        return this.i ? this.f.e : this.b.mo589getText().toString();
    }

    @Override // defpackage.muj
    public final void g(boolean z) {
        if (!z) {
            if (this.n) {
                this.m.setTint(zhn.d(this.a, R.attr.ytIcon1));
            }
            this.k.w(false);
            this.k.setBackgroundColor(0);
            return;
        }
        if (this.n) {
            this.k.y(ColorStateList.valueOf(zhn.d(this.a, R.attr.ytErrorIndicator)));
            this.m.setTint(zhn.d(this.a, R.attr.ytErrorIndicator));
        }
        arag aragVar = this.o;
        if (aragVar == null && (aragVar = this.f.f) == null) {
            aragVar = arag.a;
        }
        this.k.v(ajgl.b(aragVar));
        this.k.setBackgroundColor(zhn.d(this.a, true != this.n ? R.attr.ytGeneralBackgroundB : R.attr.ytBadgeChipBackground));
    }

    @Override // defpackage.muj
    public final boolean h() {
        return !this.f.e.contentEquals(f());
    }

    public final void i() {
        this.d.H(3, new acte(this.f.k), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (f().length() <= 0) goto L14;
     */
    @Override // defpackage.muj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mui e(boolean r5) {
        /*
            r4 = this;
            arbe r0 = r4.f
            int r0 = r0.b
            r0 = r0 & 64
            if (r0 == 0) goto L27
            java.lang.String r5 = r4.f()
            arbe r0 = r4.f
            avvz r0 = r0.i
            if (r0 != 0) goto L14
            avvz r0 = defpackage.avvz.a
        L14:
            mvi r5 = defpackage.mvj.a(r5, r0)
            arag r0 = r5.b
            r4.o = r0
            boolean r0 = r5.a
            apzg r1 = r5.c
            asir r5 = r5.d
            mui r5 = defpackage.mui.a(r0, r1, r5)
            return r5
        L27:
            r0 = 0
            r4.o = r0
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L3a
            java.lang.String r5 = r4.f()
            int r5 = r5.length()
            if (r5 != 0) goto L3a
        L38:
            r1 = 1
            goto L66
        L3a:
            arbe r5 = r4.f
            int r5 = r5.c
            int r5 = defpackage.arey.d(r5)
            if (r5 != 0) goto L45
            r5 = 1
        L45:
            int r5 = r5 + (-1)
            if (r5 == r2) goto L58
            r3 = 2
            if (r5 == r3) goto L4d
            goto L66
        L4d:
            java.lang.String r5 = r4.f()
            int r5 = r5.length()
            if (r5 <= 0) goto L66
            goto L38
        L58:
            java.util.regex.Pattern r5 = android.util.Patterns.EMAIL_ADDRESS
            java.lang.String r1 = r4.f()
            java.util.regex.Matcher r5 = r5.matcher(r1)
            boolean r1 = r5.matches()
        L66:
            mui r5 = defpackage.mui.a(r1, r0, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvf.e(boolean):mui");
    }
}
