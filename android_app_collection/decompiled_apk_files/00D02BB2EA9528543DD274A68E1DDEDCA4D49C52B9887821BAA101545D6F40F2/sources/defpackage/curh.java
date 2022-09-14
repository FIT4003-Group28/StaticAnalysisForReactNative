package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
import com.google.android.material.button.MaterialButton;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: curh  reason: default package */
/* loaded from: classes5.dex */
public final class curh extends FrameLayout {
    public static final int[][] a = {new int[]{16842910}, new int[]{-16842910}};
    public final MaterialButton b;
    public boolean c;

    public curh(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || !this.c) {
            return;
        }
        layoutParams.width = -1;
        setLayoutParams(layoutParams);
    }

    public curh(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public curh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.rich_card_button, this);
        this.b = (MaterialButton) findViewById(R.id.button);
        od.t(this, amb.a(Locale.getDefault()));
    }
}
