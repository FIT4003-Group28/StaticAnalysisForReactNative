package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cyhp  reason: default package */
/* loaded from: classes5.dex */
public final class cyhp implements cyho {
    private final Context a;

    public cyhp(Context context) {
        this.a = context;
    }

    @Override // defpackage.cyho
    public final cyhn b(String str, String str2) {
        return new cyhr(new cnjz(this.a, str2, str));
    }
}
