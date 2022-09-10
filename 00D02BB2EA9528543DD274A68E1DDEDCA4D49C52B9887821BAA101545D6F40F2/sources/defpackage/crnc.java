package defpackage;
/* compiled from: PG */
/* renamed from: crnc  reason: default package */
/* loaded from: classes5.dex */
public final class crnc implements crgy {
    private static final String a = "crnc";
    private final crnf<crgy> b;

    public crnc(bvrb bvrbVar, dcdc<crgy> dcdcVar) {
        this.b = new crnf<>(dcdcVar, bvrbVar);
    }

    @Override // defpackage.crgy
    public final void a(final crgz crgzVar) {
        this.b.a(new bvqg(crgzVar) { // from class: crna
            private final crgz a;

            {
                this.a = crgzVar;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ((crgy) obj).a(this.a);
            }
        }, ".onSessionStart()", 2);
    }

    @Override // defpackage.crgy
    public final void b(final boolean z) {
        this.b.a(new bvqg(z) { // from class: crnb
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.bvqg
            public final void NU(Object obj) {
                ((crgy) obj).b(this.a);
            }
        }, ".onSessionStop()", 0);
    }
}
