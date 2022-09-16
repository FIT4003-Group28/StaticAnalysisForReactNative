package defpackage;

import android.app.Activity;
import android.support.v7.widget.SwitchCompat;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
/* compiled from: PG */
/* renamed from: aclz  reason: default package */
/* loaded from: classes.dex */
public final class aclz implements View.OnClickListener {
    private final ajxz a;
    private final aafo b;
    private final Activity c;
    private final View d;
    private final TextView e;
    private final SwitchCompat f;
    private final ashv g;

    public aclz(Activity activity, ajxz ajxzVar, aafo aafoVar, View view, TextView textView, SwitchCompat switchCompat, ashv ashvVar) {
        arag aragVar;
        aaft[] aaftVarArr;
        activity.getClass();
        this.c = activity;
        aafoVar.getClass();
        this.b = aafoVar;
        ajxzVar.getClass();
        this.a = ajxzVar;
        view.getClass();
        this.d = view;
        textView.getClass();
        this.e = textView;
        switchCompat.getClass();
        this.f = switchCompat;
        ashvVar.getClass();
        this.g = ashvVar;
        view.setOnClickListener(this);
        d(ashvVar.g, false);
        switchCompat.setChecked(ashvVar.g);
        if ((ashvVar.b & 2) != 0) {
            aragVar = ashvVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned a = aafv.a(aragVar, aafoVar, true);
        if (a != null && zdg.e(view.getContext())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
            for (aaft aaftVar : (aaft[]) spannableStringBuilder.getSpans(0, a.length(), aaft.class)) {
                apzg apzgVar = aaftVar.c;
                if (apzgVar != null && apzgVar.qn(UrlEndpointOuterClass.urlEndpoint)) {
                    int spanStart = spannableStringBuilder.getSpanStart(aaftVar);
                    int spanEnd = spannableStringBuilder.getSpanEnd(aaftVar);
                    spannableStringBuilder.removeSpan(aaftVar);
                    spannableStringBuilder.setSpan(new URLSpan(zgt.j(((avvk) aaftVar.c.qm(UrlEndpointOuterClass.urlEndpoint)).c).toString()), spanStart, spanEnd, 33);
                }
            }
            spannableStringBuilder.append((CharSequence) " ");
            a = spannableStringBuilder;
        }
        this.e.setText(a);
    }

    public final void a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public final void b() {
        this.f.toggle();
    }

    public final boolean c() {
        return this.f.isChecked();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f.toggle();
        d(c(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d(boolean r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L22
            ashv r1 = r5.g
            int r2 = r1.b
            r2 = r2 & 8
            if (r2 == 0) goto L22
            ajxz r2 = r5.a
            arhs r1 = r1.e
            if (r1 != 0) goto L13
            arhs r1 = defpackage.arhs.a
        L13:
            int r1 = r1.c
            arhr r1 = defpackage.arhr.b(r1)
            if (r1 != 0) goto L1d
            arhr r1 = defpackage.arhr.UNKNOWN
        L1d:
            int r1 = r2.a(r1)
            goto L44
        L22:
            if (r6 != 0) goto L43
            ashv r1 = r5.g
            int r2 = r1.b
            r2 = r2 & 16
            if (r2 == 0) goto L43
            ajxz r2 = r5.a
            arhs r1 = r1.f
            if (r1 != 0) goto L34
            arhs r1 = defpackage.arhs.a
        L34:
            int r1 = r1.c
            arhr r1 = defpackage.arhr.b(r1)
            if (r1 != 0) goto L3e
            arhr r1 = defpackage.arhr.UNKNOWN
        L3e:
            int r1 = r2.a(r1)
            goto L44
        L43:
            r1 = 0
        L44:
            r2 = 0
            if (r1 == 0) goto L52
            android.widget.TextView r3 = r5.e
            android.app.Activity r4 = r5.c
            android.graphics.drawable.Drawable r1 = defpackage.akf.a(r4, r1)
            r3.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r2, r2)
        L52:
            android.view.View r1 = r5.d
            r3 = 1
            if (r3 == r6) goto L5b
            r4 = 1058642330(0x3f19999a, float:0.6)
            goto L5d
        L5b:
            r4 = 1065353216(0x3f800000, float:1.0)
        L5d:
            r1.setAlpha(r4)
            if (r7 == 0) goto L8a
            android.view.View r7 = r5.d
            android.content.Context r7 = r7.getContext()
            boolean r7 = defpackage.zdg.e(r7)
            if (r7 == 0) goto L8a
            android.view.View r7 = r5.d
            android.content.Context r7 = r7.getContext()
            android.view.View r1 = r5.d
            android.content.Context r4 = r1.getContext()
            if (r3 == r6) goto L80
            r6 = 2132018177(0x7f140401, float:1.9674653E38)
            goto L83
        L80:
            r6 = 2132018178(0x7f140402, float:1.9674655E38)
        L83:
            java.lang.String r6 = r4.getString(r6)
            defpackage.zdg.c(r7, r1, r6)
        L8a:
            ashv r6 = r5.g
            int r7 = r6.b
            r7 = r7 & 64
            if (r7 == 0) goto L9e
            aovs r6 = r6.h
            if (r6 != 0) goto L98
            aovs r6 = defpackage.aovs.a
        L98:
            aovr r2 = r6.c
            if (r2 != 0) goto L9e
            aovr r2 = defpackage.aovr.a
        L9e:
            if (r2 == 0) goto La9
            int r6 = r2.b
            r6 = r6 & 2
            if (r6 == 0) goto La9
            java.lang.String r6 = r2.c
            goto Lb9
        La9:
            ashv r6 = r5.g
            arag r6 = r6.c
            if (r6 != 0) goto Lb1
            arag r6 = defpackage.arag.a
        Lb1:
            android.text.Spanned r6 = defpackage.ajgl.b(r6)
            java.lang.String r6 = r6.toString()
        Lb9:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto Ldd
            android.view.View r7 = r5.d
            android.content.Context r1 = r7.getContext()
            boolean r2 = r5.c()
            if (r3 == r2) goto Lcf
            r2 = 2132018216(0x7f140428, float:1.9674732E38)
            goto Ld2
        Lcf:
            r2 = 2132018217(0x7f140429, float:1.9674734E38)
        Ld2:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r6
            java.lang.String r6 = r1.getString(r2, r3)
            r7.setContentDescription(r6)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aclz.d(boolean, boolean):void");
    }
}
