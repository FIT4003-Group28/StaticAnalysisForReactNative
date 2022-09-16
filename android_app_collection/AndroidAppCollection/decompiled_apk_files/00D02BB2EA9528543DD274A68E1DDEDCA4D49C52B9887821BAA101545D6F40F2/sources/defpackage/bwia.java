package defpackage;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: bwia  reason: default package */
/* loaded from: classes4.dex */
public class bwia implements bwhs {
    final Intent a;
    private final gga b;
    private final bwfp c;
    private final ResolveInfo d;
    private final cjtd e;
    private final btvo f;
    private final bvro<cjql, Intent> g;
    private final cjwu h = new cjwu();

    public bwia(gga ggaVar, ResolveInfo resolveInfo, bwfp bwfpVar, Intent intent, cjtd cjtdVar, btvo btvoVar, bvro<cjql, Intent> bvroVar) {
        this.b = ggaVar;
        this.c = bwfpVar;
        this.a = intent;
        this.d = resolveInfo;
        this.e = cjtdVar;
        this.f = btvoVar;
        this.g = bvroVar;
    }

    @Override // defpackage.bwhs
    public Drawable a() {
        return this.d.loadIcon(this.b.getPackageManager());
    }

    @Override // defpackage.bwhs
    public CharSequence b() {
        return this.d.loadLabel(this.b.getPackageManager());
    }

    @Override // defpackage.bwhs
    public cqkl c() {
        this.c.c(this.a);
        cjql a = this.h.a();
        bvro<cjql, Intent> bvroVar = this.g;
        dbsk.s(a);
        bvroVar.a(a, this.a);
        return cqkl.a;
    }

    @Override // defpackage.bwhs
    public cjtd d() {
        return bwhr.a(this.e, dbsg.j(this.d));
    }

    @Override // defpackage.bwhs
    public cjwu e() {
        return this.h;
    }

    @Override // defpackage.bwhs
    public Boolean f() {
        return Boolean.valueOf(this.f.getEnableFeatureParameters().aT);
    }
}
