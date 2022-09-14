package android.support.v4.f;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.f.b;
/* compiled from: ResultReceiver.java */
/* loaded from: classes.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: android.support.v4.f.c.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c[] newArray(int i) {
            return new c[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final boolean f380a = false;

    /* renamed from: b  reason: collision with root package name */
    final Handler f381b = null;

    /* renamed from: c  reason: collision with root package name */
    android.support.v4.f.b f382c;

    protected void a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* compiled from: ResultReceiver.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final int f384a;

        /* renamed from: b  reason: collision with root package name */
        final Bundle f385b;

        b(int i, Bundle bundle) {
            this.f384a = i;
            this.f385b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.f384a, this.f385b);
        }
    }

    /* compiled from: ResultReceiver.java */
    /* loaded from: classes.dex */
    class a extends b.a {
        a() {
        }

        @Override // android.support.v4.f.b
        public void a(int i, Bundle bundle) {
            if (c.this.f381b != null) {
                c.this.f381b.post(new b(i, bundle));
            } else {
                c.this.a(i, bundle);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f382c == null) {
                this.f382c = new a();
            }
            parcel.writeStrongBinder(this.f382c.asBinder());
        }
    }

    c(Parcel parcel) {
        this.f382c = b.a.a(parcel.readStrongBinder());
    }
}
