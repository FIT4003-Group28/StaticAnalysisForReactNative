package defpackage;
/* compiled from: PG */
/* renamed from: awqo  reason: default package */
/* loaded from: classes3.dex */
final class awqo implements dbsz<awtr> {
    final /* synthetic */ awqp a;

    public awqo(awqp awqpVar) {
        this.a = awqpVar;
    }

    @Override // defpackage.dbsz
    public final /* bridge */ /* synthetic */ void NU(@dzsi awtr awtrVar) {
        awtr awtrVar2 = awtrVar;
        final awtn k = awtrVar2 == null ? null : awtn.m(awtrVar2).k();
        this.a.a.b(new Runnable(this, k) { // from class: awqn
            private final awqo a;
            private final awtn b;

            {
                this.a = this;
                this.b = k;
            }

            @Override // java.lang.Runnable
            public final void run() {
                awqo awqoVar = this.a;
                awqoVar.a.d(this.b);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }
}
