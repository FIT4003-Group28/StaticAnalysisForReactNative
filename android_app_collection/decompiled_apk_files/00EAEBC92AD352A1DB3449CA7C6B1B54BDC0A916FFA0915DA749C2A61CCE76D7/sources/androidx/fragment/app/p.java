package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    final String f1734b;

    /* renamed from: c  reason: collision with root package name */
    final String f1735c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f1736d;

    /* renamed from: e  reason: collision with root package name */
    final int f1737e;

    /* renamed from: f  reason: collision with root package name */
    final int f1738f;

    /* renamed from: g  reason: collision with root package name */
    final String f1739g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f1740h;
    final boolean i;
    final boolean j;
    final Bundle k;
    final boolean l;
    final int m;
    Bundle n;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<p> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public p mo73createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public p[] mo74newArray(int i) {
            return new p[i];
        }
    }

    p(Parcel parcel) {
        this.f1734b = parcel.readString();
        this.f1735c = parcel.readString();
        boolean z = true;
        this.f1736d = parcel.readInt() != 0;
        this.f1737e = parcel.readInt();
        this.f1738f = parcel.readInt();
        this.f1739g = parcel.readString();
        this.f1740h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readBundle();
        this.l = parcel.readInt() == 0 ? false : z;
        this.n = parcel.readBundle();
        this.m = parcel.readInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Fragment fragment) {
        this.f1734b = fragment.getClass().getName();
        this.f1735c = fragment.f1642f;
        this.f1736d = fragment.n;
        this.f1737e = fragment.w;
        this.f1738f = fragment.x;
        this.f1739g = fragment.y;
        this.f1740h = fragment.B;
        this.i = fragment.m;
        this.j = fragment.A;
        this.k = fragment.f1643g;
        this.l = fragment.z;
        this.m = fragment.Q.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1734b);
        sb.append(" (");
        sb.append(this.f1735c);
        sb.append(")}:");
        if (this.f1736d) {
            sb.append(" fromLayout");
        }
        if (this.f1738f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1738f));
        }
        String str = this.f1739g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1739g);
        }
        if (this.f1740h) {
            sb.append(" retainInstance");
        }
        if (this.i) {
            sb.append(" removing");
        }
        if (this.j) {
            sb.append(" detached");
        }
        if (this.l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1734b);
        parcel.writeString(this.f1735c);
        parcel.writeInt(this.f1736d ? 1 : 0);
        parcel.writeInt(this.f1737e);
        parcel.writeInt(this.f1738f);
        parcel.writeString(this.f1739g);
        parcel.writeInt(this.f1740h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeBundle(this.n);
        parcel.writeInt(this.m);
    }
}
