package defpackage;

import android.app.Activity;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jed  reason: default package */
/* loaded from: classes3.dex */
public final class jed implements ahcx, ynl {
    public final Activity a;
    public final jdy b;
    public final acti c;
    public final jpu d;
    public final azqb e;
    public attp f;
    public apoj g;
    public String h = null;
    public final fbj i;
    private final jeb j;

    public jed(Activity activity, jdy jdyVar, acti actiVar, jpu jpuVar, azqb azqbVar, fbj fbjVar, jeb jebVar) {
        this.a = activity;
        this.b = jdyVar;
        this.c = actiVar;
        this.d = jpuVar;
        this.j = jebVar;
        this.e = azqbVar;
        this.i = fbjVar;
    }

    @Override // defpackage.ahcx
    public final void a(String str, int i) {
        if (!str.equals(this.h) || i != 0) {
            return;
        }
        jla jlaVar = ((mqj) this.j).j;
        jlaVar.a();
        jlaVar.b.h();
        OfflineArrowView offlineArrowView = jlaVar.b;
        offlineArrowView.j();
        zag.o(offlineArrowView.e, false);
        zag.o(offlineArrowView.g, true);
        jlaVar.b.setEnabled(false);
        jlaVar.b.setContentDescription(jlaVar.a.getString(R.string.accessibility_offline_button_cancel));
    }

    public final void b(agqv agqvVar) {
        attp attpVar = this.f;
        if (attpVar != null) {
            this.j.a(agqvVar, attpVar);
        } else {
            this.j.oO(agqvVar);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{jiy.class, jiz.class, agnt.class, agnx.class, agnz.class, agoa.class, agog.class};
            case 0:
                if (!((jiy) obj).a.equals(this.h)) {
                    return null;
                }
                b(null);
                return null;
            case 1:
                String str = ((jiz) obj).a;
                if (!str.equals(this.h)) {
                    return null;
                }
                b(((agrf) this.e.get()).a().m().e(str));
                return null;
            case 2:
                agqv agqvVar = ((agnt) obj).a;
                if (!agqvVar.m().equals(this.h)) {
                    return null;
                }
                b(agqvVar);
                return null;
            case 3:
                agnx agnxVar = (agnx) obj;
                if (!agnxVar.a.equals(this.h)) {
                    return null;
                }
                b(null);
                if (agnxVar.b == 0) {
                    zag.q(this.a, R.string.offline_error_no_external_storage, 1);
                    return null;
                }
                zag.q(this.a, R.string.add_video_to_offline_error, 1);
                return null;
            case 4:
                agqv agqvVar2 = ((agnz) obj).a;
                String m = agqvVar2.m();
                if (!m.equals(this.h)) {
                    return null;
                }
                this.i.a().E(new fcr(m, 3)).S(new jdz(this, agqvVar2, 1));
                return null;
            case 5:
                if (!((agoa) obj).a.equals(this.h)) {
                    return null;
                }
                b(null);
                return null;
            case 6:
                agqv agqvVar3 = ((agog) obj).a;
                String m2 = agqvVar3.m();
                if (!m2.equals(this.h)) {
                    return null;
                }
                this.i.a().E(new fcr(m2, 4)).S(new jdz(this, agqvVar3));
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
