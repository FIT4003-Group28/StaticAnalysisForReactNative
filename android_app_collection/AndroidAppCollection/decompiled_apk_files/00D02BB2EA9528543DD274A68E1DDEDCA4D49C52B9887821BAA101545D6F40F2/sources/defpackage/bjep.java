package defpackage;
/* compiled from: PG */
/* renamed from: bjep  reason: default package */
/* loaded from: classes3.dex */
public final class bjep {
    public final dzsj<cqhn> a;
    public final dzsj<bkar> b;
    public final dzsj<bjek> c;

    public bjep(dzsj<cqhn> dzsjVar, dzsj<bkar> dzsjVar2, dzsj<bjek> dzsjVar3) {
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
