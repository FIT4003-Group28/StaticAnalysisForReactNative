package defpackage;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: czup  reason: default package */
/* loaded from: classes5.dex */
public final class czup extends Property<ImageView, Matrix> {
    private final Matrix a;

    public czup() {
        super(Matrix.class, "imageMatrixProperty");
        this.a = new Matrix();
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
        this.a.set(imageView.getImageMatrix());
        return this.a;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
