package defpackage;

import java.util.Comparator;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
/* compiled from: PG */
/* renamed from: eakc  reason: default package */
/* loaded from: classes6.dex */
public final class eakc implements Comparator<CronetProvider> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(CronetProvider cronetProvider, CronetProvider cronetProvider2) {
        CronetProvider cronetProvider3 = cronetProvider;
        CronetProvider cronetProvider4 = cronetProvider2;
        if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider3.getName())) {
            return 1;
        }
        if (!CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider4.getName())) {
            return -CronetEngine.Builder.compareVersions(cronetProvider3.getVersion(), cronetProvider4.getVersion());
        }
        return -1;
    }
}
