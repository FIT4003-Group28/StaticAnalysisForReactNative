package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: PG */
/* renamed from: cntq  reason: default package */
/* loaded from: classes5.dex */
public class cntq<T extends SafeParcelable> extends cntl<T> {
    private final Parcelable.Creator<T> b;

    public cntq(DataHolder dataHolder, Parcelable.Creator<T> creator) {
        super(dataHolder);
        this.b = creator;
    }

    @Override // defpackage.cntn
    /* renamed from: e */
    public T d(int i) {
        DataHolder dataHolder = this.a;
        cnwc.a(dataHolder);
        byte[] d = dataHolder.d("data", i, dataHolder.e(i));
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(d, 0, d.length);
        obtain.setDataPosition(0);
        T createFromParcel = this.b.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}
