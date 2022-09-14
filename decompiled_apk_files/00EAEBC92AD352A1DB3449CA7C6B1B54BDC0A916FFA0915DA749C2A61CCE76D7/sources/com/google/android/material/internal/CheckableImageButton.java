package com.google.android.material.internal;

import a.g.m.v;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.m;
/* loaded from: classes.dex */
public class CheckableImageButton extends m implements Checkable {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f8113g = {16842912};

    /* renamed from: d  reason: collision with root package name */
    private boolean f8114d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8115e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8116f;

    /* loaded from: classes.dex */
    class a extends a.g.m.a {
        a() {
        }

        @Override // a.g.m.a
        public void a(View view, a.g.m.e0.c cVar) {
            super.a(view, cVar);
            cVar.b(CheckableImageButton.this.a());
            cVar.c(CheckableImageButton.this.isChecked());
        }

        @Override // a.g.m.a
        public void b(View view, AccessibilityEvent accessibilityEvent) {
            super.b(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends a.i.a.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        boolean f8118d;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public b mo282createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: createFromParcel */
            public b mo283createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public b[] mo284newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f8118d = z;
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f8118d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8115e = true;
        this.f8116f = true;
        v.a(this, new a());
    }

    public boolean a() {
        return this.f8115e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f8114d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        return this.f8114d ? ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + f8113g.length), f8113g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.j());
        setChecked(bVar.f8118d);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f8118d = this.f8114d;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f8115e != z) {
            this.f8115e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f8115e || this.f8114d == z) {
            return;
        }
        this.f8114d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f8116f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f8116f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f8114d);
    }
}
