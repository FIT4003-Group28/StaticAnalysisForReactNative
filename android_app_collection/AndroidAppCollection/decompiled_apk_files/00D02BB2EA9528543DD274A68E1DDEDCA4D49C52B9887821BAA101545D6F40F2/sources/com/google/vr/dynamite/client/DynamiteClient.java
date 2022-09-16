package com.google.vr.dynamite.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.ArrayMap;
import dalvik.system.DexClassLoader;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class DynamiteClient {
    private static final ArrayMap<dujc, dujb> a = new ArrayMap<>();

    private DynamiteClient() {
    }

    public static synchronized int checkVersion(Context context, String str, String str2, String str3) {
        synchronized (DynamiteClient.class) {
            dujc dujcVar = new dujc(str, str2);
            dujb remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(dujcVar);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.a(context).newNativeLibraryLoader(ObjectWrapper.b(remoteLibraryLoaderFromInfo.b(context)), ObjectWrapper.b(context));
                if (newNativeLibraryLoader == null) {
                    String valueOf = String.valueOf(dujcVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
                    sb.append("Failed to load native library ");
                    sb.append(valueOf);
                    sb.append(" from remote package: no loader available.");
                    sb.toString();
                    return -1;
                }
                return newNativeLibraryLoader.checkVersion(str3);
            } catch (RemoteException | duja | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError unused) {
                String valueOf2 = String.valueOf(dujcVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 54);
                sb2.append("Failed to load native library ");
                sb2.append(valueOf2);
                sb2.append(" from remote package:\n  ");
                sb2.toString();
                return -1;
            }
        }
    }

    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, str2);
            if (remoteContext == null) {
                return null;
            }
            return remoteContext.getClassLoader();
        }
    }

    public static synchronized Context getRemoteContext(Context context, String str, String str2) {
        Context b;
        synchronized (DynamiteClient.class) {
            dujc dujcVar = new dujc(str, str2);
            try {
                b = getRemoteLibraryLoaderFromInfo(dujcVar).b(context);
            } catch (duja unused) {
                String valueOf = String.valueOf(dujcVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                sb.append("Failed to get remote Context");
                sb.append(valueOf);
                sb.append(" from remote package:\n  ");
                sb.toString();
                return null;
            }
        }
        return b;
    }

    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, null);
            if (remoteContext == null) {
                return null;
            }
            try {
                return new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    private static synchronized dujb getRemoteLibraryLoaderFromInfo(dujc dujcVar) {
        synchronized (DynamiteClient.class) {
            ArrayMap<dujc, dujb> arrayMap = a;
            dujb dujbVar = arrayMap.get(dujcVar);
            if (dujbVar == null) {
                dujb dujbVar2 = new dujb(dujcVar);
                arrayMap.put(dujcVar, dujbVar2);
                return dujbVar2;
            }
            return dujbVar;
        }
    }

    public static synchronized long loadNativeRemoteLibrary(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            dujc dujcVar = new dujc(str, str2);
            dujb remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(dujcVar);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.a(context).newNativeLibraryLoader(ObjectWrapper.b(remoteLibraryLoaderFromInfo.b(context)), ObjectWrapper.b(context));
                if (newNativeLibraryLoader == null) {
                    String valueOf = String.valueOf(dujcVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
                    sb.append("Failed to load native library ");
                    sb.append(valueOf);
                    sb.append(" from remote package: no loader available.");
                    sb.toString();
                    return 0L;
                }
                return newNativeLibraryLoader.initializeAndLoadNativeLibrary(str2);
            } catch (RemoteException | duja | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError unused) {
                String valueOf2 = String.valueOf(dujcVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 54);
                sb2.append("Failed to load native library ");
                sb2.append(valueOf2);
                sb2.append(" from remote package:\n  ");
                sb2.toString();
                return 0L;
            }
        }
    }
}
