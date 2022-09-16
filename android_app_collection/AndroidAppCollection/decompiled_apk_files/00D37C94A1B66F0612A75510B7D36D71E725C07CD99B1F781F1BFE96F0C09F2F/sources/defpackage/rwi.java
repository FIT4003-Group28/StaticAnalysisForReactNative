package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;
/* compiled from: PG */
/* renamed from: rwi  reason: default package */
/* loaded from: classes4.dex */
public final class rwi {
    public Object c;
    private final Context d;
    private final BarcodeDetectorOptions i;
    public final Object a = new Object();
    private boolean g = false;
    private boolean h = false;
    public final String b = "BarcodeNativeHandle";
    private final String e = "com.google.android.gms.vision.dynamite.barcode";
    private final String f = "barcode";

    public rwi(Context context, BarcodeDetectorOptions barcodeDetectorOptions) {
        this.d = context;
        this.i = barcodeDetectorOptions;
        a();
    }

    public final Object a() {
        ras rasVar;
        rwh rwhVar;
        synchronized (this.a) {
            Object obj = this.c;
            if (obj != null) {
                return obj;
            }
            rwg rwgVar = null;
            try {
                rasVar = ras.e(this.d, ras.c, this.e);
            } catch (rao unused) {
                String format = String.format("%s.%s", "com.google.android.gms.vision", this.f);
                try {
                    rasVar = ras.e(this.d, ras.a, format);
                } catch (rao e) {
                    Object[] objArr = {format};
                    if (Log.isLoggable("Vision", 6)) {
                        String format2 = String.format("Error loading optional module %s", objArr);
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(format2).length() + 2 + String.valueOf(valueOf).length());
                        sb.append(format2);
                        sb.append(": ");
                        sb.append(valueOf);
                        Log.e("Vision", sb.toString());
                    }
                    if (!this.g) {
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", "barcode");
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.d.sendBroadcast(intent);
                        this.g = true;
                    }
                    rasVar = null;
                }
            }
            if (rasVar != null) {
                try {
                    Context context = this.d;
                    IBinder d = rasVar.d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                    if (d == null) {
                        rwhVar = null;
                    } else {
                        IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                        if (queryLocalInterface instanceof rwh) {
                            rwhVar = (rwh) queryLocalInterface;
                        } else {
                            rwhVar = new rwh(d);
                        }
                    }
                    if (rwhVar != null) {
                        rad a = rac.a(context);
                        BarcodeDetectorOptions barcodeDetectorOptions = this.i;
                        Parcel pv = rwhVar.pv();
                        dve.i(pv, a);
                        dve.g(pv, barcodeDetectorOptions);
                        Parcel pw = rwhVar.pw(1, pv);
                        IBinder readStrongBinder = pw.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                            if (queryLocalInterface2 instanceof rwg) {
                                rwgVar = (rwg) queryLocalInterface2;
                            } else {
                                rwgVar = new rwg(readStrongBinder);
                            }
                        }
                        pw.recycle();
                    }
                    this.c = rwgVar;
                } catch (RemoteException | rao e2) {
                    Log.e(this.b, "Error creating remote native handle", e2);
                }
            }
            if (!this.h) {
                if (this.c == null) {
                    Log.w(this.b, "Native handle not yet available. Reverting to no-op handle.");
                    this.h = true;
                }
            } else if (this.c != null) {
                Log.w(this.b, "Native handle is now available.");
            }
            return this.c;
        }
    }

    public final boolean b() {
        return a() != null;
    }
}
