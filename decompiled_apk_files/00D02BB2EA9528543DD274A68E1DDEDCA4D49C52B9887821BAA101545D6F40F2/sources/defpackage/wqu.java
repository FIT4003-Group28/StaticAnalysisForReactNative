package defpackage;

import android.app.Application;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TypefaceSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wqu  reason: default package */
/* loaded from: classes7.dex */
public class wqu implements wpq {
    private final CharSequence a;

    public wqu(Application application, zsf zsfVar, @dzsi Integer num) {
        Spanned f = num != null ? bvtb.f(application.getResources(), num.intValue(), bvsz.ABBREVIATED, new bvsw()) : null;
        String f2 = zsfVar.f();
        jhk p = zsfVar.p();
        String str = "";
        Spannable spannable = str;
        if (f2 != null) {
            SpannableString spannableString = new SpannableString(f2);
            spannableString.setSpan(new TypefaceSpan("sans-serif-medium"), 0, spannableString.length(), 33);
            bvsx bvsxVar = new bvsx(application.getResources());
            ztf ztfVar = new ztf();
            ztfVar.b(p);
            Drawable drawable = ztfVar.b;
            drawable = drawable == null ? new ColorDrawable(0) : drawable;
            if (p != null && p.c.a()) {
                str = p.c.b();
                dbsk.s(str);
            }
            if (f != null) {
                bvsu c = bvsxVar.c(R.string.TRANSIT_COMMUTE_BOARD_DEPARTURE_FIRST_TRANSFER);
                c.a(f, bvsx.j(drawable, 1.0f, str), bvsxVar.a(spannableString));
                spannable = c.c();
            } else {
                bvsu c2 = bvsxVar.c(R.string.TRANSIT_COMMUTE_BOARD_DEPARTURE_FIRST_TRANSFER_UNKNOWN_DURATION);
                c2.a(bvsx.j(drawable, 1.0f, str), bvsxVar.a(spannableString));
                spannable = c2.c();
            }
        }
        this.a = spannable;
    }

    @Override // defpackage.wpq
    public CharSequence a() {
        return this.a;
    }
}
