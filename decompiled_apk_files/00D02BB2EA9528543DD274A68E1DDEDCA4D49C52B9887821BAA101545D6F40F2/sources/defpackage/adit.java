package defpackage;
/* compiled from: PG */
/* renamed from: adit  reason: default package */
/* loaded from: classes.dex */
public final class adit {
    public final dzsj<abfa> a;
    public final dzsj<acyr> b;
    public final dzsj<adiz> c;
    public final dzsj<akfa> d;

    public adit(dzsj<abfa> dzsjVar, dzsj<acyr> dzsjVar2, dzsj<adiz> dzsjVar3, dzsj<akfa> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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