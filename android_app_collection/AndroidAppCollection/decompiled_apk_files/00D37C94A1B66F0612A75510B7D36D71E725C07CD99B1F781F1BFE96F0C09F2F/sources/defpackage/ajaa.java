package defpackage;
/* compiled from: PG */
/* renamed from: ajaa  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajaa implements Runnable {
    public final /* synthetic */ ajad a;
    private final /* synthetic */ int b;

    public /* synthetic */ ajaa(ajad ajadVar) {
        this.a = ajadVar;
    }

    public /* synthetic */ ajaa(ajad ajadVar, int i) {
        this.b = i;
        this.a = ajadVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jc jcVar;
        aoce aoceVar;
        if (this.b != 0) {
            ajad ajadVar = this.a;
            iz izVar = ajadVar.b;
            if (izVar != null && (aoceVar = ajadVar.d) != null) {
                izVar.h(aoceVar.j());
            }
            ajadVar.d = null;
            return;
        }
        ajad ajadVar2 = this.a;
        iz izVar2 = ajadVar2.b;
        if (izVar2 != null && izVar2.k() && (jcVar = ajadVar2.c) != null) {
            ajadVar2.b.i(jcVar.a());
        }
        ajadVar2.c = null;
    }
}
