package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: aqrf  reason: default package */
/* loaded from: classes2.dex */
public final class aqrf implements afhy {
    private final dzsj<apzy> a;
    private final dzsj<aqwo> b;
    private final dzsj<dxio<apyz>> c;
    private final dzsj<dxio<aprv>> d;
    private final dzsj<dxio<akfa>> e;

    public aqrf(dzsj<apzy> dzsjVar, dzsj<aqwo> dzsjVar2, dzsj<dxio<apyz>> dzsjVar3, dzsj<dxio<aprv>> dzsjVar4, dzsj<dxio<akfa>> dzsjVar5) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
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

    @Override // defpackage.afhy
    public final /* bridge */ /* synthetic */ afhx a(Intent intent, @dzsi String str) {
        b(intent, 1);
        b(this.a.a(), 3);
        b(this.b.a(), 4);
        b(((dxjh) this.c).a(), 5);
        b(((dxjh) this.d).a(), 6);
        b(((dxjh) this.e).a(), 7);
        return new aqre(intent, str);
    }
}
