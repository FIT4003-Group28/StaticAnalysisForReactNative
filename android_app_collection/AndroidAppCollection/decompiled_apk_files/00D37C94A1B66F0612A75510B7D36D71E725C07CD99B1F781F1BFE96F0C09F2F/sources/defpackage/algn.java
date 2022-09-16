package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: algn  reason: default package */
/* loaded from: classes.dex */
public final class algn implements albt {
    public final String a;
    public final albu b;
    final /* synthetic */ algq c;

    public algn(algq algqVar, String str, albu albuVar) {
        this.c = algqVar;
        this.a = str;
        this.b = albuVar;
    }

    @Override // defpackage.albt
    public final void sb(albu albuVar) {
        if (albuVar.g().b) {
            albuVar.d(this);
            this.c.b(this.a, true);
            this.c.a.execute(new Runnable() { // from class: algm
                @Override // java.lang.Runnable
                public final void run() {
                    algn algnVar = algn.this;
                    algnVar.c.e(algnVar.a);
                }
            });
        }
    }
}
