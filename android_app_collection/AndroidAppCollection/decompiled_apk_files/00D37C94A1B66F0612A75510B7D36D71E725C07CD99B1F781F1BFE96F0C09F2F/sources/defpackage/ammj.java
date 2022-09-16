package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ammj  reason: default package */
/* loaded from: classes.dex */
public final class ammj implements ankb {
    final /* synthetic */ amlv a;
    final /* synthetic */ ankb b;

    public ammj(amlv amlvVar, ankb ankbVar) {
        this.a = amlvVar;
        this.b = ankbVar;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
        amlv e = amna.e(this.a);
        try {
            this.b.a(th);
        } finally {
            amna.e(e);
        }
    }

    @Override // defpackage.ankb
    public final void b(Object obj) {
        amlv e = amna.e(this.a);
        try {
            this.b.b(obj);
        } finally {
            amna.e(e);
        }
    }
}
