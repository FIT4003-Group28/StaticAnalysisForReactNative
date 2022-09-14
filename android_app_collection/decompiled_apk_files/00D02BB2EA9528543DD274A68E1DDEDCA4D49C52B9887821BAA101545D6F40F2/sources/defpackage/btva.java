package defpackage;

import java.net.URL;
/* compiled from: PG */
/* renamed from: btva  reason: default package */
/* loaded from: classes.dex */
public final class btva implements btvf {
    private final dzsj<btvi> a;

    public btva(dzsj<btvi> dzsjVar) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
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
        a(this.a.a(), 1);
        a(url, 2);
        return new btuz(url);
    }
}
