package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afnp  reason: default package */
/* loaded from: classes2.dex */
public final class afnp implements afks {
    private final aflp a;

    public afnp(aflp aflpVar) {
        dbsk.s(aflpVar);
        this.a = aflpVar;
    }

    @Override // defpackage.afks
    public final Runnable a(@dzsi Intent intent, duqp duqpVar) {
        duqx duqxVar = duqpVar.n;
        if (duqxVar == null) {
            duqxVar = duqx.e;
        }
        final String f = dbsj.f(duqxVar.a);
        duqx duqxVar2 = duqpVar.n;
        if (duqxVar2 == null) {
            duqxVar2 = duqx.e;
        }
        int a = duqv.a(duqxVar2.d);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 1) {
            if (i == 2) {
                duqx duqxVar3 = duqpVar.n;
                if (duqxVar3 == null) {
                    duqxVar3 = duqx.e;
                }
                final String str = duqxVar3.b;
                if (!dbsj.d(str)) {
                    duqx duqxVar4 = duqpVar.n;
                    if (duqxVar4 == null) {
                        duqxVar4 = duqx.e;
                    }
                    final String f2 = dbsj.f(duqxVar4.c);
                    final boolean z = intent != null ? !affw.b(intent) : true;
                    final aflp aflpVar = this.a;
                    return new Runnable(aflpVar, f, str, f2, z) { // from class: afln
                        private final aflp a;
                        private final String b;
                        private final String c;
                        private final String d;
                        private final boolean e;

                        {
                            this.a = aflpVar;
                            this.b = f;
                            this.c = str;
                            this.d = f2;
                            this.e = z;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            aflp aflpVar2 = this.a;
                            aflpVar2.a.a().j(this.b, this.c, this.d, this.e);
                        }
                    };
                }
                throw new afkt("No sharer id specified.");
            }
            return this.a.a(null);
        }
        return this.a.a(f);
    }

    @Override // defpackage.afks
    public final durz b() {
        return durz.EIT_LOCATION_SHARING;
    }
}
