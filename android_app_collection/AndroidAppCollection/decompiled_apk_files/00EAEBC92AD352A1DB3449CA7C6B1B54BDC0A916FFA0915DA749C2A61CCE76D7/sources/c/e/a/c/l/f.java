package c.e.a.c.l;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class f extends Property<ImageView, Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f4742a;

    public f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f4742a = new Matrix();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f4742a.set(imageView.getImageMatrix());
        return this.f4742a;
    }

    @Override // android.util.Property
    /* renamed from: a */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
