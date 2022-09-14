package c.e.a.b.d.g;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.e.a.b.c.a;
/* loaded from: classes.dex */
public abstract class ld extends e1 implements md {
    public ld() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static md asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof md ? (md) queryLocalInterface : new od(iBinder);
    }

    @Override // c.e.a.b.d.g.e1
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        nd pdVar;
        nd ndVar = null;
        nd ndVar2 = null;
        nd ndVar3 = null;
        c cVar = null;
        c cVar2 = null;
        c cVar3 = null;
        nd ndVar4 = null;
        nd ndVar5 = null;
        nd ndVar6 = null;
        nd ndVar7 = null;
        nd ndVar8 = null;
        nd ndVar9 = null;
        d dVar = null;
        nd ndVar10 = null;
        nd ndVar11 = null;
        nd ndVar12 = null;
        nd ndVar13 = null;
        switch (i) {
            case 1:
                initialize(a.AbstractBinderC0096a.a(parcel.readStrongBinder()), (f) b0.a(parcel, f.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) b0.a(parcel, Bundle.CREATOR), b0.a(parcel), b0.a(parcel), parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) b0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    pdVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    pdVar = queryLocalInterface instanceof nd ? (nd) queryLocalInterface : new pd(readStrongBinder);
                }
                logEventAndBundle(readString, readString2, bundle, pdVar, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), a.AbstractBinderC0096a.a(parcel.readStrongBinder()), b0.a(parcel), parcel.readLong());
                break;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean a2 = b0.a(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ndVar = queryLocalInterface2 instanceof nd ? (nd) queryLocalInterface2 : new pd(readStrongBinder2);
                }
                getUserProperties(readString3, readString4, a2, ndVar);
                break;
            case 6:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ndVar13 = queryLocalInterface3 instanceof nd ? (nd) queryLocalInterface3 : new pd(readStrongBinder3);
                }
                getMaxUserProperties(readString5, ndVar13);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) b0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) b0.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ndVar12 = queryLocalInterface4 instanceof nd ? (nd) queryLocalInterface4 : new pd(readStrongBinder4);
                }
                getConditionalUserProperties(readString6, readString7, ndVar12);
                break;
            case 11:
                setMeasurementEnabled(b0.a(parcel), parcel.readLong());
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
                setCurrentScreen(a.AbstractBinderC0096a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ndVar11 = queryLocalInterface5 instanceof nd ? (nd) queryLocalInterface5 : new pd(readStrongBinder5);
                }
                getCurrentScreenName(ndVar11);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ndVar10 = queryLocalInterface6 instanceof nd ? (nd) queryLocalInterface6 : new pd(readStrongBinder6);
                }
                getCurrentScreenClass(ndVar10);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    dVar = queryLocalInterface7 instanceof d ? (d) queryLocalInterface7 : new g(readStrongBinder7);
                }
                setInstanceIdProvider(dVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ndVar9 = queryLocalInterface8 instanceof nd ? (nd) queryLocalInterface8 : new pd(readStrongBinder8);
                }
                getCachedAppInstanceId(ndVar9);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ndVar8 = queryLocalInterface9 instanceof nd ? (nd) queryLocalInterface9 : new pd(readStrongBinder9);
                }
                getAppInstanceId(ndVar8);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ndVar7 = queryLocalInterface10 instanceof nd ? (nd) queryLocalInterface10 : new pd(readStrongBinder10);
                }
                getGmpAppId(ndVar7);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ndVar6 = queryLocalInterface11 instanceof nd ? (nd) queryLocalInterface11 : new pd(readStrongBinder11);
                }
                generateEventId(ndVar6);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(a.AbstractBinderC0096a.a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(a.AbstractBinderC0096a.a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(a.AbstractBinderC0096a.a(parcel.readStrongBinder()), (Bundle) b0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(a.AbstractBinderC0096a.a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(a.AbstractBinderC0096a.a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(a.AbstractBinderC0096a.a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                c.e.a.b.c.a a3 = a.AbstractBinderC0096a.a(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ndVar5 = queryLocalInterface12 instanceof nd ? (nd) queryLocalInterface12 : new pd(readStrongBinder12);
                }
                onActivitySaveInstanceState(a3, ndVar5, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) b0.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ndVar4 = queryLocalInterface13 instanceof nd ? (nd) queryLocalInterface13 : new pd(readStrongBinder13);
                }
                performAction(bundle2, ndVar4, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), a.AbstractBinderC0096a.a(parcel.readStrongBinder()), a.AbstractBinderC0096a.a(parcel.readStrongBinder()), a.AbstractBinderC0096a.a(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    cVar3 = queryLocalInterface14 instanceof c ? (c) queryLocalInterface14 : new e(readStrongBinder14);
                }
                setEventInterceptor(cVar3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    cVar2 = queryLocalInterface15 instanceof c ? (c) queryLocalInterface15 : new e(readStrongBinder15);
                }
                registerOnMeasurementEventListener(cVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    cVar = queryLocalInterface16 instanceof c ? (c) queryLocalInterface16 : new e(readStrongBinder16);
                }
                unregisterOnMeasurementEventListener(cVar);
                break;
            case 37:
                initForTests(b0.b(parcel));
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ndVar3 = queryLocalInterface17 instanceof nd ? (nd) queryLocalInterface17 : new pd(readStrongBinder17);
                }
                getTestFlag(ndVar3, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(b0.a(parcel));
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    ndVar2 = queryLocalInterface18 instanceof nd ? (nd) queryLocalInterface18 : new pd(readStrongBinder18);
                }
                isDataCollectionEnabled(ndVar2);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) b0.a(parcel, Bundle.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
