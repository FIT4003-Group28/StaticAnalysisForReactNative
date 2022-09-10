package defpackage;
/* compiled from: PG */
/* renamed from: aabz  reason: default package */
/* loaded from: classes2.dex */
public class aabz {
    public final dzsj<bwqv> a;
    public final dzsj<akla> b;
    public final dzsj<aadg> c;
    public final dzsj<cbea> d;
    public final dzsj<cbqg> e;
    public final dzsj<aacj> f;
    public final dzsj<bsne> g;

    public aabz(dzsj<bwqv> dzsjVar, dzsj<akla> dzsjVar2, dzsj<aadg> dzsjVar3, dzsj<cbea> dzsjVar4, dzsj<cbqg> dzsjVar5, dzsj<aacj> dzsjVar6, dzsj<bsne> dzsjVar7) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
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
