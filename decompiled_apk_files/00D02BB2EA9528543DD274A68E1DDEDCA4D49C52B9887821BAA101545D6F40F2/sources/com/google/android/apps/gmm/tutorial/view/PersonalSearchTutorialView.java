package com.google.android.apps.gmm.tutorial.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PersonalSearchTutorialView extends bzoq {
    public PersonalSearchTutorialView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bzoo, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b(R.id.tutorial_personal_search_got_it);
        View findViewById = this.a.findViewById(R.id.tutorial_personal_search_cancel_it);
        if (findViewById != null) {
            cjqg.h(findViewById, bzoo.c());
            this.c.c(findViewById);
            findViewById.setOnClickListener(new bzom(this));
        }
    }

    public PersonalSearchTutorialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PersonalSearchTutorialView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
