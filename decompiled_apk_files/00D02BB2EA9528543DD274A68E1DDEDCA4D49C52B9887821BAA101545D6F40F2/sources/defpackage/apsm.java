package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: apsm  reason: default package */
/* loaded from: classes.dex */
public final class apsm implements afhy {
    private final dzsj<dxio<begg>> a;
    private final dzsj<gga> b;
    private final dzsj<cjqq> c;
    private final dzsj<avae> d;
    private final dzsj<bvjj> e;
    private final dzsj<bvrb> f;
    private final dzsj<auhi> g;
    private final dzsj<bhhf> h;
    private final dzsj<dxio<apsa>> i;
    private final dzsj<dxio<apus>> j;

    public apsm(dzsj<dxio<begg>> dzsjVar, dzsj<gga> dzsjVar2, dzsj<cjqq> dzsjVar3, dzsj<avae> dzsjVar4, dzsj<bvjj> dzsjVar5, dzsj<bvrb> dzsjVar6, dzsj<auhi> dzsjVar7, dzsj<bhhf> dzsjVar8, dzsj<dxio<apsa>> dzsjVar9, dzsj<dxio<apus>> dzsjVar10) {
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
        b(dzsjVar9, 9);
        this.i = dzsjVar9;
        b(dzsjVar10, 10);
        this.j = dzsjVar10;
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
        gga a2 = this.b.a();
        b(a2, 4);
        cjqq a3 = this.c.a();
        b(a3, 5);
        b(this.d.a(), 6);
        bvjj a4 = this.e.a();
        b(a4, 7);
        bvrb a5 = this.f.a();
        b(a5, 8);
        auhi a6 = this.g.a();
        b(a6, 9);
        bhhf a7 = this.h.a();
        b(a7, 10);
        dxio a8 = ((dxjh) this.i).a();
        b(a8, 11);
        dxio a9 = ((dxjh) this.j).a();
        b(a9, 12);
        return new apsl(intent, str, a, a2, a3, a4, a5, a6, a7, a8, a9);
    }
}
