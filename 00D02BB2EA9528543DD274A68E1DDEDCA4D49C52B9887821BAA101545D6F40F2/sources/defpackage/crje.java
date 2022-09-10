package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: crje  reason: default package */
/* loaded from: classes5.dex */
public final class crje {
    public final dzsj<Application> a;
    public final dzsj<btrm> b;
    public final dzsj<bvjj> c;
    public final dzsj<crlb> d;
    public final dzsj<vxa> e;
    public final dzsj<ahjq> f;
    public final dzsj<srv> g;
    public final dzsj<bvrb> h;
    public final dzsj<vva> i;

    public crje(dzsj<Application> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<bvjj> dzsjVar3, dzsj<crlb> dzsjVar4, dzsj<vxa> dzsjVar5, dzsj<ahjq> dzsjVar6, dzsj<srv> dzsjVar7, dzsj<bvrb> dzsjVar8, dzsj<vva> dzsjVar9) {
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
