package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: wyy  reason: default package */
/* loaded from: classes4.dex */
public final class wyy implements afzn {
    private final wyx a;

    public wyy(wyx wyxVar) {
        this.a = wyxVar;
    }

    @Override // defpackage.afzn
    public final String a(Uri uri, String str) {
        Integer num = (Integer) wzc.a.get(str);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 4) {
            return Integer.toString(this.a.c());
        }
        if (intValue == 10) {
            return true != this.a.e() ? "0" : "1";
        } else if (intValue == 24) {
            return Integer.toString(this.a.a());
        } else {
            if (intValue == 16) {
                return Integer.toString(this.a.b());
            }
            if (intValue != 17) {
                return null;
            }
            String str2 = this.a.b;
            return str2 != null ? str2 : "";
        }
    }

    @Override // defpackage.afzn
    public final String b() {
        return "wyy";
    }
}
