package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aity  reason: default package */
/* loaded from: classes.dex */
public final class aity {
    private final afwu a;
    private final yrj b;
    private final afst c;
    private final amqo d;
    private final Executor e;
    private final acrr f;
    private final aadd g;
    private final amqo h;
    private final ajjh i;

    public aity(afwu afwuVar, yrj yrjVar, afst afstVar, amqo amqoVar, Executor executor, ajjh ajjhVar, acrr acrrVar, aadd aaddVar, amqo amqoVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        afwuVar.getClass();
        this.a = afwuVar;
        yrjVar.getClass();
        this.b = yrjVar;
        afstVar.getClass();
        this.c = afstVar;
        this.d = amqoVar;
        executor.getClass();
        this.e = executor;
        ajjhVar.getClass();
        this.i = ajjhVar;
        this.f = acrrVar;
        this.g = aaddVar;
        this.h = amqoVar2;
    }

    public final aitz a(List list, List list2, String str) {
        return new aitz(this.a, this.b, this.c, this.d, list == null ? new ArrayList() : list, list2 == null ? new ArrayList() : list2, str, this.e, this.i, this.f, this.g, this.h, null, null, null);
    }
}
