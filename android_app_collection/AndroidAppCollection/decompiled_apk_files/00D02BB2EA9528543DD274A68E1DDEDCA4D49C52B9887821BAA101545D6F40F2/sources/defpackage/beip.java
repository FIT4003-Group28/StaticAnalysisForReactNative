package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: beip  reason: default package */
/* loaded from: classes3.dex */
public final class beip {
    public final Map<dbsi<String, String>, crzo<apsi<dbsg<dgac>>>> a = new HashMap();

    public final void a(String str, String str2, int i, dbsg<dgac> dbsgVar) {
        dbsi a = dbsi.a(str, str2);
        if (this.a.containsKey(a)) {
            this.a.get(a).a(apsi.c(i, dbsgVar));
        }
    }
}
