package defpackage;
/* renamed from: bkft  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bkft implements cqlc {
    static final cqlc a = new bkft();

    private bkft() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        final bkgn bkgnVar = (bkgn) cqkpVar;
        int i = bkgl.a;
        bkgnVar.getClass();
        return new cqgl(bkgnVar) { // from class: bkgb
            private final bkgn a;

            {
                this.a = bkgnVar;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                this.a.H(charSequence);
            }
        };
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
