package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* loaded from: classes.dex */
final class zzb implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.remoteVersion = iVersions.getRemoteVersion(context, str, true);
        if (selectionResult.remoteVersion != 0) {
            selectionResult.selection = 1;
            return selectionResult;
        }
        selectionResult.localVersion = iVersions.getLocalVersion(context, str);
        if (selectionResult.localVersion != 0) {
            selectionResult.selection = -1;
        }
        return selectionResult;
    }
}
