package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: biye  reason: default package */
/* loaded from: classes3.dex */
public class biye implements biwk {
    private final gga b;
    private final Resources c;
    private final ClipboardManager d;
    private final bvsx e;
    private final bego f;
    @dzsi
    private bwrs<ilo> g;
    private boolean h;
    private final List<iln> i;

    public biye(gga ggaVar, cqhn cqhnVar, cqhu cqhuVar, bego begoVar, dcdc<iln> dcdcVar) {
        this.b = ggaVar;
        this.d = (ClipboardManager) ggaVar.getSystemService("clipboard");
        Resources resources = ggaVar.getResources();
        this.c = resources;
        this.e = new bvsx(resources);
        this.f = begoVar;
        this.i = dcdcVar;
    }

    @dzsi
    private final String j() {
        akqq aj;
        bwrs<ilo> bwrsVar = this.g;
        ilo c = bwrsVar != null ? bwrsVar.c() : null;
        if (c == null) {
            return null;
        }
        if ((c.h().a & 16384) != 0) {
            dvyn dvynVar = c.h().t;
            if (dvynVar == null) {
                dvynVar = dvyn.d;
            }
            return dvynVar.a;
        } else if (this.h && (aj = c.aj()) != null) {
            return bij.a(aj.a, aj.b);
        } else {
            return null;
        }
    }

    @Override // defpackage.biwk
    public cqkl a() {
        View a;
        View o = cqkx.o(this);
        if (o != null && (a = cqhu.a(o, a)) != null) {
            int[] iArr = new int[2];
            a.getLocationOnScreen(iArr);
            int width = iArr[0] + (a.getWidth() / 2);
            int height = iArr[1] + (a.getHeight() / 2);
            String j = j();
            if (j != null) {
                cjwv cjwvVar = (cjwv) cjxj.a(j);
                if (!cjwvVar.a.isEmpty()) {
                    this.b.D(bilo.g(cjwvVar.a, cjwvVar.b.isEmpty() ? null : cjwvVar.b, new Point(width, height)));
                }
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.biwk
    public CharSequence b() {
        return this.b.getString(R.string.OPEN_LOCATION_CODE_TOOLTIP_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.biwk
    public boolean c(biwj biwjVar) {
        if (!this.f.g() || w().booleanValue()) {
            bwrs<ilo> bwrsVar = this.g;
            ilo c = bwrsVar != null ? bwrsVar.c() : null;
            biwj biwjVar2 = biwj.BELOW_ADDRESS;
            if (c != null) {
                dvyn dvynVar = c.h().t;
                if (dvynVar == null) {
                    dvynVar = dvyn.d;
                }
                int a = dqda.a(dvynVar.c);
                if (a == 0) {
                    a = 1;
                }
                if (a == 2) {
                    biwjVar2 = biwj.ABOVE_ADDRESS;
                }
                if (a == 4) {
                    biwjVar2 = biwj.BOTTOM;
                }
            }
            return biwjVar == biwjVar2;
        }
        return false;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return cqrt.g(2131232074, ibm.x());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        String j = j();
        if (j != null) {
            this.d.setPrimaryClip(ClipData.newPlainText(this.c.getString(R.string.COPIED_OPEN_LOCATION_CODE_LABEL), j));
            Toast.makeText(this.b, this.c.getString(R.string.COPIED_OPEN_LOCATION_CODE_TOAST), 1).show();
        }
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return cjtd.a(dtxy.kq);
    }

    public void i(boolean z) {
        this.h = true;
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        return null;
    }

    @Override // defpackage.jbi
    @dzsi
    public CharSequence m() {
        int i;
        String j = j();
        bwrs<ilo> bwrsVar = this.g;
        ilo c = bwrsVar != null ? bwrsVar.c() : null;
        if (c == null) {
            return null;
        }
        if ((c.h().a & 16384) != 0) {
            dvyn dvynVar = c.h().t;
            if (dvynVar == null) {
                dvynVar = dvyn.d;
            }
            i = dvynVar.b;
        } else {
            i = 4;
        }
        if (j == null || j.indexOf(43) != 8 || i >= j.length()) {
            return j;
        }
        bvsv a = this.e.a(j.substring(0, i));
        a.m(R.color.quantum_black_secondary_text);
        a.g("\u200a");
        a.g(j.substring(i));
        return a.c();
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.g = bwrsVar;
    }

    @Override // defpackage.bega
    public void u() {
        this.g = null;
    }

    @Override // defpackage.bega
    public Boolean w() {
        bwrs<ilo> bwrsVar = this.g;
        if (bwrsVar == null) {
            return Boolean.FALSE;
        }
        ilo c = bwrsVar.c();
        String j = j();
        boolean z = false;
        if (c == null || dbsj.d(j)) {
            return false;
        }
        if (this.i.contains(c.be())) {
            int indexOf = j.indexOf(32);
            if (indexOf != -1) {
                bij bijVar = new bij(j.substring(0, indexOf));
                if (bijVar.f.indexOf(43) >= 0 && bijVar.f.indexOf(43) < 8) {
                    return true;
                }
            }
            if (c.aj() != null && ((c.aU() || c.i) && !c.h().aE)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }
}
