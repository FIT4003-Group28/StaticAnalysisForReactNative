package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aptc  reason: default package */
/* loaded from: classes2.dex */
final class aptc implements bbuk {
    final /* synthetic */ bbtj a;
    final /* synthetic */ String b;
    final /* synthetic */ aptd c;

    public aptc(aptd aptdVar, bbtj bbtjVar, String str) {
        this.c = aptdVar;
        this.a = bbtjVar;
        this.b = str;
    }

    @Override // defpackage.bbuk
    public final void a(String str, String str2) {
        dbod a = aptr.a(this.a, dbsg.i(str));
        aptd aptdVar = this.c;
        String str3 = this.b;
        dbsg i = dbsg.i(str2);
        dbsg<aptb> k = aptdVar.k();
        if (!k.a()) {
            return;
        }
        dbnm bZ = dbno.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dbno dbnoVar = (dbno) bZ.b;
        a.getClass();
        dbnoVar.b = a;
        int i2 = dbnoVar.a | 1;
        dbnoVar.a = i2;
        str3.getClass();
        dbnoVar.a = i2 | 2;
        dbnoVar.c = str3;
        dbno dbnoVar2 = (dbno) bZ.b;
        dbnoVar2.e = 1;
        int i3 = dbnoVar2.a | 8;
        dbnoVar2.a = i3;
        String str4 = (String) ((dbsu) i).a;
        str4.getClass();
        dbnoVar2.a = i3 | 4;
        dbnoVar2.d = str4;
        k.b().q(bZ.bK());
    }

    @Override // defpackage.bbuk
    public final void b(dbsg<cruf> dbsgVar, dbsg<cruc> dbsgVar2) {
        String string;
        View findViewById = this.c.a.findViewById(16908290);
        aptd aptdVar = this.c;
        if (dbsgVar2.a()) {
            string = aptdVar.a.getString(R.string.UPLOAD_FAILED_GENERIC_ERROR);
        } else {
            cruf crufVar = cruf.PRECHECK_STATUS_UNKNOWN;
            dboe dboeVar = dboe.POST_TOPIC_TYPE_UNSPECIFIED;
            if (dbsgVar.b().ordinal() == 2) {
                string = aptdVar.a.getString(R.string.UPLOAD_REJECTED_WRONG_TYPE_TOAST);
            } else {
                string = aptdVar.a.getString(R.string.UPLOAD_FAILED_GENERIC_ERROR);
            }
        }
        ckos.a(findViewById, string, 4000).c();
        dbsg<aptb> k = this.c.k();
        if (!k.a()) {
            return;
        }
        aptb b = k.b();
        dbnm bZ = dbno.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dbno dbnoVar = (dbno) bZ.b;
        dbnoVar.e = 2;
        dbnoVar.a |= 8;
        b.q(bZ.bK());
    }
}
