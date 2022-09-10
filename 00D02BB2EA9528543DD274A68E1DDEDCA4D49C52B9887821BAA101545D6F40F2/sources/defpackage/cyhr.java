package defpackage;
/* compiled from: PG */
/* renamed from: cyhr  reason: default package */
/* loaded from: classes5.dex */
final class cyhr implements cyhn {
    private final cnjz a;

    public cyhr(cnjz cnjzVar) {
        this.a = cnjzVar;
    }

    @Override // defpackage.cyhn
    public final void a(final dssj dssjVar) {
        this.a.e(new cnjx(dssjVar) { // from class: cyhq
            private final dssj a;

            {
                this.a = dssjVar;
            }

            @Override // defpackage.cnjx
            public final byte[] a() {
                return this.a.bS();
            }
        }).a();
    }
}
