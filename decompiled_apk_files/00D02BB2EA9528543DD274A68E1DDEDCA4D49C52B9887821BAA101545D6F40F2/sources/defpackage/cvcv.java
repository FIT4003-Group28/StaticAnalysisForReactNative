package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.ui.messagecell.MessageCellStatusView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.TimestampHeaderView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.TopLabelView;
/* compiled from: PG */
/* renamed from: cvcv  reason: default package */
/* loaded from: classes5.dex */
public final class cvcv extends FrameLayout implements cvcr {
    public cugu a;
    cvdc b;
    LinearLayout c;
    MessageCellStatusView d;
    TimestampHeaderView e;
    public cuvc f;
    FrameLayout g;
    TopLabelView h;
    int i;
    int j;
    int k;
    private long l;

    public cvcv(Context context) {
        this(context, null);
    }

    @Override // defpackage.cuww
    public final void b() {
        this.d.setLabelTextStyleProvider(dbpy.a);
        this.f.b();
        this.b.b();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            cstd.a();
            this.l = System.currentTimeMillis();
        } else if (action == 1) {
            cstd.a();
            if (System.currentTimeMillis() - this.l < 200) {
                if (this.a.g().equals(cugo.OUTGOING_FAILED_SEND)) {
                    performClick();
                    return true;
                } else if (this.a.f().a() == 2 && !((cvdf) this.g.getChildAt(0)).hasSelection()) {
                    performClick();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(1.0f);
    }

    public <T extends View & cvdc> void setContentView(T t) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_start_end_padding), 0, getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_start_end_padding), 0);
        t.setId(R.id.message_content);
        cvdc cvdcVar = this.b;
        if (cvdcVar != null) {
            this.g.removeView((View) cvdcVar);
        }
        this.b = t;
        this.g.addView(t, layoutParams);
    }

    public void setLabelTextStyleProvider(cuwf cuwfVar) {
        this.d.setLabelTextStyleProvider(dbsg.i(cuwfVar));
    }

    public void setLabelViewVisibility(boolean z) {
        this.d.setVisibility(true != z ? 8 : 0);
    }

    @Override // defpackage.cuvv
    public void setPresenter(final cvcq cvcqVar) {
        setOnClickListener(new View.OnClickListener(cvcqVar) { // from class: cvcu
            private final cvcq a;

            {
                this.a = cvcqVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a();
            }
        });
    }

    public cvcv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bubbleCellStyle);
    }

    public cvcv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.bubble_cell_layout, this);
        setPadding(getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_start_end_padding), getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_top_padding), getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_start_end_padding), 0);
        this.c = (LinearLayout) findViewById(R.id.bubble_cell_wrapper);
        this.f = (cuvc) findViewById(R.id.message_avatar);
        this.d = (MessageCellStatusView) findViewById(R.id.bubble_cell_status_view);
        this.e = (TimestampHeaderView) findViewById(R.id.bubble_cell_tombstone_view);
        this.g = (FrameLayout) findViewById(R.id.message_content_wrapper);
        this.h = (TopLabelView) findViewById(R.id.top_label_layout);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cvcz.b, i, R.style.LighterBubbleCell);
        this.i = obtainStyledAttributes.getResourceId(2, R.style.UndefinedLabelText);
        this.j = obtainStyledAttributes.getResourceId(1, R.style.DefaultLabelText);
        this.k = obtainStyledAttributes.getResourceId(0, R.style.BotLabelText);
        obtainStyledAttributes.recycle();
    }
}
