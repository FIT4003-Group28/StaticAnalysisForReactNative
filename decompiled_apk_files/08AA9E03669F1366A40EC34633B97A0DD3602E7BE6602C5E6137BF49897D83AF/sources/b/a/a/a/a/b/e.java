package b.a.a.a.a.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdvertisingInfoServiceStrategy.java */
/* loaded from: classes.dex */
public class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1059a;

    public e(Context context) {
        this.f1059a = context.getApplicationContext();
    }

    @Override // b.a.a.a.a.b.f
    public b.a.a.a.a.b.b a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b.a.a.a.c.h().a("Fabric", "AdvertisingInfoServiceStrategy cannot be called on the main thread");
            return null;
        }
        try {
            this.f1059a.getPackageManager().getPackageInfo("com.android.vending", 0);
            a aVar = new a();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (this.f1059a.bindService(intent, aVar, 1)) {
                    try {
                        b bVar = new b(aVar.a());
                        b.a.a.a.a.b.b bVar2 = new b.a.a.a.a.b.b(bVar.a(), bVar.b());
                        this.f1059a.unbindService(aVar);
                        return bVar2;
                    } catch (Exception e) {
                        b.a.a.a.c.h().d("Fabric", "Exception in binding to Google Play Service to capture AdvertisingId", e);
                        this.f1059a.unbindService(aVar);
                    }
                } else {
                    b.a.a.a.c.h().a("Fabric", "Could not bind to Google Play Service to capture AdvertisingId");
                }
            } catch (Throwable th) {
                b.a.a.a.c.h().a("Fabric", "Could not bind to Google Play Service to capture AdvertisingId", th);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            b.a.a.a.c.h().a("Fabric", "Unable to find Google Play Services package name");
            return null;
        } catch (Exception e2) {
            b.a.a.a.c.h().a("Fabric", "Unable to determine if Google Play Services is available", e2);
            return null;
        }
    }

    /* compiled from: AdvertisingInfoServiceStrategy.java */
    /* loaded from: classes.dex */
    private static final class a implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1060a;

        /* renamed from: b  reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f1061b;

        private a() {
            this.f1060a = false;
            this.f1061b = new LinkedBlockingQueue<>(1);
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f1061b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            this.f1061b.clear();
        }

        public IBinder a() {
            if (this.f1060a) {
                b.a.a.a.c.h().e("Fabric", "getBinder already called");
            }
            this.f1060a = true;
            try {
                return this.f1061b.poll(200L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                return null;
            }
        }
    }

    /* compiled from: AdvertisingInfoServiceStrategy.java */
    /* loaded from: classes.dex */
    private static final class b implements IInterface {

        /* renamed from: a  reason: collision with root package name */
        private final IBinder f1062a;

        public b(IBinder iBinder) {
            this.f1062a = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f1062a;
        }

        public String a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.f1062a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } catch (Exception unused) {
                    b.a.a.a.c.h().a("Fabric", "Could not get parcel from Google Play Service to capture AdvertisingId");
                    obtain2.recycle();
                    obtain.recycle();
                    return null;
                }
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public boolean b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            boolean z = false;
            try {
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    obtain.writeInt(1);
                    this.f1062a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                } catch (Exception unused) {
                    b.a.a.a.c.h().a("Fabric", "Could not get parcel from Google Play Service to capture Advertising limitAdTracking");
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
