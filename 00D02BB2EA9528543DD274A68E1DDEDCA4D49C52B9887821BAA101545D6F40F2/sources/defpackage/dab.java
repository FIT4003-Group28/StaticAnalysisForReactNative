package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import com.google.android.apps.gmm.ar.api.AutoValue_ArLauncherParams;
/* compiled from: PG */
/* renamed from: dab  reason: default package */
/* loaded from: classes5.dex */
public final class dab implements Parcelable.Creator<AutoValue_ArLauncherParams> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_ArLauncherParams createFromParcel(Parcel parcel) {
        int readInt;
        czh czhVar = (czh) Enum.valueOf(czh.class, parcel.readString());
        dccx F = dcdc.F();
        for (int readInt2 = parcel.readInt(); readInt2 > 0; readInt2--) {
            F.g(dcvs.a(parcel.readDouble(), parcel.readDouble()));
        }
        return new AutoValue_ArLauncherParams(czhVar, F.f(), dcdc.r(parcel.readArrayList(czq.class.getClassLoader())), parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, (doi) Enum.valueOf(doi.class, parcel.readString()), (parcel.readInt() != 0 || (readInt = parcel.readInt()) < 0) ? null : ImageView.ScaleType.values()[readInt], czr.a(parcel), czr.a(parcel), czr.a(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_ArLauncherParams[] newArray(int i) {
        return new AutoValue_ArLauncherParams[i];
    }
}
