package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.widget.TextView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatTextHelperV17.java */
/* loaded from: classes.dex */
public class q extends p {

    /* renamed from: b  reason: collision with root package name */
    private ak f1007b;

    /* renamed from: c  reason: collision with root package name */
    private ak f1008c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(TextView textView) {
        super(textView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.widget.p
    public void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        Context context = this.f1001a.getContext();
        h a2 = h.a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.AppCompatTextHelper, i, 0);
        if (obtainStyledAttributes.hasValue(a.j.AppCompatTextHelper_android_drawableStart)) {
            this.f1007b = a(context, a2, obtainStyledAttributes.getResourceId(a.j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (obtainStyledAttributes.hasValue(a.j.AppCompatTextHelper_android_drawableEnd)) {
            this.f1008c = a(context, a2, obtainStyledAttributes.getResourceId(a.j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.widget.p
    public void a() {
        super.a();
        if (this.f1007b == null && this.f1008c == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f1001a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1007b);
        a(compoundDrawablesRelative[2], this.f1008c);
    }
}
