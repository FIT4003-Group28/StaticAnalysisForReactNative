package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aclx  reason: default package */
/* loaded from: classes.dex */
public final class aclx implements AdapterView.OnItemSelectedListener, ajru {
    public final Spinner a;
    public final Spinner b;
    public final View c;
    public aclw d;
    private final akbn e;
    private final Activity f;
    private final ajxz g;
    private final acti h;
    private final aafo i;
    private final TextView j;
    private final TextView k;
    private final TextView l;
    private final YouTubeTextView m;
    private final YouTubeTextView n;
    private final TextView o;
    private final TextView p;

    public aclx(Activity activity, ajxz ajxzVar, aafo aafoVar, acti actiVar, akbn akbnVar) {
        this.f = activity;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.lc_pre_stream_audience_settings, (ViewGroup) null);
        this.c = inflate;
        ajxzVar.getClass();
        this.g = ajxzVar;
        actiVar.getClass();
        this.h = actiVar;
        aafoVar.getClass();
        this.i = aafoVar;
        akbnVar.getClass();
        this.e = akbnVar;
        this.j = (TextView) inflate.findViewById(R.id.pre_stream_audience_info_title);
        this.k = (TextView) inflate.findViewById(R.id.pre_stream_kids_info_title);
        this.l = (TextView) inflate.findViewById(R.id.pre_stream_kids_info_description);
        this.a = (Spinner) inflate.findViewById(R.id.pre_stream_kids_content_option_list);
        this.b = (Spinner) inflate.findViewById(R.id.pre_stream_adult_content_option_list);
        this.o = (TextView) inflate.findViewById(R.id.pre_stream_adult_content_title);
        this.p = (TextView) inflate.findViewById(R.id.pre_stream_adult_section_info_description);
        this.m = (YouTubeTextView) inflate.findViewById(R.id.learn_more_button);
        this.n = (YouTubeTextView) inflate.findViewById(R.id.learn_more_adult_section_button);
    }

    private final void h() {
        this.o.setTextColor(this.f.getResources().getColor(R.color.yt_grey3));
        this.b.setAlpha(0.45f);
        this.o.setAlpha(0.45f);
        this.p.setAlpha(0.45f);
        this.b.setEnabled(false);
    }

    private final void i() {
        this.o.setTextColor(this.f.getResources().getColor(R.color.yt_white1));
        this.b.setAlpha(1.0f);
        this.o.setAlpha(1.0f);
        this.p.setAlpha(1.0f);
        this.b.setEnabled(true);
    }

    private final void j() {
        this.k.setTextColor(this.f.getResources().getColor(R.color.yt_white1));
        this.l.setTextColor(this.f.getResources().getColor(R.color.yt_grey1));
        this.a.setAlpha(1.0f);
        this.a.setEnabled(true);
    }

    private final void k() {
        acmb acmbVar = (acmb) this.b.getAdapter();
        int count = acmbVar.getCount();
        for (int i = 0; i < count; i++) {
            ashy item = acmbVar.getItem(i);
            if (item != null && item.c == 3 && ((Integer) item.d).intValue() == acly.b(2)) {
                acmbVar.e = i;
                this.b.setSelection(i);
                return;
            }
        }
    }

    private final void l(acmb acmbVar, Spinner spinner) {
        int count = acmbVar.getCount();
        int i = 0;
        for (int i2 = 0; i2 < count; i2++) {
            ashy item = acmbVar.getItem(i2);
            if (item.h) {
                spinner.setSelection(i2);
                acmbVar.e = i2;
                if ((item.c == 3 ? ((Integer) item.d).intValue() : 0) == acly.b(3)) {
                    k();
                    h();
                    j();
                    return;
                }
                if (item.c == 3) {
                    i = ((Integer) item.d).intValue();
                }
                if (i == acly.b(4)) {
                    i();
                    return;
                }
                i();
                j();
                return;
            }
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.avfv r12) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aclx.d(avfv):void");
    }

    public final void e(avfv avfvVar) {
        avfvVar.getClass();
        d(avfvVar);
    }

    public final int f() {
        ashy ashyVar = (ashy) this.a.getSelectedItem();
        ashy ashyVar2 = (ashy) this.b.getSelectedItem();
        int i = 0;
        if ((ashyVar.c == 3 ? ((Integer) ashyVar.d).intValue() : 0) != acly.b(1)) {
            if ((ashyVar.c == 3 ? ((Integer) ashyVar.d).intValue() : 0) != acly.b(3)) {
                if ((ashyVar.c == 3 ? ((Integer) ashyVar.d).intValue() : 0) == acly.b(1)) {
                    if (ashyVar.c == 3) {
                        i = ((Integer) ashyVar.d).intValue();
                    }
                    return akzj.E(i);
                }
                if ((ashyVar2.c == 3 ? ((Integer) ashyVar2.d).intValue() : 0) != acly.b(4)) {
                    return 2;
                }
                if (ashyVar2.c == 3) {
                    i = ((Integer) ashyVar2.d).intValue();
                }
                return akzj.E(i);
            }
        }
        if (ashyVar.c == 3) {
            i = ((Integer) ashyVar.d).intValue();
        }
        return akzj.E(i);
    }

    public final void g(acmb acmbVar, int i, Spinner spinner) {
        int i2;
        if (acmbVar != null) {
            int count = acmbVar.getCount();
            for (int i3 = 0; i3 < count; i3++) {
                ashy item = acmbVar.getItem(i3);
                if (item != null && item.c == 3 && ((Integer) item.d).intValue() == i - 1) {
                    spinner.setSelection(i3);
                    acmbVar.e = i3;
                    if (i2 == acly.b(3)) {
                        k();
                        h();
                        j();
                        return;
                    } else if (i2 == acly.b(4)) {
                        i();
                        return;
                    } else {
                        j();
                        i();
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        e((avfv) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r6 != 1) goto L15;
     */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemSelected(android.widget.AdapterView r2, android.view.View r3, int r4, long r5) {
        /*
            r1 = this;
            int r3 = r1.f()
            android.widget.Adapter r2 = r2.getAdapter()
            acmb r2 = (defpackage.acmb) r2
            r2.e = r4
            int r2 = r3 + (-1)
            r4 = 0
            if (r3 == 0) goto L8d
            r3 = 4
            int r3 = defpackage.acly.b(r3)
            r5 = 1
            if (r2 != r3) goto L1d
            r1.i()
            goto L4a
        L1d:
            r3 = 3
            int r6 = defpackage.acly.b(r3)
            if (r2 != r6) goto L44
            android.widget.Spinner r2 = r1.b
            java.lang.Object r2 = r2.getSelectedItem()
            ashy r2 = (defpackage.ashy) r2
            int r6 = r2.c
            if (r6 != r3) goto L3a
            java.lang.Object r2 = r2.d
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 == r5) goto L3d
        L3a:
            r1.k()
        L3d:
            r1.h()
            r1.j()
            goto L4a
        L44:
            r1.j()
            r1.i()
        L4a:
            aclw r2 = r1.d
            if (r2 == 0) goto L8c
            acll r2 = (defpackage.acll) r2
            aclx r3 = r2.af
            if (r3 == 0) goto L8c
            android.widget.Button r3 = r2.ak
            com.google.android.libraries.youtube.livecreation.ui.view.EditTextTitle r6 = r2.ag
            android.text.Editable r6 = r6.mo589getText()
            java.lang.String r6 = r6.toString()
            boolean r6 = defpackage.acll.aN(r6)
            r0 = 0
            if (r6 == 0) goto L73
            aclx r6 = r2.af
            int r6 = r6.f()
            if (r6 == 0) goto L72
            if (r6 == r5) goto L73
            goto L74
        L72:
            throw r4
        L73:
            r5 = 0
        L74:
            r3.setEnabled(r5)
            aclv r3 = r2.ae
            if (r3 == 0) goto L8c
            boolean r3 = r2.aK()
            if (r3 == 0) goto L87
            aclv r2 = r2.ae
            r2.a()
            return
        L87:
            aclv r2 = r2.ae
            r2.b()
        L8c:
            return
        L8d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aclx.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
