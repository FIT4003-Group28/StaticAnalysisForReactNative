package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bydu  reason: default package */
/* loaded from: classes4.dex */
public final class bydu implements bydq {
    private final Context a;
    private final cqat b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    public bydu(Context context, cqat cqatVar, bydm bydmVar) {
        this.a = context;
        this.b = cqatVar;
        this.c = bydmVar.a();
        this.d = bydmVar.b();
        this.e = bydmVar.c();
        this.f = bydmVar.d();
    }

    @Override // defpackage.bydq
    public final CharSequence a(byee byeeVar) {
        byed b = byeeVar.b(this.b);
        if (b == null || b.a() == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        byeb byebVar = byeb.PERMANENTLY_CLOSED;
        switch (b.a().ordinal()) {
            case 0:
                spannableStringBuilder.append((CharSequence) this.a.getString(R.string.PLACE_PERMANENTLY_CLOSED));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.c), 0, spannableStringBuilder.length(), 0);
                break;
            case 1:
            case 6:
            case 7:
            case 14:
                spannableStringBuilder.append((CharSequence) this.a.getString(R.string.CLOSED));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.c), 0, spannableStringBuilder.length(), 0);
                String valueOf = String.valueOf(this.a.getString(R.string.HOLIDAY_HOURS_MAY_VARY));
                spannableStringBuilder.append((CharSequence) (valueOf.length() != 0 ? " · ".concat(valueOf) : new String(" · ")));
                break;
            case 2:
            case 3:
            case 10:
            case 11:
            case 13:
                spannableStringBuilder.append((CharSequence) this.a.getString(R.string.OPEN));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.e), 0, spannableStringBuilder.length(), 0);
                String valueOf2 = String.valueOf(this.a.getString(R.string.HOLIDAY_HOURS_MAY_VARY));
                spannableStringBuilder.append((CharSequence) (valueOf2.length() != 0 ? " · ".concat(valueOf2) : new String(" · ")));
                break;
            case 4:
            case 5:
                spannableStringBuilder.append((CharSequence) this.a.getString(R.string.CLOSES_SOON));
                spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif-medium"), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d), 0, spannableStringBuilder.length(), 0);
                String valueOf3 = String.valueOf(this.a.getString(R.string.HOLIDAY_HOURS_MAY_VARY));
                spannableStringBuilder.append((CharSequence) (valueOf3.length() != 0 ? " · ".concat(valueOf3) : new String(" · ")));
                break;
            case 8:
            case 9:
                spannableStringBuilder.append((CharSequence) this.a.getString(R.string.OPENS_SOON));
                spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif-medium"), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d), 0, spannableStringBuilder.length(), 0);
                String valueOf4 = String.valueOf(this.a.getString(R.string.HOLIDAY_HOURS_MAY_VARY));
                spannableStringBuilder.append((CharSequence) (valueOf4.length() != 0 ? " · ".concat(valueOf4) : new String(" · ")));
                break;
            case 12:
                spannableStringBuilder.append((CharSequence) this.a.getString(R.string.PLACE_HOURS_UNKNOWN));
                spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif-medium"), 0, spannableStringBuilder.length(), 0);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.d), 0, spannableStringBuilder.length(), 0);
                break;
            case 15:
                dbsg<String> dbsgVar = byeeVar.a;
                if (dbsgVar.a()) {
                    spannableStringBuilder.append((CharSequence) dbsgVar.b());
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f), 0, spannableStringBuilder.length(), 0);
                    break;
                }
                break;
            case 16:
                spannableStringBuilder.append((CharSequence) this.a.getString(R.string.PLACE_TEMPORARILY_CLOSED));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.c), 0, spannableStringBuilder.length(), 0);
                break;
            default:
                return "";
        }
        return new SpannableString(spannableStringBuilder);
    }
}
