package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cowc  reason: default package */
/* loaded from: classes.dex */
public final class cowc extends covv {
    public final cnsd<coun> a;

    public cowc(cnsd<coun> cnsdVar) {
        this.a = cnsdVar;
    }

    @Override // defpackage.covv, defpackage.covx
    public final void d(int i, Bundle bundle) {
        if (i != 0) {
            return;
        }
        this.a.a(new cowb(bundle.getString("account"), bundle.getString("pagegaiaid"), bundle.getInt("scope")));
    }
}
