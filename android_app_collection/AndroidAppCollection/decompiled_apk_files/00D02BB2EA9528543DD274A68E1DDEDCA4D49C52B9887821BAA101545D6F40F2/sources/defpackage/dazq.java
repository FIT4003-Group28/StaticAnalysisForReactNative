package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dazq  reason: default package */
/* loaded from: classes5.dex */
public final class dazq implements degu {
    final /* synthetic */ dazn a;
    final /* synthetic */ degu b;

    public dazq(dazn daznVar, degu deguVar) {
        this.a = daznVar;
        this.b = deguVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        dazn g = dbaa.g(this.a);
        try {
            this.b.a(th);
        } finally {
            dbaa.g(g);
        }
    }

    @Override // defpackage.degu
    public final void b(@dzsi Object obj) {
        dazn g = dbaa.g(this.a);
        try {
            this.b.b(obj);
        } finally {
            dbaa.g(g);
        }
    }
}
