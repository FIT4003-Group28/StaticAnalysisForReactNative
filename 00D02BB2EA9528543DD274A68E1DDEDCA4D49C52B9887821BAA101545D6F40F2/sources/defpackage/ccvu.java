package defpackage;
/* compiled from: PG */
/* renamed from: ccvu  reason: default package */
/* loaded from: classes4.dex */
public class ccvu {
    public final dzsj<btvo> a;
    public final dzsj<gga> b;
    public final dzsj<ccrh> c;

    public ccvu(dzsj<btvo> dzsjVar, dzsj<gga> dzsjVar2, dzsj<ccrh> dzsjVar3) {
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
