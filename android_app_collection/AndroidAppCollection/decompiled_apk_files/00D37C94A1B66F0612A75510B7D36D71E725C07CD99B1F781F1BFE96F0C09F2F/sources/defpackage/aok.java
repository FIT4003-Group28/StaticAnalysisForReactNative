package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: aok  reason: default package */
/* loaded from: classes.dex */
public final class aok extends ib {
    public final aoi a;
    private final TextView b;

    public aok(TextView textView) {
        this.b = textView;
        this.a = new aoi(textView);
    }

    @Override // defpackage.ib
    public final void h() {
        TransformationMethod transformationMethod = this.b.getTransformationMethod();
        if (transformationMethod == null || (transformationMethod instanceof PasswordTransformationMethod)) {
            return;
        }
        TextView textView = this.b;
        if (!(transformationMethod instanceof aoo)) {
            transformationMethod = new aoo(transformationMethod);
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
