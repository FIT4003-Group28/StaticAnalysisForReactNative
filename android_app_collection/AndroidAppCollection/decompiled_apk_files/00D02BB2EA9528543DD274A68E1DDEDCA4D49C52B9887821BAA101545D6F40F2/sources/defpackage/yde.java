package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: yde  reason: default package */
/* loaded from: classes7.dex */
public final class yde implements ycx {
    private final dpdy a;
    private final vxv b;
    private final xkl c;
    private final vxw d;
    @dzsi
    private final wpv e;
    @dzsi
    private CharSequence f;
    private dpbw g = dpbw.UNKNOWN;

    public yde(vxv vxvVar, vxw vxwVar, dpdy dpdyVar, xkl xklVar, @dzsi wpv wpvVar) {
        this.a = dpdyVar;
        this.b = vxvVar;
        this.d = vxwVar;
        this.c = xklVar;
        this.e = wpvVar;
    }

    @Override // defpackage.ycx
    @dzsi
    public final CharSequence a() {
        return this.f;
    }

    @Override // defpackage.ycx
    public final dpbw b() {
        return this.g;
    }

    @Override // defpackage.ycx
    public final void c(Context context) {
        vxu a = this.b.a(this.a, this.c.a(), true);
        bvsx bvsxVar = new bvsx(context.getResources());
        CharSequence charSequence = null;
        if (this.e.ab() != null) {
            vws vwsVar = (vws) a;
            if (vwsVar.b.isEmpty()) {
                dgas dgasVar = vwsVar.e;
                if (dgasVar != null && (dgasVar.a & 2) != 0) {
                    charSequence = context.getString(R.string.TRANSIT_ALSO_EVERY, dgasVar.c);
                }
                this.f = charSequence;
                this.g = ((vws) a).c;
            }
        }
        bvsv a2 = this.d.a(((vws) a).b, context);
        if (a2 != null) {
            bvsu c = bvsxVar.c(R.string.TRANSIT_ADDITIONAL_UPCOMING_DEPARTURES);
            c.a(a2);
            charSequence = c.c();
        }
        this.f = charSequence;
        this.g = ((vws) a).c;
    }
}
