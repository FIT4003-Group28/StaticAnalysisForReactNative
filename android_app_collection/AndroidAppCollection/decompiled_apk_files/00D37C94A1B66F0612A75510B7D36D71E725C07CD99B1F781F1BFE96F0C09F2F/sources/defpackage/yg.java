package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment$SavedState;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.ViewPager;
/* compiled from: PG */
/* renamed from: yg  reason: default package */
/* loaded from: classes4.dex */
public final class yg implements Parcelable.ClassLoaderCreator {
    private final /* synthetic */ int a;

    public yg() {
    }

    public yg(int i) {
        this.a = i;
    }

    public static final AbsSavedState a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return AbsSavedState.c;
        }
        throw new IllegalStateException("superState must be null");
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return new Fragment$SavedState(parcel, null);
            }
            if (i == 2) {
                return new SearchView.SavedState(parcel, null);
            }
            if (i == 3) {
                return new Toolbar.SavedState(parcel, null);
            }
            if (i == 4) {
                return new CoordinatorLayout.SavedState(parcel, null);
            }
            if (i == 5) {
                return a(parcel, null);
            }
            return new ViewPager.SavedState(parcel, null);
        }
        return new RecyclerView.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == 1) {
                return new Fragment$SavedState[i];
            }
            if (i2 == 2) {
                return new SearchView.SavedState[i];
            }
            if (i2 == 3) {
                return new Toolbar.SavedState[i];
            }
            if (i2 == 4) {
                return new CoordinatorLayout.SavedState[i];
            }
            if (i2 == 5) {
                return new AbsSavedState[i];
            }
            return new ViewPager.SavedState[i];
        }
        return new RecyclerView.SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return new Fragment$SavedState(parcel, classLoader);
            }
            if (i == 2) {
                return new SearchView.SavedState(parcel, classLoader);
            }
            if (i == 3) {
                return new Toolbar.SavedState(parcel, classLoader);
            }
            if (i == 4) {
                return new CoordinatorLayout.SavedState(parcel, classLoader);
            }
            if (i == 5) {
                return a(parcel, classLoader);
            }
            return new ViewPager.SavedState(parcel, classLoader);
        }
        return new RecyclerView.SavedState(parcel, classLoader);
    }
}
