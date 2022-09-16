package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: biwr  reason: default package */
/* loaded from: classes3.dex */
public class biwr implements biwg, bega {
    private final ff a;
    private final btvo b;
    private final cjqy c;
    private final begg d;
    private boolean f = false;
    private CharSequence g = "";
    private cjtd h = cjtd.b;
    private final boolean e = false;

    public biwr(ff ffVar, btvo btvoVar, cjqy cjqyVar, begg beggVar) {
        this.a = ffVar;
        this.b = btvoVar;
        this.c = cjqyVar;
        this.d = beggVar;
    }

    @Override // defpackage.biwg
    public Boolean a() {
        return Boolean.valueOf(TextUtils.isEmpty(this.g));
    }

    @Override // defpackage.biwg
    public Boolean b() {
        return true;
    }

    @Override // defpackage.biwg
    public cqkl c() {
        ((ClipboardManager) this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(this.a.getString(R.string.COPIED_ADDRESS_LABEL), this.g));
        ff ffVar = this.a;
        Toast.makeText(ffVar, ffVar.getString(R.string.COPIED_ADDRESS_TOAST), 1).show();
        this.c.m(new cjte(deaf.LONG_PRESS), this.h);
        return cqkl.a;
    }

    @Override // defpackage.biwg
    public cqtd d() {
        return cqrt.g(2131232390, ibm.x());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        if (!this.a.g().J()) {
            this.d.m(jjn.COLLAPSED);
            this.c.i(this.h);
        }
        return cqkl.a;
    }

    @Override // defpackage.biwg
    @dzsi
    public jic g() {
        return null;
    }

    @Override // defpackage.biwg
    public CharSequence h() {
        return this.g;
    }

    @Override // defpackage.biwg
    public Integer i() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.biwg
    public dcdc<biwf> j() {
        return dcdc.e();
    }

    @Override // defpackage.biwg
    public CharSequence k() {
        if (this.f) {
            return this.a.getString(R.string.ACCESSIBILITY_PLACE_ADDRESS_STRICKEN_OUT, new Object[]{this.g});
        }
        return this.a.getString(R.string.ACCESSIBILITY_PLACE_ADDRESS, new Object[]{this.g});
    }

    @Override // defpackage.biwg
    public Boolean l() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.biwg
    public cjtd m() {
        return this.h;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        String B;
        int a;
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            u();
            return;
        }
        if (this.e) {
            B = iloVar.C();
        } else {
            B = iloVar.B();
        }
        this.g = B;
        doav cx = iloVar.cx();
        boolean z = false;
        if (this.b.getUgcParameters().w() && cx != null && (a = doau.a(cx.b)) != 0 && a == 2 && (cx.a & 16) != 0) {
            dnvs dnvsVar = cx.e;
            if (dnvsVar == null) {
                dnvsVar = dnvs.d;
            }
            Iterator<dnvr> it = dnvsVar.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    dqgh b = dqgh.b(it.next().b);
                    if (b == null) {
                        b = dqgh.UNDEFINED;
                    }
                    if (b == dqgh.ADDRESS) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f = z;
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxy.hk;
        this.h = c.a();
    }

    @Override // defpackage.bega
    public void u() {
        this.h = cjtd.b;
        this.g = "";
        this.f = false;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(!a().booleanValue());
    }

    public biwr(ff ffVar, btvo btvoVar, cjqy cjqyVar, begg beggVar, boolean z) {
        this.a = ffVar;
        this.b = btvoVar;
        this.c = cjqyVar;
        this.d = beggVar;
    }
}
