package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqki  reason: default package */
/* loaded from: classes2.dex */
public class aqki {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<apyx> c;
    public final dzsj<dxio<aqav>> d;
    public final dzsj<dxio<aprv>> e;
    public final dzsj<dxio<akfa>> f;
    public final dzsj<dxio<aqgn>> g;
    public final dzsj<dxio<aqgo>> h;
    public final dzsj<dxio<aqcn>> i;
    public final dzsj<Executor> j;

    public aqki(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<apyx> dzsjVar3, dzsj<dxio<aqav>> dzsjVar4, dzsj<dxio<aprv>> dzsjVar5, dzsj<dxio<akfa>> dzsjVar6, dzsj<dxio<aqgn>> dzsjVar7, dzsj<dxio<aqgo>> dzsjVar8, dzsj<dxio<aqcn>> dzsjVar9, dzsj<Executor> dzsjVar10) {
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
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
        a(dzsjVar10, 10);
        this.j = dzsjVar10;
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
