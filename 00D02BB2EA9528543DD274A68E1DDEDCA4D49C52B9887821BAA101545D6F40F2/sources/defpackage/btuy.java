package defpackage;

import java.net.URL;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: btuy  reason: default package */
/* loaded from: classes.dex */
public final class btuy implements btvf {
    private final dzsj<CronetEngine> a;
    private final dzsj<btvi> b;

    public btuy(dzsj<CronetEngine> dzsjVar, dzsj<btvi> dzsjVar2) {
        c(dzsjVar, 1);
        this.a = dzsjVar;
        c(dzsjVar2, 2);
        this.b = dzsjVar2;
    }

    private static <T> void c(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    @Override // defpackage.btvf
    /* renamed from: a */
    public final btux b(URL url) {
        CronetEngine a = this.a.a();
        c(a, 1);
        c(this.b.a(), 2);
        c(url, 3);
        return new btux(a, url);
    }
}
