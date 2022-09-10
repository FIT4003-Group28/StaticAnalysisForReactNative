package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxpx  reason: default package */
/* loaded from: classes4.dex */
class bxpx implements bxoc {
    final /* synthetic */ bxpz a;

    public bxpx(bxpz bxpzVar) {
        this.a = bxpzVar;
    }

    @Override // defpackage.bxoc
    public CharSequence a() {
        bvsv a = new bvsx(this.a.a.getResources()).a(this.a.a.getResources().getString(R.string.POOR_CONNECTION));
        a.g(" · ");
        a.g(this.a.a.getResources().getString(R.string.SHOWING_LIMITED_RESULTS));
        return a.c();
    }

    @Override // defpackage.bxoc
    public ColorFilter b() {
        dksg dksgVar = dksg.UNKNOWN_SUGGEST_SPINNER_VARIANT;
        int ordinal = this.a.r().ordinal();
        if (ordinal == 2 || ordinal == 4) {
            return new PorterDuffColorFilter(ibl.q().b(this.a.a), PorterDuff.Mode.SRC_IN);
        }
        return new PorterDuffColorFilter(ibl.H().b(this.a.a), PorterDuff.Mode.SRC_IN);
    }

    @Override // defpackage.bxoc
    public Boolean c() {
        dksg dksgVar = dksg.UNKNOWN_SUGGEST_SPINNER_VARIANT;
        int ordinal = this.a.r().ordinal();
        if (ordinal == 3 || ordinal == 4) {
            return true;
        }
        return false;
    }
}
