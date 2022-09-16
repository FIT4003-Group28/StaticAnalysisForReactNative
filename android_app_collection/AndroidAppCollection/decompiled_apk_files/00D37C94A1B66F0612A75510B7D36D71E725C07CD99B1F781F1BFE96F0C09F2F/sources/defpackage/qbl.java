package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.AppOpenAdOptionsParcel;
import com.google.android.gms.ads.internal.client.IconAdOptionsParcel;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
/* compiled from: PG */
/* renamed from: qbl  reason: default package */
/* loaded from: classes4.dex */
public final class qbl extends dvd implements qbm {
    public qaz a;

    public qbl() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // defpackage.qbm
    public final AdSizeParcel a() {
        return null;
    }

    @Override // defpackage.qbm
    public final qcg f() {
        return null;
    }

    @Override // defpackage.qbm
    public final rad g() {
        return null;
    }

    @Override // defpackage.qbm
    public final void h() {
    }

    @Override // defpackage.qbm
    public final void i(AdRequestParcel adRequestParcel, qbc qbcVar) {
    }

    @Override // defpackage.qbm
    public final void j() {
    }

    @Override // defpackage.qbm
    public final void k() {
    }

    @Override // defpackage.qbm
    public final void l(qaw qawVar) {
    }

    @Override // defpackage.qbm
    public final void m(qaz qazVar) {
        this.a = qazVar;
    }

    @Override // defpackage.qbm
    public final void n(AdSizeParcel adSizeParcel) {
    }

    @Override // defpackage.qbm
    public final void o(qbr qbrVar) {
    }

    @Override // defpackage.qbm
    public final void p(qbw qbwVar) {
    }

    @Override // defpackage.qbm
    public final void q(boolean z) {
    }

    @Override // defpackage.qbm
    public final void r(qcc qccVar) {
    }

    @Override // defpackage.qbm
    public final void s(rad radVar) {
    }

    @Override // defpackage.qbm
    public final boolean t(AdRequestParcel adRequestParcel) {
        qfl.b("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        qga.a.post(new qcp(this));
        return false;
    }

    @Override // defpackage.qbm
    public final void u() {
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        qaz qazVar = null;
        switch (i) {
            case 1:
                parcel2.writeNoException();
                dve.i(parcel2, null);
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                dve.e(parcel2, false);
                return true;
            case 4:
                t((AdRequestParcel) dve.a(parcel, AdRequestParcel.CREATOR));
                parcel2.writeNoException();
                dve.e(parcel2, false);
                return true;
            case 5:
                parcel2.writeNoException();
                return true;
            case 6:
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof qaz) {
                        qazVar = (qaz) queryLocalInterface;
                    } else {
                        qazVar = new qax(readStrongBinder);
                    }
                }
                this.a = qazVar;
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof qbr) {
                        qbr qbrVar = (qbr) queryLocalInterface2;
                    } else {
                        new qbp(readStrongBinder2);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                return true;
            case 12:
                parcel2.writeNoException();
                dve.h(parcel2, null);
                return true;
            case 13:
                AdSizeParcel adSizeParcel = (AdSizeParcel) dve.a(parcel, AdSizeParcel.CREATOR);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    if (queryLocalInterface3 instanceof qfq) {
                        qfq qfqVar = (qfq) queryLocalInterface3;
                    } else {
                        new qfq(readStrongBinder3);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    if (queryLocalInterface4 instanceof qfr) {
                        qfr qfrVar = (qfr) queryLocalInterface4;
                    } else {
                        new qfr(readStrongBinder4);
                    }
                }
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                parcel2.writeNoException();
                parcel2.writeString(null);
                return true;
            case 19:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    if (queryLocalInterface5 instanceof qdc) {
                        qdc qdcVar = (qdc) queryLocalInterface5;
                    } else {
                        new qdc(readStrongBinder5);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface6 instanceof qaw) {
                        qaw qawVar = (qaw) queryLocalInterface6;
                    } else {
                        new qau(readStrongBinder6);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface7 instanceof qbt) {
                        qbt qbtVar = (qbt) queryLocalInterface7;
                    } else {
                        new qbt(readStrongBinder7);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 22:
                dve.j(parcel);
                parcel2.writeNoException();
                return true;
            case 23:
                parcel2.writeNoException();
                dve.e(parcel2, false);
                return true;
            case 24:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    if (queryLocalInterface8 instanceof qfw) {
                        qfw qfwVar = (qfw) queryLocalInterface8;
                    } else {
                        new qfw(readStrongBinder8);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 25:
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 26:
                parcel2.writeNoException();
                dve.i(parcel2, null);
                return true;
            case 29:
                VideoOptionsParcel videoOptionsParcel = (VideoOptionsParcel) dve.a(parcel, VideoOptionsParcel.CREATOR);
                parcel2.writeNoException();
                return true;
            case 30:
                IconAdOptionsParcel iconAdOptionsParcel = (IconAdOptionsParcel) dve.a(parcel, IconAdOptionsParcel.CREATOR);
                parcel2.writeNoException();
                return true;
            case 31:
                parcel2.writeNoException();
                parcel2.writeString(null);
                return true;
            case 32:
                parcel2.writeNoException();
                dve.i(parcel2, null);
                return true;
            case 33:
                parcel2.writeNoException();
                dve.i(parcel2, null);
                return true;
            case 34:
                dve.j(parcel);
                parcel2.writeNoException();
                return true;
            case 35:
                parcel2.writeNoException();
                parcel2.writeString(null);
                return true;
            case 36:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface9 instanceof qbo) {
                        qbo qboVar = (qbo) queryLocalInterface9;
                    } else {
                        new qbo(readStrongBinder9);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                dve.h(parcel2, bundle);
                return true;
            case 38:
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 39:
                AppOpenAdOptionsParcel appOpenAdOptionsParcel = (AppOpenAdOptionsParcel) dve.a(parcel, AppOpenAdOptionsParcel.CREATOR);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    if (queryLocalInterface10 instanceof qae) {
                        qae qaeVar = (qae) queryLocalInterface10;
                    } else {
                        new qae(readStrongBinder10);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 41:
                parcel2.writeNoException();
                dve.i(parcel2, null);
                return true;
            case 42:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if (queryLocalInterface11 instanceof qcc) {
                        qcc qccVar = (qcc) queryLocalInterface11;
                    } else {
                        new qca(readStrongBinder11);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 43:
                AdRequestParcel adRequestParcel = (AdRequestParcel) dve.a(parcel, AdRequestParcel.CREATOR);
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    if (queryLocalInterface12 instanceof qbc) {
                        qbc qbcVar = (qbc) queryLocalInterface12;
                    } else {
                        new qba(readStrongBinder12);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 44:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface13 instanceof rad) {
                        rad radVar = (rad) queryLocalInterface13;
                    } else {
                        new rab(readStrongBinder13);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    if (queryLocalInterface14 instanceof qbw) {
                        qbw qbwVar = (qbw) queryLocalInterface14;
                    } else {
                        new qbu(readStrongBinder14);
                    }
                }
                parcel2.writeNoException();
                return true;
        }
    }
}
