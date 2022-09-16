package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: raw  reason: default package */
/* loaded from: classes4.dex */
public final class raw implements rav {
    public static final String a = rax.c("FamilyApiMessage");
    public final Bundle b;

    static {
        rax.c("isDirectAddInvitations");
    }

    public raw(String str, String str2) {
        Bundle bundle = new Bundle(12);
        this.b = bundle;
        qnm.l(str);
        qnm.l(str2);
        bundle.putString(a, "CreateFamilyV2");
        bundle.putString("accountName", str);
        bundle.putString("appId", str2);
    }
}
