package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: byds  reason: default package */
/* loaded from: classes4.dex */
public final class byds implements bydq {
    private static final dcqe a = dcqe.c("byds");
    private final Context b;
    private final cqat c;
    private final int d;
    private final int e;

    public byds(Context context, cqat cqatVar, bydm bydmVar) {
        this.b = context;
        this.c = cqatVar;
        this.d = bydmVar.a();
        this.e = bydmVar.b();
    }

    @Override // defpackage.bydq
    public final CharSequence a(byee byeeVar) {
        byed b = byeeVar.b(this.c);
        if (b == null || b.a() == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
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
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d), 0, spannableStringBuilder.length(), 0);
                if (c != null && d != null) {
                    spannableStringBuilder.append((CharSequence) " · ");
                    Context context = this.b;
                    spannableStringBuilder.append((CharSequence) context.getString(R.string.OPENING_TIME_WITH_DAY, c.l(context), this.b.getString(d.i)));
                    break;
                }
                break;
            case 2:
                if (b2 == null) {
                    bvoo.h("missing params for OPEN_NOW_LAST_INTERVAL", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.OPEN));
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append((CharSequence) " · ");
                Context context2 = this.b;
                spannableStringBuilder.append((CharSequence) context2.getString(R.string.CLOSING_TIME, b2.k(context2)));
                break;
            case 3:
                if (b2 == null || c == null) {
                    bvoo.h("missing params for OPEN_NOW_WILL_REOPEN", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.OPEN));
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append((CharSequence) " · ");
                Context context3 = this.b;
                spannableStringBuilder.append((CharSequence) context3.getString(R.string.CLOSING_TIME, b2.k(context3)));
                spannableStringBuilder.append((CharSequence) " · ");
                Context context4 = this.b;
                spannableStringBuilder.append((CharSequence) context4.getString(R.string.REOPENING_TIME, c.l(context4)));
                break;
            case 4:
                if (b2 == null || c == null) {
                    bvoo.h("missing params for CLOSING_SOON_WILL_REOPEN", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.CLOSES_SOON));
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.e), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append((CharSequence) " · ");
                spannableStringBuilder.append(b2.k(this.b));
                spannableStringBuilder.append((CharSequence) " · ");
                Context context5 = this.b;
                spannableStringBuilder.append((CharSequence) context5.getString(R.string.REOPENING_TIME, c.l(context5)));
                break;
            case 5:
                if (b2 == null) {
                    bvoo.h("missing params for CLOSING_SOON_LAST_INTERVAL", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.CLOSES_SOON));
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.e), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append((CharSequence) " · ");
                spannableStringBuilder.append(b2.k(this.b));
                if (c != null && d != null) {
                    spannableStringBuilder.append((CharSequence) " · ");
                    Context context6 = this.b;
                    spannableStringBuilder.append((CharSequence) context6.getString(R.string.OPENING_TIME_WITH_DAY, c.l(context6), this.b.getString(d.i)));
                    break;
                }
                break;
            case 7:
                if (c == null) {
                    bvoo.h("missing params for CLOSED_NOW_WILL_REOPEN", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.CLOSED));
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append((CharSequence) " · ");
                Context context7 = this.b;
                spannableStringBuilder.append((CharSequence) context7.getString(R.string.OPENING_TIME, c.l(context7)));
                break;
            case 8:
                if (c == null) {
                    bvoo.h("missing params for OPENS_SOON", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.OPENS_SOON));
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.e), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append((CharSequence) " · ");
                spannableStringBuilder.append(c.l(this.b));
                break;
            case 9:
                if (c == null || d == null) {
                    bvoo.h("missing params for OPENS_SOON_NEXT_DAY", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.OPENS_SOON));
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.e), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append((CharSequence) " · ");
                Context context8 = this.b;
                spannableStringBuilder.append((CharSequence) context8.getString(R.string.TIME_AND_DAY, c.l(context8), this.b.getString(d.i)));
                break;
            case 10:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.OPEN_24_HOURS));
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 0);
                break;
            case 11:
                if (b2 == null || d == null) {
                    bvoo.h("missing params for OPEN_NOW_CLOSES_NEXT_DAY", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.OPEN));
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append((CharSequence) " · ");
                Context context9 = this.b;
                spannableStringBuilder.append((CharSequence) context9.getString(R.string.CLOSING_TIME_WITH_DAY, b2.k(context9), this.b.getString(d.i)));
                break;
            case 12:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.PLACE_HOURS_UNKNOWN));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.e), 0, spannableStringBuilder.length(), 0);
                break;
            case 13:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.PLACE_OPEN_NOW_HOURS_UNKNOWN));
                break;
            case 14:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.PLACE_CLOSED_NOW_HOURS_UNKNOWN));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d), 0, spannableStringBuilder.length(), 0);
                break;
            case 16:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.PLACE_TEMPORARILY_CLOSED));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d), 0, spannableStringBuilder.length(), 0);
                break;
        }
        return new SpannableString(spannableStringBuilder);
    }
}
