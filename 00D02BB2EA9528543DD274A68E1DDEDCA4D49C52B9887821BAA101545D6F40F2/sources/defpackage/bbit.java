package defpackage;

import android.content.Intent;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bbit  reason: default package */
/* loaded from: classes.dex */
public final class bbit implements afhy {
    private final dzsj<gga> a;
    private final dzsj<dxio<bbdv>> b;
    private final dzsj<dxio<brba>> c;
    private final dzsj<Executor> d;
    private final dzsj<cjqy> e;
    private final dzsj<dxio<bvjj>> f;
    private final dzsj<bbek> g;
    private final dzsj<btvo> h;

    public bbit(dzsj<gga> dzsjVar, dzsj<dxio<bbdv>> dzsjVar2, dzsj<dxio<brba>> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<dxio<bvjj>> dzsjVar6, dzsj<bbek> dzsjVar7, dzsj<btvo> dzsjVar8) {
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
        gga a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        Executor a4 = this.d.a();
        b(a4, 4);
        cjqy a5 = this.e.a();
        b(a5, 5);
        dxio a6 = ((dxjh) this.f).a();
        b(a6, 6);
        bbek a7 = this.g.a();
        b(a7, 7);
        btvo a8 = this.h.a();
        b(a8, 8);
        b(intent, 9);
        return new bbis(a, a2, a3, a4, a5, a6, a7, a8, intent, str);
    }
}
