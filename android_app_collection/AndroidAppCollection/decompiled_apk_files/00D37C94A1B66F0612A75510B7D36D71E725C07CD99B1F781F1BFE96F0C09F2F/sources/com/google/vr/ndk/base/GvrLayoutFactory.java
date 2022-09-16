package com.google.vr.ndk.base;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import com.google.vr.vrcore.library.api.ObjectWrapper;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class GvrLayoutFactory {
    public static axgd create(Context context) {
        axgd tryCreateFromVrCorePackage = tryCreateFromVrCorePackage(context);
        if (tryCreateFromVrCorePackage == null) {
            if (GvrApi.usingShimLibrary()) {
                throw new IllegalStateException("Client shim failed to load GvrLayout from VrCore.");
            }
            return createFromCurrentPackage(context);
        }
        return tryCreateFromVrCorePackage;
    }

    private static axgd createFromCurrentPackage(Context context) {
        return new GvrLayoutImplWrapper(new GvrLayoutImpl(context));
    }

    private static axgd tryCreateFromVrCorePackage(Context context) {
        if ("com.google.vr.vrcore".equalsIgnoreCase(context.getPackageName())) {
            return createFromCurrentPackage(context);
        }
        if (context instanceof axff) {
            throw new IllegalArgumentException("VrContextWrapper only supported within VrCore.");
        }
        if (!GvrApi.usingDynamicLibrary(context)) {
            return null;
        }
        anfs params = SdkConfigurationReader.getParams(context);
        if (((params.bitField0_ & 1024) != 0 && params.allowDynamicJavaLibraryLoading_) || GvrApi.usingShimLibrary()) {
            try {
                if (VrCoreUtils.getVrCoreClientApiVersion(context) < 17) {
                    return null;
                }
                try {
                    Context g = axij.g(context);
                    axgk h = axij.h(context);
                    axgj a = ObjectWrapper.a(g);
                    axgj a2 = ObjectWrapper.a(context);
                    Parcel pv = h.pv();
                    dve.i(pv, a);
                    dve.i(pv, a2);
                    Parcel pw = h.pw(5, pv);
                    axgd asInterface = axgc.asInterface(pw.readStrongBinder());
                    pw.recycle();
                    if (asInterface == null) {
                        Log.w("GvrLayoutFactory", "GvrLayout creation from VrCore failed.");
                    }
                    return asInterface;
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                    sb.append("Failed to load GvrLayout from VrCore:\n  ");
                    sb.append(valueOf);
                    Log.e("GvrLayoutFactory", sb.toString());
                }
            } catch (axfj unused) {
            }
        }
        return null;
    }
}
