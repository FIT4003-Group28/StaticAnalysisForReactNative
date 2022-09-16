package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: qhn  reason: default package */
/* loaded from: classes7.dex */
public class qhn {
    private final bvsl a;

    public qhn(bvsl bvslVar) {
        this.a = bvslVar;
    }

    @dzsi
    public final CharSequence a(@dzsi qhs qhsVar, Context context) {
        if (qhsVar == null) {
            return null;
        }
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) " ").append((CharSequence) context.getString(R.string.BIKESHARING_X_BATTERY, String.format(Locale.getDefault(), "%d%%", Integer.valueOf(qhsVar.b())))).append((CharSequence) " ");
        append.setSpan(new ImageSpan(context, qhsVar.c()), 0, append.length(), 17);
        String i = this.a.i(qhsVar.a());
        return !i.isEmpty() ? append.append((CharSequence) context.getString(R.string.BIKESHARING_BATTERY_DISTANCE_RANGE, i)) : append;
    }
}
