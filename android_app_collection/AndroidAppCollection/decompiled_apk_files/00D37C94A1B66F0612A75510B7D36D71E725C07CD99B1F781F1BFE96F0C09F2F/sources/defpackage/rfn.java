package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.NetworkLocationStatus;
import com.google.android.gms.location.internal.DeviceOrientationRequestInternal;
import com.google.android.gms.location.internal.DeviceOrientationRequestUpdateData;
import com.google.android.gms.location.internal.FusedLocationProviderResult;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.SyncResult;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
/* compiled from: PG */
/* renamed from: rfn  reason: default package */
/* loaded from: classes4.dex */
public final class rfn implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public rfn() {
    }

    public rfn(int i) {
        this.a = i;
    }

    public static void a(EventParcel eventParcel, Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, eventParcel.a);
        tqj.E(parcel, 3, eventParcel.b, i);
        tqj.F(parcel, 4, eventParcel.c);
        tqj.t(parcel, 5, eventParcel.d);
        tqj.n(parcel, m);
    }

    public static void b(UserAttributeParcel userAttributeParcel, Parcel parcel) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, userAttributeParcel.a);
        tqj.F(parcel, 2, userAttributeParcel.b);
        tqj.t(parcel, 3, userAttributeParcel.c);
        tqj.D(parcel, 4, userAttributeParcel.d);
        tqj.F(parcel, 6, userAttributeParcel.e);
        tqj.F(parcel, 7, userAttributeParcel.f);
        Double d = userAttributeParcel.g;
        if (d != null) {
            tqj.r(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        tqj.n(parcel, m);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new DeviceOrientationRequest[i];
            case 1:
                return new UserAddress[i];
            case 2:
                return new LocationAvailability[i];
            case 3:
                return new LocationRequest[i];
            case 4:
                return new LocationResult[i];
            case 5:
                return new NetworkLocationStatus[i];
            case 6:
                return new DeviceOrientationRequestInternal[i];
            case 7:
                return new DeviceOrientationRequestUpdateData[i];
            case 8:
                return new FusedLocationProviderResult[i];
            case 9:
                return new LocationRequestInternal[i];
            case 10:
                return new LocationRequestUpdateData[i];
            case 11:
                return new LatLng[i];
            case 12:
                return new CallerInfo[i];
            case 13:
                return new SyncOptions[i];
            case 14:
                return new SyncRequest[i];
            case 15:
                return new SyncResult[i];
            case 16:
                return new InitializationParams[i];
            case 17:
                return new ConditionalUserPropertyParcel[i];
            case 18:
                return new EventParams[i];
            case 19:
                return new EventParcel[i];
            default:
                return new UserAttributeParcel[i];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 616
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:60)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r33) {
        /*
            Method dump skipped, instructions count: 1970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rfn.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
