package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bcnv  reason: default package */
/* loaded from: classes3.dex */
public class bcnv implements bcme {
    public static final dcqe b = dcqe.c("bcnv");
    private static final View.OnClickListener t = new bcns();
    private final jic a;
    public final bwsh c;
    public final ckcw d;
    @dzsi
    public final bcle e;
    public final cjqy f;
    public final cjqq g;
    @dzsi
    public final ilo h;
    public final ckmm i;
    protected final Activity j;
    protected final dwfl k;
    protected final int l;
    protected final bckv m;
    protected final dwen n;
    protected Float o;
    private final ckql p;
    private final cjtd q;
    private final bclo r;
    private final ckqf s;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
        if (r11 != 10) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bcnv(defpackage.bcnu r8, defpackage.dwfl r9, int r10, @defpackage.dzsi defpackage.ilo r11, defpackage.dwen r12) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcnv.<init>(bcnu, dwfl, int, ilo, dwen):void");
    }

    @Override // defpackage.bcdh
    public void a(cqiv cqivVar) {
        if (this.m.c()) {
            cqivVar.a(new bchj(), this);
        } else {
            cqivVar.a(new bcda(), this);
        }
    }

    @Override // defpackage.bcdh
    public jic b() {
        return this.a;
    }

    @Override // defpackage.bcdh
    public Float c() {
        return this.o;
    }

    @Override // defpackage.bcdh
    public Boolean d() {
        return true;
    }

    @Override // defpackage.bcdh
    public View.OnClickListener e() {
        return t;
    }

    @Override // defpackage.bcdh
    public cjtd f() {
        return this.q;
    }

    @Override // defpackage.bcdh
    public CharSequence g() {
        Resources resources = this.j.getResources();
        if (i().booleanValue()) {
            return resources.getString(R.string.ACCESSIBILITY_PHOTO_GALLERY_TIMESTAMPED_THUMBNAIL, Integer.valueOf(this.l + 1), j());
        }
        return resources.getString(R.string.ACCESSIBILITY_PHOTO_GALLERY_NUMBERED_THUMBNAIL, Integer.valueOf(this.l + 1));
    }

    @Override // defpackage.bcdh
    public Boolean h() {
        return false;
    }

    @Override // defpackage.bcdh
    public Boolean i() {
        return Boolean.valueOf(this.n.a);
    }

    @Override // defpackage.bcdh
    public CharSequence j() {
        bclo bcloVar = this.r;
        dizh dizhVar = this.k.p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        diis diisVar = dizhVar.g;
        if (diisVar == null) {
            diisVar = diis.h;
        }
        dhpf dhpfVar = diisVar.f;
        if (dhpfVar == null) {
            dhpfVar = dhpf.i;
        }
        int i = dhpfVar.a;
        if ((i & 1) == 0 || (i & 2) == 0 || (i & 4) == 0) {
            return "";
        }
        eaol eaolVar = new eaol(dhpfVar.b, dhpfVar.c, dhpfVar.d, dhpfVar.e, dhpfVar.f, eaou.b);
        eaol a = eaol.a();
        eapz b2 = eapz.b(eaolVar, a);
        eapz eapzVar = eapz.a;
        if (eapzVar != null ? b2.p > eapzVar.p : b2.p > 0) {
            return bcloVar.a.getQuantityString(R.plurals.PHOTO_GALLERY_YEARS_AGO, b2.p, Integer.valueOf(b2.p));
        }
        eapk b3 = eapk.b(eaolVar, a);
        eapk eapkVar = eapk.a;
        if (eapkVar != null ? b3.p > eapkVar.p : b3.p > 0) {
            return bcloVar.a.getQuantityString(R.plurals.PHOTO_GALLERY_MONTHS_AGO, b3.p, Integer.valueOf(b3.p));
        }
        eaov b4 = eaov.b(eaolVar, a);
        eaov eaovVar = eaov.a;
        if (eaovVar != null ? b4.p > eaovVar.p : b4.p > 0) {
            return bcloVar.a.getQuantityString(R.plurals.PHOTO_GALLERY_DAYS_AGO, b4.p, Integer.valueOf(b4.p));
        }
        eapa b5 = eapa.b(eaolVar, a);
        eapa eapaVar = eapa.a;
        return (eapaVar != null ? b5.p <= eapaVar.p : b5.p <= 0) ? bcloVar.a.getString(R.string.PHOTO_GALLERY_JUST_NOW) : bcloVar.a.getQuantityString(R.plurals.PHOTO_GALLERY_HOURS_AGO, b5.p, Integer.valueOf(b5.p));
    }

    @Override // defpackage.bcdh
    public Boolean k() {
        return bcdg.a();
    }

    @Override // defpackage.bcdh
    public String l() {
        return null;
    }

    @Override // defpackage.bcme
    public Float t() {
        Float c = c();
        int round = Math.round((c.floatValue() - 1.0f) / 0.15f);
        int abs = Math.abs(c.hashCode() % 2);
        if (round < -2) {
            round = abs - 2;
        } else if (round > 2) {
            round = 2 - abs;
        }
        return Float.valueOf((round * 0.15f) + 1.0f);
    }
}
