package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
/* compiled from: PG */
/* renamed from: axx  reason: default package */
/* loaded from: classes3.dex */
final class axx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> ObjectAnimator a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
