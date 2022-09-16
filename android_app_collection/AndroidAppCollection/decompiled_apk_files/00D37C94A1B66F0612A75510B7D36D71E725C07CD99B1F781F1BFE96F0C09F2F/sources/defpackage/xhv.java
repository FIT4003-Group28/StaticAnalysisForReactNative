package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: xhv  reason: default package */
/* loaded from: classes4.dex */
public final class xhv extends xhx {
    public CharSequence a;
    public apaq b;
    private final agd f;
    private final float g;
    private int h;

    public xhv(TextView textView, CharSequence charSequence, int i, float f, Drawable drawable, float f2) {
        super(textView, drawable, f2);
        this.a = charSequence;
        this.h = i;
        this.g = f;
        this.b = null;
        this.f = new agd();
    }

    private final void e(CharSequence charSequence) {
        charSequence.getClass();
        if (!akzj.f(charSequence, ((TextView) this.c).getText())) {
            ((TextView) this.c).setText(charSequence);
        }
    }

    @Override // defpackage.xhx
    public final void a() {
        apas apasVar;
        apar aparVar;
        int i;
        TextView textView;
        int a;
        super.a();
        apaq apaqVar = this.b;
        aoyi aoyiVar = null;
        String str = apaqVar == null ? null : apaqVar.c;
        int i2 = 1;
        boolean z = apaqVar == null || apaqVar.e;
        if (str == null || TextUtils.isEmpty(str)) {
            e(this.a);
        } else {
            if (z) {
                int i3 = this.f.j;
                Object[] objArr = new Object[i3 + i3];
                int i4 = 0;
                while (true) {
                    agd agdVar = this.f;
                    if (i4 >= agdVar.j) {
                        break;
                    }
                    int i5 = i4 + i4;
                    objArr[i5] = agdVar.f(i4);
                    objArr[i5 + 1] = this.f.i(i4);
                    i4++;
                }
                str = nd.f(Locale.getDefault(), str, objArr);
            }
            e(str);
        }
        apaq apaqVar2 = this.b;
        if (apaqVar2 == null || (apaqVar2.b & 2) == 0) {
            apasVar = null;
        } else {
            apasVar = apaqVar2.d;
            if (apasVar == null) {
                apasVar = apas.a;
            }
        }
        if (apasVar == null) {
            aparVar = null;
        } else {
            aparVar = apasVar.c;
            if (aparVar == null) {
                aparVar = apar.a;
            }
        }
        if (aparVar != null && (aoyiVar = aparVar.d) == null) {
            aoyiVar = aoyi.a;
        }
        f(aoyiVar);
        if (aparVar != null && (a = aoyt.a(aparVar.c)) != 0) {
            i2 = a;
        }
        switch (i2 - 1) {
            case 1:
                i = R.dimen.condor_ad_font_size_extra_extra_small;
                break;
            case 2:
                return;
            case 3:
                i = R.dimen.condor_ad_font_size_small;
                break;
            case 4:
                i = R.dimen.condor_ad_font_size_medium;
                break;
            case 5:
                i = R.dimen.condor_ad_font_size_large;
                break;
            case 6:
                i = R.dimen.condor_ad_font_size_extra_large;
                break;
            case 7:
                i = R.dimen.condor_ad_font_size_extra_extra_large;
                break;
            default:
                ((TextView) this.c).setTextSize(0, this.g);
                return;
        }
        ((TextView) this.c).setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(i));
    }

    public final void b(apaq apaqVar) {
        this.b = apaqVar;
        aoyj aoyjVar = null;
        if (apaqVar != null && (apaqVar.b & 2) != 0) {
            apas apasVar = apaqVar.d;
            if (apasVar == null) {
                apasVar = apas.a;
            }
            aoyjVar = apasVar.d;
            if (aoyjVar == null) {
                aoyjVar = aoyj.a;
            }
        }
        this.d = aoyjVar;
    }

    public final void c(int i) {
        this.h = i;
        f(null);
    }

    public final void d(Object obj) {
        this.f.put("TIME_REMAINING", obj);
    }

    private final void f(aoyi aoyiVar) {
        int i = aoyiVar == null ? this.h : aoyiVar.b;
        if (i != ((TextView) this.c).getCurrentTextColor()) {
            ((TextView) this.c).setTextColor(i);
        }
    }
}
