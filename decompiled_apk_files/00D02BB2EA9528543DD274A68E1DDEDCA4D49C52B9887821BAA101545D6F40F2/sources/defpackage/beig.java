package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: beig  reason: default package */
/* loaded from: classes3.dex */
final class beig implements btzi<diet, diev> {
    final /* synthetic */ dbsg a;
    final /* synthetic */ beih b;
    final /* synthetic */ bmdn c;

    public beig(beih beihVar, dbsg dbsgVar, bmdn bmdnVar) {
        this.b = beihVar;
        this.a = dbsgVar;
        this.c = bmdnVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<diet> btzrVar, btzy btzyVar) {
        dcep<dfzy> dcepVar = beih.a;
        this.b.b.c();
        this.b.d(ddda.aH, this.a);
        this.c.b();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<diet> btzrVar, diev dievVar) {
        String str = dievVar.a;
        if (str.isEmpty()) {
            dcep<dfzy> dcepVar = beih.a;
            this.b.b.c();
            this.b.d(ddda.aH, this.a);
            this.c.b();
            return;
        }
        dcep<dfzy> dcepVar2 = beih.a;
        this.b.b.c();
        this.b.d(ddda.aJ, this.a);
        bmdn bmdnVar = this.c;
        String valueOf = String.valueOf(str);
        bmdnVar.a(Uri.parse(valueOf.length() != 0 ? "tel: ".concat(valueOf) : new String("tel: ")));
    }
}
