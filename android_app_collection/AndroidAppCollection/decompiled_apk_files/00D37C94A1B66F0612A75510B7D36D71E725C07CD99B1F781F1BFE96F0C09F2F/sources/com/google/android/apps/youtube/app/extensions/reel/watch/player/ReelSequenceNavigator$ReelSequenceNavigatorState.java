package com.google.android.apps.youtube.app.extensions.reel.watch.player;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.player.sequencer.state.SequenceNavigatorState;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReelSequenceNavigator$ReelSequenceNavigatorState implements SequenceNavigatorState {
    public static final Parcelable.Creator CREATOR = new gta(10);
    private artv a;

    public ReelSequenceNavigator$ReelSequenceNavigatorState(Parcel parcel) {
        try {
            if (parcel.readInt() != 0) {
                this.a = (artv) aphq.g(parcel, artv.a, aoos.b());
            } else {
                this.a = null;
            }
        } catch (aopx e) {
            zep.d("Invalid ReelItemWatchResponse", e);
        }
    }

    public ReelSequenceNavigator$ReelSequenceNavigatorState(artv artvVar) {
        this.a = artvVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a != null ? 1 : 0);
        artv artvVar = this.a;
        if (artvVar != null) {
            aphq.l(parcel, artvVar);
        }
    }
}
