package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btgx  reason: default package */
/* loaded from: classes4.dex */
public class btgx implements btgu {
    @dzsi
    public aufs a;
    public final ausy b;
    private final auhi c;
    @dzsi
    private final aujb d;
    private final auom e;
    private final Activity f;
    @dzsi
    private final auin g;
    private boolean h;
    private final cjqy i;

    public btgx(auhi auhiVar, auin auinVar, auom auomVar, Activity activity, cjqy cjqyVar, ausy ausyVar) {
        this.h = false;
        this.c = auhiVar;
        this.g = auinVar;
        this.d = null;
        this.e = auomVar;
        this.f = activity;
        this.i = cjqyVar;
        this.a = null;
        this.b = ausyVar;
    }

    public btgx(auhi auhiVar, aujb aujbVar, auom auomVar, Activity activity, cjqy cjqyVar, ausy ausyVar) {
        this.h = false;
        this.c = auhiVar;
        this.d = aujbVar;
        this.g = null;
        this.e = auomVar;
        this.f = activity;
        this.i = cjqyVar;
        this.a = auhiVar.t(aujbVar.a);
        this.b = ausyVar;
    }

    private static Boolean j(aufs aufsVar) {
        return Boolean.valueOf(aufsVar == aufs.INBOX_ONLY);
    }

    @Override // defpackage.btgu
    public Integer a(aufs aufsVar) {
        aufs aufsVar2 = aufs.UNKNOWN_STATE;
        int ordinal = aufsVar.ordinal();
        return Integer.valueOf(ordinal != 1 ? ordinal != 2 ? R.string.NOTIFICATION_SETTING_OFF : R.string.NOTIFICATION_SETTING_INBOX_ONLY : R.string.NOTIFICATION_SETTING_ON);
    }

    @Override // defpackage.btgu
    public Boolean b(aufs aufsVar) {
        if (aufsVar != aufs.INBOX_ONLY) {
            return true;
        }
        if (!this.e.b) {
            return false;
        }
        aujb aujbVar = this.d;
        if (aujbVar != null) {
            return Boolean.valueOf(h(aujbVar));
        }
        auin auinVar = this.g;
        if (auinVar != null) {
            return Boolean.valueOf(dcft.j(this.c.c(auinVar).values(), new dbsl(this) { // from class: btgv
                private final btgx a;

                {
                    this.a = this;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.h((aujb) obj);
                }
            }));
        }
        return false;
    }

    @Override // defpackage.btgu
    public Boolean c(aufs aufsVar) {
        aufs aufsVar2 = this.a;
        boolean z = false;
        if (aufsVar2 != null && aufsVar2 == aufsVar) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.btgu
    public cqkl d() {
        this.h = !this.h;
        cqkx.p(this);
        View findViewById = this.f.findViewById(R.id.inbox_only_subtitle_id);
        if (findViewById != null) {
            cpv.a.f(findViewById, this.f.getString(R.string.NOTIFICATION_SETTING_INBOX_ONLY_DESCRIPTION));
        }
        return cqkl.a;
    }

    @Override // defpackage.btgu
    public cqkl e(aufs aufsVar) {
        aujb aujbVar = this.d;
        if (aujbVar != null && this.a != aufsVar) {
            this.c.e(aujbVar.a, aufsVar);
            i(aufsVar);
        }
        this.a = aufsVar;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.btgu
    public Boolean f(aufs aufsVar) {
        boolean z = false;
        if (j(aufsVar).booleanValue() && this.h) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.btgu
    public Boolean g(aufs aufsVar) {
        boolean z = false;
        if (j(aufsVar).booleanValue() && !this.h) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public boolean h(aujb aujbVar) {
        return dcft.j(this.c.f(aujbVar), new dbsl(this) { // from class: btgw
            private final btgx a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                btgx btgxVar = this.a;
                aujb aujbVar2 = (aujb) obj;
                if (aujbVar2 != null) {
                    return btgxVar.b.a(aujbVar2.a);
                }
                return false;
            }
        });
    }

    public void i(aufs aufsVar) {
        ddho ddhoVar;
        aujb aujbVar = this.d;
        cjta cjtaVar = null;
        if (aujbVar != null) {
            dpyv b = dpyv.b(aujbVar.a);
            if (b != null) {
                cjtaVar = cjtd.b();
                ddov bZ = ddow.c.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddow ddowVar = (ddow) bZ.b;
                ddowVar.b = Integer.valueOf(b.dm);
                ddowVar.a = 1;
                cjtaVar.m(bZ.bK());
            }
        } else {
            auin auinVar = this.g;
            if (auinVar != null) {
                aufo aufoVar = auinVar.l;
                cjtaVar = cjtd.b();
                ddov bZ2 = ddow.c.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddow ddowVar2 = (ddow) bZ2.b;
                ddowVar2.b = Integer.valueOf(aufoVar.p);
                ddowVar2.a = 2;
                cjtaVar.m(bZ2.bK());
            }
        }
        if (cjtaVar == null) {
            return;
        }
        aufs aufsVar2 = aufs.UNKNOWN_STATE;
        int ordinal = aufsVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                ddhoVar = dtxw.dS;
            } else if (ordinal != 3) {
                return;
            } else {
                ddhoVar = dtxw.dQ;
            }
            cjtaVar.d = ddhoVar;
        } else {
            cjtaVar.d = dtxw.dR;
        }
        cjqy cjqyVar = this.i;
        if (cjqyVar == null) {
            return;
        }
        cjqyVar.i(cjtaVar.a());
    }
}
