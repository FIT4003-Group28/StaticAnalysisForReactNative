package defpackage;

import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ynv  reason: default package */
/* loaded from: classes4.dex */
public final class ynv {
    public final String a;
    public final Bundle b;

    public ynv(Bundle bundle) {
        this.a = "__EMPTY_ROOT__";
        this.b = bundle;
    }

    public ynv(String str, Bundle bundle) {
        str.getClass();
        this.a = str;
        this.b = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(ProviderInfo providerInfo, int i) {
        return (i & 128) == 128 && TextUtils.equals(providerInfo.authority, this.a);
    }
}
