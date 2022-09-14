package defpackage;
/* renamed from: bbwv  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbwv implements cqlc {
    static final cqlc a = new bbwv();

    private bbwv() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        final bbyg bbygVar = (bbyg) cqkpVar;
        return new Runnable(bbygVar) { // from class: bbxi
            private final bbyg a;

            {
                this.a = bbygVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bbyg bbygVar2 = this.a;
                cqjg cqjgVar = bbyf.a;
                bbygVar2.j();
            }
        };
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
