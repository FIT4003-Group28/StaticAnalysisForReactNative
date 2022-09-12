package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.customview.view.AbsSavedState;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CheckableImageButton extends xl implements Checkable {
    private static final int[] c = {16842912};
    public boolean a;
    public boolean b;
    private boolean d;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        if (this.a) {
            return mergeDrawableStates(super.onCreateDrawableState(i + 1), c);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        setChecked(savedState.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.a;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.b != z) {
            this.b = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.b || this.a == z) {
            return;
        }
        this.a = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.d = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.d) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.a);
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new daag();
        boolean a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt() != 1 ? false : true;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        this.d = true;
        od.c(this, new daaf(this));
    }
}
