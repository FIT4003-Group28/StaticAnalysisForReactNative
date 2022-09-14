package defpackage;
/* compiled from: PG */
/* renamed from: cavr  reason: default package */
/* loaded from: classes4.dex */
public class cavr {
    public final dzsj<cqhn> a;
    public final dzsj<amfi> b;
    public final dzsj<bvrb> c;

    public cavr(dzsj<cqhn> dzsjVar, dzsj<amfi> dzsjVar2, dzsj<bvrb> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
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
