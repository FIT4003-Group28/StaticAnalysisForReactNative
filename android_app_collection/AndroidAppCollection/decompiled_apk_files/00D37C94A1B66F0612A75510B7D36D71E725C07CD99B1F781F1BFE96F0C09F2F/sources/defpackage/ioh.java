package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ioh  reason: default package */
/* loaded from: classes3.dex */
public final class ioh extends ajwe {
    final /* synthetic */ lsv a;

    public ioh(lsv lsvVar) {
        this.a = lsvVar;
    }

    @Override // defpackage.ajwe, defpackage.akae
    public final void c(aakw aakwVar, boolean z) {
        auqa auqaVar;
        auqh auqhVar = aakwVar.a;
        if ((auqhVar.c & 4) != 0) {
            auqe auqeVar = auqhVar.h;
            if (auqeVar == null) {
                auqeVar = auqe.a;
            }
            if (auqeVar.b == 105924295) {
                auqaVar = (auqa) auqeVar.c;
            } else {
                auqaVar = auqa.a;
            }
        } else {
            auqaVar = null;
        }
        if (auqaVar != null) {
            this.a.p(auqaVar);
        }
    }
}
