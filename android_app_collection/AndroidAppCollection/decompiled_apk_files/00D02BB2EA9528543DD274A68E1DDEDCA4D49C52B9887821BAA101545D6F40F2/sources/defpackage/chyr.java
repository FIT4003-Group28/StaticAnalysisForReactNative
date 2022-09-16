package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chyr  reason: default package */
/* loaded from: classes4.dex */
public final class chyr {
    public final dzsj<Application> a;
    public final dzsj<Resources> b;
    public final dzsj<Executor> c;
    public final dzsj<cqhn> d;
    public final dzsj<cqhu> e;
    public final dzsj<cizn> f;
    public final dzsj<cisi> g;
    public final dzsj<cibe> h;
    public final dzsj<cjnx> i;
    public final dzsj<btvo> j;
    public final dzsj<PublicDisclosureLayout$PublicDisclosureViewModelImpl> k;
    public final dzsj<cjae> l;
    public final dzsj<chsf> m;
    public final dzsj<bvpe> n;

    public chyr(dzsj<Application> dzsjVar, dzsj<Resources> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<cqhn> dzsjVar4, dzsj<cqhu> dzsjVar5, dzsj<cizn> dzsjVar6, dzsj<cisi> dzsjVar7, dzsj<cibe> dzsjVar8, dzsj<cjnx> dzsjVar9, dzsj<btvo> dzsjVar10, dzsj<PublicDisclosureLayout$PublicDisclosureViewModelImpl> dzsjVar11, dzsj<cjae> dzsjVar12, dzsj<chsf> dzsjVar13, dzsj<bvpe> dzsjVar14) {
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
        a(dzsjVar11, 11);
        this.k = dzsjVar11;
        a(dzsjVar12, 12);
        this.l = dzsjVar12;
        a(dzsjVar13, 13);
        this.m = dzsjVar13;
        a(dzsjVar14, 14);
        this.n = dzsjVar14;
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
