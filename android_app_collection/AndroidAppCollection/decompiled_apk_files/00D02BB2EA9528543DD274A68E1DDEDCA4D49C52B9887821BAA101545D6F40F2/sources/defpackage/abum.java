package defpackage;
/* compiled from: PG */
/* renamed from: abum  reason: default package */
/* loaded from: classes2.dex */
public final class abum {
    public final dzsj<cqhn> a;
    public final dzsj<dxio<axwo>> b;
    public final dzsj<abuh> c;
    public final dzsj<dxio<brba>> d;

    public abum(dzsj<cqhn> dzsjVar, dzsj<dxio<axwo>> dzsjVar2, dzsj<abuh> dzsjVar3, dzsj<dxio<brba>> dzsjVar4) {
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
