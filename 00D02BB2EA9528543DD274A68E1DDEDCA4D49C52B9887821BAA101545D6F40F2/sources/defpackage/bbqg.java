package defpackage;

import android.content.Intent;
/* renamed from: bbqg  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbqg implements bbqm {
    static final bbqm a = new bbqg();

    private bbqg() {
    }

    @Override // defpackage.bbqm
    public final Intent a(crts crtsVar, String str) {
        Intent intent = new Intent("geo.uploader.upload_progress_broadcast_action");
        crtt bZ = crua.o.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        crua cruaVar = (crua) bZ.b;
        str.getClass();
        cruaVar.a |= 1;
        cruaVar.b = str;
        crtx crtxVar = crtx.UPLOADED;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        crua cruaVar2 = (crua) bZ.b;
        cruaVar2.e = crtxVar.l;
        cruaVar2.a |= 8;
        dfql dfqlVar = (dfql) dfqq.x.bZ();
        String str2 = crtsVar.b;
        if (dfqlVar.c) {
            dfqlVar.bF();
            dfqlVar.c = false;
        }
        dfqq dfqqVar = (dfqq) dfqlVar.b;
        str2.getClass();
        dfqqVar.a |= 32768;
        dfqqVar.m = str2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        crua cruaVar3 = (crua) bZ.b;
        dfqq dfqqVar2 = (dfqq) dfqlVar.bK();
        dfqqVar2.getClass();
        cruaVar3.j = dfqqVar2;
        cruaVar3.a |= 128;
        return intent.putExtra("geo.uploader.upload_state_key", bZ.bK().bS());
    }
}
