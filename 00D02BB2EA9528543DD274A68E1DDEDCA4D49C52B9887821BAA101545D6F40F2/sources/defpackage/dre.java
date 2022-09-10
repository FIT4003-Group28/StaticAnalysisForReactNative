package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: dre  reason: default package */
/* loaded from: classes6.dex */
public final class dre {
    private final dzsj<gga> a;
    private final dzsj<ahjq> b;
    private final dzsj<dxio<qbt>> c;
    private final dzsj<dxio<ascb>> d;
    private final dzsj<dkn> e;

    public dre(dzsj<gga> dzsjVar, dzsj<ahjq> dzsjVar2, dzsj<dxio<qbt>> dzsjVar3, dzsj<dxio<ascb>> dzsjVar4, dzsj<dkn> dzsjVar5) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final drd a(View view) {
        gga a = this.a.a();
        b(a, 1);
        ahjq a2 = this.b.a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        dkn a5 = this.e.a();
        b(a5, 5);
        b(view, 6);
        return new drd(a, a2, a3, a4, a5, view);
    }
}
