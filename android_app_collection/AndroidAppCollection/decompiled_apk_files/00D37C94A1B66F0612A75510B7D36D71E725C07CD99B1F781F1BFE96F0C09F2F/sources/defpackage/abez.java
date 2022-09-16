package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: abez  reason: default package */
/* loaded from: classes.dex */
public final class abez extends aaqs {
    public String a;
    public String b;
    public aoob c;
    public aoob d;
    public String s;
    public String t;
    public byte[] u;
    public byte[] v;
    public String w;
    public String x;
    private final String y;
    private final String z;

    public abez(aaqf aaqfVar, afvm afvmVar) {
        super("ypc/complete_transaction", aaqfVar, afvmVar);
        this.a = "";
        this.b = "";
        this.y = "";
        this.c = aoob.b;
        this.d = aoob.b;
        this.s = "";
        this.t = "";
        this.z = "";
        this.u = abff.b;
        this.v = abff.a;
        this.w = "";
        this.x = "";
        this.k = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        ashm ashmVar = (ashm) a().mo39build();
        boolean[] zArr = new boolean[3];
        int i = ashmVar.b;
        boolean z = false;
        zArr[0] = (i & 8) != 0;
        zArr[1] = (i & 16) != 0;
        zArr[2] = (i & 32) != 0;
        int c = anhh.c(zArr);
        if (c == 1 || (c == 0 && !ashmVar.i.isEmpty())) {
            z = true;
        }
        aqxo.z(z, "More than one params field or none set. ");
    }

    @Override // defpackage.aaqs
    /* renamed from: t */
    public final aopa a() {
        aopa createBuilder = ashm.a.createBuilder();
        if (!TextUtils.isEmpty(this.y)) {
            String str = this.y;
            createBuilder.copyOnWrite();
            ashm ashmVar = (ashm) createBuilder.instance;
            ashmVar.b |= 2;
            ashmVar.d = str;
        }
        aoob aoobVar = this.c;
        if (aoobVar != null && !aoobVar.H()) {
            aoob aoobVar2 = this.c;
            createBuilder.copyOnWrite();
            ashm ashmVar2 = (ashm) createBuilder.instance;
            aoobVar2.getClass();
            ashmVar2.b |= 4;
            ashmVar2.e = aoobVar2;
        }
        if (!TextUtils.isEmpty(this.a)) {
            String str2 = this.a;
            createBuilder.copyOnWrite();
            ashm ashmVar3 = (ashm) createBuilder.instance;
            str2.getClass();
            ashmVar3.b |= 8;
            ashmVar3.f = str2;
        } else if (!TextUtils.isEmpty(this.b)) {
            String str3 = this.b;
            createBuilder.copyOnWrite();
            ashm ashmVar4 = (ashm) createBuilder.instance;
            str3.getClass();
            ashmVar4.b |= 16;
            ashmVar4.g = str3;
        } else {
            aoob aoobVar3 = this.d;
            if (aoobVar3 != null && !aoobVar3.H()) {
                aoob aoobVar4 = this.d;
                createBuilder.copyOnWrite();
                ashm ashmVar5 = (ashm) createBuilder.instance;
                aoobVar4.getClass();
                ashmVar5.b |= 32;
                ashmVar5.h = aoobVar4;
            }
        }
        if (!TextUtils.isEmpty(this.w)) {
            String str4 = this.w;
            createBuilder.copyOnWrite();
            ashm ashmVar6 = (ashm) createBuilder.instance;
            str4.getClass();
            ashmVar6.b |= 64;
            ashmVar6.i = str4;
        }
        if (!TextUtils.isEmpty(this.s) && !TextUtils.isEmpty(this.t)) {
            aopa createBuilder2 = arny.a.createBuilder();
            String str5 = this.s;
            createBuilder2.copyOnWrite();
            arny arnyVar = (arny) createBuilder2.instance;
            str5.getClass();
            arnyVar.b |= 2;
            arnyVar.f = str5;
            String str6 = this.t;
            createBuilder2.copyOnWrite();
            arny arnyVar2 = (arny) createBuilder2.instance;
            str6.getClass();
            arnyVar2.b |= 4;
            arnyVar2.g = str6;
            createBuilder.copyOnWrite();
            ashm ashmVar7 = (ashm) createBuilder.instance;
            arny arnyVar3 = (arny) createBuilder2.mo39build();
            arnyVar3.getClass();
            ashmVar7.j = arnyVar3;
            ashmVar7.b |= 128;
        }
        String str7 = this.z;
        createBuilder.copyOnWrite();
        ashm ashmVar8 = (ashm) createBuilder.instance;
        ashmVar8.b |= 1024;
        ashmVar8.m = str7;
        byte[] bArr = this.u;
        if (bArr != null) {
            aoob x = aoob.x(bArr);
            createBuilder.copyOnWrite();
            ashm ashmVar9 = (ashm) createBuilder.instance;
            ashmVar9.b |= 256;
            ashmVar9.k = x;
        }
        byte[] bArr2 = this.v;
        if (bArr2 != null) {
            aoob x2 = aoob.x(bArr2);
            createBuilder.copyOnWrite();
            ashm ashmVar10 = (ashm) createBuilder.instance;
            ashmVar10.b |= 512;
            ashmVar10.l = x2;
        }
        if (!TextUtils.isEmpty(this.x)) {
            aopa createBuilder3 = apwg.a.createBuilder();
            String str8 = this.x;
            createBuilder3.copyOnWrite();
            apwg apwgVar = (apwg) createBuilder3.instance;
            str8.getClass();
            apwgVar.b |= 1;
            apwgVar.c = str8;
            createBuilder.copyOnWrite();
            ashm ashmVar11 = (ashm) createBuilder.instance;
            apwg apwgVar2 = (apwg) createBuilder3.mo39build();
            apwgVar2.getClass();
            ashmVar11.n = apwgVar2;
            ashmVar11.b |= 2048;
        }
        return createBuilder;
    }
}
