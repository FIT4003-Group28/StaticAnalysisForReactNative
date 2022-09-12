package defpackage;
/* renamed from: bjcv  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bjcv implements cqlc {
    static final cqlc a = new bjcv();

    private bjcv() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        final bjda bjdaVar = (bjda) cqkpVar;
        return new cqgl(bjdaVar) { // from class: bjcp
            private final bjda a;

            {
                this.a = bjdaVar;
            }

            @Override // defpackage.cqgl
            public final void a(CharSequence charSequence) {
                bjda bjdaVar2 = this.a;
                int i = bjcz.b;
                bjdaVar2.f(charSequence);
            }
        };
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
