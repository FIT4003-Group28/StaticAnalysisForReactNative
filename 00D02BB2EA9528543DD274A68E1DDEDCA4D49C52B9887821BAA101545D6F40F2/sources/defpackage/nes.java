package defpackage;
/* compiled from: PG */
/* renamed from: nes  reason: default package */
/* loaded from: classes7.dex */
public final class nes {
    public final dzsj<akfa> a;
    public final dzsj<bxtx> b;
    public final dzsj<bxtv> c;

    public nes(dzsj<akfa> dzsjVar, dzsj<bxtx> dzsjVar2, dzsj<bxtv> dzsjVar3) {
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
