package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: exu  reason: default package */
/* loaded from: classes3.dex */
public final class exu implements afzn {
    public volatile String a;

    @Override // defpackage.afzn
    public final String a(Uri uri, String str) {
        Integer num = (Integer) wzc.a.get(str);
        if (num != null && num.intValue() == 15) {
            return zgh.h(this.a);
        }
        return null;
    }

    @Override // defpackage.afzn
    public final String b() {
        return "exu";
    }
}
