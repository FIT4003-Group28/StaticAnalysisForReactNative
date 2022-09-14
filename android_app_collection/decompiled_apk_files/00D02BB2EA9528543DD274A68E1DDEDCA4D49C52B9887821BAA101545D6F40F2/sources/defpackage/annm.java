package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: annm  reason: default package */
/* loaded from: classes.dex */
public final class annm implements afhy {
    private final dzsj<gga> a;
    private final dzsj<anhg> b;
    private final dzsj<akfc> c;
    private final dzsj<apkk> d;
    private final dzsj<eeu> e;

    public annm(dzsj<gga> dzsjVar, dzsj<anhg> dzsjVar2, dzsj<akfc> dzsjVar3, dzsj<apkk> dzsjVar4, dzsj<eeu> dzsjVar5) {
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
        akfc a3 = this.c.a();
        b(a3, 5);
        b(this.d.a(), 6);
        eeu a4 = this.e.a();
        b(a4, 7);
        return new annl(intent, str, a, a2, a3, a4);
    }
}
