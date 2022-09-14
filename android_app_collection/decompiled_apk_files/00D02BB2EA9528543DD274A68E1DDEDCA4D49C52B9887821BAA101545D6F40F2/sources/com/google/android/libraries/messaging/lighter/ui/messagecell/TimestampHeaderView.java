package com.google.android.libraries.messaging.lighter.ui.messagecell;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TimestampHeaderView extends FrameLayout {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    public TextView b;
    public long c;
    private final Runnable d;

    public TimestampHeaderView(Context context) {
        this(context, null);
    }

    public final void a(cvcy cvcyVar) {
        this.c = TimeUnit.MICROSECONDS.toMillis(cvcyVar.a().b().d().longValue());
        if (cvcyVar.a().a()) {
            if (cvcyVar.d()) {
                setVisibility(0);
                this.b.setText(cvda.a(this.c, getContext()));
                return;
            }
            setVisibility(8);
        }
    }

    public TimestampHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bubbleCellStyle);
        postDelayed(this.d, a);
    }

    public TimestampHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new cvdb(this);
        inflate(getContext(), R.layout.bubble_cell_tombstone_layout, this);
        this.b = (TextView) findViewById(R.id.timestamp_header);
    }
}
