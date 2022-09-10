package defpackage;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
/* compiled from: PG */
/* renamed from: ntm  reason: default package */
/* loaded from: classes7.dex */
public final class ntm extends LinearLayout {
    public ntm(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        ntl ntlVar = null;
        ntj ntjVar = null;
        ntk ntkVar = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof ntl) {
                ntlVar = (ntl) childAt;
            }
            if (childAt instanceof ntj) {
                ntjVar = (ntj) childAt;
            }
            if (childAt instanceof ntk) {
                ntkVar = (ntk) childAt;
            }
        }
        if (ntlVar == null || ntjVar == null || ntkVar == null) {
            super.onMeasure(i, i2);
            return;
        }
        ((LinearLayout.LayoutParams) ntlVar.getLayoutParams()).width = 0;
        ((LinearLayout.LayoutParams) ntlVar.getLayoutParams()).weight = 1.0f;
        ((LinearLayout.LayoutParams) ntjVar.getLayoutParams()).weight = 0.0f;
        ntkVar.setVisibility(0);
        ntjVar.setVisibility(0);
        super.onMeasure(i, i2);
        if (Layout.getDesiredWidth(ntlVar.getText(), ntlVar.getPaint()) + Layout.getDesiredWidth(ntjVar.getText(), ntjVar.getPaint()) <= ntlVar.getMeasuredWidth() + ntjVar.getMeasuredWidth()) {
            ((LinearLayout.LayoutParams) ntlVar.getLayoutParams()).width = -2;
            ((LinearLayout.LayoutParams) ntlVar.getLayoutParams()).weight = 0.0f;
            ((LinearLayout.LayoutParams) ntjVar.getLayoutParams()).weight = 1.0f;
            ntkVar.setVisibility(0);
            ntjVar.setVisibility(0);
        } else {
            ((LinearLayout.LayoutParams) ntlVar.getLayoutParams()).width = 0;
            ((LinearLayout.LayoutParams) ntlVar.getLayoutParams()).weight = 1.0f;
            ((LinearLayout.LayoutParams) ntjVar.getLayoutParams()).weight = 0.0f;
            ntjVar.setVisibility(8);
            ntkVar.setVisibility(8);
        }
        super.onMeasure(i, i2);
    }

    public ntm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ntm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
