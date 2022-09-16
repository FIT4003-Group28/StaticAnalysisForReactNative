package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.label.internal.client.ImageLabelParcel;
import com.google.android.gms.vision.label.internal.client.LabelOptions;
/* compiled from: PG */
/* renamed from: cpfz  reason: default package */
/* loaded from: classes5.dex */
public final class cpfz extends cpfd<cpfx> {
    private final cpgf a;

    static {
        new LabelOptions(-1);
    }

    public cpfz(cpgf cpgfVar) {
        this.a = cpgfVar;
    }

    @Override // defpackage.cpfd
    public final void a() {
        super.a();
        this.a.d();
    }

    public final SparseArray<cpfx> b(cpfg cpfgVar, LabelOptions labelOptions) {
        cpfx[] cpfxVarArr;
        int i;
        Bitmap bitmap = cpfgVar.b;
        FrameMetadataParcel a = FrameMetadataParcel.a(cpfgVar);
        cnwc.a(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (a.e != 0) {
            Matrix matrix = new Matrix();
            int i2 = a.e;
            if (i2 == 0) {
                i = 0;
            } else if (i2 == 1) {
                i = 90;
            } else if (i2 == 2) {
                i = 180;
            } else if (i2 != 3) {
                throw new IllegalArgumentException("Unsupported rotation degree.");
            } else {
                i = 270;
            }
            matrix.postRotate(i);
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        }
        int i3 = a.e;
        if (i3 == 1 || i3 == 3) {
            a.a = height;
            a.b = width;
        }
        cpgf cpgfVar = this.a;
        if (!cpgfVar.c()) {
            cpfxVarArr = new cpfx[0];
        } else {
            try {
                coba b = cobb.b(bitmap);
                cpga e = cpgfVar.e();
                cnwc.a(e);
                ImageLabelParcel[] e2 = e.e(b, labelOptions);
                cpfx[] cpfxVarArr2 = new cpfx[e2.length];
                for (int i4 = 0; i4 != e2.length; i4++) {
                    ImageLabelParcel imageLabelParcel = e2[i4];
                    String str = imageLabelParcel.a;
                    String str2 = imageLabelParcel.b;
                    float f = imageLabelParcel.c;
                    int i5 = imageLabelParcel.d;
                    cpfxVarArr2[i4] = new cpfx(str, f);
                }
                cpfxVarArr = cpfxVarArr2;
            } catch (RemoteException unused) {
                cpfxVarArr = new cpfx[0];
            }
        }
        SparseArray<cpfx> sparseArray = new SparseArray<>(cpfxVarArr.length);
        for (int i6 = 0; i6 < cpfxVarArr.length; i6++) {
            sparseArray.append(i6, cpfxVarArr[i6]);
        }
        return sparseArray;
    }

    public final boolean c() {
        return this.a.c();
    }
}
