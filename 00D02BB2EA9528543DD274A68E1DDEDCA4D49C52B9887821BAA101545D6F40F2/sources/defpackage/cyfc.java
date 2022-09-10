package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.Experiments;
/* compiled from: PG */
/* renamed from: cyfc  reason: default package */
/* loaded from: classes5.dex */
public final class cyfc implements Parcelable.Creator<Experiments> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Experiments createFromParcel(Parcel parcel) {
        cyfd c = Experiments.c();
        c.a.a((cydy) parcel.readSerializable());
        return c.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Experiments[] newArray(int i) {
        return new Experiments[i];
    }
}
