package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdir  reason: default package */
/* loaded from: classes3.dex */
public class bdir implements bdik {
    public final bdip a;
    public boolean b;
    private final jic c;
    private final ckql d;
    private final Float e;
    private final String f;
    private final bdhf g;
    private final int h;
    private final Activity i;
    private final View.OnClickListener j = new bdio(this);

    public bdir(gga ggaVar, cqhn cqhnVar, dwfl dwflVar, int i, bdhf bdhfVar, boolean z, bdip bdipVar) {
        this.a = bdipVar;
        this.g = bdhfVar;
        this.b = z;
        this.h = i;
        this.i = ggaVar;
        Resources resources = ggaVar.getResources();
        int i2 = (resources.getDisplayMetrics().widthPixels - 10) / 2;
        float f = (resources.getDisplayMetrics().densityDpi / 160.0f) * 110.0f;
        this.e = Float.valueOf(i2 / f);
        ckqd ckqdVar = ckqc.FULLY_QUALIFIED;
        if (ckob.b(dwflVar)) {
            ckqdVar = new cknd(dwflVar);
        } else {
            dgge dggeVar = dgge.IMAGE_UNKNOWN;
            dizh dizhVar = dwflVar.p;
            dggg dgggVar = (dizhVar == null ? dizh.j : dizhVar).b;
            dgge b = dgge.b((dgggVar == null ? dggg.d : dgggVar).b);
            int ordinal = (b == null ? dgge.IMAGE_UNKNOWN : b).ordinal();
            if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 8 || ordinal == 10) {
                ckqdVar = new bdiq(i2, Math.round(f));
            }
        }
        ckqd ckqdVar2 = ckqdVar;
        this.f = dwflVar.d;
        ckql ckqlVar = new ckql();
        this.d = ckqlVar;
        this.c = new jic(dwflVar.h, ckqdVar2, irg.f(), resources.getInteger(17694720), null, ckqlVar);
    }

    @Override // defpackage.bcdh
    public void a(cqiv cqivVar) {
        cqivVar.a(new bdij(), this);
    }

    @Override // defpackage.bcdh
    public jic b() {
        return this.c;
    }

    @Override // defpackage.bcdh
    public Float c() {
        return this.e;
    }

    @Override // defpackage.bcdh
    public Boolean d() {
        return true;
    }

    @Override // defpackage.bcdh
    public View.OnClickListener e() {
        return this.j;
    }

    @Override // defpackage.bcdh
    public cjtd f() {
        return cjtd.a(dtxo.S);
    }

    @Override // defpackage.bcdh
    public CharSequence g() {
        return this.i.getResources().getString(true != this.b ? R.string.ACCESSIBILITY_PHOTO_GALLERY_NUMBERED_THUMBNAIL_UNCHECKED : R.string.ACCESSIBILITY_PHOTO_GALLERY_NUMBERED_THUMBNAIL_CHECKED, Integer.valueOf(this.h + 1));
    }

    @Override // defpackage.bcdh
    public Boolean h() {
        return false;
    }

    @Override // defpackage.bcdh
    public Boolean i() {
        throw null;
    }

    @Override // defpackage.bcdh
    public CharSequence j() {
        throw null;
    }

    @Override // defpackage.bcdh
    public Boolean k() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.bcdh
    @dzsi
    public String l() {
        return this.f;
    }

    @Override // defpackage.bdik
    public Boolean m() {
        boolean z = false;
        if (this.g == bdhf.MULTIPLE || (this.g == bdhf.SINGLE && this.b)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdik
    public void n() {
        this.b = false;
        cqkx.p(this);
    }
}
