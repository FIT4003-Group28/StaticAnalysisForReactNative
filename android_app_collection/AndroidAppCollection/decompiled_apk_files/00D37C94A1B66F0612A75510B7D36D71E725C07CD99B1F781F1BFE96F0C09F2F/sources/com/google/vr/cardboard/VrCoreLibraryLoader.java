package com.google.vr.cardboard;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.ndk.base.Version;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import com.google.vr.vrcore.library.api.ObjectWrapper;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class VrCoreLibraryLoader {
    public static long loadNativeDlsymMethod(Context context) {
        if (Build.VERSION.SDK_INT > 23) {
            return 0L;
        }
        try {
            if (VrCoreUtils.getVrCoreClientApiVersion(context) < 14) {
                return 0L;
            }
            axgl a = axij.h(context).a(ObjectWrapper.a(axij.g(context)), ObjectWrapper.a(context));
            if (a != null) {
                Parcel pw = a.pw(4, a.pv());
                long readLong = pw.readLong();
                pw.recycle();
                return readLong;
            }
            Log.e("VrCoreLibraryLoader", "Failed to load native dlsym handle from VrCore: no library loader available.");
            return 0L;
        } catch (RemoteException | axfj | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
            sb.append("Failed to load native dlsym handle from VrCore:\n  ");
            sb.append(valueOf);
            Log.e("VrCoreLibraryLoader", sb.toString());
            return 0L;
        }
    }

    public static long loadNativeGvrLibrary(Context context) {
        return loadNativeGvrLibrary(context, Version.MIN, Version.CURRENT);
    }

    public static long loadNativeGvrLibrary(Context context, Version version, Version version2) {
        try {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
                if (applicationInfo == null) {
                    throw new axfj(8);
                }
                if (!applicationInfo.enabled) {
                    throw new axfj(2);
                }
                if (applicationInfo.metaData == null) {
                    throw new axfj(4);
                }
                String string = applicationInfo.metaData.getString("com.google.vr.vrcore.SdkLibraryVersion", "");
                if (string.isEmpty()) {
                    throw new axfj(4);
                }
                String substring = string.substring(1);
                Version parse = Version.parse(substring);
                if (parse == null) {
                    throw new axfj(4);
                }
                if (parse.isAtLeast(version)) {
                    Context g = axij.g(context);
                    axij.g(context);
                    int i = axij.b;
                    axgl a = axij.h(context).a(ObjectWrapper.a(g), ObjectWrapper.a(context));
                    if (a == null) {
                        Log.e("VrCoreLibraryLoader", "Failed to load native GVR library from VrCore: no library loader available.");
                        return 0L;
                    } else if (i < 19) {
                        int i2 = version2.majorVersion;
                        int i3 = version2.minorVersion;
                        int i4 = version2.patchVersion;
                        Parcel pv = a.pv();
                        pv.writeInt(i2);
                        pv.writeInt(i3);
                        pv.writeInt(i4);
                        Parcel pw = a.pw(2, pv);
                        long readLong = pw.readLong();
                        pw.recycle();
                        return readLong;
                    } else {
                        String version3 = version.toString();
                        String version4 = version2.toString();
                        Parcel pv2 = a.pv();
                        pv2.writeString(version3);
                        pv2.writeString(version4);
                        Parcel pw2 = a.pw(5, pv2);
                        long readLong2 = pw2.readLong();
                        pw2.recycle();
                        return readLong2;
                    }
                }
                Log.w("VrCoreLibraryLoader", String.format("VrCore GVR library version obsolete; VrCore supports %s but client min is %s", substring, version.toString()));
                throw new axfj(4);
            } catch (PackageManager.NameNotFoundException unused) {
                throw new axfj(VrCoreUtils.a(context));
            }
        } catch (RemoteException e) {
            e = e;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Failed to load native GVR library from VrCore:\n  ");
            sb.append(valueOf);
            Log.e("VrCoreLibraryLoader", sb.toString());
            return 0L;
        } catch (axfj e2) {
            e = e2;
            String valueOf2 = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 49);
            sb2.append("Failed to load native GVR library from VrCore:\n  ");
            sb2.append(valueOf2);
            Log.e("VrCoreLibraryLoader", sb2.toString());
            return 0L;
        } catch (IllegalArgumentException e3) {
            e = e3;
            String valueOf22 = String.valueOf(e);
            StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf22).length() + 49);
            sb22.append("Failed to load native GVR library from VrCore:\n  ");
            sb22.append(valueOf22);
            Log.e("VrCoreLibraryLoader", sb22.toString());
            return 0L;
        } catch (IllegalStateException e4) {
            e = e4;
            String valueOf222 = String.valueOf(e);
            StringBuilder sb222 = new StringBuilder(String.valueOf(valueOf222).length() + 49);
            sb222.append("Failed to load native GVR library from VrCore:\n  ");
            sb222.append(valueOf222);
            Log.e("VrCoreLibraryLoader", sb222.toString());
            return 0L;
        } catch (SecurityException e5) {
            e = e5;
            String valueOf2222 = String.valueOf(e);
            StringBuilder sb2222 = new StringBuilder(String.valueOf(valueOf2222).length() + 49);
            sb2222.append("Failed to load native GVR library from VrCore:\n  ");
            sb2222.append(valueOf2222);
            Log.e("VrCoreLibraryLoader", sb2222.toString());
            return 0L;
        } catch (UnsatisfiedLinkError e6) {
            e = e6;
            String valueOf22222 = String.valueOf(e);
            StringBuilder sb22222 = new StringBuilder(String.valueOf(valueOf22222).length() + 49);
            sb22222.append("Failed to load native GVR library from VrCore:\n  ");
            sb22222.append(valueOf22222);
            Log.e("VrCoreLibraryLoader", sb22222.toString());
            return 0L;
        }
    }
}
