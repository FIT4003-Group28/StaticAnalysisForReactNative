package defpackage;
/* compiled from: PG */
/* renamed from: anin  reason: default package */
/* loaded from: classes2.dex */
public final class anin extends bbf {
    private final anil<?, ? extends anim> a;
    private final cjqy b;

    public anin(anil<?, ? extends anim> anilVar, cjqy cjqyVar) {
        this.a = anilVar;
        this.b = cjqyVar;
    }

    @Override // defpackage.bbf, defpackage.bbb
    public final void b(int i) {
        cjtd c;
        int b = this.a.b();
        if (i != b && (c = this.a.c().b().c()) != null) {
            this.b.m(new cjte(deaf.SWIPE, i < b ? dead.RIGHT : dead.LEFT), c);
        }
        final anil<?, ? extends anim> anilVar = this.a;
        boolean z = true;
        dbsk.l(!anilVar.b.isEmpty());
        dbsk.a(i >= 0);
        if (i >= anilVar.b.size()) {
            z = false;
        }
        dbsk.a(z);
        if (anilVar.d == i) {
            return;
        }
        anilVar.d = i;
        anii aniiVar = anilVar.e;
        Runnable runnable = new Runnable(anilVar) { // from class: anig
            private final anil a;

            {
                this.a = anilVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d();
            }
        };
        cjyb cjybVar = aniiVar.a;
        cjxx cjxxVar = aniiVar.b;
        anih anihVar = new anih(runnable);
        cjybVar.d(cjxxVar, anihVar);
        aniiVar.b = anihVar;
        anilVar.g(anilVar.c());
    }
}
