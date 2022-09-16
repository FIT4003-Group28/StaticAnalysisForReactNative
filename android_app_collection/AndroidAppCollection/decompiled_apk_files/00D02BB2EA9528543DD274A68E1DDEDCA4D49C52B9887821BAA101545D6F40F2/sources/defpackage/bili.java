package defpackage;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.style.StyleSpan;
import com.google.android.apps.maps.R;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: bili  reason: default package */
/* loaded from: classes3.dex */
public class bili implements bilh, bega, begt {
    private final Activity a;
    private final cqat b;
    private String c;
    @dzsi
    private TimeZone d;
    private cjtd e;

    public bili(Activity activity, cqat cqatVar) {
        this.a = activity;
        this.b = cqatVar;
    }

    @Override // defpackage.begt
    public void a(boolean z) {
        if (z) {
            cqkx.p(this);
        }
    }

    @Override // defpackage.bilh
    public CharSequence b() {
        String sb;
        SpannableString spannableString = new SpannableString(alp.a().b(this.a.getResources().getString(R.string.LOCAL_TIME_TITLE)).replace(" ", " "));
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 0);
        CharSequence[] charSequenceArr = new CharSequence[3];
        charSequenceArr[0] = spannableString;
        charSequenceArr[1] = " ";
        alp a = alp.a();
        long b = this.b.b();
        StringBuilder sb2 = new StringBuilder(a.b(DateUtils.formatDateRange(this.a, new Formatter(new StringBuilder()), b, b, 3, this.c).toString()));
        sb2.append(" ");
        if (this.d == null) {
            sb = "";
        } else {
            StringBuilder sb3 = new StringBuilder("(");
            TimeZone timeZone = this.d;
            sb3.append(timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0, Locale.getDefault()));
            sb3.append(")");
            sb = sb3.toString();
        }
        sb2.append(a.b(sb));
        charSequenceArr[2] = sb2.toString().replace(" ", " ");
        return TextUtils.concat(charSequenceArr);
    }

    @Override // defpackage.bilh
    public CharSequence c() {
        return b();
    }

    @Override // defpackage.bilh
    public Boolean d() {
        return Boolean.FALSE;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return Boolean.FALSE;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.bilh
    public cqtd g() {
        return cqrt.g(2131231600, ibm.x());
    }

    @Override // defpackage.bilh
    public jic h() {
        return null;
    }

    @Override // defpackage.bilh
    public cjtd i() {
        return this.e;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            u();
            return;
        }
        String aT = iloVar.aT();
        this.c = aT;
        if (dbsj.d(aT)) {
            this.d = null;
            return;
        }
        this.d = TimeZone.getTimeZone(this.c);
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxy.jL;
        this.e = c.a();
    }

    @Override // defpackage.bega
    public void u() {
        this.c = "";
        this.d = null;
        this.e = cjtd.b;
    }

    @Override // defpackage.bega
    public Boolean w() {
        if (dbsj.d(this.c)) {
            return Boolean.FALSE;
        }
        TimeZone timeZone = TimeZone.getDefault();
        long b = this.b.b();
        return Boolean.valueOf(timeZone.getOffset(b) != this.d.getOffset(b));
    }
}
