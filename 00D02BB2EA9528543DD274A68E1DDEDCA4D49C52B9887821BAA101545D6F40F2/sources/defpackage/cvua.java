package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cvua  reason: default package */
/* loaded from: classes5.dex */
public final class cvua implements cvtz {
    private final cvot a;
    private final cvkk b;
    private final cvkf c;
    private final cvpc d;
    private final cvlr e;

    public cvua(cvot cvotVar, cvkk cvkkVar, cvkf cvkfVar, cvpc cvpcVar, cvlr cvlrVar) {
        this.a = cvotVar;
        this.b = cvkkVar;
        this.c = cvkfVar;
        this.d = cvpcVar;
        this.e = cvlrVar;
    }

    @Override // defpackage.cvtz
    public final void a(@dzsi String str, List<String> list) {
        cvkc b = this.c.b(str);
        List<cvkj> d = this.b.d(b == null ? null : b.b(), (String[]) list.toArray(new String[0]));
        if (!d.isEmpty()) {
            cvpc cvpcVar = this.d;
            cvll k = cvlm.k();
            cvlj cvljVar = (cvlj) k;
            cvljVar.f = 3;
            k.e(1);
            cvljVar.a = "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED";
            cvljVar.b = b;
            k.g(d);
            dsee bZ = dsef.f.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsef dsefVar = (dsef) bZ.b;
            dsefVar.e = 2;
            dsefVar.a |= 8;
            dsef dsefVar2 = (dsef) bZ.b;
            dsefVar2.d = 2;
            dsefVar2.a |= 4;
            k.d(bZ.bK());
            k.f(9);
            cvpcVar.a(k.b());
            cvlp a = this.e.a(drwv.DISMISSED_BY_API);
            a.i(b);
            a.e(d);
            a.a();
        }
    }

    @Override // defpackage.cvtz
    public final void b() {
        for (cvkc cvkcVar : this.c.a()) {
            e(cvkcVar);
        }
        e(null);
    }

    @Override // defpackage.cvtz
    public final void c(cvix cvixVar) {
        for (cvkc cvkcVar : this.c.a()) {
            for (cvkj cvkjVar : this.b.b(cvkcVar.b())) {
                this.a.a(cvkcVar, cvkjVar, true, true, cvixVar, null, null);
            }
        }
        for (cvkj cvkjVar2 : this.b.b(null)) {
            this.a.a(null, cvkjVar2, true, true, cvixVar, null, null);
        }
    }

    @Override // defpackage.cvtz
    public final void d(@dzsi cvkc cvkcVar, String str, cvix cvixVar, @dzsi dsok dsokVar) {
        List<cvkj> d = this.b.d(cvkcVar != null ? cvkcVar.b() : null, str);
        if (d.isEmpty()) {
            return;
        }
        cvkj cvkjVar = d.get(0);
        if (dsokVar != null) {
            cvlw.c("ChimeTrayManagerApi", "Refreshing thread with app provided Payload (instead of server Payload).", new Object[0]);
            cvka o = cvkjVar.o();
            o.e = dsokVar;
            cvkjVar = o.a();
        }
        this.a.a(cvkcVar, cvkjVar, true, true, cvixVar, null, null);
    }

    public final void e(@dzsi cvkc cvkcVar) {
        List<cvkj> b = this.b.b(cvkcVar == null ? null : cvkcVar.b());
        if (!b.isEmpty()) {
            cvpc cvpcVar = this.d;
            cvll k = cvlm.k();
            cvlj cvljVar = (cvlj) k;
            cvljVar.f = 3;
            k.e(1);
            cvljVar.a = "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED";
            cvljVar.b = cvkcVar;
            k.g(b);
            dsee bZ = dsef.f.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsef dsefVar = (dsef) bZ.b;
            dsefVar.e = 2;
            dsefVar.a |= 8;
            dsef dsefVar2 = (dsef) bZ.b;
            dsefVar2.d = 2;
            dsefVar2.a |= 4;
            k.d(bZ.bK());
            k.f(9);
            cvpcVar.a(k.b());
            cvlp a = this.e.a(drwv.DISMISSED_BY_API);
            a.i(cvkcVar);
            a.e(b);
            a.a();
        }
    }
}
