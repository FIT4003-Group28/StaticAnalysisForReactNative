package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: akxd  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class akxd implements bvro {
    static final bvro a = new akxd();

    private akxd() {
    }

    @Override // defpackage.bvro
    public final void a(Object obj, Object obj2) {
        dmll dmllVar = (dmll) obj;
        int i = akxf.a;
        int b = ((ddho) obj2).b();
        if (dmllVar.c) {
            dmllVar.bF();
            dmllVar.c = false;
        }
        dmlm dmlmVar = (dmlm) dmllVar.b;
        dmlm dmlmVar2 = dmlm.g;
        dmlmVar.a |= 8;
        dmlmVar.e = b;
    }
}
