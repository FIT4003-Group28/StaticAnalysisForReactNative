package defpackage;

import android.net.Uri;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: wzg  reason: default package */
/* loaded from: classes4.dex */
public final class wzg implements afzn {
    private Integer a;

    @Override // defpackage.afzn
    public final String a(Uri uri, String str) {
        Integer num;
        if (str == null || (num = (Integer) wzc.a.get(str)) == null || num.intValue() != 67 || this.a == null) {
            return null;
        }
        return String.format(Locale.US, "%d", this.a);
    }

    @Override // defpackage.afzn
    public final String b() {
        return "wzg";
    }

    public final void c() {
        this.a = null;
    }

    public final void d(int i) {
        this.a = Integer.valueOf(i);
    }
}
