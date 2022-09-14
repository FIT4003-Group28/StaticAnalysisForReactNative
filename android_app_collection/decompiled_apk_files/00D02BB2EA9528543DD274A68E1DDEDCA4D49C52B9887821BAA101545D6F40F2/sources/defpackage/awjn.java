package defpackage;
/* compiled from: PG */
/* renamed from: awjn  reason: default package */
/* loaded from: classes3.dex */
final class awjn implements avii {
    final /* synthetic */ awjv a;

    public awjn(awjv awjvVar) {
        this.a = awjvVar;
    }

    @Override // defpackage.avii
    public final void a(final avih avihVar) {
        int i = awjv.p;
        this.a.c.execute(new Runnable(this, avihVar) { // from class: awjk
            private final awjn a;
            private final avih b;

            {
                this.a = this;
                this.b = avihVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                avjg avjgVar;
                awjn awjnVar = this.a;
                avih avihVar2 = this.b;
                awjv awjvVar = awjnVar.a;
                avih avihVar3 = avih.UNKNOWN;
                avjg avjgVar2 = avjg.OK;
                avjv avjvVar = avjv.UNKNOWN_SCREEN_CHECK;
                avjx avjxVar = avjx.UNKNOWN_TIME_BUDGET;
                int ordinal = avihVar2.ordinal();
                if (ordinal == 0) {
                    avjgVar = avjg.UNKNOWN;
                } else if (ordinal == 1) {
                    avjgVar = avjg.OK;
                } else if (ordinal != 2) {
                    avjgVar = ordinal != 3 ? avjg.UNKNOWN : avjg.TERMINATION_OR_NOOP;
                } else {
                    avjgVar = avjg.FAILURE;
                }
                awjvVar.b(avjgVar);
            }
        });
    }

    @Override // defpackage.avii
    public final void b() {
        this.a.c.execute(new Runnable(this) { // from class: awjl
            private final awjn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b(avjg.SHUTDOWN);
            }
        });
    }

    @Override // defpackage.avii
    public final void c() {
        this.a.c.execute(new Runnable(this) { // from class: awjm
            private final awjn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b(avjg.FAILURE);
            }
        });
    }
}
