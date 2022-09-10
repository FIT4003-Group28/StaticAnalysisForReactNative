package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: mpn  reason: default package */
/* loaded from: classes7.dex */
public final class mpn implements mpf {
    private final alp a = alp.a();
    private final ksh b;
    private final cjtd c;
    private boolean d;
    @dzsi
    private ilo e;

    public mpn(ksh kshVar, ldm ldmVar, cjtd cjtdVar) {
        this.b = kshVar;
        dbsk.s(cjtdVar);
        this.c = cjtdVar;
        e(ldmVar);
    }

    @Override // defpackage.mow
    public cqkl a() {
        ilo iloVar;
        if (this.d && (iloVar = this.e) != null) {
            ksh kshVar = this.b;
            String L = iloVar.L();
            kshVar.a.u(cjtx.c(2, iloVar, false));
            String valueOf = String.valueOf(L);
            Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(valueOf.length() != 0 ? "tel: ".concat(valueOf) : new String("tel: ")));
            intent.addCategory("com.google.android.gms.car.category.CATEGORY_PROJECTION");
            intent.setComponent(new ComponentName("com.google.android.projection.gearhead", "com.google.android.projection.gearhead.telecom.TelecomService"));
            kshVar.c.a.n(intent);
        }
        return cqkl.a;
    }

    @Override // defpackage.mow
    public cjtd b() {
        return this.c;
    }

    @Override // defpackage.mow
    public String c() {
        String K;
        ilo iloVar = this.e;
        return (iloVar == null || (K = iloVar.K()) == null) ? "" : this.a.b(K);
    }

    @Override // defpackage.mow
    public Boolean d() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.mpf
    public void e(ldm ldmVar) {
        dbsk.s(ldmVar);
        boolean z = false;
        this.d = false;
        ilo iloVar = ldmVar.d;
        this.e = iloVar;
        if (iloVar == null) {
            return;
        }
        ilo iloVar2 = ldmVar.d;
        if (iloVar2 == null || (iloVar2.be() != iln.GEOCODE && akqi.d(iloVar2.ai()))) {
            if (this.b.b && !dbsj.d(iloVar.L())) {
                z = true;
            }
            this.d = z;
            return;
        }
        this.d = false;
    }

    public int hashCode() {
        return Objects.hashCode("PlaceDetailsCallButtonViewModelImpl");
    }
}
