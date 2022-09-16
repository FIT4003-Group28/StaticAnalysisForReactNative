package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acrm  reason: default package */
/* loaded from: classes2.dex */
public class acrm implements acqx {
    private final Context a;
    @dzsi
    private CharSequence b;
    @dzsi
    private CharSequence c;
    private boolean d = false;

    public acrm(Context context) {
        this.a = context;
    }

    @Override // defpackage.acqx
    @dzsi
    public CharSequence a() {
        return this.b;
    }

    @Override // defpackage.acqx
    @dzsi
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.acqx
    public Boolean c() {
        return Boolean.valueOf(this.d);
    }

    public void d(@dzsi dvvs dvvsVar, boolean z, @dzsi String str) {
        SpannableStringBuilder spannableStringBuilder;
        String str2 = null;
        if (dvvsVar == null) {
            this.b = null;
            this.c = null;
            return;
        }
        this.d = z;
        String string = z ? this.a.getResources().getString(R.string.WAIT_TIMES_LIVE) : dvvsVar.e;
        if (!z || dbsj.d(str)) {
            str = dvvsVar.d;
        }
        if (dbsj.d(string) || dbsj.d(str)) {
            spannableStringBuilder = null;
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
            String string2 = this.a.getResources().getString(R.string.WAIT_TIMES_SEPARATOR);
            int length = string.length() + string2.length();
            spannableStringBuilder.append((CharSequence) string).append((CharSequence) string2).append((CharSequence) str);
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, length, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(akm.c(this.a, true != c().booleanValue() ? R.color.qu_daynight_google_blue_600 : R.color.mod_daynight_pink700)), 0, length, 33);
        }
        this.b = spannableStringBuilder;
        if (!dvvsVar.f.isEmpty()) {
            str2 = dvvsVar.f;
        }
        this.c = str2;
    }
}
