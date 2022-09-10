package defpackage;
/* compiled from: PG */
/* renamed from: chrl  reason: default package */
/* loaded from: classes4.dex */
public final class chrl {
    public final dzsj<bvrb> a;
    public final dzsj<dxio<cclq>> b;
    public final dzsj<dxio<cgen>> c;
    public final dzsj<dxio<blpp>> d;
    public final dzsj<dxio<cfpk>> e;
    public final dzsj<dxio<caym>> f;
    public final dzsj<dxio<cbrv>> g;
    public final dzsj<dxio<bjbu>> h;

    public chrl(dzsj<bvrb> dzsjVar, dzsj<dxio<cclq>> dzsjVar2, dzsj<dxio<cgen>> dzsjVar3, dzsj<dxio<blpp>> dzsjVar4, dzsj<dxio<cfpk>> dzsjVar5, dzsj<dxio<caym>> dzsjVar6, dzsj<dxio<cbrv>> dzsjVar7, dzsj<dxio<bjbu>> dzsjVar8) {
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
        this.h = dzsjVar8;
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
