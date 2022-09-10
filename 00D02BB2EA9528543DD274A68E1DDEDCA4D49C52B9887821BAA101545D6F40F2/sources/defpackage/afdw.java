package defpackage;
/* compiled from: PG */
/* renamed from: afdw  reason: default package */
/* loaded from: classes.dex */
public final class afdw {
    private final dbty<dkmh> a;
    private final afec b;

    public afdw(final btvo btvoVar, afec afecVar) {
        btvoVar.getClass();
        this.a = dbud.a(new dbty(btvoVar) { // from class: afdv
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.getIncognitoParameters();
            }
        });
        this.b = afecVar;
    }

    public final boolean a() {
        if (this.b.a()) {
            return true;
        }
        return this.a.a().a;
    }
}
