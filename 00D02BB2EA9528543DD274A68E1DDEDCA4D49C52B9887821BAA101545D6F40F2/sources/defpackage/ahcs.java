package defpackage;
/* compiled from: PG */
/* renamed from: ahcs  reason: default package */
/* loaded from: classes2.dex */
public class ahcs {
    public final dzsj<agwa> a;
    public final dzsj<ahco> b;
    public final dzsj<bvrb> c;

    public ahcs(dzsj<agwa> dzsjVar, dzsj<ahco> dzsjVar2, dzsj<bvrb> dzsjVar3) {
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
