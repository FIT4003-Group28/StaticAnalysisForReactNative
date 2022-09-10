package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ajcn  reason: default package */
/* loaded from: classes2.dex */
public final class ajcn {
    public static ajcr a(btlu btluVar, ajco ajcoVar, int i) {
        ajcr ajcrVar = new ajcr();
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_SHARE_MESSAGE_RESOURCE_ID", i);
        bundle.putString("accountId", btluVar.d);
        bundle.putString("account_name", btluVar.t());
        bundle.putInt("mode", ajcoVar.ordinal());
        ajcrVar.B(bundle);
        return ajcrVar;
    }
}
