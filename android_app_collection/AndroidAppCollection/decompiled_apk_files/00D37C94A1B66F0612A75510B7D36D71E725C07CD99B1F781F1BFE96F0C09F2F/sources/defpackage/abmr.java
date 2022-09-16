package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ScaleXSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: abmr  reason: default package */
/* loaded from: classes.dex */
public final class abmr implements ajru {
    private static Locale e;
    private static DateFormat f;
    protected final Context a;
    protected final aafo b;
    protected final View c;
    protected final TextView d;
    private final SpannableStringBuilder g;
    private final StringBuilder h;
    private final float i;

    public abmr(Context context, aafo aafoVar) {
        this.a = context;
        this.b = aafoVar;
        View inflate = View.inflate(context, R.layout.live_chat_light_moderation_item, null);
        this.c = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.chat_message);
        this.d = textView;
        this.g = new SpannableStringBuilder();
        this.h = new StringBuilder();
        this.i = context.getResources().getDimensionPixelSize(R.dimen.live_chat_message_spacing) / textView.getPaint().measureText(" ");
    }

    private final String d(long j) {
        Locale locale = Locale.getDefault();
        if (!locale.equals(e)) {
            f = android.text.format.DateFormat.getTimeFormat(this.a);
            e = locale;
        }
        return f.format(new Date(j));
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, int i, Object obj) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(obj, length - i, length, 33);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        asrc asrcVar = (asrc) obj;
        boolean e2 = zdg.e(this.a);
        long millis = TimeUnit.MICROSECONDS.toMillis(asrcVar.e);
        if (millis != 0) {
            SpannableStringBuilder spannableStringBuilder = this.g;
            String d = d(millis);
            spannableStringBuilder.append((CharSequence) d);
            e(spannableStringBuilder, d.length(), new TextAppearanceSpan(this.a, R.style.live_chat_message_time));
            SpannableStringBuilder spannableStringBuilder2 = this.g;
            spannableStringBuilder2.append((CharSequence) " ");
            e(spannableStringBuilder2, 1, new ScaleXSpan(this.i));
            if (e2) {
                this.h.append(d(millis));
                this.h.append(" ");
            }
        }
        if ((asrcVar.b & 1) != 0) {
            aragVar = asrcVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned a = aafv.a(aragVar, this.b, false);
        this.g.append((CharSequence) a);
        if (e2) {
            this.h.append((CharSequence) a);
        }
        zag.m(this.d, this.g);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.g.clear();
        this.h.setLength(0);
    }
}
