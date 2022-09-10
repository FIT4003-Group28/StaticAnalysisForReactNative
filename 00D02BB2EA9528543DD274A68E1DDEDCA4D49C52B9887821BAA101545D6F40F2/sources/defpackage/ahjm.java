package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahjm  reason: default package */
/* loaded from: classes2.dex */
public class ahjm extends agxc implements ahag {
    private final Activity a;
    private final dcdc<ahah> b;
    private final String c;
    private final String d;
    private final dxio<afha> e;

    public ahjm(Activity activity, dxio<afha> dxioVar, dldx dldxVar) {
        this.a = activity;
        this.e = dxioVar;
        this.b = dcdc.r(dcbg.b(dldxVar.d).s(ahjl.a).z());
        this.c = dldxVar.e;
        this.d = dldxVar.f;
    }

    @Override // defpackage.ahag
    public Boolean a() {
        return Boolean.valueOf(!b().isEmpty());
    }

    @Override // defpackage.ahag
    public List<ahah> b() {
        return this.b;
    }

    @Override // defpackage.ahag
    public String c() {
        return this.c;
    }

    @Override // defpackage.ahag
    public cqkl h() {
        this.e.a().k(this.a, this.d, 1);
        return cqkl.a;
    }
}
