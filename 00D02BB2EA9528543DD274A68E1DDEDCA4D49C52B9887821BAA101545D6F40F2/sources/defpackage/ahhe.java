package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ahhe  reason: default package */
/* loaded from: classes2.dex */
public abstract class ahhe implements agxd {
    private static final dcqe a = dcqe.c("ahhe");
    private final Activity b;
    @dzsi
    private final dlam c;
    private final ahhv d;

    /* JADX INFO: Access modifiers changed from: protected */
    public ahhe(Activity activity, @dzsi dlam dlamVar, ahhv ahhvVar) {
        this.b = activity;
        this.c = dlamVar;
        this.d = ahhvVar;
    }

    @Override // defpackage.agxd
    public Boolean b() {
        return false;
    }

    @Override // defpackage.agxd
    public cqkl c() {
        return cqkl.a;
    }

    @Override // defpackage.agxd
    public cjtd d() {
        if (b().booleanValue()) {
            bvoo.h("Clickable element must have UE3 params.", new Object[0]);
        }
        return cjtd.b;
    }

    @Override // defpackage.agxd
    @dzsi
    public final CharSequence j() {
        dlam dlamVar = this.c;
        if (dlamVar == null) {
            return null;
        }
        if (dlamVar.a != 6) {
            int size = dlamVar.c.size();
            if (size <= 0) {
                return null;
            }
            if (size == 1) {
                return this.c.c.get(0).a;
            }
            return this.b.getResources().getQuantityString(R.plurals.LOCALSTREAM_TAGLINE_AREA_COUNT, size, Integer.valueOf(size));
        }
        return ((dlaj) dlamVar.b).a;
    }

    @Override // defpackage.agxd
    @dzsi
    public final cqtd k() {
        dlam dlamVar = this.c;
        if (dlamVar == null || dlamVar.a != 4) {
            return null;
        }
        return iup.e(R.raw.localstream_travel_icon_svg);
    }

    @Override // defpackage.agxd
    public Boolean l() {
        return this.d.u();
    }

    @Override // defpackage.agxd
    public final View.OnClickListener m() {
        return this.d.v();
    }

    @Override // defpackage.agxd
    public String n() {
        return this.b.getString(R.string.LOCALSTREAM_ACCESSIBILITY_SHARE_CARD, new Object[]{a()});
    }

    @Override // defpackage.agxd
    public Boolean o() {
        throw null;
    }

    @Override // defpackage.agxd
    public final View.OnClickListener p() {
        return this.d.w();
    }

    @Override // defpackage.agxd
    public String q() {
        dlam dlamVar = this.c;
        if (dlamVar == null || dlamVar.c.size() <= 0) {
            return this.b.getString(R.string.LOCALSTREAM_ACCESSIBILITY_OPEN_MAP_IN_CARD, new Object[]{a()});
        }
        int size = this.c.c.size();
        if (size == 1) {
            return this.b.getString(R.string.LOCALSTREAM_ACCESSIBILITY_OPEN_MAP_WITH_TITLE_AND_AREA_NAME, new Object[]{a(), this.c.c.get(0).a});
        }
        return this.b.getResources().getQuantityString(R.plurals.LOCALSTREAM_ACCESSIBILITY_OPEN_MAP_WITH_TITLE_AND_AREA_COUNT, size, a(), Integer.valueOf(size));
    }

    @Override // defpackage.agxd
    public final Boolean r() {
        return this.d.x();
    }

    @Override // defpackage.agxd
    public final cqkl s(View view) {
        return this.d.f(view);
    }

    @Override // defpackage.agxd
    public String t() {
        dlam dlamVar = this.c;
        if (dlamVar == null || dlamVar.c.size() <= 0) {
            return this.b.getString(R.string.LOCALSTREAM_ACCESSIBILITY_OVERFLOW_MENU_IN_CARD, new Object[]{a()});
        }
        int size = this.c.c.size();
        if (size == 1) {
            return this.b.getString(R.string.LOCALSTREAM_ACCESSIBILITY_OVERFLOW_MENU_WITH_TITLE_AND_AREA_NAME, new Object[]{a(), this.c.c.get(0).a});
        }
        return this.b.getResources().getQuantityString(R.plurals.LOCALSTREAM_ACCESSIBILITY_OVERFLOW_MENU_WITH_TITLE_AND_AREA_COUNT, size, a(), Integer.valueOf(size));
    }

    @Override // defpackage.agxd
    @dzsi
    public jic u() {
        return null;
    }

    @Override // defpackage.agxd
    @dzsi
    public CharSequence v() {
        return null;
    }

    @Override // defpackage.agxd
    public final cjtd w(ddho ddhoVar) {
        return this.d.b(ddhoVar);
    }

    @Override // defpackage.agxd
    @dzsi
    public View.OnAttachStateChangeListener x() {
        return null;
    }

    @Override // defpackage.agxd
    public final cqss i() {
        drco drcoVar;
        dlaf dlafVar;
        dlam dlamVar = this.c;
        if (dlamVar == null || dlamVar.a != 3) {
            if (dlamVar != null && dlamVar.a == 2) {
                if (((dlaf) dlamVar.b).a.size() > 0) {
                    dlam dlamVar2 = this.c;
                    if (dlamVar2.a == 2) {
                        dlafVar = (dlaf) dlamVar2.b;
                    } else {
                        dlafVar = dlaf.b;
                    }
                    drcoVar = dlafVar.a.get(0).a;
                    if (drcoVar == null) {
                        drcoVar = drco.d;
                    }
                } else {
                    drcoVar = drco.d;
                }
                drcq drcqVar = drcq.UNKNOWN_PLACE_LIST_TYPE;
                drcq b = drcq.b(drcoVar.b);
                if (b == null) {
                    b = drcq.UNKNOWN_PLACE_LIST_TYPE;
                }
                int ordinal = b.ordinal();
                if (ordinal == 1) {
                    return ibm.T();
                }
                if (ordinal == 2) {
                    return ibm.L();
                }
                if (ordinal == 3) {
                    return iva.b(ibl.ar(), cqrt.c(R.color.mod_google_cyan200));
                }
                if (ordinal == 4) {
                    return ibm.G();
                }
            } else if (dlamVar != null && dlamVar.a == 4) {
                return ibm.U();
            }
            return ibm.p();
        }
        return ibm.w();
    }
}
