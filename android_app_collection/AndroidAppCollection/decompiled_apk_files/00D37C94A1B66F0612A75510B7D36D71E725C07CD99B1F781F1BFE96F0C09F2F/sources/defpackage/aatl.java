package defpackage;
/* compiled from: PG */
/* renamed from: aatl  reason: default package */
/* loaded from: classes.dex */
public final class aatl {
    public final aprn a;
    public aatk b;
    private aatm c;

    public aatl(aprn aprnVar) {
        aprnVar.getClass();
        this.a = aprnVar;
    }

    public final aatm a() {
        if (this.c == null) {
            aprm aprmVar = this.a.d;
            if (aprmVar == null) {
                aprmVar = aprm.a;
            }
            if ((aprmVar.b & 2) != 0) {
                aprm aprmVar2 = this.a.d;
                if (aprmVar2 == null) {
                    aprmVar2 = aprm.a;
                }
                aprp aprpVar = aprmVar2.d;
                if (aprpVar == null) {
                    aprpVar = aprp.a;
                }
                this.c = new aatm(aprpVar);
            }
        }
        return this.c;
    }

    public final aprs b() {
        aprm aprmVar = this.a.d;
        if (aprmVar == null) {
            aprmVar = aprm.a;
        }
        if ((aprmVar.b & 1) != 0) {
            aprm aprmVar2 = this.a.d;
            if (aprmVar2 == null) {
                aprmVar2 = aprm.a;
            }
            aprs aprsVar = aprmVar2.c;
            return aprsVar == null ? aprs.a : aprsVar;
        }
        return null;
    }
}
