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
/* loaded from: classes2.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new mo();
    public final int a;
    public final long b;
    final long c;
    public final float d;
    public final long e;
    final int f;
    public final CharSequence g;
    final long h;
    List<CustomAction> i;
    final long j;
    final Bundle k;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new mp();
        private final String a;
        private final CharSequence b;
        private final int c;
        private final Bundle d;

        public CustomAction(Parcel parcel) {
            this.a = parcel.readString();
            this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.c = parcel.readInt();
            this.d = parcel.readBundle(mm.class.getClassLoader());
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

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = f;
        this.e = j3;
        this.f = 0;
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
            List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
            if (customActions != null) {
                ArrayList arrayList2 = new ArrayList(customActions.size());
                for (PlaybackState.CustomAction customAction2 : customActions) {
                    if (customAction2 != null) {
                        PlaybackState.CustomAction customAction3 = customAction2;
                        Bundle extras = customAction3.getExtras();
                        mm.a(extras);
                        customAction = new CustomAction(customAction3.getAction(), customAction3.getName(), customAction3.getIcon(), extras);
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
                bundle = playbackState.getExtras();
                mm.a(bundle);
            }
            return new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundle);
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
        this.k = parcel.readBundle(mm.class.getClassLoader());
        this.f = parcel.readInt();
    }
}
