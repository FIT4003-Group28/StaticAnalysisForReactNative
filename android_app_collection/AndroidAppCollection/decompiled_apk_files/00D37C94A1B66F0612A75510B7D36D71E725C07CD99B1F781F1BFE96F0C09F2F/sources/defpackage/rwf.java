package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;
/* compiled from: PG */
@Deprecated
/* renamed from: rwf  reason: default package */
/* loaded from: classes4.dex */
public final class rwf extends rvy {
    private final rwi c;

    private rwf() {
        throw new IllegalStateException("Default constructor called");
    }

    @Override // defpackage.rvy
    public final SparseArray a(rwa rwaVar) {
        Barcode[] barcodeArr;
        FrameMetadataParcel frameMetadataParcel = new FrameMetadataParcel();
        rvz rvzVar = rwaVar.a;
        frameMetadataParcel.a = rvzVar.a;
        frameMetadataParcel.b = rvzVar.b;
        frameMetadataParcel.e = rvzVar.e;
        frameMetadataParcel.c = rvzVar.c;
        frameMetadataParcel.d = rvzVar.d;
        ByteBuffer byteBuffer = rwaVar.b;
        rwi rwiVar = this.c;
        qnm.b(byteBuffer);
        if (!rwiVar.b()) {
            barcodeArr = new Barcode[0];
        } else {
            try {
                rad a = rac.a(byteBuffer);
                Object a2 = rwiVar.a();
                qnm.b(a2);
                Parcel pv = ((dvc) a2).pv();
                dve.i(pv, a);
                dve.g(pv, frameMetadataParcel);
                Parcel pw = ((dvc) a2).pw(1, pv);
                Barcode[] barcodeArr2 = (Barcode[]) pw.createTypedArray(Barcode.CREATOR);
                pw.recycle();
                barcodeArr = barcodeArr2;
            } catch (RemoteException e) {
                Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
                barcodeArr = new Barcode[0];
            }
        }
        SparseArray sparseArray = new SparseArray(barcodeArr.length);
        for (Barcode barcode : barcodeArr) {
            sparseArray.append(barcode.b.hashCode(), barcode);
        }
        return sparseArray;
    }

    @Override // defpackage.rvy
    public final void b() {
        synchronized (this.a) {
            rwc rwcVar = this.b;
            if (rwcVar != null) {
                rwcVar.a();
                this.b = null;
            }
        }
        rwi rwiVar = this.c;
        synchronized (rwiVar.a) {
            if (rwiVar.c == null) {
                return;
            }
            try {
                if (rwiVar.b()) {
                    Object a = rwiVar.a();
                    qnm.b(a);
                    ((dvc) a).px(3, ((dvc) a).pv());
                }
            } catch (RemoteException e) {
                Log.e(rwiVar.b, "Could not finalize native handle", e);
            }
        }
    }

    @Override // defpackage.rvy
    public final boolean c() {
        return this.c.b();
    }

    public rwf(rwi rwiVar) {
        this.c = rwiVar;
    }
}
