package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.initialization.MediationConfigurationParcel;
/* compiled from: PG */
/* renamed from: qep  reason: default package */
/* loaded from: classes4.dex */
public abstract class qep extends dvd implements qeq {
    public qep() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        rad rabVar;
        rad radVar;
        qet qerVar;
        rad rabVar2;
        rad rabVar3;
        rad radVar2;
        qet qerVar2;
        qet qetVar;
        rad rabVar4;
        rad radVar3;
        qet qerVar3;
        rad rabVar5;
        rad rabVar6;
        rad radVar4;
        qet qerVar4;
        rad rabVar7;
        rad radVar5;
        qet qetVar2 = null;
        rad radVar6 = null;
        rad radVar7 = null;
        rad radVar8 = null;
        rad radVar9 = null;
        qet qetVar3 = null;
        qfx qfxVar = null;
        qet qetVar4 = null;
        qet qetVar5 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    radVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof rad) {
                        rabVar = (rad) queryLocalInterface;
                    } else {
                        rabVar = new rab(readStrongBinder);
                    }
                    radVar = rabVar;
                }
                AdSizeParcel adSizeParcel = (AdSizeParcel) dve.a(parcel, AdSizeParcel.CREATOR);
                AdRequestParcel adRequestParcel = (AdRequestParcel) dve.a(parcel, AdRequestParcel.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof qet) {
                        qerVar = (qet) queryLocalInterface2;
                    } else {
                        qerVar = new qer(readStrongBinder2);
                    }
                    qetVar2 = qerVar;
                }
                i(radVar, adSizeParcel, adRequestParcel, readString, qetVar2);
                parcel2.writeNoException();
                return true;
            case 2:
                rad f = f();
                parcel2.writeNoException();
                dve.i(parcel2, f);
                return true;
            case 3:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    rabVar2 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof rad) {
                        rabVar2 = (rad) queryLocalInterface3;
                    } else {
                        rabVar2 = new rab(readStrongBinder3);
                    }
                }
                AdRequestParcel adRequestParcel2 = (AdRequestParcel) dve.a(parcel, AdRequestParcel.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof qet) {
                        qetVar5 = (qet) queryLocalInterface4;
                    } else {
                        qetVar5 = new qer(readStrongBinder4);
                    }
                }
                k(rabVar2, adRequestParcel2, readString2, qetVar5);
                parcel2.writeNoException();
                return true;
            case 4:
                r();
                parcel2.writeNoException();
                return true;
            case 5:
                g();
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    radVar2 = null;
                } else {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface5 instanceof rad) {
                        rabVar3 = (rad) queryLocalInterface5;
                    } else {
                        rabVar3 = new rab(readStrongBinder5);
                    }
                    radVar2 = rabVar3;
                }
                AdSizeParcel adSizeParcel2 = (AdSizeParcel) dve.a(parcel, AdSizeParcel.CREATOR);
                AdRequestParcel adRequestParcel3 = (AdRequestParcel) dve.a(parcel, AdRequestParcel.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 == null) {
                    qetVar = null;
                } else {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof qet) {
                        qerVar2 = (qet) queryLocalInterface6;
                    } else {
                        qerVar2 = new qer(readStrongBinder6);
                    }
                    qetVar = qerVar2;
                }
                j(radVar2, adSizeParcel2, adRequestParcel3, readString3, readString4, qetVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 == null) {
                    radVar3 = null;
                } else {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface7 instanceof rad) {
                        rabVar4 = (rad) queryLocalInterface7;
                    } else {
                        rabVar4 = new rab(readStrongBinder7);
                    }
                    radVar3 = rabVar4;
                }
                AdRequestParcel adRequestParcel4 = (AdRequestParcel) dve.a(parcel, AdRequestParcel.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface8 instanceof qet) {
                        qerVar3 = (qet) queryLocalInterface8;
                    } else {
                        qerVar3 = new qer(readStrongBinder8);
                    }
                    qetVar4 = qerVar3;
                }
                l(radVar3, adRequestParcel4, readString5, readString6, qetVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                o();
                parcel2.writeNoException();
                return true;
            case 9:
                p();
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 == null) {
                    rabVar5 = null;
                } else {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface9 instanceof rad) {
                        rabVar5 = (rad) queryLocalInterface9;
                    } else {
                        rabVar5 = new rab(readStrongBinder9);
                    }
                }
                AdRequestParcel adRequestParcel5 = (AdRequestParcel) dve.a(parcel, AdRequestParcel.CREATOR);
                parcel.readString();
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    if (queryLocalInterface10 instanceof qfx) {
                        qfxVar = (qfx) queryLocalInterface10;
                    } else {
                        qfxVar = new qfx(readStrongBinder10);
                    }
                }
                parcel.readString();
                B(rabVar5, qfxVar);
                parcel2.writeNoException();
                return true;
            case 11:
                h((AdRequestParcel) dve.a(parcel, AdRequestParcel.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                s();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean t = t();
                parcel2.writeNoException();
                dve.e(parcel2, t);
                return true;
            case 14:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 == null) {
                    radVar4 = null;
                } else {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface11 instanceof rad) {
                        rabVar6 = (rad) queryLocalInterface11;
                    } else {
                        rabVar6 = new rab(readStrongBinder11);
                    }
                    radVar4 = rabVar6;
                }
                AdRequestParcel adRequestParcel6 = (AdRequestParcel) dve.a(parcel, AdRequestParcel.CREATOR);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface12 instanceof qet) {
                        qerVar4 = (qet) queryLocalInterface12;
                    } else {
                        qerVar4 = new qer(readStrongBinder12);
                    }
                    qetVar3 = qerVar4;
                }
                m(radVar4, adRequestParcel6, readString7, readString8, qetVar3, (NativeAdOptionsParcel) dve.a(parcel, NativeAdOptionsParcel.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                dve.i(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                dve.i(parcel2, null);
                return true;
            case 17:
                Bundle a = a();
                parcel2.writeNoException();
                dve.h(parcel2, a);
                return true;
            case 18:
                Bundle b = b();
                parcel2.writeNoException();
                dve.h(parcel2, b);
                return true;
            case 19:
                Bundle c = c();
                parcel2.writeNoException();
                dve.h(parcel2, c);
                return true;
            case 20:
                String readString9 = parcel.readString();
                parcel.readString();
                w((AdRequestParcel) dve.a(parcel, AdRequestParcel.CREATOR), readString9);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface13 instanceof rad) {
                        radVar9 = (rad) queryLocalInterface13;
                    } else {
                        radVar9 = new rab(readStrongBinder13);
                    }
                }
                n(radVar9);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                dve.e(parcel2, false);
                return true;
            case 23:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface14 instanceof rad) {
                        rad radVar10 = (rad) queryLocalInterface14;
                    } else {
                        new rab(readStrongBinder14);
                    }
                }
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    if (queryLocalInterface15 instanceof qfx) {
                        qfx qfxVar2 = (qfx) queryLocalInterface15;
                    } else {
                        new qfx(readStrongBinder15);
                    }
                }
                parcel.createStringArrayList();
                u();
                parcel2.writeNoException();
                return true;
            case 24:
                qdr A = A();
                parcel2.writeNoException();
                dve.i(parcel2, A);
                return true;
            case 25:
                q(dve.j(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                qcg d = d();
                parcel2.writeNoException();
                dve.i(parcel2, d);
                return true;
            case 27:
                qew e = e();
                parcel2.writeNoException();
                dve.i(parcel2, e);
                return true;
            case 28:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface16 instanceof rad) {
                        radVar8 = (rad) queryLocalInterface16;
                    } else {
                        radVar8 = new rab(readStrongBinder16);
                    }
                }
                AdRequestParcel adRequestParcel7 = (AdRequestParcel) dve.a(parcel, AdRequestParcel.CREATOR);
                String readString10 = parcel.readString();
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface17 instanceof qet) {
                        qet qetVar6 = (qet) queryLocalInterface17;
                    } else {
                        new qer(readStrongBinder17);
                    }
                }
                v(radVar8, adRequestParcel7, readString10);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface18 instanceof rad) {
                        rad radVar11 = (rad) queryLocalInterface18;
                    } else {
                        new rab(readStrongBinder18);
                    }
                }
                z();
                parcel2.writeNoException();
                return true;
            case 31:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface19 instanceof rad) {
                        radVar7 = (rad) queryLocalInterface19;
                    } else {
                        radVar7 = new rab(readStrongBinder19);
                    }
                }
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    if (queryLocalInterface20 instanceof qek) {
                        qek qekVar = (qek) queryLocalInterface20;
                    } else {
                        new qek(readStrongBinder20);
                    }
                }
                E(radVar7, parcel.createTypedArrayList(MediationConfigurationParcel.CREATOR));
                parcel2.writeNoException();
                return true;
            case 32:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface21 instanceof rad) {
                        radVar6 = (rad) queryLocalInterface21;
                    } else {
                        radVar6 = new rab(readStrongBinder21);
                    }
                }
                AdRequestParcel adRequestParcel8 = (AdRequestParcel) dve.a(parcel, AdRequestParcel.CREATOR);
                String readString11 = parcel.readString();
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface22 instanceof qet) {
                        qet qetVar7 = (qet) queryLocalInterface22;
                    } else {
                        new qer(readStrongBinder22);
                    }
                }
                x(radVar6, adRequestParcel8, readString11);
                parcel2.writeNoException();
                return true;
            case 33:
                C();
                parcel2.writeNoException();
                dve.h(parcel2, null);
                return true;
            case 34:
                D();
                parcel2.writeNoException();
                dve.h(parcel2, null);
                return true;
            case 35:
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 == null) {
                    radVar5 = null;
                } else {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface23 instanceof rad) {
                        rabVar7 = (rad) queryLocalInterface23;
                    } else {
                        rabVar7 = new rab(readStrongBinder23);
                    }
                    radVar5 = rabVar7;
                }
                AdSizeParcel adSizeParcel3 = (AdSizeParcel) dve.a(parcel, AdSizeParcel.CREATOR);
                AdRequestParcel adRequestParcel9 = (AdRequestParcel) dve.a(parcel, AdRequestParcel.CREATOR);
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                IBinder readStrongBinder24 = parcel.readStrongBinder();
                if (readStrongBinder24 != null) {
                    IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface24 instanceof qet) {
                        qet qetVar8 = (qet) queryLocalInterface24;
                    } else {
                        new qer(readStrongBinder24);
                    }
                }
                F(radVar5, adSizeParcel3, adRequestParcel9, readString12, readString13);
                parcel2.writeNoException();
                return true;
            case 36:
                parcel2.writeNoException();
                dve.i(parcel2, null);
                return true;
            case 37:
                IBinder readStrongBinder25 = parcel.readStrongBinder();
                if (readStrongBinder25 != null) {
                    IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface25 instanceof rad) {
                        rad radVar12 = (rad) queryLocalInterface25;
                    } else {
                        new rab(readStrongBinder25);
                    }
                }
                y();
                parcel2.writeNoException();
                return true;
        }
    }
}
