package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cixm  reason: default package */
/* loaded from: classes4.dex */
public final class cixm {
    public final dzsj<cqhn> a;
    public final dzsj<buva> b;
    public final dzsj<Resources> c;
    public final dzsj<dxio<cavs>> d;
    public final dzsj<dxio<ccif>> e;
    public final dzsj<dxio<chnm>> f;
    public final dzsj<dxio<ceet>> g;
    public final dzsj<Executor> h;

    public cixm(dzsj<cqhn> dzsjVar, dzsj<buva> dzsjVar2, dzsj<Resources> dzsjVar3, dzsj<dxio<cavs>> dzsjVar4, dzsj<dxio<ccif>> dzsjVar5, dzsj<dxio<chnm>> dzsjVar6, dzsj<dxio<ceet>> dzsjVar7, dzsj<Executor> dzsjVar8) {
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
