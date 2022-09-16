package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: aljh  reason: default package */
/* loaded from: classes.dex */
public final class aljh implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public aljh() {
    }

    public aljh(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return new AppBarLayout.BaseBehavior.SavedState(parcel, null);
            }
            if (i == 2) {
                return new MaterialButton.SavedState(parcel, null);
            }
            if (i == 3) {
                return new CheckableImageButton.SavedState(parcel, null);
            }
            if (i == 4) {
                return new ExtendableSavedState(parcel, null);
            }
            return new TextInputLayout.SavedState(parcel, null);
        }
        return new BottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == 1) {
                return new AppBarLayout.BaseBehavior.SavedState[i];
            }
            if (i2 == 2) {
                return new MaterialButton.SavedState[i];
            }
            if (i2 == 3) {
                return new CheckableImageButton.SavedState[i];
            }
            if (i2 == 4) {
                return new ExtendableSavedState[i];
            }
            return new TextInputLayout.SavedState[i];
        }
        return new BottomSheetBehavior.SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return new AppBarLayout.BaseBehavior.SavedState(parcel, classLoader);
            }
            if (i == 2) {
                return new MaterialButton.SavedState(parcel, classLoader);
            }
            if (i == 3) {
                return new CheckableImageButton.SavedState(parcel, classLoader);
            }
            if (i == 4) {
                return new ExtendableSavedState(parcel, classLoader);
            }
            return new TextInputLayout.SavedState(parcel, classLoader);
        }
        return new BottomSheetBehavior.SavedState(parcel, classLoader);
    }
}
