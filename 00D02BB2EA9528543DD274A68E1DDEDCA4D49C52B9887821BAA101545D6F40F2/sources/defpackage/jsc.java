package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: jsc  reason: default package */
/* loaded from: classes7.dex */
public final class jsc {
    private final dzsj<jsf> a;
    private final dzsj<jsa> b;

    public jsc(dzsj<jsf> dzsjVar, dzsj<jsa> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final jsb a(String str, List<dhmz> list, Map<String, dhnd> map, dcna<String, dkdt> dcnaVar, jry jryVar) {
        jsf a = this.a.a();
        b(a, 1);
        jsa a2 = this.b.a();
        b(a2, 2);
        b(str, 3);
        b(list, 4);
        b(map, 5);
        b(dcnaVar, 6);
        b(jryVar, 7);
        return new jsb(a, a2, str, list, map, dcnaVar, jryVar);
    }
}
