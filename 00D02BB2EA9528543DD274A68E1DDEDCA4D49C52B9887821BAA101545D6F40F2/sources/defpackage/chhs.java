package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: chhs  reason: default package */
/* loaded from: classes4.dex */
public final class chhs {
    public final dhpj a;
    public final Application b;
    public final djev c;
    public final dxio<apni> d;

    public chhs(dhpj dhpjVar, Application application, dxio<apni> dxioVar) {
        this.a = dhpjVar;
        this.b = application;
        this.d = dxioVar;
        djeq bZ = djev.h.bZ();
        String string = application.getString(R.string.DONE);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djev djevVar = (djev) bZ.b;
        string.getClass();
        djevVar.a |= 1;
        djevVar.b = string;
        djes djesVar = djes.BLUE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djev djevVar2 = (djev) bZ.b;
        djevVar2.g = djesVar.f;
        djevVar2.a |= 32;
        djes djesVar2 = djes.WHITE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djev djevVar3 = (djev) bZ.b;
        djevVar3.f = djesVar2.f;
        djevVar3.a |= 16;
        djdo bZ2 = djep.c.bZ();
        djdt bZ3 = djdu.a.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djep djepVar = (djep) bZ2.b;
        djdu bK = bZ3.bK();
        bK.getClass();
        djepVar.b = bK;
        djepVar.a = 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djev djevVar4 = (djev) bZ.b;
        djep bK2 = bZ2.bK();
        bK2.getClass();
        djevVar4.c = bK2;
        djevVar4.a |= 2;
        this.c = bZ.bK();
    }

    public final djgl a() {
        return b(true);
    }

    public final djgl b(boolean z) {
        djdo bZ;
        djgk bZ2 = djgl.g.bZ();
        djfu bZ3 = djfx.e.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        djfx djfxVar = (djfx) bZ3.b;
        djfxVar.b = 1;
        djfxVar.a |= 1;
        djva bZ4 = djvd.d.bZ();
        djvc djvcVar = djvc.MAJOR_TYPE;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        djvd djvdVar = (djvd) bZ4.b;
        djvdVar.b = djvcVar.d;
        djvdVar.a |= 1;
        String string = this.b.getString(true != z ? R.string.SUBMIT_RATING_THANKS : R.string.SUBMIT_REVIEW_THANKS);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        djvd djvdVar2 = (djvd) bZ4.b;
        string.getClass();
        djvdVar2.a |= 2;
        djvdVar2.c = string;
        bZ3.c(bZ4);
        djva bZ5 = djvd.d.bZ();
        djvc djvcVar2 = djvc.MINOR_TYPE;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        djvd djvdVar3 = (djvd) bZ5.b;
        djvdVar3.b = djvcVar2.d;
        djvdVar3.a |= 1;
        String string2 = this.b.getString(R.string.SUBMIT_REVIEW_YOUR_CONTRIBUTION);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        djvd djvdVar4 = (djvd) bZ5.b;
        string2.getClass();
        djvdVar4.a |= 2;
        djvdVar4.c = string2;
        bZ3.c(bZ5);
        djeq bZ6 = djev.h.bZ();
        String string3 = this.b.getString(R.string.SUBMIT_REVIEW_MORE);
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        djev djevVar = (djev) bZ6.b;
        string3.getClass();
        djevVar.a |= 1;
        djevVar.b = string3;
        if (dhpj.TODO_LIST.equals(this.a)) {
            bZ = djep.c.bZ();
            djdt bZ7 = djdu.a.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djep djepVar = (djep) bZ.b;
            djdu bK = bZ7.bK();
            bK.getClass();
            djepVar.b = bK;
            djepVar.a = 1;
        } else {
            bZ = djep.c.bZ();
            djdz bZ8 = djea.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djep djepVar2 = (djep) bZ.b;
            djea bK2 = bZ8.bK();
            bK2.getClass();
            djepVar2.b = bK2;
            djepVar2.a = 4;
        }
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        djev djevVar2 = (djev) bZ6.b;
        djep bK3 = bZ.bK();
        bK3.getClass();
        djevVar2.c = bK3;
        djevVar2.a |= 2;
        bZ3.a(bZ6);
        bZ3.b(this.c);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djgl djglVar = (djgl) bZ2.b;
        djfx bK4 = bZ3.bK();
        bK4.getClass();
        djglVar.c = bK4;
        djglVar.b = 1;
        return bZ2.bK();
    }

    public final djgl c() {
        djgk bZ = djgl.g.bZ();
        djht bZ2 = djhu.f.bZ();
        djdb bZ3 = djdm.c.bZ();
        djde bZ4 = djdf.e.bZ();
        String string = this.b.getString(R.string.THANK_YOU_FOR_IMPROVING_GOOGLE_MAPS);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        djdf djdfVar = (djdf) bZ4.b;
        string.getClass();
        djdfVar.a |= 1;
        djdfVar.b = string;
        String string2 = this.b.getString(R.string.THANK_YOU_SUBTITLE);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        djdf djdfVar2 = (djdf) bZ4.b;
        string2.getClass();
        djdfVar2.a |= 2;
        djdfVar2.c = string2;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        djdm djdmVar = (djdm) bZ3.b;
        djdf bK = bZ4.bK();
        bK.getClass();
        djdmVar.b = bK;
        djdmVar.a = 2;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djhu djhuVar = (djhu) bZ2.b;
        djdm bK2 = bZ3.bK();
        bK2.getClass();
        djhuVar.b = bK2;
        djhuVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djgl djglVar = (djgl) bZ.b;
        djhu bK3 = bZ2.bK();
        bK3.getClass();
        djglVar.c = bK3;
        djglVar.b = 7;
        return bZ.bK();
    }

    public final djgl d() {
        djgk bZ = djgl.g.bZ();
        djfu bZ2 = djfx.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djfx djfxVar = (djfx) bZ2.b;
        djfxVar.b = 0;
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
        String string = this.b.getString(R.string.PLACE_QA_ANSWER_THANK_YOU_TITLE);
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
        String string2 = this.b.getString(R.string.PLACE_QA_ANSWER_THANK_YOU_SUBTITLE);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        djvd djvdVar4 = (djvd) bZ4.b;
        string2.getClass();
        djvdVar4.a |= 2;
        djvdVar4.c = string2;
        bZ2.c(bZ4);
        djeq bZ5 = djev.h.bZ();
        String string3 = this.b.getString(R.string.UGC_PHOTO_UPLOAD_CONTRIBUTE_MORE);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        djev djevVar = (djev) bZ5.b;
        string3.getClass();
        djevVar.a |= 1;
        djevVar.b = string3;
        djdo bZ6 = djep.c.bZ();
        djdz bZ7 = djea.c.bZ();
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        djep djepVar = (djep) bZ6.b;
        djea bK = bZ7.bK();
        bK.getClass();
        djepVar.b = bK;
        djepVar.a = 4;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        djev djevVar2 = (djev) bZ5.b;
        djep bK2 = bZ6.bK();
        bK2.getClass();
        djevVar2.c = bK2;
        djevVar2.a |= 2;
        bZ2.a(bZ5);
        bZ2.b(this.c);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djgl djglVar = (djgl) bZ.b;
        djfx bK3 = bZ2.bK();
        bK3.getClass();
        djglVar.c = bK3;
        djglVar.b = 1;
        return bZ.bK();
    }
}
