package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: aqqt  reason: default package */
/* loaded from: classes2.dex */
public final class aqqt implements afhy {
    private final dzsj<dxio<aprv>> a;
    private final dzsj<dxio<apyz>> b;
    private final dzsj<dxio<akfa>> c;
    private final dzsj<apzy> d;
    private final dzsj<apyx> e;
    private final dzsj<cjqy> f;

    public aqqt(dzsj<dxio<aprv>> dzsjVar, dzsj<dxio<apyz>> dzsjVar2, dzsj<dxio<akfa>> dzsjVar3, dzsj<apzy> dzsjVar4, dzsj<apyx> dzsjVar5, dzsj<cjqy> dzsjVar6) {
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
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
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
    public final /* bridge */ /* synthetic */ afhx a(Intent intent, String str) {
        b(intent, 1);
        dxio a = ((dxjh) this.a).a();
        b(a, 3);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 4);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 5);
        apzy a4 = this.d.a();
        b(a4, 6);
        apyx a5 = this.e.a();
        b(a5, 7);
        cjqy a6 = this.f.a();
        b(a6, 8);
        return new aqqs(intent, str, a, a2, a3, a4, a5, a6);
    }
}
