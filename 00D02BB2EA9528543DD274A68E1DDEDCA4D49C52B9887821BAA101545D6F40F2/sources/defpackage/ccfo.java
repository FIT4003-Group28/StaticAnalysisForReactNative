package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ccfo  reason: default package */
/* loaded from: classes.dex */
public final class ccfo implements afhy {
    private final dzsj<dxio<bqji>> a;
    private final dzsj<dxio<begg>> b;
    private final dzsj<dxio<befw>> c;
    private final dzsj<dxio<btvo>> d;
    private final dzsj<dxio<cafi>> e;
    private final dzsj<dxio<cfrt>> f;
    private final dzsj<dxio<chnm>> g;
    private final dzsj<dxio<auhi>> h;

    public ccfo(dzsj<dxio<bqji>> dzsjVar, dzsj<dxio<begg>> dzsjVar2, dzsj<dxio<befw>> dzsjVar3, dzsj<dxio<btvo>> dzsjVar4, dzsj<dxio<cafi>> dzsjVar5, dzsj<dxio<cfrt>> dzsjVar6, dzsj<dxio<chnm>> dzsjVar7, dzsj<dxio<auhi>> dzsjVar8) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    @Override // defpackage.afhy
    public final /* bridge */ /* synthetic */ afhx a(Intent intent, @dzsi String str) {
        b(intent, 1);
        dxio a = ((dxjh) this.a).a();
        b(a, 3);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 4);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 5);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 6);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 7);
        dxio a6 = ((dxjh) this.f).a();
        b(a6, 8);
        dxio a7 = ((dxjh) this.g).a();
        b(a7, 9);
        dxio a8 = ((dxjh) this.h).a();
        b(a8, 10);
        return new ccfn(intent, str, a, a2, a3, a4, a5, a6, a7, a8);
    }
}
