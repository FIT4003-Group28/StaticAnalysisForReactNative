package defpackage;
/* compiled from: PG */
/* renamed from: bcnn  reason: default package */
/* loaded from: classes3.dex */
public final class bcnn {
    public final dzsj<bcnu> a;
    public final dzsj<cafi> b;
    public final dzsj<dxio<afha>> c;

    public bcnn(dzsj<bcnu> dzsjVar, dzsj<cafi> dzsjVar2, dzsj<dxio<afha>> dzsjVar3) {
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
