package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.lottie.LottieAnimationView;
/* compiled from: PG */
/* renamed from: bir  reason: default package */
/* loaded from: classes3.dex */
public final class bir implements Parcelable.Creator<LottieAnimationView.SavedState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LottieAnimationView.SavedState createFromParcel(Parcel parcel) {
        return new LottieAnimationView.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LottieAnimationView.SavedState[] newArray(int i) {
        return new LottieAnimationView.SavedState[i];
    }
}
