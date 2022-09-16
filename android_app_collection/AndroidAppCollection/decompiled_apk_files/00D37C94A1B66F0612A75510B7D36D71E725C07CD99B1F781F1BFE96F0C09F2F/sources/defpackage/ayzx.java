package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ayzx  reason: default package */
/* loaded from: classes2.dex */
public final class ayzx extends ayua {
    final TimeUnit c;
    final ayor d;

    public ayzx(aynx aynxVar, TimeUnit timeUnit, ayor ayorVar) {
        super(aynxVar);
        this.c = timeUnit;
        this.d = ayorVar;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        this.b.ac(new ayzw(bameVar, this.c, this.d.a()));
    }
}
