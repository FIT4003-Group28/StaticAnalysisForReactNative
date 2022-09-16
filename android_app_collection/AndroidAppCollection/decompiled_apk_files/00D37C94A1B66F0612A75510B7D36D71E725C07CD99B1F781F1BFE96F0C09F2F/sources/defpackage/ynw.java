package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ynw  reason: default package */
/* loaded from: classes4.dex */
public final class ynw extends ynx {
    private final ynv b;

    public ynw(PackageManager packageManager, ynv ynvVar) {
        super(packageManager);
        this.b = ynvVar;
    }

    @Override // defpackage.ynx, android.content.pm.PackageManager
    public final ProviderInfo resolveContentProvider(String str, int i) {
        ProviderInfo resolveContentProvider = this.a.resolveContentProvider(str, i);
        ynv ynvVar = this.b;
        if (ynvVar.a(resolveContentProvider, i)) {
            if (resolveContentProvider.metaData == null) {
                zep.m("PatchedPackageManager", "patching ProviderInfo. Metadata was null");
                resolveContentProvider.metaData = new Bundle(ynvVar.b);
            } else {
                zep.m("PatchedPackageManager", "patching ProviderInfo. Metadata was not null");
                resolveContentProvider.metaData.putAll(ynvVar.b);
            }
        }
        if (this.b.a(resolveContentProvider, i)) {
            String valueOf = String.valueOf(resolveContentProvider);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
            sb.append("resolveContentProvider flags: ");
            sb.append(i);
            sb.append(" ret: ");
            sb.append(valueOf);
            zep.m("PatchedPackageManager", sb.toString());
        }
        return resolveContentProvider;
    }
}
