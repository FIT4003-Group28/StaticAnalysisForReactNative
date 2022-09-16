package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentState.java */
/* loaded from: classes.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new Parcelable.Creator<r>() { // from class: android.support.v4.app.r.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public r createFromParcel(Parcel parcel) {
            return new r(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public r[] newArray(int i) {
            return new r[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final String f287a;

    /* renamed from: b  reason: collision with root package name */
    final int f288b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f289c;

    /* renamed from: d  reason: collision with root package name */
    final int f290d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final Bundle i;
    final boolean j;
    Bundle k;
    i l;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(i iVar) {
        this.f287a = iVar.getClass().getName();
        this.f288b = iVar.mIndex;
        this.f289c = iVar.mFromLayout;
        this.f290d = iVar.mFragmentId;
        this.e = iVar.mContainerId;
        this.f = iVar.mTag;
        this.g = iVar.mRetainInstance;
        this.h = iVar.mDetached;
        this.i = iVar.mArguments;
        this.j = iVar.mHidden;
    }

    r(Parcel parcel) {
        this.f287a = parcel.readString();
        this.f288b = parcel.readInt();
        boolean z = false;
        this.f289c = parcel.readInt() != 0;
        this.f290d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readBundle();
        this.j = parcel.readInt() != 0 ? true : z;
        this.k = parcel.readBundle();
    }

    public i a(m mVar, k kVar, i iVar, p pVar, android.arch.lifecycle.p pVar2) {
        if (this.l == null) {
            Context i = mVar.i();
            if (this.i != null) {
                this.i.setClassLoader(i.getClassLoader());
            }
            if (kVar != null) {
                this.l = kVar.a(i, this.f287a, this.i);
            } else {
                this.l = i.instantiate(i, this.f287a, this.i);
            }
            if (this.k != null) {
                this.k.setClassLoader(i.getClassLoader());
                this.l.mSavedFragmentState = this.k;
            }
            this.l.setIndex(this.f288b, iVar);
            this.l.mFromLayout = this.f289c;
            this.l.mRestored = true;
            this.l.mFragmentId = this.f290d;
            this.l.mContainerId = this.e;
            this.l.mTag = this.f;
            this.l.mRetainInstance = this.g;
            this.l.mDetached = this.h;
            this.l.mHidden = this.j;
            this.l.mFragmentManager = mVar.f244d;
            if (o.f245a) {
                Log.v("FragmentManager", "Instantiated fragment " + this.l);
            }
        }
        this.l.mChildNonConfig = pVar;
        this.l.mViewModelStore = pVar2;
        return this.l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f287a);
        parcel.writeInt(this.f288b);
        parcel.writeInt(this.f289c ? 1 : 0);
        parcel.writeInt(this.f290d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeBundle(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeBundle(this.k);
    }
}
