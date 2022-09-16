package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.AccountActionResult;
import com.google.apps.tiktok.account.api.controller.AutoValue_ValidationResult;
import com.google.apps.tiktok.account.api.controller.ValidationResult;
import com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.CallStatus;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.messaging.RemoteMessage;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import com.google.vr.vrcore.common.api.HeadTrackingState;
import com.google.vr.vrcore.controller.api.ControllerAccelEvent;
import com.google.vr.vrcore.controller.api.ControllerBatteryEvent;
import com.google.vr.vrcore.controller.api.ControllerButtonEvent;
import com.google.vr.vrcore.controller.api.ControllerEventPacket;
import com.google.vr.vrcore.controller.api.ControllerEventPacket2;
import com.google.vr.vrcore.controller.api.ControllerGyroEvent;
/* compiled from: PG */
/* renamed from: alwc  reason: default package */
/* loaded from: classes.dex */
public final class alwc implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public alwc() {
    }

    public alwc(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new MetricKey[i];
            case 1:
                return new CustomEvent[i];
            case 2:
                return new AccountId[i];
            case 3:
                return new AccountActionResult[i];
            case 4:
                return new ValidationResult[i];
            case 5:
                return new ParcelableFuture[i];
            case 6:
                return new ActionImpl[i];
            case 7:
                return new CallStatus[i];
            case 8:
                return new Thing.Metadata[i];
            case 9:
                return new ActionImpl.MetadataImpl[i];
            case 10:
                return new MutateRequest[i];
            case 11:
                return new Thing[i];
            case 12:
                return new RemoteMessage[i];
            case 13:
                return new ProtoParsers$InternalDontUse[i];
            case 14:
                return new HeadTrackingState[i];
            case 15:
                return new ControllerAccelEvent[i];
            case 16:
                return new ControllerBatteryEvent[i];
            case 17:
                return new ControllerButtonEvent[i];
            case 18:
                return new ControllerEventPacket[i];
            case 19:
                return new ControllerEventPacket2[i];
            default:
                return new ControllerGyroEvent[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ControllerEventPacket controllerEventPacket;
        ControllerEventPacket2 controllerEventPacket2;
        boolean z = true;
        int i = 0;
        Bundle bundle = null;
        switch (this.a) {
            case 0:
                return new MetricKey(parcel.readString(), parcel.readString());
            case 1:
                return new CustomEvent(parcel.readLong(), (MetricKey) parcel.readParcelable(MetricKey.class.getClassLoader()), parcel.readPersistableBundle(MetricKey.class.getClassLoader()), parcel.readPersistableBundle(MetricKey.class.getClassLoader()), null);
            case 2:
                return AccountId.b(parcel.readInt());
            case 3:
                return new AccountActionResult(parcel);
            case 4:
                boolean z2 = parcel.readInt() == 1;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                return new AutoValue_ValidationResult(z2, z, (Intent) parcel.readParcelable(getClass().getClassLoader()));
            case 5:
                return new ParcelableFuture(parcel);
            case 6:
                int Q = tqj.Q(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                ActionImpl.MetadataImpl metadataImpl = null;
                String str5 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < Q) {
                    int readInt = parcel.readInt();
                    switch (tqj.M(readInt)) {
                        case 1:
                            str = tqj.Y(parcel, readInt);
                            break;
                        case 2:
                            str2 = tqj.Y(parcel, readInt);
                            break;
                        case 3:
                            str3 = tqj.Y(parcel, readInt);
                            break;
                        case 4:
                            str4 = tqj.Y(parcel, readInt);
                            break;
                        case 5:
                            metadataImpl = (ActionImpl.MetadataImpl) tqj.U(parcel, readInt, ActionImpl.MetadataImpl.CREATOR);
                            break;
                        case 6:
                            str5 = tqj.Y(parcel, readInt);
                            break;
                        case 7:
                            bundle2 = tqj.S(parcel, readInt);
                            break;
                        default:
                            tqj.ad(parcel, readInt);
                            break;
                    }
                }
                tqj.ac(parcel, Q);
                return new ActionImpl(str, str2, str3, str4, metadataImpl, str5, bundle2);
            case 7:
                int Q2 = tqj.Q(parcel);
                while (parcel.dataPosition() < Q2) {
                    int readInt2 = parcel.readInt();
                    if (tqj.M(readInt2) == 1) {
                        i = tqj.O(parcel, readInt2);
                    } else {
                        tqj.ad(parcel, readInt2);
                    }
                }
                tqj.ac(parcel, Q2);
                return new CallStatus(i);
            case 8:
                int Q3 = tqj.Q(parcel);
                String str6 = null;
                Bundle bundle3 = null;
                Bundle bundle4 = null;
                boolean z3 = false;
                int i2 = 0;
                while (parcel.dataPosition() < Q3) {
                    int readInt3 = parcel.readInt();
                    int M = tqj.M(readInt3);
                    if (M == 1) {
                        z3 = tqj.ae(parcel, readInt3);
                    } else if (M == 2) {
                        i2 = tqj.O(parcel, readInt3);
                    } else if (M == 3) {
                        str6 = tqj.Y(parcel, readInt3);
                    } else if (M == 4) {
                        bundle3 = tqj.S(parcel, readInt3);
                    } else if (M == 5) {
                        bundle4 = tqj.S(parcel, readInt3);
                    } else {
                        tqj.ad(parcel, readInt3);
                    }
                }
                tqj.ac(parcel, Q3);
                return new Thing.Metadata(z3, i2, str6, bundle3, bundle4);
            case 9:
                int Q4 = tqj.Q(parcel);
                String str7 = null;
                String str8 = null;
                byte[] bArr = null;
                int i3 = 0;
                boolean z4 = false;
                boolean z5 = false;
                while (parcel.dataPosition() < Q4) {
                    int readInt4 = parcel.readInt();
                    switch (tqj.M(readInt4)) {
                        case 1:
                            i3 = tqj.O(parcel, readInt4);
                            break;
                        case 2:
                            z4 = tqj.ae(parcel, readInt4);
                            break;
                        case 3:
                            str7 = tqj.Y(parcel, readInt4);
                            break;
                        case 4:
                            str8 = tqj.Y(parcel, readInt4);
                            break;
                        case 5:
                            bArr = tqj.af(parcel, readInt4);
                            break;
                        case 6:
                            z5 = tqj.ae(parcel, readInt4);
                            break;
                        default:
                            tqj.ad(parcel, readInt4);
                            break;
                    }
                }
                tqj.ac(parcel, Q4);
                return new ActionImpl.MetadataImpl(i3, z4, str7, str8, bArr, z5);
            case 10:
                int Q5 = tqj.Q(parcel);
                Thing[] thingArr = null;
                String[] strArr = null;
                String[] strArr2 = null;
                ActionImpl actionImpl = null;
                String str9 = null;
                String str10 = null;
                int i4 = 0;
                while (parcel.dataPosition() < Q5) {
                    int readInt5 = parcel.readInt();
                    switch (tqj.M(readInt5)) {
                        case 1:
                            i4 = tqj.O(parcel, readInt5);
                            break;
                        case 2:
                            thingArr = (Thing[]) tqj.ai(parcel, readInt5, Thing.CREATOR);
                            break;
                        case 3:
                            strArr = tqj.aj(parcel, readInt5);
                            break;
                        case 4:
                        default:
                            tqj.ad(parcel, readInt5);
                            break;
                        case 5:
                            strArr2 = tqj.aj(parcel, readInt5);
                            break;
                        case 6:
                            actionImpl = (ActionImpl) tqj.U(parcel, readInt5, ActionImpl.CREATOR);
                            break;
                        case 7:
                            str9 = tqj.Y(parcel, readInt5);
                            break;
                        case 8:
                            str10 = tqj.Y(parcel, readInt5);
                            break;
                    }
                }
                tqj.ac(parcel, Q5);
                return new MutateRequest(i4, thingArr, strArr, strArr2, actionImpl, str9, str10);
            case 11:
                int Q6 = tqj.Q(parcel);
                Bundle bundle5 = null;
                Thing.Metadata metadata = null;
                String str11 = null;
                String str12 = null;
                int i5 = 0;
                while (parcel.dataPosition() < Q6) {
                    int readInt6 = parcel.readInt();
                    int M2 = tqj.M(readInt6);
                    if (M2 == 1) {
                        bundle5 = tqj.S(parcel, readInt6);
                    } else if (M2 == 2) {
                        metadata = (Thing.Metadata) tqj.U(parcel, readInt6, Thing.Metadata.CREATOR);
                    } else if (M2 == 3) {
                        str11 = tqj.Y(parcel, readInt6);
                    } else if (M2 == 4) {
                        str12 = tqj.Y(parcel, readInt6);
                    } else if (M2 == 1000) {
                        i5 = tqj.O(parcel, readInt6);
                    } else {
                        tqj.ad(parcel, readInt6);
                    }
                }
                tqj.ac(parcel, Q6);
                return new Thing(i5, bundle5, metadata, str11, str12);
            case 12:
                int Q7 = tqj.Q(parcel);
                while (parcel.dataPosition() < Q7) {
                    int readInt7 = parcel.readInt();
                    if (tqj.M(readInt7) == 2) {
                        bundle = tqj.S(parcel, readInt7);
                    } else {
                        tqj.ad(parcel, readInt7);
                    }
                }
                tqj.ac(parcel, Q7);
                return new RemoteMessage(bundle);
            case 13:
                byte[] bArr2 = new byte[parcel.readInt()];
                parcel.readByteArray(bArr2);
                return new ProtoParsers$InternalDontUse(bArr2, null);
            case 14:
                return new HeadTrackingState(parcel);
            case 15:
                return new ControllerAccelEvent(parcel);
            case 16:
                return new ControllerBatteryEvent(parcel);
            case 17:
                return new ControllerButtonEvent(parcel);
            case 18:
                synchronized (ControllerEventPacket.k) {
                    controllerEventPacket = ControllerEventPacket.j.isEmpty() ? new ControllerEventPacket() : (ControllerEventPacket) ControllerEventPacket.j.remove();
                }
                controllerEventPacket.c(parcel);
                return controllerEventPacket;
            case 19:
                synchronized (ControllerEventPacket2.b) {
                    controllerEventPacket2 = ControllerEventPacket2.a.isEmpty() ? new ControllerEventPacket2() : (ControllerEventPacket2) ControllerEventPacket2.a.remove();
                }
                controllerEventPacket2.c(parcel);
                return controllerEventPacket2;
            default:
                return new ControllerGyroEvent(parcel);
        }
    }
}
