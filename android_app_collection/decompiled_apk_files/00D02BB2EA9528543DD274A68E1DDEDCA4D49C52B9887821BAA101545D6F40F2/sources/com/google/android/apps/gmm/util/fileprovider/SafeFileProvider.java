package com.google.android.apps.gmm.util.fileprovider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes.dex */
public class SafeFileProvider extends ja {
    @Override // defpackage.ja, android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        PackageManager packageManager = context.getPackageManager();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(providerInfo.authority, 128);
        if (resolveContentProvider == null || resolveContentProvider.loadXmlMetaData(packageManager, "android.support.FILE_PROVIDER_PATHS") == null) {
            Bundle bundle = new Bundle(1);
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", R.xml.filepaths);
            context = new ckla(context, new ckkz(context.getPackageManager(), new ckky(providerInfo.authority, bundle)));
        }
        super.attachInfo(context, providerInfo);
    }
}
