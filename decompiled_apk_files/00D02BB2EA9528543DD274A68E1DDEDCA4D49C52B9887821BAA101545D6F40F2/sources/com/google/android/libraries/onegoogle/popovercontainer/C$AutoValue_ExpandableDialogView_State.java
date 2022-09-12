package com.google.android.libraries.onegoogle.popovercontainer;

import android.os.Parcelable;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
/* compiled from: PG */
/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.$AutoValue_ExpandableDialogView_State  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_ExpandableDialogView_State extends ExpandableDialogView.State {
    public final boolean a;
    public final Parcelable b;

    public C$AutoValue_ExpandableDialogView_State(boolean z, Parcelable parcelable) {
        this.a = z;
        if (parcelable != null) {
            this.b = parcelable;
            return;
        }
        throw new NullPointerException("Null parentState");
    }

    @Override // com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView.State
    public final boolean a() {
        return this.a;
    }

    @Override // com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView.State
    public final Parcelable b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExpandableDialogView.State) {
            ExpandableDialogView.State state = (ExpandableDialogView.State) obj;
            if (this.a == state.a() && this.b.equals(state.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("State{isPortraitInFullScreen=");
        sb.append(z);
        sb.append(", parentState=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
