package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.measurement.api.internal.InitializationParams;
/* compiled from: PG */
/* renamed from: rhf  reason: default package */
/* loaded from: classes4.dex */
public abstract class rhf extends dvd implements rhg {
    public rhf() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static rhg asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof rhg) {
            return (rhg) queryLocalInterface;
        }
        return new rhe(iBinder);
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        rhj rhhVar;
        rad rabVar;
        rad rabVar2;
        rad radVar;
        rad rabVar3;
        rad rabVar4;
        rad rabVar5;
        rad rabVar6;
        rad radVar2;
        rad radVar3 = null;
        rhj rhjVar = null;
        rhj rhjVar2 = null;
        rhl rhlVar = null;
        rhl rhlVar2 = null;
        rhl rhlVar3 = null;
        rhj rhjVar3 = null;
        rhj rhjVar4 = null;
        rad radVar4 = null;
        rad radVar5 = null;
        rad radVar6 = null;
        rad radVar7 = null;
        rad radVar8 = null;
        rad radVar9 = null;
        rhj rhjVar5 = null;
        rhj rhjVar6 = null;
        rhj rhjVar7 = null;
        rhj rhjVar8 = null;
        rhn rhnVar = null;
        rhj rhjVar9 = null;
        rhj rhjVar10 = null;
        rhj rhjVar11 = null;
        rhj rhjVar12 = null;
        rhj rhjVar13 = null;
        rad radVar10 = null;
        rhj rhjVar14 = null;
        switch (i) {
            case 1:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof rad) {
                        radVar3 = (rad) queryLocalInterface;
                    } else {
                        radVar3 = new rab(readStrongBinder);
                    }
                }
                initialize(radVar3, (InitializationParams) dve.a(parcel, InitializationParams.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) dve.a(parcel, Bundle.CREATOR), dve.j(parcel), dve.j(parcel), parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) dve.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof rhj) {
                        rhhVar = (rhj) queryLocalInterface2;
                    } else {
                        rhhVar = new rhh(readStrongBinder2);
                    }
                    rhjVar14 = rhhVar;
                }
                logEventAndBundle(readString, readString2, bundle, rhjVar14, parcel.readLong());
                break;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface3 instanceof rad) {
                        rabVar = (rad) queryLocalInterface3;
                    } else {
                        rabVar = new rab(readStrongBinder3);
                    }
                    radVar10 = rabVar;
                }
                setUserProperty(readString3, readString4, radVar10, dve.j(parcel), parcel.readLong());
                break;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean j = dve.j(parcel);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof rhj) {
                        rhjVar13 = (rhj) queryLocalInterface4;
                    } else {
                        rhjVar13 = new rhh(readStrongBinder4);
                    }
                }
                getUserProperties(readString5, readString6, j, rhjVar13);
                break;
            case 6:
                String readString7 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof rhj) {
                        rhjVar12 = (rhj) queryLocalInterface5;
                    } else {
                        rhjVar12 = new rhh(readStrongBinder5);
                    }
                }
                getMaxUserProperties(readString7, rhjVar12);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) dve.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) dve.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof rhj) {
                        rhjVar11 = (rhj) queryLocalInterface6;
                    } else {
                        rhjVar11 = new rhh(readStrongBinder6);
                    }
                }
                getConditionalUserProperties(readString8, readString9, rhjVar11);
                break;
            case 11:
                setMeasurementEnabled(dve.j(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 == null) {
                    radVar = null;
                } else {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface7 instanceof rad) {
                        rabVar2 = (rad) queryLocalInterface7;
                    } else {
                        rabVar2 = new rab(readStrongBinder7);
                    }
                    radVar = rabVar2;
                }
                setCurrentScreen(radVar, parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof rhj) {
                        rhjVar10 = (rhj) queryLocalInterface8;
                    } else {
                        rhjVar10 = new rhh(readStrongBinder8);
                    }
                }
                getCurrentScreenName(rhjVar10);
                break;
            case 17:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof rhj) {
                        rhjVar9 = (rhj) queryLocalInterface9;
                    } else {
                        rhjVar9 = new rhh(readStrongBinder9);
                    }
                }
                getCurrentScreenClass(rhjVar9);
                break;
            case 18:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface10 instanceof rhn) {
                        rhnVar = (rhn) queryLocalInterface10;
                    } else {
                        rhnVar = new rhm(readStrongBinder10);
                    }
                }
                setInstanceIdProvider(rhnVar);
                break;
            case 19:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof rhj) {
                        rhjVar8 = (rhj) queryLocalInterface11;
                    } else {
                        rhjVar8 = new rhh(readStrongBinder11);
                    }
                }
                getCachedAppInstanceId(rhjVar8);
                break;
            case 20:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof rhj) {
                        rhjVar7 = (rhj) queryLocalInterface12;
                    } else {
                        rhjVar7 = new rhh(readStrongBinder12);
                    }
                }
                getAppInstanceId(rhjVar7);
                break;
            case 21:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof rhj) {
                        rhjVar6 = (rhj) queryLocalInterface13;
                    } else {
                        rhjVar6 = new rhh(readStrongBinder13);
                    }
                }
                getGmpAppId(rhjVar6);
                break;
            case 22:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface14 instanceof rhj) {
                        rhjVar5 = (rhj) queryLocalInterface14;
                    } else {
                        rhjVar5 = new rhh(readStrongBinder14);
                    }
                }
                generateEventId(rhjVar5);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface15 instanceof rad) {
                        radVar9 = (rad) queryLocalInterface15;
                    } else {
                        radVar9 = new rab(readStrongBinder15);
                    }
                }
                onActivityStarted(radVar9, parcel.readLong());
                break;
            case 26:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface16 instanceof rad) {
                        radVar8 = (rad) queryLocalInterface16;
                    } else {
                        radVar8 = new rab(readStrongBinder16);
                    }
                }
                onActivityStopped(radVar8, parcel.readLong());
                break;
            case 27:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface17 instanceof rad) {
                        radVar7 = (rad) queryLocalInterface17;
                    } else {
                        radVar7 = new rab(readStrongBinder17);
                    }
                }
                onActivityCreated(radVar7, (Bundle) dve.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface18 instanceof rad) {
                        radVar6 = (rad) queryLocalInterface18;
                    } else {
                        radVar6 = new rab(readStrongBinder18);
                    }
                }
                onActivityDestroyed(radVar6, parcel.readLong());
                break;
            case 29:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface19 instanceof rad) {
                        radVar5 = (rad) queryLocalInterface19;
                    } else {
                        radVar5 = new rab(readStrongBinder19);
                    }
                }
                onActivityPaused(radVar5, parcel.readLong());
                break;
            case 30:
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface20 instanceof rad) {
                        radVar4 = (rad) queryLocalInterface20;
                    } else {
                        radVar4 = new rab(readStrongBinder20);
                    }
                }
                onActivityResumed(radVar4, parcel.readLong());
                break;
            case 31:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 == null) {
                    rabVar3 = null;
                } else {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface21 instanceof rad) {
                        rabVar3 = (rad) queryLocalInterface21;
                    } else {
                        rabVar3 = new rab(readStrongBinder21);
                    }
                }
                IBinder readStrongBinder22 = parcel.readStrongBinder();
                if (readStrongBinder22 != null) {
                    IInterface queryLocalInterface22 = readStrongBinder22.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface22 instanceof rhj) {
                        rhjVar4 = (rhj) queryLocalInterface22;
                    } else {
                        rhjVar4 = new rhh(readStrongBinder22);
                    }
                }
                onActivitySaveInstanceState(rabVar3, rhjVar4, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) dve.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder23 = parcel.readStrongBinder();
                if (readStrongBinder23 != null) {
                    IInterface queryLocalInterface23 = readStrongBinder23.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface23 instanceof rhj) {
                        rhjVar3 = (rhj) queryLocalInterface23;
                    } else {
                        rhjVar3 = new rhh(readStrongBinder23);
                    }
                }
                performAction(bundle2, rhjVar3, parcel.readLong());
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString10 = parcel.readString();
                IBinder readStrongBinder24 = parcel.readStrongBinder();
                if (readStrongBinder24 == null) {
                    rabVar4 = null;
                } else {
                    IInterface queryLocalInterface24 = readStrongBinder24.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface24 instanceof rad) {
                        rabVar4 = (rad) queryLocalInterface24;
                    } else {
                        rabVar4 = new rab(readStrongBinder24);
                    }
                }
                IBinder readStrongBinder25 = parcel.readStrongBinder();
                if (readStrongBinder25 == null) {
                    rabVar5 = null;
                } else {
                    IInterface queryLocalInterface25 = readStrongBinder25.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface25 instanceof rad) {
                        rabVar5 = (rad) queryLocalInterface25;
                    } else {
                        rabVar5 = new rab(readStrongBinder25);
                    }
                }
                IBinder readStrongBinder26 = parcel.readStrongBinder();
                if (readStrongBinder26 == null) {
                    radVar2 = null;
                } else {
                    IInterface queryLocalInterface26 = readStrongBinder26.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface26 instanceof rad) {
                        rabVar6 = (rad) queryLocalInterface26;
                    } else {
                        rabVar6 = new rab(readStrongBinder26);
                    }
                    radVar2 = rabVar6;
                }
                logHealthData(readInt, readString10, rabVar4, rabVar5, radVar2);
                break;
            case 34:
                IBinder readStrongBinder27 = parcel.readStrongBinder();
                if (readStrongBinder27 != null) {
                    IInterface queryLocalInterface27 = readStrongBinder27.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface27 instanceof rhl) {
                        rhlVar3 = (rhl) queryLocalInterface27;
                    } else {
                        rhlVar3 = new rhk(readStrongBinder27);
                    }
                }
                setEventInterceptor(rhlVar3);
                break;
            case 35:
                IBinder readStrongBinder28 = parcel.readStrongBinder();
                if (readStrongBinder28 != null) {
                    IInterface queryLocalInterface28 = readStrongBinder28.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface28 instanceof rhl) {
                        rhlVar2 = (rhl) queryLocalInterface28;
                    } else {
                        rhlVar2 = new rhk(readStrongBinder28);
                    }
                }
                registerOnMeasurementEventListener(rhlVar2);
                break;
            case 36:
                IBinder readStrongBinder29 = parcel.readStrongBinder();
                if (readStrongBinder29 != null) {
                    IInterface queryLocalInterface29 = readStrongBinder29.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface29 instanceof rhl) {
                        rhlVar = (rhl) queryLocalInterface29;
                    } else {
                        rhlVar = new rhk(readStrongBinder29);
                    }
                }
                unregisterOnMeasurementEventListener(rhlVar);
                break;
            case 37:
                initForTests(dve.d(parcel));
                break;
            case 38:
                IBinder readStrongBinder30 = parcel.readStrongBinder();
                if (readStrongBinder30 != null) {
                    IInterface queryLocalInterface30 = readStrongBinder30.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface30 instanceof rhj) {
                        rhjVar2 = (rhj) queryLocalInterface30;
                    } else {
                        rhjVar2 = new rhh(readStrongBinder30);
                    }
                }
                getTestFlag(rhjVar2, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(dve.j(parcel));
                break;
            case 40:
                IBinder readStrongBinder31 = parcel.readStrongBinder();
                if (readStrongBinder31 != null) {
                    IInterface queryLocalInterface31 = readStrongBinder31.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface31 instanceof rhj) {
                        rhjVar = (rhj) queryLocalInterface31;
                    } else {
                        rhjVar = new rhh(readStrongBinder31);
                    }
                }
                isDataCollectionEnabled(rhjVar);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) dve.a(parcel, Bundle.CREATOR));
                break;
            case 43:
                clearMeasurementEnabled(parcel.readLong());
                break;
            case 44:
                setConsent((Bundle) dve.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 45:
                setConsentThirdParty((Bundle) dve.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
