package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.vision.face.internal.client.ContourParcel;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;
import java.util.HashSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdgz  reason: default package */
/* loaded from: classes4.dex */
public final class cdgz implements cdgw {
    private final dvlj a;
    private final Context b;
    private final ckcw c;

    public cdgz(dvlj dvljVar, Context context, ckcw ckcwVar) {
        this.a = dvljVar;
        this.b = context;
        this.c = ckcwVar;
    }

    @Override // defpackage.cdgw
    public final cdgv a(Bitmap bitmap) {
        ByteBuffer byteBuffer;
        int i;
        cpfj[] cpfjVarArr;
        FaceParcel[] faceParcelArr;
        cpfm[] cpfmVarArr;
        cpfi[] cpfiVarArr;
        int i2;
        dvli dvliVar = this.a.e;
        if (dvliVar == null) {
            dvliVar = dvli.e;
        }
        boolean z = dvliVar.d;
        dvli dvliVar2 = this.a.e;
        if (dvliVar2 == null) {
            dvliVar2 = dvli.e;
        }
        int a = dvlh.a(dvliVar2.c);
        int i3 = (a == 0 || a == 2) ? 1 : 0;
        cpfk cpfkVar = new cpfk(this.b);
        cpfkVar.c = false;
        cpfkVar.d = i3 ^ 1;
        cpfkVar.b = z;
        dvli dvliVar3 = this.a.e;
        if (dvliVar3 == null) {
            dvliVar3 = dvli.e;
        }
        if ((dvliVar3.a & 1) != 0) {
            dvli dvliVar4 = this.a.e;
            if (dvliVar4 == null) {
                dvliVar4 = dvli.e;
            }
            float f = dvliVar4.b;
            if (f < 0.0f || f > 1.0f) {
                StringBuilder sb = new StringBuilder(47);
                sb.append("Invalid proportional face size: ");
                sb.append(f);
                throw new IllegalArgumentException(sb.toString());
            }
            cpfkVar.e = f;
        }
        FaceSettingsParcel faceSettingsParcel = new FaceSettingsParcel();
        faceSettingsParcel.a = cpfkVar.d;
        faceSettingsParcel.b = 0;
        faceSettingsParcel.c = 0;
        faceSettingsParcel.d = cpfkVar.b;
        faceSettingsParcel.e = cpfkVar.c;
        faceSettingsParcel.f = cpfkVar.e;
        cpfl cpflVar = new cpfl(new cpfo(cpfkVar.a, faceSettingsParcel));
        if (cpflVar.b.c()) {
            cpfg cpfgVar = new cpfg();
            cpfe.b(bitmap, cpfgVar);
            cpfg a2 = cpfe.a(cpfgVar);
            Bitmap bitmap2 = a2.b;
            if (bitmap2 != null) {
                int width = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                int i4 = width * height;
                int i5 = ((width + 1) / 2) * ((height + 1) / 2);
                byteBuffer = ByteBuffer.allocateDirect(i5 + i5 + i4);
                int i6 = i4;
                for (int i7 = 0; i7 < i4; i7++) {
                    int i8 = i7 % width;
                    int i9 = i7 / width;
                    int pixel = bitmap2.getPixel(i8, i9);
                    float red = Color.red(pixel);
                    float green = Color.green(pixel);
                    float blue = Color.blue(pixel);
                    byteBuffer.put(i7, (byte) ((0.299f * red) + (0.587f * green) + (0.114f * blue)));
                    if (i9 % 2 == 0 && i8 % 2 == 0) {
                        int i10 = i6 + 1;
                        byteBuffer.put(i6, (byte) (((-0.169f) * red) + ((-0.331f) * green) + (blue * 0.5f) + 128.0f));
                        i6 = i10 + 1;
                        byteBuffer.put(i10, (byte) ((red * 0.5f) + (green * (-0.419f)) + (blue * (-0.081f)) + 128.0f));
                    }
                }
            } else {
                byteBuffer = null;
            }
            synchronized (cpflVar.c) {
                if (cpflVar.d) {
                    cpfo cpfoVar = cpflVar.b;
                    cnwc.a(byteBuffer);
                    FrameMetadataParcel a3 = FrameMetadataParcel.a(a2);
                    if (!cpfoVar.c()) {
                        cpfjVarArr = new cpfj[0];
                    } else {
                        try {
                            coba b = cobb.b(byteBuffer);
                            cpfr e = cpfoVar.e();
                            cnwc.a(e);
                            FaceParcel[] e2 = e.e(b, a3);
                            cpfj[] cpfjVarArr2 = new cpfj[e2.length];
                            int i11 = 0;
                            while (i11 < e2.length) {
                                FaceParcel faceParcel = e2[i11];
                                int i12 = faceParcel.b;
                                new PointF(faceParcel.c, faceParcel.d);
                                float f2 = faceParcel.e;
                                float f3 = faceParcel.f;
                                float f4 = faceParcel.g;
                                float f5 = faceParcel.h;
                                float f6 = faceParcel.i;
                                LandmarkParcel[] landmarkParcelArr = faceParcel.j;
                                if (landmarkParcelArr == null) {
                                    cpfmVarArr = new cpfm[0];
                                    faceParcelArr = e2;
                                } else {
                                    cpfm[] cpfmVarArr2 = new cpfm[landmarkParcelArr.length];
                                    int i13 = 0;
                                    while (i13 < landmarkParcelArr.length) {
                                        LandmarkParcel landmarkParcel = landmarkParcelArr[i13];
                                        FaceParcel[] faceParcelArr2 = e2;
                                        new PointF(landmarkParcel.b, landmarkParcel.c);
                                        int i14 = landmarkParcel.d;
                                        cpfmVarArr2[i13] = new cpfm();
                                        i13++;
                                        e2 = faceParcelArr2;
                                    }
                                    faceParcelArr = e2;
                                    cpfmVarArr = cpfmVarArr2;
                                }
                                ContourParcel[] contourParcelArr = faceParcel.n;
                                if (contourParcelArr == null) {
                                    cpfiVarArr = new cpfi[0];
                                } else {
                                    cpfi[] cpfiVarArr2 = new cpfi[contourParcelArr.length];
                                    for (int i15 = 0; i15 < contourParcelArr.length; i15++) {
                                        ContourParcel contourParcel = contourParcelArr[i15];
                                        PointF[] pointFArr = contourParcel.a;
                                        int i16 = contourParcel.b;
                                        cpfiVarArr2[i15] = new cpfi();
                                    }
                                    cpfiVarArr = cpfiVarArr2;
                                }
                                float f7 = faceParcel.k;
                                float f8 = faceParcel.l;
                                float f9 = faceParcel.m;
                                float f10 = faceParcel.o;
                                cpfjVarArr2[i11] = new cpfj(i12, cpfmVarArr, cpfiVarArr);
                                i11++;
                                e2 = faceParcelArr;
                            }
                            cpfjVarArr = cpfjVarArr2;
                        } catch (RemoteException unused) {
                            i = 0;
                            cpfjVarArr = new cpfj[0];
                        }
                    }
                    i = 0;
                } else {
                    throw new IllegalStateException("Cannot use detector after release()");
                }
            }
            HashSet hashSet = new HashSet();
            SparseArray sparseArray = new SparseArray(cpfjVarArr.length);
            int i17 = 0;
            for (cpfj cpfjVar : cpfjVarArr) {
                int i18 = cpfjVar.a;
                i17 = Math.max(i17, i18);
                if (hashSet.contains(Integer.valueOf(i18))) {
                    i18 = i17 + 1;
                    i17 = i18;
                }
                hashSet.add(Integer.valueOf(i18));
                cpfh cpfhVar = cpflVar.a;
                synchronized (cpfh.a) {
                    i2 = cpfhVar.c.get(i18, -1);
                    if (i2 == -1) {
                        i2 = cpfh.b;
                        cpfh.b++;
                        cpfhVar.c.append(i18, i2);
                        cpfhVar.d.append(i2, i18);
                    }
                }
                sparseArray.append(i2, cpfjVar);
            }
            cpflVar.a();
            sparseArray.size();
            dccx F = dcdc.F();
            while (i < sparseArray.size()) {
                F.g(new cdgy());
                i++;
            }
            return cdgv.c(F.f(), null);
        }
        ((ckcn) this.c.a(ckdz.V)).a();
        return new cdgu().a(bitmap);
    }
}
