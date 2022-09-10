package defpackage;
/* compiled from: PG */
/* renamed from: apid  reason: default package */
/* loaded from: classes2.dex */
public class apid {
    public final dzsj<gga> a;
    public final dzsj<bwqv> b;
    public final dzsj<aphj> c;
    public final dzsj<aoxq> d;

    public apid(dzsj<gga> dzsjVar, dzsj<bwqv> dzsjVar2, dzsj<aphj> dzsjVar3, dzsj<aoxq> dzsjVar4) {
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
