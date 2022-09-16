package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ayva  reason: default package */
/* loaded from: classes2.dex */
public final class ayva extends ayua {
    final long c;
    final TimeUnit d;
    final ayor e;

    public ayva(aynx aynxVar, long j, TimeUnit timeUnit, ayor ayorVar) {
        super(aynxVar);
        this.c = j;
        this.d = timeUnit;
        this.e = ayorVar;
    }

    @Override // defpackage.aynx
    protected final void ae(bame bameVar) {
        this.b.ac(new ayuz(new azqa(bameVar), this.c, this.d, this.e.a()));
    }
}
