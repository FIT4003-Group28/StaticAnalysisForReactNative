package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.List;
/* compiled from: PG */
/* renamed from: bwib  reason: default package */
/* loaded from: classes4.dex */
public class bwib implements bwht {
    private final cjmt a;
    private final gga b;
    private final cqrp c;
    private float d = -1.0f;
    private final List<bwia> e;
    @dzsi
    private final String f;

    public bwib(gga ggaVar, btvo btvoVar, cjmt cjmtVar, @dzsi btlu btluVar, Intent intent, bweo bweoVar, @dzsi String str, cjtd cjtdVar, cqrp cqrpVar, bvro<cjql, Intent> bvroVar) {
        gga ggaVar2 = ggaVar;
        cqrt.g(2131231715, ibl.b());
        ire.n();
        this.f = str;
        this.a = cjmtVar;
        this.b = ggaVar2;
        this.c = cqrpVar;
        bwfp f = bwfp.f(ggaVar2, btvoVar.getSharingParameters().b);
        f.g(intent);
        dccx F = dcdc.F();
        dcdc<ResolveInfo> a = f.a(btluVar);
        int size = a.size();
        int i = 0;
        while (i < size) {
            ResolveInfo resolveInfo = a.get(i);
            Intent b = f.b(resolveInfo);
            if (b != null) {
                bwep.b(b, bweoVar, ggaVar2);
                F.g(new bwia(ggaVar, resolveInfo, f, b, cjtdVar, btvoVar, bvroVar));
            }
            i++;
            ggaVar2 = ggaVar;
        }
        this.e = F.f();
    }

    @Override // defpackage.bwht
    public Boolean a() {
        return Boolean.valueOf(!TextUtils.isEmpty(this.f));
    }

    @Override // defpackage.bwht
    public CharSequence b() {
        return dbsj.e(this.f);
    }

    @Override // defpackage.bwht
    public List<? extends bwhs> c() {
        return this.e;
    }

    @Override // defpackage.bwht
    public Integer d() {
        return Integer.valueOf(cqsg.g(cqsz.d(), cqsg.d(this.c, bwgl.c, cqrp.d(20.0d))).e(this.b));
    }

    @Override // defpackage.bwht
    public Boolean e() {
        return true;
    }

    @Override // defpackage.bwhx
    public Integer f() {
        return d();
    }

    public void g(jjn jjnVar, float f) {
        jjn jjnVar2 = jjn.HIDDEN;
        int ordinal = jjnVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            this.d = -1.0f;
        } else if (ordinal == 2) {
            this.d = f - 1.0f;
        } else if (ordinal != 3) {
        } else {
            this.d = 0.0f;
        }
    }

    public Integer h() {
        return Integer.valueOf((int) (this.d * this.a.g()));
    }
}
