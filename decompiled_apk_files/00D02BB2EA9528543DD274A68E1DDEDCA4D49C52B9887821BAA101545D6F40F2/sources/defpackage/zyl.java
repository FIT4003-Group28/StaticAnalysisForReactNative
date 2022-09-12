package defpackage;
/* renamed from: zyl  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class zyl implements cqlc {
    static final cqlc a = new zyl();

    private zyl() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        final zyt zytVar = (zyt) cqkpVar;
        return new cqgl(zytVar) { // from class: zyi
            private final zyt a;

            {
                this.a = zytVar;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                zyt zytVar2 = this.a;
                cqss cqssVar = zyr.a;
                zytVar2.f(charSequence);
            }
        };
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
