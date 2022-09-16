package com.google.android.apps.youtube.app.extensions.reel.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReelToReelList implements Parcelable {
    public static final Parcelable.Creator CREATOR = new gta();
    public final List a;
    public final List b;

    public ReelToReelList(apzg apzgVar) {
        apzgVar.getClass();
        aqxo.y(apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        this.a = Collections.unmodifiableList(amxp.r(apzgVar));
        this.b = Collections.unmodifiableList(amxp.r(Optional.empty()));
    }

    public final ReelToReelList a() {
        return new ReelToReelList(Collections.unmodifiableList(amxp.t(this.a)), Collections.unmodifiableList(amxp.t(this.b)));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[ReelToReelList");
        sb.append(" size=");
        sb.append(this.a.size());
        for (apzg apzgVar : this.a) {
            ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            sb.append(" video[");
            sb.append(reelWatchEndpointOuterClass$ReelWatchEndpoint.e);
            sb.append("]=");
            sb.append(reelWatchEndpointOuterClass$ReelWatchEndpoint.d);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelableMessageLite[] parcelableMessageLiteArr = new ParcelableMessageLite[this.a.size()];
        int i2 = 0;
        for (apzg apzgVar : this.a) {
            parcelableMessageLiteArr[i2] = new ParcelableMessageLite(apzgVar);
            i2++;
        }
        parcel.writeParcelableArray(parcelableMessageLiteArr, 0);
        for (Optional optional : this.b) {
            if (optional.isPresent()) {
                parcel.writeByteArray(((aoob) optional.get()).I());
            } else {
                parcel.writeByteArray(new byte[0]);
            }
        }
    }

    public ReelToReelList(List list) {
        list.getClass();
        this.a = list;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqxo.y(((apzg) it.next()).qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
            arrayList.add(Optional.empty());
        }
        this.b = Collections.unmodifiableList(arrayList);
    }

    public ReelToReelList(List list, List list2) {
        list.getClass();
        this.a = list;
        list2.getClass();
        this.b = list2;
        aqxo.y(list.size() == list2.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqxo.y(((apzg) it.next()).qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint));
        }
    }
}
