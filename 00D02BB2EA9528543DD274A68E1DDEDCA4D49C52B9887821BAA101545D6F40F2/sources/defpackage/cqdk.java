package defpackage;

import android.accounts.Account;
import android.content.Context;
/* compiled from: PG */
/* renamed from: cqdk  reason: default package */
/* loaded from: classes5.dex */
public final class cqdk {
    public static cqdi c;
    static final dcco<cqeo, dhim> d;
    public final cqdo a;
    public final cqbr b;
    private final cqeu e;

    static {
        cqeo cqeoVar = cqeo.ALREADY_CONSENTED;
        dhim dhimVar = dhim.ALREADY_CONSENTED;
        cqeo cqeoVar2 = cqeo.CANNOT_CONSENT;
        dhim dhimVar2 = dhim.CANNOT_CONSENT;
        cqeo cqeoVar3 = cqeo.CAN_ASK_FOR_CONSENT;
        dhim dhimVar3 = dhim.CAN_ASK_FOR_CONSENT;
        cqeo cqeoVar4 = cqeo.CONSENT_DEPRECATED;
        dhim dhimVar4 = dhim.CONSENT_DEPRECATED;
        dbzb.a(cqeoVar, dhimVar);
        dbzb.a(cqeoVar2, dhimVar2);
        dbzb.a(cqeoVar3, dhimVar3);
        dbzb.a(cqeoVar4, dhimVar4);
        d = new dcmh(new Object[]{cqeoVar, dhimVar, cqeoVar2, dhimVar2, cqeoVar3, dhimVar3, cqeoVar4, dhimVar4}, 4);
    }

    public cqdk() {
        cqeu cqeuVar = new cqeu();
        cqdo cqdoVar = new cqdo();
        cqbr cqbrVar = new cqbr();
        dbsk.t(c, "You should use ConsentFlow.setGrpcChannelFactory to set the desired network stack");
        this.e = cqeuVar;
        this.a = cqdoVar;
        this.b = cqbrVar;
    }

    public final void a(final Context context, final Account account, dgyd dgydVar, final cqdj cqdjVar) {
        final cqew a = cqev.a(context, account, Integer.valueOf(dbsy.a.nextInt()), dgydVar);
        a.b(2);
        this.e.a(context, account, new cqet(this, cqdjVar, a, context, account) { // from class: cqdf
            private final cqdk a;
            private final cqdj b;
            private final cqew c;
            private final Context d;
            private final Account e;

            {
                this.a = this;
                this.b = cqdjVar;
                this.c = a;
                this.d = context;
                this.e = account;
            }

            @Override // defpackage.cqet
            public final void a(cqes cqesVar) {
                cqdk cqdkVar = this.a;
                cqdj cqdjVar2 = this.b;
                cqew cqewVar = this.c;
                Context context2 = this.d;
                Account account2 = this.e;
                cqde cqdeVar = (cqde) cqesVar;
                cqdjVar2.a(cqdeVar.a);
                dhim orDefault = cqdk.d.getOrDefault(cqdeVar.a, dhim.PROMOTABILITY_UNKNOWN);
                dhif bZ = dhip.f.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dhip dhipVar = (dhip) bZ.b;
                dhipVar.b = 2;
                dhipVar.a |= 1;
                dhii bZ2 = dhij.c.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dhij.b((dhij) bZ2.b);
                dgyd dgydVar2 = cqewVar.a;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dhij dhijVar = (dhij) bZ2.b;
                dhijVar.b = dgydVar2.v;
                dhijVar.a |= 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dhip dhipVar2 = (dhip) bZ.b;
                dhij bK = bZ2.bK();
                bK.getClass();
                dhipVar2.c = bK;
                dhipVar2.a |= 2;
                dhik bZ3 = dhin.c.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dhin dhinVar = (dhin) bZ3.b;
                dhinVar.b = orDefault.f;
                dhinVar.a |= 1;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dhip dhipVar3 = (dhip) bZ.b;
                dhin bK2 = bZ3.bK();
                bK2.getClass();
                dhipVar3.e = bK2;
                dhipVar3.a |= 8;
                cqewVar.a(bZ.bK());
                if (cqdeVar.a == cqeo.CAN_ASK_FOR_CONSENT) {
                    cqdkVar.a.a(context2, account2, cqeu.b(cqesVar), cqbs.a(context2));
                    cqdkVar.b.a(context2, account2, cqdg.a);
                    cqdkVar.b.b(context2, account2, cqdh.a);
                }
            }
        });
    }
}
