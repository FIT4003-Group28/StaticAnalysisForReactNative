package defpackage;
/* compiled from: PG */
/* renamed from: rhk  reason: default package */
/* loaded from: classes7.dex */
public final class rhk {
    public final dzsj<rig> a;
    public final dzsj<rhz> b;
    public final dzsj<rin> c;
    public final dzsj<rhr> d;
    public final dzsj<rig> e;
    public final dzsj<rhz> f;
    public final dzsj<rin> g;

    public rhk(dzsj<rig> dzsjVar, dzsj<rhz> dzsjVar2, dzsj<rin> dzsjVar3, dzsj<rhr> dzsjVar4, dzsj<rig> dzsjVar5, dzsj<rhz> dzsjVar6, dzsj<rin> dzsjVar7, dzsj<rig> dzsjVar8, dzsj<rhz> dzsjVar9, dzsj<rin> dzsjVar10) {
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
        a(dzsjVar8, 8);
        a(dzsjVar9, 9);
        a(dzsjVar10, 10);
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
