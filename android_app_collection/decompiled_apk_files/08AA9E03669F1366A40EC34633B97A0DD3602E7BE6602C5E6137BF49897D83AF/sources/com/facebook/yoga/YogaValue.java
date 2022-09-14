package com.facebook.yoga;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class YogaValue {

    /* renamed from: a  reason: collision with root package name */
    static final YogaValue f4284a = new YogaValue(Float.NaN, YogaUnit.UNDEFINED);

    /* renamed from: b  reason: collision with root package name */
    static final YogaValue f4285b = new YogaValue((float) BitmapDescriptorFactory.HUE_RED, YogaUnit.POINT);

    /* renamed from: c  reason: collision with root package name */
    static final YogaValue f4286c = new YogaValue(Float.NaN, YogaUnit.AUTO);

    /* renamed from: d  reason: collision with root package name */
    public final float f4287d;
    public final YogaUnit e;

    public YogaValue(float f, YogaUnit yogaUnit) {
        this.f4287d = f;
        this.e = yogaUnit;
    }

    @com.facebook.k.a.a
    YogaValue(float f, int i) {
        this(f, YogaUnit.a(i));
    }

    public boolean equals(Object obj) {
        if (obj instanceof YogaValue) {
            YogaValue yogaValue = (YogaValue) obj;
            if (this.e == yogaValue.e) {
                return this.e == YogaUnit.UNDEFINED || Float.compare(this.f4287d, yogaValue.f4287d) == 0;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f4287d) + this.e.a();
    }

    public String toString() {
        switch (this.e) {
            case UNDEFINED:
                return "undefined";
            case POINT:
                return Float.toString(this.f4287d);
            case PERCENT:
                return this.f4287d + "%";
            case AUTO:
                return "auto";
            default:
                throw new IllegalStateException();
        }
    }
}
