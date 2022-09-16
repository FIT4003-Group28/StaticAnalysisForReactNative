package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: wzj  reason: default package */
/* loaded from: classes4.dex */
public final class wzj implements afzn {
    private final int a;
    private final int b;

    public wzj(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.afzn
    public final String a(Uri uri, String str) {
        Integer num = (Integer) wzc.a.get(str);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 22) {
            return Integer.toString(this.a);
        }
        if (intValue == 23) {
            return Integer.toString(this.b);
        }
        return null;
    }

    @Override // defpackage.afzn
    public final String b() {
        return "wzj";
    }
}
