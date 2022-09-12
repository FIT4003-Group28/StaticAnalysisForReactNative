package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: arqa  reason: default package */
/* loaded from: classes.dex */
public final class arqa implements afhy {
    private final dzsj<ascb> a;
    private final dzsj<asim> b;
    private final dzsj<asik> c;
    private final dzsj<ckcw> d;

    public arqa(dzsj<ascb> dzsjVar, dzsj<asim> dzsjVar2, dzsj<asik> dzsjVar3, dzsj<ckcw> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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
        ascb a = this.a.a();
        b(a, 3);
        asim a2 = this.b.a();
        b(a2, 4);
        asik a3 = this.c.a();
        b(a3, 5);
        ckcw a4 = this.d.a();
        b(a4, 6);
        return new arpz(intent, str, a, a2, a3, a4);
    }
}
