package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: apua  reason: default package */
/* loaded from: classes2.dex */
public final class apua extends bvxb<dbnd, dbnf> {
    public final apup a;
    private final gga b;

    public apua(apup apupVar, gga ggaVar) {
        this.a = apupVar;
        this.b = ggaVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "pa.set";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    @dzsi
    public final /* bridge */ /* synthetic */ dbnf e(dbnd dbndVar) {
        dbnd dbndVar2 = dbndVar;
        if (!dbndVar2.b.isEmpty()) {
            dafk a = ckos.a(this.b.findViewById(16908290), dbndVar2.b, 4000);
            if ((dbndVar2.a & 2) != 0) {
                dbnb dbnbVar = dbndVar2.c;
                if (dbnbVar == null) {
                    dbnbVar = dbnb.b;
                }
                int a2 = dbna.a(dbnbVar.a);
                if (a2 != 0 && a2 != 1) {
                    a.t(R.string.TRY_AGAIN_BUTTON_TITLE, new aptz(this, dbndVar2));
                }
            }
            a.c();
        }
        return dbnf.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dbnd j(byte[] bArr) {
        return ((dbnc) dbnd.d.bZ().by(bArr)).bK();
    }
}
