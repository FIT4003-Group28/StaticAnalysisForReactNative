package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awhq  reason: default package */
/* loaded from: classes3.dex */
public final class awhq implements avlm {
    private final cqat a;
    private final avop b;

    public awhq(cqat cqatVar, avop avopVar) {
        this.a = cqatVar;
        this.b = avopVar;
    }

    @Override // defpackage.avlm
    public final void a(dlpt dlptVar) {
        dlrj dlrjVar = dlptVar.e;
        if (dlrjVar == null) {
            dlrjVar = dlrj.e;
        }
        for (dltm dltmVar : dlrjVar.b) {
            ((ckco) this.b.a.a(ckia.B)).a(Math.max(0, (int) TimeUnit.MILLISECONDS.toDays(this.a.b() - dltmVar.q)));
        }
    }
}
