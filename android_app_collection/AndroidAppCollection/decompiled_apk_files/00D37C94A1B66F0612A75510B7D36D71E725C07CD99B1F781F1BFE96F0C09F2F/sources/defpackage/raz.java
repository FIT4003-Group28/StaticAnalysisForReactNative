package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: raz  reason: default package */
/* loaded from: classes4.dex */
public final class raz implements ray {
    public static final String a = rax.c("FamilyApiMessage");
    public final Bundle b;

    static {
        rax.c("isDirectAddInvitations");
    }

    public raz(String str, String str2) {
        Bundle bundle = new Bundle(13);
        this.b = bundle;
        qnm.l(str);
        qnm.l(str2);
        bundle.putString(a, "ManageFamilyV2");
        bundle.putString("accountName", str);
        bundle.putString("appId", str2);
    }
}
