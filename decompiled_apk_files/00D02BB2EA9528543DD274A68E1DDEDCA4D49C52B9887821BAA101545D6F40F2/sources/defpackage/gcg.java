package defpackage;
/* compiled from: PG */
/* renamed from: gcg  reason: default package */
/* loaded from: classes.dex */
public final class gcg {
    private final dbty<Boolean> a;

    public gcg(final dxio<dkiy> dxioVar) {
        this.a = dbud.a(new dbty(dxioVar) { // from class: gcf
            private final dxio a;

            {
                this.a = dxioVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(((dkiy) this.a.a()).bt);
            }
        });
    }

    public final boolean a() {
        return this.a.a().booleanValue();
    }
}
