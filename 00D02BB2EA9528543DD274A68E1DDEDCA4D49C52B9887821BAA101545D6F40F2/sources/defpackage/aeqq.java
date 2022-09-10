package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: aeqq  reason: default package */
/* loaded from: classes2.dex */
public class aeqq {
    private final dzsj<Resources> a;

    public aeqq(dzsj<Resources> dzsjVar) {
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

    public final aeqp a(dnng dnngVar, cjtd cjtdVar, String str) {
        Resources a = this.a.a();
        b(a, 1);
        b(dnngVar, 2);
        b(cjtdVar, 3);
        b(str, 4);
        return new aeqp(a, dnngVar, cjtdVar, str);
    }
}
