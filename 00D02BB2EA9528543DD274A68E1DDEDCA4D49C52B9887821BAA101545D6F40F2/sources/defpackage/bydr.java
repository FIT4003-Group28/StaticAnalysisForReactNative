package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bydr  reason: default package */
/* loaded from: classes4.dex */
public final class bydr implements bydq {
    private static final dcqe a = dcqe.c("bydr");
    private final Context b;
    private final cqat c;
    private final bydm d;

    public bydr(Context context, cqat cqatVar, bydm bydmVar) {
        this.b = context;
        this.c = cqatVar;
        this.d = bydmVar;
    }

    private final void b(SpannableStringBuilder spannableStringBuilder) {
        Object typefaceSpan;
        if (this.d.e()) {
            typefaceSpan = new StyleSpan(1);
        } else {
            typefaceSpan = new TypefaceSpan("sans-serif-medium");
        }
        spannableStringBuilder.setSpan(typefaceSpan, 0, spannableStringBuilder.length(), 0);
    }

    private final void c(SpannableStringBuilder spannableStringBuilder) {
        if (this.d.c() != 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d.c()), 0, spannableStringBuilder.length(), 0);
        }
    }

    @Override // defpackage.bydq
    public final CharSequence a(byee byeeVar) {
        if (this.b == null) {
            bvoo.h("Context is null", new Object[0]);
            return "";
        }
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
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d.a()), 0, spannableStringBuilder.length(), 0);
                break;
            case 1:
            case 6:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.CLOSED));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d.a()), 0, spannableStringBuilder.length(), 0);
                if (c != null && d != null) {
                    spannableStringBuilder.append(" · ");
                    Context context = this.b;
                    spannableStringBuilder.append((CharSequence) context.getString(R.string.OPENING_TIME_WITH_DAY, c.l(context), this.b.getString(d.i)));
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
                c(spannableStringBuilder);
                spannableStringBuilder.append(" · ");
                Context context2 = this.b;
                spannableStringBuilder.append((CharSequence) context2.getString(R.string.CLOSING_TIME, b2.k(context2)));
                break;
            case 4:
            case 5:
                if (b2 == null) {
                    bvoo.h("missing params for CLOSING_SOON_LAST_INTERVAL", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.CLOSES_SOON));
                b(spannableStringBuilder);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d.b()), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append(" · ");
                spannableStringBuilder.append(b2.k(this.b));
                break;
            case 7:
                if (c == null) {
                    bvoo.h("missing params for CLOSED_NOW_WILL_REOPEN", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.CLOSED));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d.a()), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append(" · ");
                Context context3 = this.b;
                spannableStringBuilder.append((CharSequence) context3.getString(R.string.OPENING_TIME, c.l(context3)));
                break;
            case 8:
                if (c == null) {
                    bvoo.h("missing params for OPENS_SOON", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.OPENS_SOON));
                b(spannableStringBuilder);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d.b()), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append(" · ");
                spannableStringBuilder.append(c.l(this.b));
                break;
            case 9:
                if (c == null || d == null) {
                    bvoo.h("missing params for OPENS_SOON_NEXT_DAY", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.OPENS_SOON));
                b(spannableStringBuilder);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d.b()), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append(" · ");
                Context context4 = this.b;
                spannableStringBuilder.append((CharSequence) context4.getString(R.string.TIME_AND_DAY, c.l(context4), this.b.getString(d.i)));
                break;
            case 10:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.OPEN_24_HOURS));
                c(spannableStringBuilder);
                break;
            case 11:
                if (b2 == null || d == null) {
                    bvoo.h("missing params for OPEN_NOW_CLOSES_NEXT_DAY", new Object[0]);
                    return "";
                }
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.OPEN));
                c(spannableStringBuilder);
                spannableStringBuilder.append(" · ");
                Context context5 = this.b;
                spannableStringBuilder.append((CharSequence) context5.getString(R.string.CLOSING_TIME_WITH_DAY, b2.k(context5), this.b.getString(d.i)));
                break;
            case 12:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.PLACE_HOURS_UNKNOWN));
                b(spannableStringBuilder);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d.b()), 0, spannableStringBuilder.length(), 0);
                break;
            case 13:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.PLACE_OPEN_NOW_HOURS_UNKNOWN));
                c(spannableStringBuilder);
                break;
            case 14:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.PLACE_CLOSED_NOW_HOURS_UNKNOWN));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d.a()), 0, spannableStringBuilder.length(), 0);
                break;
            case 15:
                dbsg<String> dbsgVar = byeeVar.a;
                if (dbsgVar.a()) {
                    spannableStringBuilder.append((CharSequence) dbsgVar.b());
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d.d()), 0, spannableStringBuilder.length(), 0);
                    break;
                }
                break;
            case 16:
                spannableStringBuilder.append((CharSequence) this.b.getString(R.string.PLACE_TEMPORARILY_CLOSED));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d.a()), 0, spannableStringBuilder.length(), 0);
                break;
        }
        return new SpannableString(spannableStringBuilder);
    }
}
