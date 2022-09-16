package defpackage;

import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* renamed from: wza  reason: default package */
/* loaded from: classes4.dex */
public final class wza implements afzn {
    private final tjt a;
    private final Map b;

    public wza(tjt tjtVar, Map map) {
        this.a = tjtVar;
        this.b = map;
    }

    public static wza c(tjt tjtVar, Map map) {
        return new wza(tjtVar, map);
    }

    @Override // defpackage.afzn
    public final String a(Uri uri, String str) {
        Integer num = (Integer) wzc.a.get(str);
        if (num == null) {
            return null;
        }
        if (!afzo.h(this.b, str, uri)) {
            return (String) wzc.b.get(str);
        }
        int intValue = num.intValue();
        if (intValue == 49) {
            tjt tjtVar = this.a;
            return tjtVar != null ? tjtVar.a : "";
        } else if (intValue == 60) {
            tjt tjtVar2 = this.a;
            return tjtVar2 != null ? tjtVar2.b : "";
        } else {
            switch (intValue) {
                case 62:
                    tjt tjtVar3 = this.a;
                    return tjtVar3 != null ? tjtVar3.c : "";
                case 63:
                    tjt tjtVar4 = this.a;
                    return tjtVar4 != null ? tjtVar4.d : "";
                case 64:
                    tjt tjtVar5 = this.a;
                    return tjtVar5 != null ? tjtVar5.e : "";
                default:
                    return null;
            }
        }
    }

    @Override // defpackage.afzn
    public final String b() {
        return "wza";
    }
}
