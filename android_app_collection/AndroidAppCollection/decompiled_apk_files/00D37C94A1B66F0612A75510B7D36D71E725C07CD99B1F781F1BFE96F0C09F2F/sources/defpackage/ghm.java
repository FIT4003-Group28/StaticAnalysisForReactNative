package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: ghm  reason: default package */
/* loaded from: classes3.dex */
public final class ghm implements ggt {
    private final avhn a;
    private final String b;
    private final apzg c;
    private final apzg d;
    private final arag e;
    private final List f;
    private final boolean g;
    private final ggy h;
    private final int i;

    public ghm(int i, avhn avhnVar, String str, apzg apzgVar, apzg apzgVar2, arag aragVar, avhc[] avhcVarArr, boolean z, ggy ggyVar) {
        this.i = i;
        this.a = avhnVar;
        this.b = str;
        this.c = apzgVar;
        this.d = apzgVar2;
        this.e = aragVar;
        this.f = avhcVarArr == null ? null : Arrays.asList(avhcVarArr);
        this.g = z;
        this.h = ggyVar;
    }

    public static ghl n() {
        return new ghl();
    }

    @Override // defpackage.ggt
    public final ggy a() {
        return this.h;
    }

    @Override // defpackage.ggt
    public final apzg b() {
        return this.c;
    }

    @Override // defpackage.ggt
    public final apzg c() {
        return this.d;
    }

    @Override // defpackage.ggt
    public final arag d() {
        return this.e;
    }

    @Override // defpackage.ggt
    public final avhn e() {
        return this.a;
    }

    @Override // defpackage.ggt
    public final String f() {
        return this.b;
    }

    @Override // defpackage.ggt
    public final List g() {
        return this.f;
    }

    @Override // defpackage.ggt
    public final boolean h() {
        return this.g;
    }

    @Override // defpackage.ggt
    public final /* synthetic */ boolean i() {
        return ggs.b(this);
    }

    @Override // defpackage.ggt
    public final /* synthetic */ boolean j() {
        return ggs.c(this);
    }

    @Override // defpackage.ggt
    public final /* synthetic */ boolean k(ggt ggtVar) {
        return ggs.d(this, ggtVar);
    }

    @Override // defpackage.ggt
    public final int l() {
        return this.i;
    }

    @Override // defpackage.ggt
    public final /* synthetic */ void m() {
        ggs.e(this);
    }
}
