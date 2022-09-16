package defpackage;
/* compiled from: PG */
/* renamed from: bpcf  reason: default package */
/* loaded from: classes3.dex */
public class bpcf {
    public final dzsj<bwqv> a;
    public final dzsj<bnyo> b;
    public final dzsj<bpsw> c;

    public bpcf(dzsj<bwqv> dzsjVar, dzsj<bnyo> dzsjVar2, dzsj<bpsw> dzsjVar3) {
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
