package defpackage;
/* renamed from: zyn  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class zyn implements cqlc {
    static final cqlc a = new zyn();

    private zyn() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        final zyt zytVar = (zyt) cqkpVar;
        return new cqgl(zytVar) { // from class: zyh
            private final zyt a;

            {
                this.a = zytVar;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                zyt zytVar2 = this.a;
                cqss cqssVar = zyr.a;
                zytVar2.h(charSequence);
            }
        };
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
