package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.e;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() { // from class: android.support.v4.media.session.PlaybackStateCompat.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final int f603a;

    /* renamed from: b  reason: collision with root package name */
    final long f604b;

    /* renamed from: c  reason: collision with root package name */
    final long f605c;

    /* renamed from: d  reason: collision with root package name */
    final float f606d;
    final long e;
    final int f;
    final CharSequence g;
    final long h;
    List<CustomAction> i;
    final long j;
    final Bundle k;
    private Object l;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f603a = i;
        this.f604b = j;
        this.f605c = j2;
        this.f606d = f;
        this.e = j3;
        this.f = i2;
        this.g = charSequence;
        this.h = j4;
        this.i = new ArrayList(list);
        this.j = j5;
        this.k = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f603a = parcel.readInt();
        this.f604b = parcel.readLong();
        this.f606d = parcel.readFloat();
        this.h = parcel.readLong();
        this.f605c = parcel.readLong();
        this.e = parcel.readLong();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.j = parcel.readLong();
        this.k = parcel.readBundle();
        this.f = parcel.readInt();
    }

    public String toString() {
        return "PlaybackState {state=" + this.f603a + ", position=" + this.f604b + ", buffered position=" + this.f605c + ", speed=" + this.f606d + ", updated=" + this.h + ", actions=" + this.e + ", error code=" + this.f + ", error message=" + this.g + ", custom actions=" + this.i + ", active item id=" + this.j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f603a);
        parcel.writeLong(this.f604b);
        parcel.writeFloat(this.f606d);
        parcel.writeLong(this.h);
        parcel.writeLong(this.f605c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.g, parcel, i);
        parcel.writeTypedList(this.i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f);
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> h = e.h(obj);
        if (h != null) {
            ArrayList arrayList2 = new ArrayList(h.size());
            for (Object obj2 : h) {
                arrayList2.add(CustomAction.a(obj2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = f.a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(e.a(obj), e.b(obj), e.c(obj), e.d(obj), e.e(obj), 0, e.f(obj), e.g(obj), arrayList, e.i(obj), bundle);
        playbackStateCompat.l = obj;
        return playbackStateCompat;
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() { // from class: android.support.v4.media.session.PlaybackStateCompat.CustomAction.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private final String f607a;

        /* renamed from: b  reason: collision with root package name */
        private final CharSequence f608b;

        /* renamed from: c  reason: collision with root package name */
        private final int f609c;

        /* renamed from: d  reason: collision with root package name */
        private final Bundle f610d;
        private Object e;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f607a = str;
            this.f608b = charSequence;
            this.f609c = i;
            this.f610d = bundle;
        }

        CustomAction(Parcel parcel) {
            this.f607a = parcel.readString();
            this.f608b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f609c = parcel.readInt();
            this.f610d = parcel.readBundle();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f607a);
            TextUtils.writeToParcel(this.f608b, parcel, i);
            parcel.writeInt(this.f609c);
            parcel.writeBundle(this.f610d);
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(e.a.a(obj), e.a.b(obj), e.a.c(obj), e.a.d(obj));
            customAction.e = obj;
            return customAction;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f608b) + ", mIcon=" + this.f609c + ", mExtras=" + this.f610d;
        }
    }
}
