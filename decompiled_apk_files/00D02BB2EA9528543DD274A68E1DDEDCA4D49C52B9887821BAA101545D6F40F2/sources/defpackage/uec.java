package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: uec  reason: default package */
/* loaded from: classes7.dex */
public final class uec extends LinearLayout {
    private Boolean a;
    private Boolean b;
    private Boolean c;
    private cqrp d;
    private Boolean e;
    private int f;

    public uec(Context context) {
        this(context, null);
    }

    public final void a() {
        this.e = true;
    }

    public final void b(int i) {
        this.f = i;
    }

    public final void c() {
        this.e = false;
        this.f = -1;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        TextView textView = (TextView) findViewById(R.id.precedence_aware_notice_list_item_text);
        TextView textView2 = (TextView) findViewById(R.id.precedence_aware_notice_list_item_bullet);
        textView2.setText(true != this.a.booleanValue() ? "" : "  •  ");
        if (this.a.booleanValue()) {
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        if (!this.e.booleanValue() || !this.b.booleanValue()) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (!this.c.booleanValue() || this.f < 0) {
            return;
        }
        int measuredWidth2 = this.f - (measuredWidth - textView.getMeasuredWidth());
        if (measuredWidth2 < this.d.e(getContext())) {
            return;
        }
        textView.setMaxWidth(measuredWidth2);
        super.onMeasure(i, i2);
    }

    public void setAllowTextDropped(Boolean bool) {
        this.b = bool;
    }

    public void setAllowTextTruncation(Boolean bool) {
        this.c = bool;
    }

    public void setMinTextWidth(cqrp cqrpVar) {
        this.d = cqrpVar;
    }

    public void setNeedPrecedingInterpunct(Boolean bool) {
        this.a = bool;
    }

    public uec(Context context, @dzsi AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public uec(Context context, @dzsi AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
        this.b = false;
        this.c = false;
        this.d = cqrp.d(dcyn.a);
        this.e = false;
        this.f = -1;
    }
}
