package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aajj  reason: default package */
/* loaded from: classes2.dex */
final class aajj implements btzi<dhlp, dhlr> {
    final /* synthetic */ boolean a;
    final /* synthetic */ aajk b;

    public aajj(aajk aajkVar, boolean z) {
        this.b = aajkVar;
        this.a = z;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dhlp> btzrVar, btzy btzyVar) {
        if (this.b.a.z(bdgy.class) != null) {
            this.b.a.g().f();
        }
        this.b.b();
        gcz a = this.b.d.a();
        a.j();
        a.d(R.string.SUGGEST_PHOTO_FAILURE_DIALOG_BODY);
        a.h(R.string.SUGGEST_PHOTO_FAILURE_DIALOG_OK_BUTTON, cjtd.a(dtxy.fc), aaji.a);
        a.i = cjtd.a(dtxy.fb);
        a.b();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dhlp> btzrVar, dhlr dhlrVar) {
        if (this.b.a.z(bdgy.class) != null) {
            this.b.a.g().f();
        }
        this.b.b();
        if (this.a) {
            aajk aajkVar = this.b;
            chhr chhrVar = aajkVar.b;
            chhs chhsVar = aajkVar.c;
            djgk bZ = djgl.g.bZ();
            djfu bZ2 = djfx.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            djfx djfxVar = (djfx) bZ2.b;
            djfxVar.b = 2;
            djfxVar.a |= 1;
            djva bZ3 = djvd.d.bZ();
            djvc djvcVar = djvc.MAJOR_TYPE;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            djvd djvdVar = (djvd) bZ3.b;
            djvdVar.b = djvcVar.d;
            djvdVar.a |= 1;
            String string = chhsVar.b.getString(R.string.ASSOCIATE_PHOTO_THANKS);
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            djvd djvdVar2 = (djvd) bZ3.b;
            string.getClass();
            djvdVar2.a |= 2;
            djvdVar2.c = string;
            bZ2.c(bZ3);
            djva bZ4 = djvd.d.bZ();
            djvc djvcVar2 = djvc.MINOR_TYPE;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            djvd djvdVar3 = (djvd) bZ4.b;
            djvdVar3.b = djvcVar2.d;
            djvdVar3.a |= 1;
            String string2 = chhsVar.b.getString(R.string.ASSOCIATE_PHOTO_THANKS_YOUR_CONTRIBUTION_SHORT);
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            djvd djvdVar4 = (djvd) bZ4.b;
            string2.getClass();
            djvdVar4.a = 2 | djvdVar4.a;
            djvdVar4.c = string2;
            bZ2.c(bZ4);
            bZ2.b(chhsVar.c);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djgl djglVar = (djgl) bZ.b;
            djfx bK = bZ2.bK();
            bK.getClass();
            djglVar.c = bK;
            djglVar.b = 1;
            chhrVar.a(bZ.bK(), dtyc.R, dtyc.g);
        }
    }
}
