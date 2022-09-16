package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.youtube.api.service.YouTubeService;
/* compiled from: PG */
/* renamed from: alxv  reason: default package */
/* loaded from: classes.dex */
public final class alxv extends alyp {
    final /* synthetic */ YouTubeService a;
    private final ord b;

    public alxv(YouTubeService youTubeService, ord ordVar, byte[] bArr, byte[] bArr2) {
        this.a = youTubeService;
        this.b = ordVar;
    }

    @Override // defpackage.alyp
    public final void a(alyc alycVar, int i, String str, String str2, String str3) {
        if (i < 1000) {
            YouTubeService.a(alycVar, 9);
            return;
        }
        YouTubeService youTubeService = this.a;
        int callingUid = Binder.getCallingUid();
        if (!TextUtils.isEmpty(str)) {
            rfg a = rfb.a(youTubeService);
            String[] packagesForUid = a.a.getPackageManager().getPackagesForUid(callingUid);
            if (packagesForUid == null) {
                rfe a2 = rfe.a(a.a);
                if (a2 != null) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putInt("uid", callingUid);
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            Bundle call = a2.a.getContentResolver().call(rff.a, "getAppPackageForUid", (String) null, bundle);
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                            if (call != null) {
                                String string = call.getString("result");
                                if (string != null) {
                                    packagesForUid = new String[]{string};
                                }
                            } else {
                                throw new RemoteException();
                            }
                        } catch (IllegalArgumentException unused) {
                            rfe.b();
                            throw new RemoteException("IAE: Content provider unavailable. Likely GmsCore down.");
                        } catch (SecurityException unused2) {
                            rfe.b();
                            throw new RemoteException("SecurityException: Content provider unavailable. Likely framework issue.");
                        }
                    } catch (RemoteException e) {
                        Log.e("InstantAppsPMW", "Error getting app package for UID", e);
                    }
                }
                packagesForUid = null;
            }
            if (str != null && packagesForUid != null) {
                for (String str4 : packagesForUid) {
                    if (str.equals(str4)) {
                        YouTubeService youTubeService2 = this.a;
                        alxy alxyVar = new alxy(youTubeService2, youTubeService2.a, str, alycVar, this.b, null, null);
                        String b = alyz.b(i);
                        str2.getClass();
                        str3.getClass();
                        oon.n(alxyVar, alxyVar.c, alxyVar.b, str3, alxyVar.d, str2, b, alxy.a.contains(alxyVar.d), 2);
                        return;
                    }
                }
            }
        }
        YouTubeService.a(alycVar, 2);
    }
}
