package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: awni  reason: default package */
/* loaded from: classes3.dex */
public final class awni extends View {
    public final awnh a;

    public awni(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        awnh awnhVar = new awnh();
        this.a = awnhVar;
        ShapeDrawable shapeDrawable = new ShapeDrawable(awnhVar);
        shapeDrawable.getPaint().setColor(getResources().getColor(R.color.primary_grey));
        shapeDrawable.getPaint().setAlpha(127);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        setBackground(shapeDrawable);
    }
}
