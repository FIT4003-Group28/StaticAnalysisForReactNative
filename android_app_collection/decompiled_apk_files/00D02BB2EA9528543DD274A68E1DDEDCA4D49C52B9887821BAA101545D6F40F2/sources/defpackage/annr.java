package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: annr  reason: default package */
/* loaded from: classes.dex */
public final class annr implements afhy {
    private final dzsj<gga> a;
    private final dzsj<anhg> b;
    private final dzsj<cjqy> c;
    private final dzsj<akfc> d;
    private final dzsj<akfa> e;

    public annr(dzsj<gga> dzsjVar, dzsj<anhg> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<akfc> dzsjVar4, dzsj<akfa> dzsjVar5) {
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
        gga a = this.a.a();
        b(a, 3);
        anhg a2 = this.b.a();
        b(a2, 4);
        cjqy a3 = this.c.a();
        b(a3, 5);
        akfc a4 = this.d.a();
        b(a4, 6);
        akfa a5 = this.e.a();
        b(a5, 7);
        return new annq(intent, str, a, a2, a3, a4, a5);
    }
}
