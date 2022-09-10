package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cbvy  reason: default package */
/* loaded from: classes4.dex */
public class cbvy {
    public final dzsj<cqhn> a;
    public final dzsj<cbyi> b;
    public final dzsj<cbxa> c;
    public final dzsj<cbxu> d;
    public final dzsj<Executor> e;

    public cbvy(dzsj<cqhn> dzsjVar, dzsj<cbyi> dzsjVar2, dzsj<cbxa> dzsjVar3, dzsj<cbxu> dzsjVar4, dzsj<Executor> dzsjVar5) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
