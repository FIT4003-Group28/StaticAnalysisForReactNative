package a.r;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
/* loaded from: classes.dex */
class q<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    private final Property<T, PointF> f672a;

    /* renamed from: b  reason: collision with root package name */
    private final PathMeasure f673b;

    /* renamed from: c  reason: collision with root package name */
    private final float f674c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f675d;

    /* renamed from: e  reason: collision with root package name */
    private final PointF f676e;

    /* renamed from: f  reason: collision with root package name */
    private float f677f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f675d = new float[2];
        this.f676e = new PointF();
        this.f672a = property;
        this.f673b = new PathMeasure(path, false);
        this.f674c = this.f673b.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public void set(T t, Float f2) {
        this.f677f = f2.floatValue();
        this.f673b.getPosTan(this.f674c * f2.floatValue(), this.f675d, null);
        PointF pointF = this.f676e;
        float[] fArr = this.f675d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f672a.set(t, pointF);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public Float get(T t) {
        return Float.valueOf(this.f677f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.util.Property
    /* renamed from: get  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Float mo27get(Object obj) {
        return get((q<T>) obj);
    }
}
