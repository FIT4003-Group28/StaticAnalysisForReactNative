package defpackage;
/* compiled from: PG */
/* renamed from: aluz  reason: default package */
/* loaded from: classes.dex */
public final class aluz extends alvc {
    private alvb a;

    public aluz(final alyx alyxVar) {
        super(dbud.a(new dbty(alyxVar) { // from class: aluy
            private final alyx a;

            {
                this.a = alyxVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a;
            }
        }));
    }

    @Override // defpackage.alvc, defpackage.alvd
    public final synchronized alvb a(akry akryVar, int i, boolean z) {
        if (this.a == null) {
            this.a = super.a(akryVar, i, z);
        }
        return this.a;
    }
}
