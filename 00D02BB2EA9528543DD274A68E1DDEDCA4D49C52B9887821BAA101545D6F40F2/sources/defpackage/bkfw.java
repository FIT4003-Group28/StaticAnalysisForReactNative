package defpackage;
/* renamed from: bkfw  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bkfw implements cqlc {
    static final cqlc a = new bkfw();

    private bkfw() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        final bkgn bkgnVar = (bkgn) cqkpVar;
        int i = bkgl.a;
        bkgnVar.getClass();
        return new cqgl(bkgnVar) { // from class: bkga
            private final bkgn a;

            {
                this.a = bkgnVar;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                this.a.A(charSequence);
            }
        };
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
