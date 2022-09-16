package defpackage;
/* compiled from: PG */
/* renamed from: awhr  reason: default package */
/* loaded from: classes3.dex */
public final class awhr implements avlm {
    private final bvjj a;

    public awhr(bvjj bvjjVar) {
        this.a = bvjjVar;
    }

    @Override // defpackage.avlm
    public final void a(dlpt dlptVar) {
        dlrj dlrjVar = dlptVar.e;
        if (dlrjVar == null) {
            dlrjVar = dlrj.e;
        }
        dlqm dlqmVar = dlrjVar.c;
        if (dlqmVar == null) {
            dlqmVar = dlqm.b;
        }
        if (dlqmVar.a.size() == 1) {
            bvjj bvjjVar = this.a;
            bvjk bvjkVar = bvjk.bK;
            dlug dlugVar = dlqmVar.a.get(0).c;
            if (dlugVar == null) {
                dlugVar = dlug.c;
            }
            bvjjVar.S(bvjkVar, !dlugVar.equals(dlug.c));
            return;
        }
        this.a.S(bvjk.bK, false);
    }
}
