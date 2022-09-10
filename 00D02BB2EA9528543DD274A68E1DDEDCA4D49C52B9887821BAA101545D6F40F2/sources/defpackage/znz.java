package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: znz  reason: default package */
/* loaded from: classes7.dex */
public class znz implements zdv, wtm {
    public static final dcqe c = dcqe.c("znz");
    public final Activity d;
    public final zom e;
    public final vwn f;
    private final voh g;
    private final dqvj h;
    private final boolean i;

    public znz(Activity activity, zom zomVar, voh vohVar, dqvj dqvjVar, vwn vwnVar) {
        this.d = activity;
        this.i = g(activity);
        this.e = zomVar;
        this.g = vohVar;
        this.h = dqvjVar;
        this.f = vwnVar;
    }

    public static boolean g(Activity activity) {
        Resources resources = activity.getResources();
        if (resources.getConfiguration().orientation == 2) {
            return true;
        }
        int i = resources.getConfiguration().screenHeightDp;
        return i < 500 && i != 0;
    }

    @Override // defpackage.wtm
    public void Rh(wtl wtlVar) {
        View findViewById = this.d.findViewById(16908290);
        wtl wtlVar2 = wtl.LOADING_STARTED;
        int ordinal = wtlVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 5) {
                ckos.b(findViewById, R.string.DIRECTIONS_TAXI_ACCURATE_ESTIMATES_CONSENT_UPDATE_FAILED, -1).c();
            } else if (ordinal == 2) {
                ckos.b(findViewById, R.string.DIRECTIONS_TAXI_ACCURATE_ESTIMATES_CONSENTS_LOAD_FAILED, -1).c();
                cqkx.p(this);
            } else if (ordinal == 3) {
            } else {
                cqkx.p(this);
                this.g.a();
            }
        }
    }

    @Override // defpackage.zdv
    public zdy b() {
        return this.e;
    }

    @Override // defpackage.zdv
    public dqvj c() {
        return this.h;
    }

    @Override // defpackage.zdv
    @dzsi
    public zdz d() {
        if (this.i) {
            return null;
        }
        return this.e;
    }

    @Override // defpackage.zdv
    public Boolean e() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.zdv
    public int f(View view) {
        return view.getMeasuredHeight();
    }
}
