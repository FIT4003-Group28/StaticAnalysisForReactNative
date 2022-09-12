package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: nfg  reason: default package */
/* loaded from: classes7.dex */
public final class nfg {
    private final dzsj<Executor> a;
    private final dzsj<crzm<jzq>> b;
    private final dzsj<cjqy> c;
    private final dzsj<cjqq> d;

    public nfg(dzsj<Executor> dzsjVar, dzsj<crzm<jzq>> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<cjqq> dzsjVar4) {
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

    public final nff a(cqkj cqkjVar, not notVar, kxu kxuVar, lxh lxhVar, kdg kdgVar, Runnable runnable, Runnable runnable2, CharSequence charSequence, boolean z, dcdc<nfz> dcdcVar, jty jtyVar, @dzsi cjsz cjszVar, @dzsi cjtd cjtdVar, @dzsi cjtd cjtdVar2) {
        b(cqkjVar, 1);
        Executor a = this.a.a();
        b(a, 2);
        crzm<jzq> a2 = this.b.a();
        b(a2, 3);
        b(notVar, 4);
        b(kxuVar, 5);
        b(lxhVar, 6);
        b(kdgVar, 7);
        b(runnable, 8);
        b(runnable2, 9);
        b(charSequence, 10);
        b(dcdcVar, 12);
        b(jtyVar, 13);
        cjqy a3 = this.c.a();
        b(a3, 14);
        cjqq a4 = this.d.a();
        b(a4, 15);
        return new nff(cqkjVar, a, a2, notVar, kxuVar, lxhVar, kdgVar, runnable, runnable2, charSequence, z, dcdcVar, jtyVar, a3, a4, cjszVar, cjtdVar, cjtdVar2);
    }
}
