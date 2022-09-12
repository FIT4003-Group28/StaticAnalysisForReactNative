package com.google.android.libraries.messaging.lighter.ui.lighterwebview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LighterWebViewHeader extends LinearLayout {
    public final ImageView a;
    public final TextView b;
    public final ImageView c;

    public LighterWebViewHeader(Context context) {
        this(context, null);
    }

    public static void a(View view, boolean z) {
        view.setVisibility(true != z ? 8 : 0);
    }

    public void setPresenter(final cvcj cvcjVar) {
        this.c.setOnClickListener(new View.OnClickListener(cvcjVar) { // from class: cvck
            private final cvcj a;

            {
                this.a = cvcjVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.a();
            }
        });
    }

    public LighterWebViewHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LighterWebViewHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.web_view_header, this);
        this.a = (ImageView) findViewById(R.id.web_view_display_icon);
        this.b = (TextView) findViewById(R.id.web_view_title);
        this.c = (ImageView) findViewById(R.id.web_view_dismiss_button);
    }
}
