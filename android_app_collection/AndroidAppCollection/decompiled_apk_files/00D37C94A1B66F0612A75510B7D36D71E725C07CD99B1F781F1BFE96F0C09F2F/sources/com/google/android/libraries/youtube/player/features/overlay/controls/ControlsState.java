package com.google.android.libraries.youtube.player.features.overlay.controls;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ControlsState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new abjw(17);
    public final ahzb a;
    public final boolean b;

    public ControlsState(ahzb ahzbVar, boolean z) {
        if (ahzbVar != ahzb.PLAYING && ahzbVar != ahzb.PAUSED) {
            aqxo.q(!z, "controls can be in the buffering state only if in PLAYING or PAUSED video state");
        }
        ahzbVar.getClass();
        this.a = ahzbVar;
        this.b = z;
    }

    public static ControlsState a() {
        return new ControlsState(ahzb.ENDED, false);
    }

    public static ControlsState b() {
        return new ControlsState(ahzb.NEW, false);
    }

    public static ControlsState c() {
        return new ControlsState(ahzb.PAUSED, true);
    }

    public static ControlsState d() {
        return new ControlsState(ahzb.PAUSED, false);
    }

    public static ControlsState e() {
        return new ControlsState(ahzb.PLAYING, true);
    }

    public static ControlsState f() {
        return new ControlsState(ahzb.PLAYING, false);
    }

    public static ControlsState g() {
        return new ControlsState(ahzb.RECOVERABLE_ERROR, false);
    }

    public static ControlsState h() {
        return new ControlsState(ahzb.UNRECOVERABLE_ERROR, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ControlsState)) {
            return false;
        }
        ControlsState controlsState = (ControlsState) obj;
        return this.a == controlsState.a && this.b == controlsState.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    public final boolean i() {
        return this.a == ahzb.RECOVERABLE_ERROR || this.a == ahzb.UNRECOVERABLE_ERROR;
    }

    public final boolean j() {
        return this.a == ahzb.PLAYING || this.a == ahzb.PAUSED || this.a == ahzb.ENDED;
    }

    public final boolean k() {
        return j() && !this.b;
    }

    public final String toString() {
        ampp b = akzj.b(ControlsState.class);
        b.b("videoState", this.a);
        b.g("isBuffering", this.b);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.ordinal());
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
    }
}
