package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: abfa  reason: default package */
/* loaded from: classes.dex */
public final class abfa extends aaqs {
    public String a;
    public long b;
    public avka c;
    public String d;
    public aopa s;
    private String t;

    public abfa(aaqf aaqfVar, afvm afvmVar) {
        super("ypc/get_cart", aaqfVar, afvmVar);
        this.a = "";
        this.t = "";
        this.d = "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        boolean[] zArr = new boolean[5];
        int i = ((asho) a().mo39build()).b;
        boolean z = false;
        zArr[0] = (i & 2) != 0;
        zArr[1] = (i & 8) != 0;
        zArr[2] = (i & 16) != 0;
        zArr[3] = (i & 32) != 0;
        zArr[4] = (i & 128) != 0;
        if (anhh.c(zArr) == 1) {
            z = true;
        }
        aqxo.y(z);
    }

    public final void t(byte[] bArr) {
        if (this.s == null) {
            this.s = apox.a.createBuilder();
        }
        aopa aopaVar = this.s;
        aoob x = aoob.x(bArr);
        aopaVar.copyOnWrite();
        apox apoxVar = (apox) aopaVar.instance;
        apox apoxVar2 = apox.a;
        apoxVar.b |= 1;
        apoxVar.e = x;
    }

    public final void u(String str) {
        this.t = g(str);
    }

    @Override // defpackage.aaqs
    /* renamed from: v */
    public final aopa a() {
        aopa createBuilder = asho.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            asho ashoVar = (asho) createBuilder.instance;
            str.getClass();
            ashoVar.b |= 2;
            ashoVar.d = str;
        } else if (!TextUtils.isEmpty(this.t)) {
            long j = this.b;
            createBuilder.copyOnWrite();
            asho ashoVar2 = (asho) createBuilder.instance;
            ashoVar2.b |= 4;
            ashoVar2.e = j;
            String str2 = this.t;
            createBuilder.copyOnWrite();
            asho ashoVar3 = (asho) createBuilder.instance;
            str2.getClass();
            ashoVar3.b |= 8;
            ashoVar3.f = str2;
        }
        aopa aopaVar = this.s;
        if (aopaVar != null) {
            createBuilder.copyOnWrite();
            asho ashoVar4 = (asho) createBuilder.instance;
            apox apoxVar = (apox) aopaVar.mo39build();
            apoxVar.getClass();
            ashoVar4.g = apoxVar;
            ashoVar4.b |= 32;
        }
        avka avkaVar = this.c;
        if (avkaVar != null) {
            createBuilder.copyOnWrite();
            asho ashoVar5 = (asho) createBuilder.instance;
            ashoVar5.h = avkaVar;
            ashoVar5.b |= 64;
        }
        if (!TextUtils.isEmpty(this.d)) {
            String str3 = this.d;
            createBuilder.copyOnWrite();
            asho ashoVar6 = (asho) createBuilder.instance;
            str3.getClass();
            ashoVar6.b |= 128;
            ashoVar6.i = str3;
        }
        return createBuilder;
    }
}
