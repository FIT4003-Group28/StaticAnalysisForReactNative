package defpackage;
/* compiled from: PG */
/* renamed from: bpsl  reason: default package */
/* loaded from: classes4.dex */
public final class bpsl {
    public final dzsj<boxa> a;
    public final dzsj<akfa> b;
    public final dzsj<bbtk> c;
    public final dzsj<bbul> d;

    public bpsl(dzsj<boxa> dzsjVar, dzsj<akfa> dzsjVar2, dzsj<bbtk> dzsjVar3, dzsj<bbul> dzsjVar4) {
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
