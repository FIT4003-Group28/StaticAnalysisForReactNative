package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: apqp  reason: default package */
/* loaded from: classes2.dex */
public enum apqp {
    SHRINK_CONTAINER(1, ImageView.ScaleType.FIT_XY, true, false),
    FILL(1, ImageView.ScaleType.FIT_XY, false, false),
    CROP(2, ImageView.ScaleType.CENTER_CROP, false, true);
    
    public final Integer d;
    public final ImageView.ScaleType e;
    public final Boolean f;
    public final Boolean g;

    apqp(Integer num, ImageView.ScaleType scaleType, Boolean bool, Boolean bool2) {
        this.d = num;
        this.e = scaleType;
        this.f = bool;
        this.g = bool2;
    }
}
