package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akas  reason: default package */
/* loaded from: classes.dex */
public abstract class akas extends vew {
    @Override // defpackage.vew, defpackage.dh, defpackage.dp
    public void mS() {
        int i;
        int i2;
        super.mS();
        Window window = this.d.getWindow();
        Context rb = rb();
        TypedArray obtainStyledAttributes = rb.getTheme().obtainStyledAttributes(new int[]{16843499});
        int dimension = (int) obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
        int l = zew.l(rb);
        if (zew.x(rb)) {
            i2 = dimension * 4;
        } else if (!zew.y(rb)) {
            i = -1;
            window.setLayout(i, -2);
            this.d.getWindow().setBackgroundDrawable(new ColorDrawable(zhn.d(rb(), R.attr.ytBrandBackgroundSolid)));
        } else {
            i2 = dimension + dimension;
        }
        i = l - i2;
        window.setLayout(i, -2);
        this.d.getWindow().setBackgroundDrawable(new ColorDrawable(zhn.d(rb(), R.attr.ytBrandBackgroundSolid)));
    }
}
