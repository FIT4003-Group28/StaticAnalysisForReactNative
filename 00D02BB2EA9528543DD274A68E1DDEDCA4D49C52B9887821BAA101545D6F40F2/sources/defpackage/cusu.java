package defpackage;
/* compiled from: PG */
/* renamed from: cusu  reason: default package */
/* loaded from: classes5.dex */
final class cusu<T> {
    public final cuss<T> a;
    final /* synthetic */ cusw c;
    public boolean b = false;
    private final cusr<T> d = new cusr(this) { // from class: cust
        private final cusu a;

        {
            this.a = this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.cusr
        public final void a(Object obj) {
            cusu cusuVar = this.a;
            synchronized (cusuVar.c) {
                synchronized (cusuVar) {
                    if (!cusuVar.b) {
                        cusuVar.b = true;
                        cusw cuswVar = cusuVar.c;
                        cuswVar.b--;
                    }
                    cusuVar.c.a.put(cusuVar.a, obj);
                    cusw cuswVar2 = cusuVar.c;
                    if (cuswVar2.b == 0) {
                        cuswVar2.a(new cusv(cuswVar2.a));
                    }
                }
            }
        }
    };

    public cusu(cusw cuswVar, cuss<T> cussVar) {
        this.c = cuswVar;
        this.a = cussVar;
    }

    public final synchronized void a() {
        this.b = false;
        this.a.q(this.d);
    }

    public final synchronized void b() {
        this.a.g(this.d);
        this.b = false;
    }
}
