package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.instream.InstreamAdConfigurationParcel;
/* compiled from: PG */
/* renamed from: qbh  reason: default package */
/* loaded from: classes4.dex */
public final class qbh extends dvd implements qbi {
    public qaz a;

    public qbh() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // defpackage.qbi
    public final qbf a() {
        return new qbe(this);
    }

    @Override // defpackage.qbi
    public final void f(String str, qea qeaVar, qdx qdxVar) {
    }

    @Override // defpackage.qbi
    public final void g(qee qeeVar) {
    }

    @Override // defpackage.qbi
    public final void h(qaz qazVar) {
        this.a = qazVar;
    }

    @Override // defpackage.qbi
    public final void i(NativeAdOptionsParcel nativeAdOptionsParcel) {
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        qaz qaxVar;
        switch (i) {
            case 1:
                qbf a = a();
                parcel2.writeNoException();
                dve.i(parcel2, a);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    qaxVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof qaz) {
                        qaxVar = (qaz) queryLocalInterface;
                    } else {
                        qaxVar = new qax(readStrongBinder);
                    }
                }
                this.a = qaxVar;
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    if (queryLocalInterface2 instanceof qdt) {
                        qdt qdtVar = (qdt) queryLocalInterface2;
                    } else {
                        new qdt(readStrongBinder2);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    if (queryLocalInterface3 instanceof qdu) {
                        qdu qduVar = (qdu) queryLocalInterface3;
                    } else {
                        new qdu(readStrongBinder3);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    if (queryLocalInterface4 instanceof qea) {
                        qea qeaVar = (qea) queryLocalInterface4;
                    } else {
                        new qdy(readStrongBinder4);
                    }
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    if (queryLocalInterface5 instanceof qdx) {
                        qdx qdxVar = (qdx) queryLocalInterface5;
                    } else {
                        new qdv(readStrongBinder5);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                NativeAdOptionsParcel nativeAdOptionsParcel = (NativeAdOptionsParcel) dve.a(parcel, NativeAdOptionsParcel.CREATOR);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface6 instanceof qbt) {
                        qbt qbtVar = (qbt) queryLocalInterface6;
                    } else {
                        new qbt(readStrongBinder6);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    if (queryLocalInterface7 instanceof qeb) {
                        qeb qebVar = (qeb) queryLocalInterface7;
                    } else {
                        new qeb(readStrongBinder7);
                    }
                }
                AdSizeParcel adSizeParcel = (AdSizeParcel) dve.a(parcel, AdSizeParcel.CREATOR);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) dve.a(parcel, PublisherAdViewOptions.CREATOR);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    if (queryLocalInterface8 instanceof qee) {
                        qee qeeVar = (qee) queryLocalInterface8;
                    } else {
                        new qec(readStrongBinder8);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                InstreamAdConfigurationParcel instreamAdConfigurationParcel = (InstreamAdConfigurationParcel) dve.a(parcel, InstreamAdConfigurationParcel.CREATOR);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    if (queryLocalInterface9 instanceof qel) {
                        qel qelVar = (qel) queryLocalInterface9;
                    } else {
                        new qel(readStrongBinder9);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) dve.a(parcel, AdManagerAdViewOptions.CREATOR);
                parcel2.writeNoException();
                return true;
        }
    }
}
