package defpackage;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: zud  reason: default package */
/* loaded from: classes7.dex */
public final class zud extends LinearLayout {
    public static final int a = cqir.a();
    public static final int b = cqir.a();
    @dzsi
    private CharSequence c;
    private Boolean d;

    public zud(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
    }

    public static <T extends cqkp> cqnf<T> a(cqlc<T, Boolean> cqlcVar) {
        return cqjv.g(ztg.NEED_PRECEDING_BULLET, cqlcVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> b(cqlc<T, CharSequence> cqlcVar) {
        return cqjv.g(ztg.BADGE_TEXT, cqlcVar, zth.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int lineCount;
        TextView textView = (TextView) findViewById(a);
        TextView textView2 = (TextView) findViewById(b);
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            textView.setText(charSequence);
            textView2.setText(true != this.d.booleanValue() ? "" : "  •  ");
            textView.setVisibility(0);
            textView2.setVisibility(0);
        }
        super.onMeasure(i, i2);
        if (textView.length() == 0) {
            textView2.setVisibility(8);
            return;
        }
        Layout layout = textView.getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        textView.setVisibility(8);
        textView2.setVisibility(8);
        super.onMeasure(i, i2);
    }

    public void setBadgeText(@dzsi CharSequence charSequence) {
        this.c = charSequence;
        ((TextView) findViewById(a)).setText(charSequence);
    }

    public void setNeedPrecedingBullet(Boolean bool) {
        this.d = bool;
    }
}
