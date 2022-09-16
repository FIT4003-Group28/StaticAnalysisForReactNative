package defpackage;

import android.app.Activity;
import android.view.View;
/* compiled from: PG */
/* renamed from: bfmq  reason: default package */
/* loaded from: classes3.dex */
public class bfmq implements bfmh {
    private final dxio<begg> a;
    private final dwcg b;
    private final ilo c;
    private final cjtd d;
    private final String e;
    private final bydr f;
    private final Boolean g;

    public bfmq(dxio<begg> dxioVar, cqat cqatVar, Activity activity, dwcg dwcgVar, String str, cjta cjtaVar, Boolean bool) {
        this.a = dxioVar;
        this.b = dwcgVar;
        ily ilyVar = new ily();
        ilyVar.F(dwcgVar.d);
        ilyVar.k(dwcgVar.e);
        this.c = ilyVar.d();
        this.e = str;
        bydl g = bydm.g(activity.getBaseContext());
        g.b(ibm.I().b(activity));
        g.c(ibm.M().b(activity));
        this.f = new bydr(activity, cqatVar, g.a());
        if ((dwcgVar.a & 16) != 0) {
            cjtaVar.g(dwcgVar.f);
        }
        this.d = cjtaVar.a();
        this.g = bool;
    }

    @Override // defpackage.igw
    public Boolean a() {
        return igv.a();
    }

    @Override // defpackage.actn
    public View.OnClickListener b() {
        throw null;
    }

    @Override // defpackage.bfmh
    public cqkl c(cjqm cjqmVar) {
        begj begjVar = new begj();
        begjVar.b(this.c);
        begjVar.n = true;
        begjVar.c = jjn.EXPANDED;
        begjVar.F = true;
        this.a.a().o(begjVar, false, null);
        return cqkl.a;
    }

    @Override // defpackage.bfmh
    public CharSequence d() {
        return this.b.d;
    }

    @Override // defpackage.bfmh
    public CharSequence e() {
        dwcg dwcgVar = this.b;
        if (dwcgVar.b == 3) {
            dgfs dgfsVar = ((dwcf) dwcgVar.c).a;
            if (dgfsVar == null) {
                dgfsVar = dgfs.f;
            }
            return this.f.a(new byee(dgfsVar, this.e, false, false));
        }
        return null;
    }

    @Override // defpackage.bfmh
    public jic f() {
        dwcg dwcgVar = this.b;
        if (dwcgVar.b == 3) {
            return new jic(((dwcf) dwcgVar.c).b, ckqc.FULLY_QUALIFIED, 0);
        }
        return null;
    }

    @Override // defpackage.bfmh
    public cjtd g() {
        return this.d;
    }

    @Override // defpackage.bfmh
    public Boolean h() {
        return this.g;
    }
}
