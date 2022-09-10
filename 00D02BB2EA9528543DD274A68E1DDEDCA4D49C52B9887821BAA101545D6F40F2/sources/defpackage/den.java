package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: den  reason: default package */
/* loaded from: classes6.dex */
public final class den {
    private final dzsj<ahjq> a;
    private final dzsj<dgw> b;
    private final dzsj<ff> c;
    private final dzsj<btvo> d;
    private final dzsj<Executor> e;
    private final dzsj<deh> f;

    public den(dzsj<ahjq> dzsjVar, dzsj<dgw> dzsjVar2, dzsj<ff> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<Executor> dzsjVar5, dzsj<deh> dzsjVar6) {
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

    public final dem a(czh czhVar, dbty<dehn<Boolean>> dbtyVar) {
        ahjq a = this.a.a();
        b(a, 1);
        dgw a2 = this.b.a();
        b(a2, 2);
        ff ffVar = (ff) ((dxjd) this.c).a;
        b(ffVar, 3);
        btvo a3 = this.d.a();
        b(a3, 4);
        Executor a4 = this.e.a();
        b(a4, 5);
        deh a5 = this.f.a();
        b(a5, 6);
        b(czhVar, 7);
        b(dbtyVar, 8);
        return new dem(a, a2, ffVar, a3, a4, a5, czhVar, dbtyVar);
    }
}
