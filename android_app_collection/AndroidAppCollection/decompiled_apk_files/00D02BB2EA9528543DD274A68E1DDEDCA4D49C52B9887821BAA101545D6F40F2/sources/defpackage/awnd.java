package defpackage;
/* compiled from: PG */
/* renamed from: awnd  reason: default package */
/* loaded from: classes3.dex */
public final class awnd {
    public static final drte a;
    public static final byte[] b;
    private final awmu c;

    static {
        drtd bZ = drte.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drte drteVar = (drte) bZ.b;
        int i = drteVar.a | 8;
        drteVar.a = i;
        drteVar.e = 14;
        drteVar.a = i | 4;
        drteVar.d = "server too busy";
        drte bK = bZ.bK();
        a = bK;
        b = bK.bS();
    }

    public awnd(awmu awmuVar) {
        this.c = awmuVar;
    }

    public final <R> void a(String str, final awnc<R> awncVar, awnb<R> awnbVar, awmz awmzVar) {
        dehn<R> a2 = this.c.a(str, new awmn(awncVar) { // from class: awmy
            private final awnc a;

            {
                this.a = awncVar;
            }

            @Override // defpackage.awmn
            public final dehn a(dehp dehpVar) {
                awnc awncVar2 = this.a;
                drte drteVar = awnd.a;
                return dehpVar.c(awncVar2);
            }
        });
        a2.Pk(new awna(a2, awnbVar, awmzVar), this.c.a);
    }
}
