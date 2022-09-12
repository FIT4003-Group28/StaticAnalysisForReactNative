package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: abdz  reason: default package */
/* loaded from: classes2.dex */
public class abdz {
    private final dzsj<abed> a;

    public abdz(dzsj<abed> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final abdy a(dqpm dqpmVar, int i, String str, String str2, String str3, Map<String, dqpy> map) {
        abed a = this.a.a();
        b(a, 1);
        b(dqpmVar, 2);
        b(str, 4);
        b(str2, 5);
        b(str3, 6);
        b(map, 7);
        return new abdy(a, dqpmVar, i, str, str2, str3, map);
    }
}
