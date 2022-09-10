package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ahcx  reason: default package */
/* loaded from: classes2.dex */
public final class ahcx {
    private final dzsj<gga> a;
    private final dzsj<ahcu> b;

    public ahcx(dzsj<gga> dzsjVar, dzsj<ahcu> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final ahcw a(List<dlay> list) {
        gga a = this.a.a();
        b(a, 1);
        ahcu a2 = this.b.a();
        b(a2, 2);
        b(list, 3);
        return new ahcw(a, a2, list);
    }
}
