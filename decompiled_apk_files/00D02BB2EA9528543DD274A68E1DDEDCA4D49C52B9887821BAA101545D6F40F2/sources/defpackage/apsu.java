package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: apsu  reason: default package */
/* loaded from: classes.dex */
public final class apsu implements afhy {
    private final dzsj<gga> a;
    private final dzsj<avae> b;
    private final dzsj<bvjj> c;
    private final dzsj<bvrb> d;
    private final dzsj<auhi> e;
    private final dzsj<dxio<begg>> f;
    private final dzsj<dxio<aput>> g;

    public apsu(dzsj<gga> dzsjVar, dzsj<avae> dzsjVar2, dzsj<bvjj> dzsjVar3, dzsj<bvrb> dzsjVar4, dzsj<auhi> dzsjVar5, dzsj<dxio<begg>> dzsjVar6, dzsj<dxio<aput>> dzsjVar7) {
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
        gga a = this.a.a();
        b(a, 3);
        b(this.b.a(), 4);
        bvjj a2 = this.c.a();
        b(a2, 5);
        bvrb a3 = this.d.a();
        b(a3, 6);
        auhi a4 = this.e.a();
        b(a4, 7);
        dxio a5 = ((dxjh) this.f).a();
        b(a5, 8);
        dxio a6 = ((dxjh) this.g).a();
        b(a6, 9);
        return new apst(intent, str, a, a2, a3, a4, a5, a6);
    }
}
