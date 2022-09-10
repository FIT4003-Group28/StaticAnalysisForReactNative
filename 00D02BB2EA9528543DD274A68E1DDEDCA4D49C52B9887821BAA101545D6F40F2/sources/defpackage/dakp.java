package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: dakp  reason: default package */
/* loaded from: classes5.dex */
public final class dakp implements dakz {
    public final dzsj<dali> a;
    private final dzsj<Context> b;
    private final dzsj<damc> c;
    private final dzsj<dalh> d;
    private final dzsj<dalc> e;
    private final dzsj<damf> f;
    private final dzsj<dall> g;
    private final dzsj<File> h;
    private final dzsj<damu> i;
    private final dzsj<dakv> j;

    public dakp(daln dalnVar) {
        dalo daloVar = new dalo(dalnVar);
        this.b = daloVar;
        dzsj<damc> b = dxjc.b(new damd(daloVar));
        this.c = b;
        dzsj<dalh> b2 = dxjc.b(new dalq(dalnVar));
        this.d = b2;
        dzsj<dalc> b3 = dxjc.b(new dald(daloVar));
        this.e = b3;
        dzsj<damf> b4 = dxjc.b(new damg(daloVar));
        this.f = b4;
        dzsj<dall> b5 = dxjc.b(new dalm(b, b2, b3, b4));
        this.g = b5;
        dzsj<File> b6 = dxjc.b(new dalp(daloVar));
        this.h = b6;
        dzsj<damu> b7 = dxjc.b(new damv(daloVar, b6, b3));
        this.i = b7;
        dzsj<dakv> b8 = dxjc.b(new dakw(b5, b7, b6));
        this.j = b8;
        this.a = dxjc.b(new dalr(b8));
    }
}
