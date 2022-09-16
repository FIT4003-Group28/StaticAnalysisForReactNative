package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: rtk  reason: default package */
/* loaded from: classes4.dex */
public final class rtk extends dvc implements IInterface {
    public rtk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void a(rtj rtjVar, String str) {
        Parcel pv = pv();
        dve.i(pv, rtjVar);
        pv.writeString(str);
        px(5, pv);
    }
}
