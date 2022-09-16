package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new cs(13);
    public final int a;
    public final long b;
    public final long c;
    public final float d;
    public final long e;
    public final int f;
    public final CharSequence g;
    public final long h;
    public List i;
    public final long j;
    public final Bundle k;
    public PlaybackState l;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class CustomAction implements Parcelable {
        public static final Parcelable.Creator CREATOR = new cs(14);
        public final String a;
        public final CharSequence b;
        public final int c;
        public final Bundle d;
        public PlaybackState.CustomAction e;

        public CustomAction(Parcel parcel) {
            this.a = parcel.readString();
            this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.c = parcel.readInt();
            this.d = parcel.readBundle(iz.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.a = str;
            this.b = charSequence;
            this.c = i;
            this.d = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.b) + ", mIcon=" + this.c + ", mExtras=" + this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            TextUtils.writeToParcel(this.b, parcel, i);
            parcel.writeInt(this.c);
            parcel.writeBundle(this.d);
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List list, long j5, Bundle bundle) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = f;
        this.e = j3;
        this.f = i2;
        this.g = charSequence;
        this.h = j4;
        this.i = new ArrayList(list);
        this.j = j5;
        this.k = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        CustomAction customAction;
        Bundle bundle = null;
        if (obj != null) {
            PlaybackState playbackState = (PlaybackState) obj;
            List q = ja.q(playbackState);
            if (q != null) {
                ArrayList arrayList2 = new ArrayList(q.size());
                for (Object obj2 : q) {
                    if (obj2 != null) {
                        PlaybackState.CustomAction customAction2 = (PlaybackState.CustomAction) obj2;
                        Bundle m = ja.m(customAction2);
                        iz.c(m);
                        customAction = new CustomAction(ja.p(customAction2), ja.o(customAction2), ja.b(customAction2), m);
                        customAction.e = customAction2;
                    } else {
                        customAction = null;
                    }
                    arrayList2.add(customAction);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            if (Build.VERSION.SDK_INT >= 22) {
                bundle = jb.a(playbackState);
                iz.c(bundle);
            }
            PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(ja.c(playbackState), ja.h(playbackState), ja.f(playbackState), ja.a(playbackState), ja.d(playbackState), 0, ja.n(playbackState), ja.g(playbackState), arrayList, ja.e(playbackState), bundle);
            playbackStateCompat.l = playbackState;
            return playbackStateCompat;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.a + ", position=" + this.b + ", buffered position=" + this.c + ", speed=" + this.d + ", updated=" + this.h + ", actions=" + this.e + ", error code=" + this.f + ", error message=" + this.g + ", custom actions=" + this.i + ", active item id=" + this.j + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.h);
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.g, parcel, i);
        parcel.writeTypedList(this.i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f);
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.d = parcel.readFloat();
        this.h = parcel.readLong();
        this.c = parcel.readLong();
        this.e = parcel.readLong();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.j = parcel.readLong();
        this.k = parcel.readBundle(iz.class.getClassLoader());
        this.f = parcel.readInt();
    }
}
