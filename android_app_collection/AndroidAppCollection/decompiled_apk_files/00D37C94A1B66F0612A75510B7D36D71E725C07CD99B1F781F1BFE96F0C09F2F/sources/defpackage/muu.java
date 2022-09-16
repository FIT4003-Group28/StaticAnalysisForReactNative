package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
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
import java.util.Locale;
import java.util.Set;
/* compiled from: PG */
/* renamed from: muu  reason: default package */
/* loaded from: classes3.dex */
public final class muu implements muj {
    private static final vdw m = vdw.b();
    public final Context a;
    public final TextView b;
    public final EditTextWithHelpIcon c;
    public final aafo d;
    public final acti e;
    public final arbc f;
    public final arbd g;
    public final boolean h;
    public String i;
    public nx j;
    public boolean k = false;
    public boolean l = false;
    private final View n;
    private final TextView o;
    private final TextInputLayout p;
    private final TextWatcher q;
    private final Drawable r;
    private final boolean s;
    private TextWatcher t;
    private arag u;

    public muu(Context context, aafo aafoVar, acti actiVar, ViewGroup viewGroup, arbc arbcVar, arbd arbdVar, aadd aaddVar) {
        this.d = aafoVar;
        this.e = actiVar;
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.formfill_phone_number_input, viewGroup, false);
        this.n = inflate;
        this.b = (TextView) inflate.findViewById(R.id.region_text);
        this.o = (TextView) inflate.findViewById(R.id.region_text_label);
        this.c = (EditTextWithHelpIcon) inflate.findViewById(R.id.edit_text);
        this.p = (TextInputLayout) inflate.findViewById(R.id.text_input_layout);
        this.f = arbcVar;
        this.g = arbdVar;
        this.i = l(arbdVar);
        this.q = new mut(this);
        this.r = context.getResources().getDrawable(2131232537);
        this.s = xrz.c(aaddVar);
        this.h = xrz.i(aaddVar);
    }

    private static String l(arbd arbdVar) {
        String str = arbdVar.d;
        if (amps.e(str)) {
            str = Locale.getDefault().getCountry();
            try {
                vdw vdwVar = m;
                str = vdwVar.h(vdwVar.e(arbdVar.f, str));
            } catch (vdv unused) {
            }
        }
        Set j = m.j();
        return !j.contains(str) ? j.isEmpty() ? "" : (String) j.iterator().next() : str;
    }

    private final String m() {
        return this.l ? this.g.f : this.c.mo589getText().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[Catch: vdv -> 0x00f0, TryCatch #0 {vdv -> 0x00f0, blocks: (B:2:0x0000, B:4:0x001a, B:43:0x00eb, B:5:0x0022, B:7:0x002e, B:8:0x0033, B:12:0x0047, B:14:0x004c, B:15:0x0050, B:17:0x0056, B:19:0x0062, B:21:0x007c, B:34:0x00c0, B:36:0x00c7, B:38:0x00cf, B:40:0x00d3, B:41:0x00de, B:42:0x00e8, B:27:0x0093, B:30:0x00a7, B:32:0x00ad, B:33:0x00bc, B:13:0x004a), top: B:46:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[Catch: vdv -> 0x00f0, TryCatch #0 {vdv -> 0x00f0, blocks: (B:2:0x0000, B:4:0x001a, B:43:0x00eb, B:5:0x0022, B:7:0x002e, B:8:0x0033, B:12:0x0047, B:14:0x004c, B:15:0x0050, B:17:0x0056, B:19:0x0062, B:21:0x007c, B:34:0x00c0, B:36:0x00c7, B:38:0x00cf, B:40:0x00d3, B:41:0x00de, B:42:0x00e8, B:27:0x0093, B:30:0x00a7, B:32:0x00ad, B:33:0x00bc, B:13:0x004a), top: B:46:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3 A[Catch: vdv -> 0x00f0, TryCatch #0 {vdv -> 0x00f0, blocks: (B:2:0x0000, B:4:0x001a, B:43:0x00eb, B:5:0x0022, B:7:0x002e, B:8:0x0033, B:12:0x0047, B:14:0x004c, B:15:0x0050, B:17:0x0056, B:19:0x0062, B:21:0x007c, B:34:0x00c0, B:36:0x00c7, B:38:0x00cf, B:40:0x00d3, B:41:0x00de, B:42:0x00e8, B:27:0x0093, B:30:0x00a7, B:32:0x00ad, B:33:0x00bc, B:13:0x004a), top: B:46:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de A[Catch: vdv -> 0x00f0, TryCatch #0 {vdv -> 0x00f0, blocks: (B:2:0x0000, B:4:0x001a, B:43:0x00eb, B:5:0x0022, B:7:0x002e, B:8:0x0033, B:12:0x0047, B:14:0x004c, B:15:0x0050, B:17:0x0056, B:19:0x0062, B:21:0x007c, B:34:0x00c0, B:36:0x00c7, B:38:0x00cf, B:40:0x00d3, B:41:0x00de, B:42:0x00e8, B:27:0x0093, B:30:0x00a7, B:32:0x00ad, B:33:0x00bc, B:13:0x004a), top: B:46:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String n(java.lang.String r11, java.lang.String r12, int r13) {
        /*
            vdw r0 = defpackage.muu.m     // Catch: defpackage.vdv -> Lf0
            veb r11 = r0.e(r12, r11)     // Catch: defpackage.vdv -> Lf0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: defpackage.vdv -> Lf0
            r2 = 20
            r1.<init>(r2)     // Catch: defpackage.vdv -> Lf0
            r2 = 0
            r1.setLength(r2)     // Catch: defpackage.vdv -> Lf0
            int r2 = r11.a     // Catch: defpackage.vdv -> Lf0
            java.lang.String r3 = r0.f(r11)     // Catch: defpackage.vdv -> Lf0
            r4 = 1
            if (r13 != r4) goto L22
            r1.append(r3)     // Catch: defpackage.vdv -> Lf0
            r0.o(r2, r4, r1)     // Catch: defpackage.vdv -> Lf0
            goto Leb
        L22:
            java.util.Map r4 = r0.e     // Catch: defpackage.vdv -> Lf0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: defpackage.vdv -> Lf0
            boolean r4 = r4.containsKey(r5)     // Catch: defpackage.vdv -> Lf0
            if (r4 != 0) goto L33
            r1.append(r3)     // Catch: defpackage.vdv -> Lf0
            goto Leb
        L33:
            java.lang.String r4 = r0.g(r2)     // Catch: defpackage.vdv -> Lf0
            vdy r4 = r0.d(r2, r4)     // Catch: defpackage.vdv -> Lf0
            java.util.List r5 = r4.t     // Catch: defpackage.vdv -> Lf0
            int r5 = r5.size()     // Catch: defpackage.vdv -> Lf0
            r6 = 3
            if (r5 == 0) goto L4a
            if (r13 != r6) goto L47
            goto L4a
        L47:
            java.util.List r5 = r4.t     // Catch: defpackage.vdv -> Lf0
            goto L4c
        L4a:
            java.util.List r5 = r4.s     // Catch: defpackage.vdv -> Lf0
        L4c:
            java.util.Iterator r5 = r5.iterator()     // Catch: defpackage.vdv -> Lf0
        L50:
            boolean r7 = r5.hasNext()     // Catch: defpackage.vdv -> Lf0
            if (r7 == 0) goto L8f
            java.lang.Object r7 = r5.next()     // Catch: defpackage.vdv -> Lf0
            vdx r7 = (defpackage.vdx) r7     // Catch: defpackage.vdv -> Lf0
            int r8 = r7.a()     // Catch: defpackage.vdv -> Lf0
            if (r8 == 0) goto L7c
            vef r9 = r0.f     // Catch: defpackage.vdv -> Lf0
            int r8 = r8 + (-1)
            java.util.List r10 = r7.c     // Catch: defpackage.vdv -> Lf0
            java.lang.Object r8 = r10.get(r8)     // Catch: defpackage.vdv -> Lf0
            java.lang.String r8 = (java.lang.String) r8     // Catch: defpackage.vdv -> Lf0
            java.util.regex.Pattern r8 = r9.a(r8)     // Catch: defpackage.vdv -> Lf0
            java.util.regex.Matcher r8 = r8.matcher(r3)     // Catch: defpackage.vdv -> Lf0
            boolean r8 = r8.lookingAt()     // Catch: defpackage.vdv -> Lf0
            if (r8 == 0) goto L50
        L7c:
            vef r8 = r0.f     // Catch: defpackage.vdv -> Lf0
            java.lang.String r9 = r7.a     // Catch: defpackage.vdv -> Lf0
            java.util.regex.Pattern r8 = r8.a(r9)     // Catch: defpackage.vdv -> Lf0
            java.util.regex.Matcher r8 = r8.matcher(r3)     // Catch: defpackage.vdv -> Lf0
            boolean r8 = r8.matches()     // Catch: defpackage.vdv -> Lf0
            if (r8 == 0) goto L50
            goto L90
        L8f:
            r7 = 0
        L90:
            if (r7 != 0) goto L93
            goto Lc0
        L93:
            java.lang.String r5 = r7.b     // Catch: defpackage.vdv -> Lf0
            vef r8 = r0.f     // Catch: defpackage.vdv -> Lf0
            java.lang.String r9 = r7.a     // Catch: defpackage.vdv -> Lf0
            java.util.regex.Pattern r8 = r8.a(r9)     // Catch: defpackage.vdv -> Lf0
            java.util.regex.Matcher r3 = r8.matcher(r3)     // Catch: defpackage.vdv -> Lf0
            java.lang.String r7 = r7.d     // Catch: defpackage.vdv -> Lf0
            if (r13 != r6) goto Lbc
            if (r7 == 0) goto Lbc
            int r6 = r7.length()     // Catch: defpackage.vdv -> Lf0
            if (r6 <= 0) goto Lbc
            java.util.regex.Pattern r6 = defpackage.vdw.d     // Catch: defpackage.vdv -> Lf0
            java.util.regex.Matcher r5 = r6.matcher(r5)     // Catch: defpackage.vdv -> Lf0
            java.lang.String r5 = r5.replaceFirst(r7)     // Catch: defpackage.vdv -> Lf0
            java.lang.String r3 = r3.replaceAll(r5)     // Catch: defpackage.vdv -> Lf0
            goto Lc0
        Lbc:
            java.lang.String r3 = r3.replaceAll(r5)     // Catch: defpackage.vdv -> Lf0
        Lc0:
            r1.append(r3)     // Catch: defpackage.vdv -> Lf0
            boolean r3 = r11.c     // Catch: defpackage.vdv -> Lf0
            if (r3 == 0) goto Le8
            java.lang.String r3 = r11.d     // Catch: defpackage.vdv -> Lf0
            int r3 = r3.length()     // Catch: defpackage.vdv -> Lf0
            if (r3 <= 0) goto Le8
            boolean r3 = r4.n     // Catch: defpackage.vdv -> Lf0
            if (r3 == 0) goto Lde
            java.lang.String r3 = r4.o     // Catch: defpackage.vdv -> Lf0
            r1.append(r3)     // Catch: defpackage.vdv -> Lf0
            java.lang.String r11 = r11.d     // Catch: defpackage.vdv -> Lf0
            r1.append(r11)     // Catch: defpackage.vdv -> Lf0
            goto Le8
        Lde:
            java.lang.String r3 = " ext. "
            r1.append(r3)     // Catch: defpackage.vdv -> Lf0
            java.lang.String r11 = r11.d     // Catch: defpackage.vdv -> Lf0
            r1.append(r11)     // Catch: defpackage.vdv -> Lf0
        Le8:
            r0.o(r2, r13, r1)     // Catch: defpackage.vdv -> Lf0
        Leb:
            java.lang.String r11 = r1.toString()     // Catch: defpackage.vdv -> Lf0
            return r11
        Lf0:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.muu.n(java.lang.String, java.lang.String, int):java.lang.String");
    }

    @Override // defpackage.muj
    public final View a() {
        return this.n;
    }

    @Override // defpackage.muj
    public final asip b(asip asipVar) {
        aopa mo52toBuilder = asipVar.mo52toBuilder();
        if (h()) {
            mo52toBuilder.copyOnWrite();
            asip.c((asip) mo52toBuilder.instance);
        }
        if (this.g.f.length() > 0) {
            mo52toBuilder.copyOnWrite();
            asip.f((asip) mo52toBuilder.instance);
        }
        return (asip) mo52toBuilder.mo39build();
    }

    @Override // defpackage.muj
    public final asjg c(asjg asjgVar) {
        aopa mo52toBuilder = asjgVar.mo52toBuilder();
        if (h()) {
            mo52toBuilder.copyOnWrite();
            asjg.c((asjg) mo52toBuilder.instance);
        }
        if (this.g.f.length() > 0) {
            mo52toBuilder.copyOnWrite();
            asjg.f((asjg) mo52toBuilder.instance);
        }
        return (asjg) mo52toBuilder.mo39build();
    }

    @Override // defpackage.muj
    public final View d() {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        this.c.setOnFocusChangeListener(new mus(this));
        this.c.setOnClickListener(new muo(this, 1));
        this.c.setImeOptions(5);
        this.c.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: mup
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                muu muuVar = muu.this;
                ((InputMethodManager) muuVar.a.getSystemService("input_method")).hideSoftInputFromWindow(textView.getRootView().getWindowToken(), 2);
                muuVar.c.clearFocus();
                return true;
            }
        });
        TextInputLayout textInputLayout = this.p;
        arbd arbdVar = this.g;
        if ((arbdVar.b & 4) != 0) {
            aragVar = arbdVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textInputLayout.B(ajgl.b(aragVar));
        TextInputLayout textInputLayout2 = this.p;
        arbd arbdVar2 = this.g;
        if ((arbdVar2.b & 64) != 0) {
            aragVar2 = arbdVar2.i;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textInputLayout2.z(ajgl.b(aragVar2));
        TextView textView = this.o;
        arbd arbdVar3 = this.g;
        if ((arbdVar3.b & 1) != 0) {
            aragVar3 = arbdVar3.c;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        textView.setText(ajgl.b(aragVar3));
        k();
        arbd arbdVar4 = this.g;
        if ((arbdVar4.b & 256) != 0) {
            this.l = true;
            this.c.setText(arbdVar4.k);
        } else {
            this.c.setText(n(this.i, arbdVar4.f, 3));
        }
        if ((this.g.b & 32) != 0) {
            this.c.b(this.r, new xjh() { // from class: mur
                @Override // defpackage.xjh
                public final void a() {
                    muu muuVar = muu.this;
                    aafo aafoVar = muuVar.d;
                    apzg apzgVar = muuVar.g.h;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, actk.f(muuVar.g));
                }
            });
        }
        this.c.addTextChangedListener(this.q);
        this.b.setText(this.a.getResources().getString(R.string.region_with_calling_code, this.i, Integer.valueOf(m.a(this.i))));
        this.b.setOnClickListener(new muo(this));
        this.e.u(new acte(this.g.l), null);
        return this.n;
    }

    @Override // defpackage.muj
    public final String f() {
        return n(this.i, m(), 1);
    }

    @Override // defpackage.muj
    public final void g(boolean z) {
        if (!z) {
            if (this.s) {
                this.r.setTint(zhn.d(this.a, R.attr.ytIcon1));
            }
            this.p.w(false);
            this.p.setBackgroundColor(0);
            return;
        }
        if (this.s) {
            this.p.y(ColorStateList.valueOf(zhn.d(this.a, R.attr.ytErrorIndicator)));
            this.r.setTint(zhn.d(this.a, R.attr.ytErrorIndicator));
        }
        arag aragVar = this.u;
        if (aragVar == null && (aragVar = this.g.g) == null) {
            aragVar = arag.a;
        }
        this.p.v(ajgl.b(aragVar));
        this.p.setBackgroundColor(zhn.d(this.a, true != this.s ? R.attr.ytGeneralBackgroundB : R.attr.ytBadgeChipBackground));
    }

    @Override // defpackage.muj
    public final boolean h() {
        return !f().equals(n(l(this.g), this.g.f, 1));
    }

    public final void i() {
        this.c.setText(n(this.i, this.g.f, 3));
        this.l = false;
    }

    public final void j() {
        this.e.H(3, new acte(this.g.l), null);
    }

    public final void k() {
        this.c.removeTextChangedListener(this.t);
        PhoneNumberFormattingTextWatcher phoneNumberFormattingTextWatcher = new PhoneNumberFormattingTextWatcher(this.i);
        this.t = phoneNumberFormattingTextWatcher;
        this.c.addTextChangedListener(phoneNumberFormattingTextWatcher);
        String normalizeNumber = PhoneNumberUtils.normalizeNumber(this.c.getEditableText().toString());
        this.c.getEditableText().clear();
        this.c.setText(normalizeNumber);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r6.m(r6.e(m(), r5.i)) != false) goto L13;
     */
    @Override // defpackage.muj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mui e(boolean r6) {
        /*
            r5 = this;
            arbd r0 = r5.g
            int r0 = r0.b
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L27
            java.lang.String r6 = r5.f()
            arbd r0 = r5.g
            avvz r0 = r0.j
            if (r0 != 0) goto L14
            avvz r0 = defpackage.avvz.a
        L14:
            mvi r6 = defpackage.mvj.a(r6, r0)
            arag r0 = r6.b
            r5.u = r0
            boolean r0 = r6.a
            apzg r1 = r6.c
            asir r6 = r6.d
            mui r6 = defpackage.mui.a(r0, r1, r6)
            return r6
        L27:
            r0 = 0
            r5.u = r0
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L3a
            java.lang.String r6 = r5.m()
            int r6 = r6.length()
            if (r6 != 0) goto L3a
        L38:
            r1 = 1
            goto L4d
        L3a:
            vdw r6 = defpackage.muu.m     // Catch: defpackage.vdv -> L4d
            java.lang.String r3 = r5.m()     // Catch: defpackage.vdv -> L4d
            java.lang.String r4 = r5.i     // Catch: defpackage.vdv -> L4d
            veb r3 = r6.e(r3, r4)     // Catch: defpackage.vdv -> L4d
            boolean r6 = r6.m(r3)     // Catch: defpackage.vdv -> L4d
            if (r6 == 0) goto L4d
            goto L38
        L4d:
            mui r6 = defpackage.mui.a(r1, r0, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.muu.e(boolean):mui");
    }
}
