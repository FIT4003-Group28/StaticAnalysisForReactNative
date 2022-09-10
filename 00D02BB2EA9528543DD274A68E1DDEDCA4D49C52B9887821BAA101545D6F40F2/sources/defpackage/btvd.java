package defpackage;

import java.net.URL;
/* compiled from: PG */
/* renamed from: btvd  reason: default package */
/* loaded from: classes4.dex */
public final class btvd implements btvf {
    private final dzsj<btvi> a;

    public btvd(dzsj<btvi> dzsjVar) {
        c(dzsjVar, 1);
        this.a = dzsjVar;
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
    public final btvc b(URL url) {
        c(this.a.a(), 1);
        c(url, 2);
        return new btvc(url);
    }
}
