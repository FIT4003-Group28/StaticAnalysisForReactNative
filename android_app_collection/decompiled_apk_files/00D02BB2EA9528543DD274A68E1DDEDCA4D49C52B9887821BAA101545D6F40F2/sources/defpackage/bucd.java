package defpackage;

import java.net.URL;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: bucd  reason: default package */
/* loaded from: classes4.dex */
public final class bucd implements btvf {
    private final dzsj<CronetEngine> a;
    private final dzsj<Boolean> b;
    private final dzsj<btvi> c;

    public bucd(dzsj<CronetEngine> dzsjVar, dzsj<Boolean> dzsjVar2, dzsj<btvi> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
    }

    private static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    @Override // defpackage.btvf
    public final /* bridge */ /* synthetic */ btve b(URL url) {
        CronetEngine a = this.a.a();
        a(a, 1);
        Boolean a2 = this.b.a();
        a(a2, 2);
        boolean booleanValue = a2.booleanValue();
        a(this.c.a(), 3);
        a(url, 4);
        return new bucc(a, booleanValue, url);
    }
}
