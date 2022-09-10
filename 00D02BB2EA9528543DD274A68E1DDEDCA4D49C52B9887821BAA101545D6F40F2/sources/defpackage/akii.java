package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
/* compiled from: PG */
/* renamed from: akii  reason: default package */
/* loaded from: classes2.dex */
public final class akii extends WebImageView {
    private static final cqkv i = new akih();
    private dqiz j;

    public akii(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = dqiz.UNKNOWN_SCALE_TYPE;
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> q(cqmp<T>... cqmpVarArr) {
        return new cqmh(akii.class, cqmpVarArr);
    }

    public static <T extends cqkp> cqnf<T> r(cqjb<T, dqiz> cqjbVar) {
        return cqjv.e(cqfe.SCALE_TYPE, cqjbVar, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ckqg, android.widget.ImageView, android.view.View
    public final void onMeasure(int i2, int i3) {
        Drawable drawable = getDrawable();
        if (drawable == null || this.j != dqiz.FIT_WIDTH) {
            if (drawable == null || this.j != dqiz.FIT_HEIGHT) {
                super.onMeasure(i2, i3);
                return;
            }
            int size = View.MeasureSpec.getSize(i3);
            setMeasuredDimension((drawable.getIntrinsicWidth() * size) / drawable.getIntrinsicHeight(), size);
            return;
        }
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size2, (drawable.getIntrinsicHeight() * size2) / drawable.getIntrinsicWidth());
    }

    public void setScaleType(dqiz dqizVar) {
        this.j = dqizVar;
        super.setScaleType(dqizVar == dqiz.SCALE ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
    }
}
