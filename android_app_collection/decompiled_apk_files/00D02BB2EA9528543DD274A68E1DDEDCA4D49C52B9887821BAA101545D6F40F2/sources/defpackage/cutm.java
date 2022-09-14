package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import com.google.android.apps.maps.R;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* renamed from: cutm  reason: default package */
/* loaded from: classes5.dex */
public final class cutm extends MaterialButton implements cuww, cuvv {
    public int c;
    public int d;
    public int e;

    public cutm(Context context) {
        this(context, null);
    }

    @Override // defpackage.cuww
    public final void b() {
        setText("");
        setIcon(null);
        setIconTint(null);
    }

    @Override // defpackage.cuvv
    public /* bridge */ /* synthetic */ void setPresenter(Object obj) {
        Void r1 = (Void) obj;
    }

    public void setPresenter(Void r1) {
    }

    public cutm(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipStyle);
    }

    public cutm(Context context, AttributeSet attributeSet, int i) {
        super(new ContextThemeWrapper(context, (int) R.style.LighterSuggestionChipView), attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cutg.a, i, R.style.LighterSuggestionChipView);
        this.c = obtainStyledAttributes.getResourceId(2, R.style.LighterTextAppearance);
        this.d = obtainStyledAttributes.getResourceId(0, R.style.LighterPrimaryTextAppearance);
        this.e = obtainStyledAttributes.getResourceId(1, R.style.LighterSecondaryTextAppearance);
        obtainStyledAttributes.recycle();
    }
}
