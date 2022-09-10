package defpackage;

import defpackage.dssj;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: buah  reason: default package */
/* loaded from: classes4.dex */
public final class buah<S extends dssj> implements buir<S> {
    private final dssj a;
    private final buid b;
    private final bufa<S> c;

    public buah(dssj dssjVar, buid buidVar, bufa<S> bufaVar) {
        this.a = dssjVar;
        this.b = buidVar;
        this.c = bufaVar;
    }

    @Override // defpackage.buir
    public final dehn<S> a(buic buicVar, btzu btzuVar) {
        this.a.getClass();
        return this.c.a(bufa.c(this.b, buicVar), Collections.emptyList(), btzuVar);
    }
}
