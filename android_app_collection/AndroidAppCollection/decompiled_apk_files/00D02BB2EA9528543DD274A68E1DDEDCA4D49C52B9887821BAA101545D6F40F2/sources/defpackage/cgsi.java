package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cgsi  reason: default package */
/* loaded from: classes4.dex */
public class cgsi {
    public final dzsj<Activity> a;
    public final dzsj<bvrb> b;
    public final dzsj<akfa> c;
    public final dzsj<cgen> d;
    public final dzsj<bbul> e;
    public final dzsj<bbtk> f;
    public final dzsj<bqji> g;
    public final dzsj<buke> h;
    public final dzsj<cjqy> i;
    public final dzsj<cjqq> j;

    public cgsi(dzsj<Activity> dzsjVar, dzsj<bvrb> dzsjVar2, dzsj<akfa> dzsjVar3, dzsj<cgen> dzsjVar4, dzsj<bbul> dzsjVar5, dzsj<bbtk> dzsjVar6, dzsj<bqji> dzsjVar7, dzsj<buke> dzsjVar8, dzsj<cjqy> dzsjVar9, dzsj<cjqq> dzsjVar10) {
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
