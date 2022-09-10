package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpxe  reason: default package */
/* loaded from: classes4.dex */
public final class bpxe extends bvxb<dgnj, dgnl> {
    private final akfa a;
    private final akfc b;

    public bpxe(akfa akfaVar, akfc akfcVar) {
        this.a = akfaVar;
        this.b = akfcVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rmi.eua";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    @dzsi
    public final /* bridge */ /* synthetic */ dgnl e(dgnj dgnjVar) {
        aker i = akeu.i(new bpxd());
        aken a = i.a();
        a.i(R.string.RAP_AAP_LOGIN_SCREEN_TITLE);
        a.h(R.string.RAP_AAP_LOGIN_SCREEN_SUBTITLE);
        a.c(R.string.DISABLE_INCOGNITO_BODY_TEXT);
        this.b.b(i.b());
        if (btlu.i(this.a.j()).equals(btlt.GOOGLE)) {
            dgnk bZ = dgnl.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dgnl dgnlVar = (dgnl) bZ.b;
            dgnlVar.a |= 1;
            dgnlVar.b = true;
            return bZ.bK();
        }
        return null;
    }

    @Override // defpackage.bvxb
    @dzsi
    protected final /* bridge */ /* synthetic */ dgnl f(Object obj) {
        if (!(obj instanceof Boolean)) {
            return null;
        }
        dgnk bZ = dgnl.c.bZ();
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgnl dgnlVar = (dgnl) bZ.b;
        dgnlVar.a |= 1;
        dgnlVar.b = booleanValue;
        return bZ.bK();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dgnj j(byte[] bArr) {
        return ((dgni) dgnj.a.bZ().bx(bArr, dsqa.c())).bK();
    }
}
