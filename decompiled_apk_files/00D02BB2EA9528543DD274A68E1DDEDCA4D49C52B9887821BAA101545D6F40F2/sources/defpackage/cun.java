package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cun  reason: default package */
/* loaded from: classes5.dex */
final class cun implements amfq {
    public final String a;
    final /* synthetic */ cuo b;
    private final Executor c;

    public cun(cuo cuoVar, String str, Executor executor) {
        this.b = cuoVar;
        this.a = str;
        this.c = executor;
    }

    @Override // defpackage.amfq
    public final void a(final amfu amfuVar) {
        this.c.execute(new Runnable(this, amfuVar) { // from class: cum
            private final cun a;
            private final amfu b;

            {
                this.a = this;
                this.b = amfuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cun cunVar = this.a;
                amfu amfuVar2 = this.b;
                ((ckco) cunVar.b.f.a().a(ckjh.c)).a(amfuVar2.b());
                if (amfuVar2.b() == 0 || amfuVar2.b() == 1 || amfuVar2.b() == 2) {
                    cuo cuoVar = cunVar.b;
                    String str = cunVar.a;
                    if (cuoVar.b.contains(str)) {
                        if (cuoVar.b.a(str) >= 3) {
                            cuoVar.d(str);
                            return;
                        }
                        cuoVar.b.add(str);
                        cuoVar.a.put(str, cul.LOG_STATUS_FAILED);
                        return;
                    }
                    cuoVar.b.add(str);
                    cuoVar.a.put(str, cul.LOG_STATUS_FAILED);
                    return;
                }
                ((ckcn) cunVar.b.f.a().a(ckjh.b)).a();
                cuo cuoVar2 = cunVar.b;
                String str2 = cunVar.a;
                cuoVar2.a.put(str2, cul.LOG_STATUS_SUCCESSFULLY_LOGGED);
                cuoVar2.b.remove(str2);
            }
        });
    }
}
