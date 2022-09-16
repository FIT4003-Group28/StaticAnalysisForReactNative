package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zlc  reason: default package */
/* loaded from: classes7.dex */
public class zlc extends zmb {
    private final Context e;

    public zlc(btvo btvoVar, vtn vtnVar, cqat cqatVar, wgh wghVar, zgv zgvVar, zqg zqgVar, Context context, amve amveVar, int i, amvh amvhVar, zfo zfoVar, zfg zfgVar, boolean z, @dzsi vou vouVar, long j, @dzsi izl izlVar, @dzsi dosz doszVar, boolean z2, @dzsi amub amubVar, cqhn cqhnVar) {
        super(btvoVar, vtnVar, cqatVar, wghVar, zgvVar, zqgVar, context, amveVar, i, amvhVar, zfoVar, zfgVar, z, vouVar, j, izlVar, doszVar, z2, amubVar, cqhnVar);
        this.e = context;
    }

    @Override // defpackage.zqo
    public void OU(zfn zfnVar) {
        super.OU(zfnVar);
        ((zmb) this).b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.zmb
    public final void ac(bvsi bvsiVar) {
        super.ac(bvsiVar);
        zfn M = M();
        if (M != null) {
            int ordinal = M.ordinal();
            if (ordinal == 1) {
                bvsiVar.d(this.e.getString(R.string.ACCESSIBILITY_ACTIVATE_TO_OPEN_STEP_LIST));
            } else if (ordinal != 2 && ordinal != 3) {
            } else {
                bvsiVar.d(this.e.getString(R.string.ACCESSIBILITY_ACTIVATE_TO_CLOSE_STEP_LIST));
            }
        }
    }
}
