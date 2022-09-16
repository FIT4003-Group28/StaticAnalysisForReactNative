package defpackage;

import android.content.res.Resources;
import android.widget.RadioButton;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aken  reason: default package */
/* loaded from: classes.dex */
public final class aken {
    public final boolean a;

    public aken() {
        this(true);
    }

    public aken(boolean z) {
        this.a = z;
    }

    public final void a(RadioButton radioButton, int i) {
        if (this.a) {
            radioButton.getClass();
            radioButton.setButtonDrawable(zhn.g(radioButton.getContext(), i));
        }
    }

    public final void b(RadioButton radioButton) {
        a(radioButton, R.attr.ytRadioButton);
    }

    public final void c(RadioButton radioButton, int i, int i2) {
        if (this.a) {
            Resources resources = radioButton.getContext().getResources();
            radioButton.setPaddingRelative(resources.getDimensionPixelSize(i), resources.getDimensionPixelSize(i2), radioButton.getPaddingEnd(), resources.getDimensionPixelSize(i2));
        }
    }

    public aken(aacz aaczVar) {
        asxj asxjVar = aaczVar.b().e;
        this.a = (asxjVar == null ? asxj.a : asxjVar).bQ;
    }
}
