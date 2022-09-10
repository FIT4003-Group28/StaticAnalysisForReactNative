package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aizc  reason: default package */
/* loaded from: classes2.dex */
public final class aizc {
    public final dnom a;
    public final PersonId b;
    public dbsg<aink> c;
    public long d;
    public boolean e;
    final /* synthetic */ aizd f;

    public aizc(aizd aizdVar, PersonId personId, dbsg<aink> dbsgVar, int i, long j) {
        dbsg<eaow> dbsgVar2;
        this.f = aizdVar;
        this.b = personId;
        this.c = dbsgVar;
        this.d = j;
        dnom bZ = dnop.j.bZ();
        this.a = bZ;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnop dnopVar = (dnop) bZ.b;
        dnopVar.c = i - 1;
        dnopVar.a |= 2;
        int a = decl.a(TimeUnit.MILLISECONDS.toSeconds(aizdVar.b.e()));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnop dnopVar2 = (dnop) bZ.b;
        dnopVar2.a |= 4;
        dnopVar2.d = a;
        if (this.c.a() && this.c.b().o().a()) {
            String b = this.c.b().o().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnop dnopVar3 = (dnop) bZ.b;
            b.getClass();
            dnopVar3.a |= 1;
            dnopVar3.b = b;
        }
        if (this.c.a()) {
            dbsgVar2 = this.c.b().p(eapd.a());
        } else {
            dbsgVar2 = dbpy.a;
        }
        if (dbsgVar2.a()) {
            int a2 = decl.a(dbsgVar2.b().g());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnop dnopVar4 = (dnop) bZ.b;
            dnopVar4.a |= 8;
            dnopVar4.e = a2;
        }
        this.e = false;
    }
}
