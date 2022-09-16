package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cgyp  reason: default package */
/* loaded from: classes4.dex */
public class cgyp implements cgvx, jkk {
    public int a = 0;
    public int b = 0;
    private final Activity c;
    private final btvo d;
    private final gga e;
    private final cjqy f;
    private final dxio<afha> g;
    private int h;
    private final cgyo i;

    public cgyp(Activity activity, btvo btvoVar, gga ggaVar, axwy axwyVar, cjqy cjqyVar, dxio<afha> dxioVar, cgyo cgyoVar) {
        this.c = activity;
        this.d = btvoVar;
        this.e = ggaVar;
        this.i = cgyoVar;
        this.f = cjqyVar;
        this.g = dxioVar;
    }

    @Override // defpackage.cgvx
    public Integer a() {
        return Integer.valueOf(this.h);
    }

    @Override // defpackage.cgvx
    public cqkl b() {
        String str;
        ilo c;
        dwqe j = this.i.j();
        if ((j.a & 1) != 0) {
            cjqy cjqyVar = this.f;
            cjta b = cjtd.b();
            b.g(j.b);
            cjqyVar.i(b.a());
        }
        if ((j.a & 2) != 0) {
            str = j.c;
        } else {
            bwrs<ilo> i = this.i.i();
            if (i == null || (c = i.c()) == null) {
                str = "";
            } else {
                Object[] objArr = new Object[3];
                objArr[0] = Uri.encode(c.n());
                dvxz dvxzVar = c.h().s;
                if (dvxzVar == null) {
                    dvxzVar = dvxz.h;
                }
                objArr[1] = dvxzVar.d;
                objArr[2] = Locale.getDefault().getLanguage();
                str = String.format("https://www.google.com/search?q=%s+%s&hl=%s", objArr);
            }
        }
        this.i.ab(doab.PRIOR_RESEARCH_DID_SEARCH);
        this.g.a().k(this.e, str, 1);
        return cqkl.a;
    }

    @Override // defpackage.cgvx
    public cqkl c() {
        this.i.h();
        return cqkl.a;
    }

    @Override // defpackage.cgvx
    public CharSequence d() {
        return this.c.getResources().getString(R.string.UGC_TASK_N_OF_M_TEXT, Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    @Override // defpackage.cgvx
    public CharSequence e() {
        return this.c.getResources().getString(R.string.UGC_TASKS_ACCESSIBILITY_N_OF_M, Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    @Override // defpackage.cgvx
    public cqkl f() {
        this.i.k();
        return cqkl.a;
    }

    @Override // defpackage.jkk
    public void g(int i) {
        this.h = i;
        cqkx.p(this);
    }

    @Override // defpackage.cgvx
    public cqkl h() {
        if (this.a > 0) {
            this.i.l();
        }
        return cqkl.a;
    }

    @Override // defpackage.cgvx
    public Boolean i() {
        return Boolean.valueOf(this.a > 0);
    }

    @Override // defpackage.cgvx
    public Boolean j() {
        return Boolean.valueOf(this.i.m());
    }

    @Override // defpackage.cgvx
    public Boolean k() {
        return Boolean.valueOf(this.i.o());
    }

    @Override // defpackage.cgvx
    public cqkl l() {
        this.i.n();
        return cqkl.a;
    }

    @Override // defpackage.cgvx
    public Boolean m() {
        int i = this.d.getUgcTasksParameters().i;
        return false;
    }
}
