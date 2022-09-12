package defpackage;
/* compiled from: PG */
/* renamed from: cchu  reason: default package */
/* loaded from: classes4.dex */
public final class cchu {
    public final dzsj<cafi> a;
    public final dzsj<ccif> b;
    public final dzsj<chhr> c;
    public final dzsj<anhk> d;

    public cchu(dzsj<cafi> dzsjVar, dzsj<ccif> dzsjVar2, dzsj<chhr> dzsjVar3, dzsj<anhk> dzsjVar4) {
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
