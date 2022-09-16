package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ayzz  reason: default package */
/* loaded from: classes2.dex */
public final class ayzz extends ayua {
    final TimeUnit c;

    public ayzz(aynx aynxVar, TimeUnit timeUnit) {
        super(aynxVar);
        this.c = timeUnit;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        this.b.ac(new ayzy(bameVar, this.c));
    }
}
