package defpackage;

import android.app.Service;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: byzq  reason: default package */
/* loaded from: classes4.dex */
public abstract class byzq implements byzz {
    protected final vyl b;
    protected final Service c;
    protected final btvo d;

    public byzq(vyl vylVar, Service service, btvo btvoVar) {
        this.b = vylVar;
        this.c = service;
        this.d = btvoVar;
    }

    protected Intent c(bzdg bzdgVar, byzg byzgVar, boolean z) {
        Service service = this.c;
        return new Intent(bzcg.a, new Uri.Builder().appendQueryParameter("transitStageNumber", Integer.toString(bzdgVar.L())).appendQueryParameter("transitGuidanceType", byzgVar.name()).build(), service, service.getClass());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CharSequence d(bzdk bzdkVar) {
        return e().getString(R.string.TRANSIT_GUIDANCE_NOTIFICATION_ARRIVE_TIME, bvtb.i(this.c, TimeUnit.MILLISECONDS.toSeconds(bzdkVar.d().a)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Resources e() {
        return this.c.getResources();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String f(int i, Object... objArr) {
        return e().getString(i, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Drawable g(int i) {
        Drawable drawable = e().getDrawable(i, null);
        dbsk.s(drawable);
        return drawable;
    }

    protected boolean h() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byzy i(bzdk bzdkVar, byzg byzgVar, vyk vykVar, vyk vykVar2, dbty<Drawable> dbtyVar, int i) {
        return k(bzdkVar, bzdkVar.g().b(), byzgVar, vykVar, vykVar2, dbtyVar, i, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final byzy j(bzdk bzdkVar, bzdg bzdgVar, byzg byzgVar, vyk vykVar, vyk vykVar2, dbty<Drawable> dbtyVar, int i) {
        return k(bzdkVar, bzdgVar, byzgVar, vykVar, vykVar2, dbtyVar, i, false);
    }

    protected final byzy k(bzdk bzdkVar, bzdg bzdgVar, byzg byzgVar, vyk vykVar, vyk vykVar2, dbty<Drawable> dbtyVar, int i, boolean z) {
        dgsn dgsnVar = dgsn.VEHICLE_TYPE_ANY;
        if (bzdgVar.c() == dqvj.TRANSIT) {
            dgsnVar = dgsn.b(bzdgVar.d().h);
        }
        dgsn dgsnVar2 = dgsnVar;
        boolean z2 = byzgVar != byzg.ERROR && (byzgVar != byzg.ARRIVE || !z);
        Intent intent = null;
        Intent g = (!z2 || bzdgVar.D()) ? null : bzaj.g(this.c, bzdgVar.L(), byzgVar, 1);
        if (z2 && (!bzdgVar.E() || byzgVar == byzg.RIDE)) {
            intent = bzaj.g(this.c, bzdgVar.L(), byzgVar, 2);
        }
        boolean z3 = bzdkVar.h() == bzdj.STARTED && !bzdkVar.g().p();
        CharSequence d = d(bzdkVar);
        Intent c = c(bzdgVar, byzgVar, z);
        boolean p = bzdkVar.p();
        int M = bzdgVar.M();
        int N = bzdgVar.N();
        int t = bzdkVar.t();
        dbty<Intent> r = byzy.r(c);
        dbsk.s(r);
        return new byzp(d, vykVar, vykVar2, dbtyVar, i, byzgVar, dgsnVar2, r, byzy.r(g), byzy.r(intent), h(), z, z3, p, M, N, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int l(int i) {
        return e().getDimensionPixelSize(i);
    }
}
