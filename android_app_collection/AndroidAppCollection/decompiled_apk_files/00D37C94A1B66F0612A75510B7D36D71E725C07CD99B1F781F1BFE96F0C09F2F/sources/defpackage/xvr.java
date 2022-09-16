package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: xvr  reason: default package */
/* loaded from: classes4.dex */
public final class xvr implements xwd {
    private final View C;
    private final aqus D;
    private final boolean E;
    private String F;
    private final ajvj G;
    private final TextWatcher H;
    private boolean I;
    public final Dialog a;
    public final Context b;
    public final Activity c;
    public final ajmr d;
    public final akbv e;
    public final EditText f;
    public final ImageView g;
    public final ImageView h;
    public final ImageView i;
    public final TextView j;
    public final TextView k;
    public final View l;
    public final TextView m;
    public final View n;
    public final ImageView o;
    public final ImageView p;
    public final ImageView q;
    public final View r;
    public final boolean s;
    public final ColorDrawable t;
    public Runnable u;
    public Runnable v;
    public boolean w;
    public boolean x;
    public xkr y;
    private static final Pattern z = Pattern.compile("^\\s*$");
    private static final Pattern A = Pattern.compile("^\\s*");
    private static final Pattern B = Pattern.compile("\\s*$");

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xvr(android.content.Context r17, android.app.Activity r18, defpackage.ajmr r19, defpackage.akbv r20, defpackage.ajxz r21, defpackage.apoj r22, defpackage.aqus r23, defpackage.aacz r24, defpackage.ajvj r25) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvr.<init>(android.content.Context, android.app.Activity, ajmr, akbv, ajxz, apoj, aqus, aacz, ajvj):void");
    }

    @Override // defpackage.xwd
    public final Spanned a() {
        EditText editText = this.f;
        if (editText == null) {
            return new SpannedString("");
        }
        return new SpannedString(editText.getText());
    }

    @Override // defpackage.xwd
    public final void b() {
        this.a.cancel();
    }

    public final void c(boolean z2) {
        if (m()) {
            z2 = false;
        } else if (this.x) {
            z2 = true;
        }
        this.w = z2;
        f(z2);
    }

    public final void d(CharSequence charSequence, boolean z2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f.getText().clear();
            this.f.append(charSequence);
            c(z2);
            if (!this.w) {
                String charSequence2 = charSequence.toString();
                this.F = charSequence2;
                String replaceAll = charSequence2.replaceAll(A.toString(), "");
                this.F = replaceAll;
                this.F = replaceAll.replaceAll(B.toString(), "");
            } else {
                this.F = "";
            }
            xxq[] xxqVarArr = (xxq[]) this.f.getText().getSpans(0, this.f.getText().length(), xxq.class);
            if (xxqVarArr != null && xxqVarArr.length != 0) {
                return;
            }
            this.f.getText().setSpan(new xxq(), 0, this.f.getText().length(), 18);
        }
    }

    @Override // defpackage.xwd
    public final void dismiss() {
        if (!this.I && !this.c.isDestroyed() && !this.c.isFinishing()) {
            this.a.dismiss();
            this.I = true;
        }
    }

    @Override // defpackage.xwd
    public final void e(DialogInterface.OnCancelListener onCancelListener) {
        this.a.setOnCancelListener(onCancelListener);
    }

    public final void f(boolean z2) {
        int i = 0;
        boolean z3 = this.g.getVisibility() == 0 || (this.E && this.h.getVisibility() == 0);
        ImageView imageView = this.i;
        if (!z2) {
            i = z3 ? 8 : 4;
        }
        imageView.setVisibility(i);
        zag.l(this.i, null, 1);
    }

    @Override // defpackage.xwd
    public final void g() {
        this.g.setVisibility(0);
    }

    public final void h() {
        this.e.f((ViewGroup) this.C, this.D, this.f, new xvq(this));
    }

    @Override // defpackage.xwd
    public final void i() {
        if (this.e.h) {
            h();
        }
    }

    @Override // defpackage.xwd
    public final void j() {
        TextWatcher textWatcher = this.H;
        if (textWatcher != null) {
            textWatcher.afterTextChanged(this.f.getText());
        }
    }

    @Override // defpackage.xwd
    public final boolean k() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        return TextUtils.isEmpty(this.F) ? !m() : !a().toString().replaceAll(A.toString(), "").replaceAll(B.toString(), "").equals(this.F);
    }

    @Override // defpackage.xwd
    public final boolean m() {
        String obj = a().toString();
        return TextUtils.isEmpty(obj) || z.matcher(obj).find();
    }
}
