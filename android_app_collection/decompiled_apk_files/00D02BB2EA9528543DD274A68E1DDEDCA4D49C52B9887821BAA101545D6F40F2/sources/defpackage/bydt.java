package defpackage;

import android.app.Application;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bydt  reason: default package */
/* loaded from: classes4.dex */
public final class bydt implements bydq {
    private static final dcqe a = dcqe.c("bydt");
    private final Application b;
    private final cqat c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public bydt(Application application, cqat cqatVar, bydm bydmVar) {
        this.b = application;
        this.c = cqatVar;
        this.d = bydmVar.a();
        this.e = bydmVar.b();
        this.f = bydmVar.c();
        this.g = bydmVar.d();
    }

    private final void b(SpannableStringBuilder spannableStringBuilder) {
        int i = this.f;
        if (i != 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, spannableStringBuilder.length(), 0);
        }
    }

    @Override // defpackage.bydq
    public final CharSequence a(byee byeeVar) {
        if (this.b == null) {
            bvoo.h("Application is null", new Object[0]);
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        byed b = byeeVar.b(this.c);
        if (b == null || b.a() == null) {
            spannableStringBuilder.append((CharSequence) this.b.getString(R.string.PLACE_HOURS_UNKNOWN));
            spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif-medium"), 0, spannableStringBuilder.length(), 0);
            spannableStringBuilder.setSpan(new StyleSpan(2), 0, spannableStringBuilder.length(), 0);
            return new SpannableString(spannableStringBuilder);
        }
        byef b2 = b.b();
        byef c = b.c();
        byea d = b.d();
        byeb byebVar = byeb.PERMANENTLY_CLOSED;
        switch (b.a().ordinal()) {
            case 0:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.PLACE_PERMANENTLY_CLOSED));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d), 0, spannableStringBuilder.length(), 0);
                break;
            case 1:
            case 6:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.CLOSED));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d), 0, spannableStringBuilder.length(), 0);
                if (c != null && d != null) {
                    spannableStringBuilder.append(" · ");
                    Application application = this.b;
                    spannableStringBuilder.append((CharSequence) application.getString(R.string.OPENING_TIME_WITH_DAY, new Object[]{c.l(application), this.b.getString(d.i)}));
                    break;
                }
                break;
            case 2:
            case 3:
                if (b2 == null) {
                    bvoo.h("missing params for OPEN_NOW_LAST_INTERVAL", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.OPEN));
                b(spannableStringBuilder);
                spannableStringBuilder.append(" · ");
                Application application2 = this.b;
                spannableStringBuilder.append((CharSequence) application2.getString(R.string.CLOSING_TIME, new Object[]{b2.k(application2)}));
                break;
            case 4:
            case 5:
                if (b2 == 0) {
                    bvoo.h("missing params for CLOSING_SOON_LAST_INTERVAL", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.CLOSES_SOON));
                spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif-medium"), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.e), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append(" · ");
                spannableStringBuilder.append(b2.k(this.b));
                break;
            case 7:
                if (c == 0) {
                    bvoo.h("missing params for CLOSED_NOW_WILL_REOPEN", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.CLOSED));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append(" · ");
                Application application3 = this.b;
                spannableStringBuilder.append((CharSequence) application3.getString(R.string.OPENING_TIME, new Object[]{c.l(application3)}));
                break;
            case 8:
                if (c == 0) {
                    bvoo.h("missing params for OPENS_SOON", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.OPENS_SOON));
                spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif-medium"), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.e), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append(" · ");
                spannableStringBuilder.append(c.l(this.b));
                break;
            case 9:
                if (c == 0 || d == null) {
                    bvoo.h("missing params for OPENS_SOON_NEXT_DAY", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.OPENS_SOON));
                spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif-medium"), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.e), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append(" · ");
                Application application4 = this.b;
                spannableStringBuilder.append((CharSequence) application4.getString(R.string.TIME_AND_DAY, new Object[]{c.l(application4), this.b.getString(d.i)}));
                break;
            case 10:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.OPEN_24_HOURS));
                b(spannableStringBuilder);
                break;
            case 11:
                if (b2 == 0 || d == null) {
                    bvoo.h("missing params for OPEN_NOW_CLOSES_NEXT_DAY", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.OPEN));
                b(spannableStringBuilder);
                spannableStringBuilder.append(" · ");
                Application application5 = this.b;
                spannableStringBuilder.append((CharSequence) application5.getString(R.string.CLOSING_TIME_WITH_DAY, new Object[]{b2.k(application5), this.b.getString(d.i)}));
                break;
            case 12:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.PLACE_HOURS_UNKNOWN));
                spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif-medium"), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.setSpan(new StyleSpan(2), 0, spannableStringBuilder.length(), 0);
                break;
            case 13:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.PLACE_OPEN_NOW_HOURS_UNKNOWN));
                b(spannableStringBuilder);
                break;
            case 14:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.PLACE_CLOSED_NOW_HOURS_UNKNOWN));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d), 0, spannableStringBuilder.length(), 0);
                break;
            case 15:
                dbsg<String> dbsgVar = byeeVar.a;
                if (dbsgVar.a()) {
                    spannableStringBuilder.append((CharSequence) dbsgVar.b());
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.g), 0, spannableStringBuilder.length(), 0);
                    break;
                }
                break;
            case 16:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.PLACE_TEMPORARILY_CLOSED));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d), 0, spannableStringBuilder.length(), 0);
                break;
        }
        return new SpannableString(spannableStringBuilder);
    }
}
