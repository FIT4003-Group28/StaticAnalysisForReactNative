package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: twi  reason: default package */
/* loaded from: classes7.dex */
public class twi implements twa {
    private final cqtd a;
    @dzsi
    private final String b;

    public twi(Activity activity, amve amveVar) {
        dqvj c = dqvj.c(amveVar.b().b);
        this.a = vyv.b(c == null ? dqvj.DRIVE : c);
        dqvj b = vyb.b(amveVar);
        String str = null;
        if (((b != null && (b == dqvj.WALK || b == dqvj.BICYCLE)) || amveVar.e() >= 2) && !amveVar.b().c.isEmpty()) {
            str = activity.getString(R.string.VIA_ROADS_CLAUSE, new Object[]{amveVar.b().c});
        }
        this.b = str;
    }

    @Override // defpackage.twa
    public cqtd a() {
        return this.a;
    }

    @Override // defpackage.twa
    @dzsi
    public String b() {
        return this.b;
    }
}
