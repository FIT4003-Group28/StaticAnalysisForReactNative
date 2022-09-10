package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
import com.google.android.libraries.messaging.lighter.ui.messagecell.MessageCellStatusView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.TimestampHeaderView;
import com.google.android.libraries.messaging.lighter.ui.messagecell.TopLabelView;
/* compiled from: PG */
/* renamed from: curt  reason: default package */
/* loaded from: classes5.dex */
public final class curt extends LinearLayout implements cvdj {
    MessageCellStatusView a;
    TimestampHeaderView b;
    curm c;
    TopLabelView d;
    ctyy e;
    public cuuc f;
    public cuwi g;
    public int h;
    public int i;
    public int j;
    public cuiv k;

    public curt(Context context) {
        this(context, null);
    }

    @Override // defpackage.cuww
    public final void b() {
        this.c.removeAllViews();
    }

    public void setAccountContext(ctyy ctyyVar) {
        this.e = ctyyVar;
    }

    public void setActionHandler(cuuc cuucVar) {
        this.f = cuucVar;
    }

    public void setImpressionLogger(cuwi cuwiVar) {
        this.g = cuwiVar;
    }

    public void setPhotosMessagingController(cuiv cuivVar) {
        this.k = cuivVar;
    }

    @Override // defpackage.cuvv
    public void setPresenter(final cvdi cvdiVar) {
        boolean isClickable = isClickable();
        setOnClickListener(new View.OnClickListener(cvdiVar) { // from class: curs
            private final cvdi a;

            {
                this.a = cvdiVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a();
            }
        });
        setClickable(isClickable);
    }

    public curt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bubbleCellStyle);
    }

    public curt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = cuud.a;
        this.g = cuwi.b;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, curd.a, i, R.style.LighterBubbleCell);
        this.h = obtainStyledAttributes.getResourceId(2, R.style.UndefinedLabelText);
        this.i = obtainStyledAttributes.getResourceId(1, R.style.DefaultLabelText);
        this.j = obtainStyledAttributes.getResourceId(0, R.style.BotLabelText);
        obtainStyledAttributes.recycle();
        inflate(getContext(), R.layout.richcard_layout, this);
        this.a = (MessageCellStatusView) findViewById(R.id.bubble_cell_status_view);
        this.b = (TimestampHeaderView) findViewById(R.id.bubble_cell_tombstone_view);
        this.d = (TopLabelView) findViewById(R.id.top_label_layout);
        this.c = (curm) findViewById(R.id.rich_card_content);
        this.a.setPadding(getContext().getResources().getDimensionPixelSize(R.dimen.label_padding_start), this.a.getPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.label_padding_start), this.a.getPaddingBottom());
        setOrientation(1);
    }
}
