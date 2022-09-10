package com.google.android.libraries.messaging.lighter.ui.messagecell;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class MessageCellStatusView extends AppCompatTextView {
    public static final long b = TimeUnit.MINUTES.toMillis(1);
    int c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final int j;
    private dbsg<cuwf> k;
    private long l;
    private cugo m;
    private final Runnable n;

    public MessageCellStatusView(Context context) {
        this(context, null);
    }

    private final SpannableString c(String str, String str2) {
        SpannableString spannableString = new SpannableString(getResources().getString(R.string.bullet_point_separated_text, str, str2));
        spannableString.setSpan(new StyleSpan(1), str.length() + 1, str.length() + 2, 256);
        return spannableString;
    }

    public final void a(cvcy cvcyVar) {
        setLabelViewVisibility(cvcyVar.e());
        cugu b2 = cvcyVar.a().b();
        this.l = TimeUnit.MICROSECONDS.toMillis(b2.d().longValue());
        this.m = b2.g();
        b();
    }

    public final void b() {
        if (this.m != null) {
            if (this.k.a()) {
                this.k.b().b();
            } else {
                qf.a(this, this.c);
            }
            CharSequence a = cuvy.a(getContext(), this.l);
            cugo cugoVar = cugo.INVALID;
            switch (this.m.ordinal()) {
                case 1:
                case 2:
                case 3:
                    setText(a);
                    return;
                case 4:
                default:
                    setLabelViewVisibility(false);
                    return;
                case 5:
                    setText("");
                    return;
                case 6:
                    setText(c(this.f, this.h));
                    setTextColor(this.j);
                    return;
                case 7:
                    setText(c(a.toString(), this.d));
                    return;
                case 8:
                    setText(c(a.toString(), this.e));
                    return;
                case 9:
                    setText(c(a.toString(), this.g));
                    return;
                case 10:
                    setText(this.i);
                    setTextColor(this.j);
                    return;
            }
        }
    }

    public void setLabelTextStyleProvider(dbsg<cuwf> dbsgVar) {
        this.k = dbsgVar;
    }

    public void setLabelViewVisibility(boolean z) {
        setVisibility(true != z ? 8 : 0);
    }

    public MessageCellStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bubbleCellStyle);
    }

    public MessageCellStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = dbpy.a;
        cvcw cvcwVar = new cvcw(this);
        this.n = cvcwVar;
        setPadding(getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_status_start_end_padding), getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_top_padding), getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_status_start_end_padding), getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_status_bottom_padding));
        this.d = getContext().getText(R.string.message_sent_success).toString();
        this.f = getContext().getText(R.string.message_sent_failed).toString();
        this.e = getContext().getText(R.string.message_sent_delivered).toString();
        this.g = getContext().getText(R.string.message_sent_read).toString();
        this.h = getContext().getText(R.string.tap_to_retry).toString();
        this.i = getContext().getText(R.string.message_delivery_failed).toString();
        this.j = akm.c(getContext(), R.color.google_red600);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cvcz.c, i, R.style.LighterBubbleCellStatus);
        this.c = obtainStyledAttributes.getResourceId(0, R.style.LabelText);
        obtainStyledAttributes.recycle();
        postDelayed(cvcwVar, b);
    }
}
