package com.google.android.apps.youtube.app.common.ui.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.Fragment$SavedState;
import java.util.LinkedList;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PaneBackStack implements Parcelable {
    public static final Parcelable.Creator CREATOR = new asq(17);
    public final LinkedList a;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class BackStackEntry implements Parcelable {
        public static final Parcelable.Creator CREATOR = new asq(18);
        public final PaneDescriptor a;
        public final Fragment$SavedState b;
        public final Object c;
        public final String d;

        public BackStackEntry(Parcel parcel) {
            this.a = (PaneDescriptor) parcel.readParcelable(PaneDescriptor.class.getClassLoader());
            this.b = (Fragment$SavedState) parcel.readParcelable(Fragment$SavedState.class.getClassLoader());
            this.c = null;
            this.d = parcel.readString();
        }

        public BackStackEntry(PaneDescriptor paneDescriptor, Fragment$SavedState fragment$SavedState, Object obj, String str) {
            this.a = paneDescriptor;
            this.b = fragment$SavedState;
            this.c = obj;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.a, i);
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.d);
        }
    }

    public PaneBackStack() {
        this.a = new LinkedList();
    }

    public final BackStackEntry a() {
        return (BackStackEntry) this.a.peek();
    }

    public final BackStackEntry b() {
        return (BackStackEntry) this.a.pollFirst();
    }

    public final void c(PaneDescriptor paneDescriptor, Fragment$SavedState fragment$SavedState, Object obj, String str) {
        this.a.addFirst(new BackStackEntry(paneDescriptor, fragment$SavedState, obj, str));
    }

    public final boolean d() {
        return this.a.isEmpty();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e() {
        BackStackEntry backStackEntry = (BackStackEntry) this.a.peekLast();
        this.a.clear();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
    }

    public PaneBackStack(Parcel parcel) {
        this();
        parcel.readTypedList(this.a, BackStackEntry.CREATOR);
    }
}
