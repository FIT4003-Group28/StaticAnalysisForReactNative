package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ahbd  reason: default package */
/* loaded from: classes2.dex */
public class ahbd {
    private final dzsj<ahbc> a;

    public ahbd(dzsj<ahbc> dzsjVar) {
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

    public final ahaz a(List<cqix<?>> list, cjtd cjtdVar) {
        ahbc a = this.a.a();
        b(a, 1);
        b(list, 2);
        b(cjtdVar, 3);
        return new ahaz(a, list, cjtdVar);
    }
}
