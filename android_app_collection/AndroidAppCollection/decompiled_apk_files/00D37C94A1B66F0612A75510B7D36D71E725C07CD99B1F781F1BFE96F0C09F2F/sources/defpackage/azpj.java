package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: azpj  reason: default package */
/* loaded from: classes2.dex */
public final class azpj {
    public static final ayor a;
    static final ayor b;
    static final ayor c;
    public static final ayor d;

    static {
        ayor b2;
        ayor b3;
        ayyq ayyqVar = new ayyq(5);
        ayqe ayqeVar = azqc.d;
        a = azqc.c(ayyqVar);
        ayyq ayyqVar2 = new ayyq(2);
        ayqe ayqeVar2 = azqc.c;
        if (ayqeVar2 == null) {
            b2 = azqc.c(ayyqVar2);
        } else {
            b2 = azqc.b(ayqeVar2, ayyqVar2);
        }
        b = b2;
        ayyq ayyqVar3 = new ayyq(3);
        ayqe ayqeVar3 = azqc.e;
        if (ayqeVar3 == null) {
            b3 = azqc.c(ayyqVar3);
        } else {
            b3 = azqc.b(ayqeVar3, ayyqVar3);
        }
        c = b3;
        d = azns.b;
        ayyq ayyqVar4 = new ayyq(4);
        ayqe ayqeVar4 = azqc.f;
        azqc.c(ayyqVar4);
    }

    public static ayor a() {
        ayor ayorVar = b;
        ayqe ayqeVar = azqc.g;
        return ayorVar;
    }

    public static ayor b(Executor executor) {
        return new azmw(executor);
    }

    public static ayor c() {
        ayor ayorVar = c;
        ayqe ayqeVar = azqc.i;
        return ayorVar;
    }
}
