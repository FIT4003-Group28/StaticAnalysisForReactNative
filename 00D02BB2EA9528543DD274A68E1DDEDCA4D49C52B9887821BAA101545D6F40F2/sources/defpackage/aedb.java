package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aedb  reason: default package */
/* loaded from: classes2.dex */
final class aedb implements aeck {
    private final afzu a;
    private final afzt b;

    public aedb(final dxio<akfa> dxioVar, afzu afzuVar, final afzs afzsVar, final Executor executor, final aecm aecmVar) {
        this.a = afzuVar;
        this.b = new afzt(executor, dxioVar, aecmVar, afzsVar) { // from class: aecz
            private final Executor a;
            private final dxio b;
            private final aecm c;
            private final afzs d;

            {
                this.a = executor;
                this.b = dxioVar;
                this.c = aecmVar;
                this.d = afzsVar;
            }

            @Override // defpackage.afzt
            public final void a(final afzu afzuVar2) {
                Executor executor2 = this.a;
                final dxio dxioVar2 = this.b;
                final aecm aecmVar2 = this.c;
                final afzs afzsVar2 = this.d;
                executor2.execute(new Runnable(dxioVar2, afzuVar2, aecmVar2, afzsVar2) { // from class: aeda
                    private final dxio a;
                    private final afzu b;
                    private final aecm c;
                    private final afzs d;

                    {
                        this.a = dxioVar2;
                        this.b = afzuVar2;
                        this.c = aecmVar2;
                        this.d = afzsVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ddho ddhoVar;
                        ddho ddhoVar2;
                        dxio dxioVar3 = this.a;
                        afzu afzuVar3 = this.b;
                        aecm aecmVar3 = this.c;
                        afzs afzsVar3 = this.d;
                        btlu j = ((akfa) dxioVar3.a()).j();
                        if (afzuVar3.c(j)) {
                            ddhoVar = dtxr.W;
                            ddhoVar2 = dtxr.V;
                        } else {
                            ddhoVar = dtxr.Y;
                            ddhoVar2 = dtxr.X;
                        }
                        dktk dktkVar = dktk.FEED;
                        if (aecmVar3.g.e(dktkVar)) {
                            aecmVar3.g.d.f(dktkVar, ddhoVar, ddhoVar2);
                        }
                        dktk dktkVar2 = dktk.FEED;
                        boolean f = afzsVar3.a.a().f();
                        if (aecmVar3.g.e(dktkVar2)) {
                            aecmVar3.g.d.e(dktkVar2, f);
                        }
                        aecmVar3.b(dktk.FEED, afzuVar3.b(j));
                    }
                });
            }
        };
    }

    @Override // defpackage.aeck
    public final String a() {
        return "local_stream";
    }

    @Override // defpackage.aeck
    public final void b() {
        this.a.d(this.b);
    }

    @Override // defpackage.aeck
    public final void c() {
        this.a.e(this.b);
    }
}
