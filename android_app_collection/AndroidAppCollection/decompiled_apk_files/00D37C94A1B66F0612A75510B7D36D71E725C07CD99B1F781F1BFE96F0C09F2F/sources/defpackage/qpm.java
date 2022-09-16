package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
/* compiled from: PG */
/* renamed from: qpm  reason: default package */
/* loaded from: classes4.dex */
public final class qpm implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public qpm() {
    }

    public qpm(int i) {
        this.a = i;
    }

    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, getServiceRequest.a);
        tqj.s(parcel, 2, getServiceRequest.b);
        tqj.s(parcel, 3, getServiceRequest.c);
        tqj.F(parcel, 4, getServiceRequest.d);
        tqj.y(parcel, 5, getServiceRequest.e);
        tqj.I(parcel, 6, getServiceRequest.f, i);
        tqj.v(parcel, 7, getServiceRequest.g);
        tqj.E(parcel, 8, getServiceRequest.h, i);
        tqj.I(parcel, 10, getServiceRequest.i, i);
        tqj.I(parcel, 11, getServiceRequest.j, i);
        tqj.o(parcel, 12, getServiceRequest.k);
        tqj.s(parcel, 13, getServiceRequest.l);
        tqj.o(parcel, 14, getServiceRequest.m);
        tqj.F(parcel, 15, getServiceRequest.n);
        tqj.n(parcel, m);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new DeviceStatus[i];
            case 1:
                return new ApplicationStatus[i];
            case 2:
                return new LogEventParcelable[i];
            case 3:
                return new PlayLoggerContext[i];
            case 4:
                return new CloudMessage[i];
            case 5:
                return new CloudMessagingMessengerCompat[i];
            case 6:
                return new ConnectionResult[i];
            case 7:
                return new Feature[i];
            case 8:
                return new GoogleCertificatesLookupQuery[i];
            case 9:
                return new GoogleCertificatesLookupResponse[i];
            case 10:
                return new GoogleCertificatesQuery[i];
            case 11:
                return new Scope[i];
            case 12:
                return new Status[i];
            case 13:
                return new BitmapTeleporter[i];
            case 14:
                return new DataHolder[i];
            case 15:
                return new WebImage[i];
            case 16:
                return new BinderWrapper[i];
            case 17:
                return new ClientIdentity[i];
            case 18:
                return new ConnectionInfo[i];
            case 19:
                return new ConnectionTelemetryConfiguration[i];
            default:
                return new GetServiceRequest[i];
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 566
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:60)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r26) {
        /*
            Method dump skipped, instructions count: 1694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpm.createFromParcel(android.os.Parcel):java.lang.Object");
    }
}
