package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.PriorityBlockingQueue;
/* compiled from: PG */
/* renamed from: ckse  reason: default package */
/* loaded from: classes4.dex */
public final class ckse implements cksr {
    public final cksd a;
    public bvqm b;
    private final btvo c;
    private final cksj d;
    private final crox e;
    private final PriorityBlockingQueue<cksp> f;
    private final crdz g;

    public ckse(cksj cksjVar, btvo btvoVar, crox croxVar, PriorityBlockingQueue priorityBlockingQueue, cksd cksdVar, crdz crdzVar) {
        this.d = cksjVar;
        this.c = btvoVar;
        this.e = croxVar;
        this.f = priorityBlockingQueue;
        this.a = cksdVar;
        this.g = crdzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cksi a(btvo btvoVar, crfk crfkVar, crdz crdzVar) {
        int i = btvoVar.getTextToSpeechParameters().d;
        cksg cksgVar = new cksg();
        cksgVar.a = crfkVar;
        cksgVar.b = Locale.getDefault();
        cksgVar.e = i;
        cksgVar.c = cksh.NETWORK;
        if (crdzVar.a()) {
            cksgVar.d = crdzVar.b();
        }
        return new cksi(cksgVar);
    }

    @Override // defpackage.cksr
    public final void b(cksp ckspVar) {
        cksp ckspVar2;
        ArrayList a = dchl.a();
        this.f.drainTo(a);
        int size = a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ckspVar2 = null;
                break;
            }
            ckspVar2 = (cksp) a.get(i);
            i++;
            if (ckspVar2.a.equals(ckspVar.a)) {
                break;
            }
        }
        if (ckspVar2 == null) {
            this.f.addAll(a);
        } else {
            int size2 = a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                cksp ckspVar3 = (cksp) a.get(i2);
                if (ckspVar3.b.compareTo(ckspVar.b) >= 0) {
                    this.f.add(ckspVar3);
                } else if (ckspVar3.c > ckspVar2.c) {
                    this.f.add(ckspVar3);
                }
            }
        }
        this.f.add(ckspVar);
    }

    @Override // defpackage.cksr
    @dzsi
    public final File c(crfk crfkVar) {
        File a = this.d.a(a(this.c, crfkVar, this.g));
        this.e.i();
        if (a != null) {
            this.e.j();
        }
        return a;
    }

    @Override // defpackage.cksr
    public final void d(Locale locale) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // defpackage.cksr
    public final void e() {
        this.f.size();
        this.f.clear();
    }

    @Override // defpackage.cksr
    public final void f() {
        e();
        cksf cksfVar = this.a.a;
        ((cksa) cksfVar).a.a(cksfVar);
        bvqm bvqmVar = this.b;
        if (bvqmVar != null) {
            bvqmVar.quit();
        }
    }
}
