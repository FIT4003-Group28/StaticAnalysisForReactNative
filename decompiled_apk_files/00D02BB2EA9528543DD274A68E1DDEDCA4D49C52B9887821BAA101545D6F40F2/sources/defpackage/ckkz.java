package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ckkz  reason: default package */
/* loaded from: classes.dex */
public final class ckkz extends ckkx {
    private final ckky b;

    public ckkz(PackageManager packageManager, ckky ckkyVar) {
        super(packageManager);
        this.b = ckkyVar;
    }

    @Override // defpackage.ckkx, android.content.pm.PackageManager
    public final ProviderInfo resolveContentProvider(String str, int i) {
        ckky ckkyVar = this.b;
        ProviderInfo resolveContentProvider = super.resolveContentProvider(str, i);
        if (resolveContentProvider != null && (i & 128) != 0 && TextUtils.equals(resolveContentProvider.authority, ckkyVar.a)) {
            if (resolveContentProvider.metaData == null) {
                resolveContentProvider.metaData = new Bundle(ckkyVar.b);
            } else {
                resolveContentProvider.metaData.putAll(ckkyVar.b);
            }
        }
        return resolveContentProvider;
    }
}
