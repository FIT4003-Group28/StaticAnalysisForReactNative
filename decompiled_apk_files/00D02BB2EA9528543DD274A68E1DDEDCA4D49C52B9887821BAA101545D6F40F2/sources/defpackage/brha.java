package defpackage;

import android.content.Intent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: brha  reason: default package */
/* loaded from: classes.dex */
public final class brha extends afhx {
    private final brba d;
    private final akpm e;
    public static final dcep<String> a = dcep.B("plus.codes");
    public static final Pattern b = Pattern.compile("^/([\\+23456789CFGHJMPQRVWX]+)");
    private static final Pattern i = Pattern.compile("^/(.+)");
    public static final dbsl<afga> c = brgz.a;

    public brha(Intent intent, @dzsi String str, brba brbaVar, akpm akpmVar) {
        super(intent, str, afid.PLUS_CODES);
        this.d = brbaVar;
        this.e = akpmVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        String group;
        Matcher matcher = i.matcher(this.f.getData().getPath());
        if (!matcher.find()) {
            this.f.getData();
            group = null;
        } else {
            group = matcher.group(1);
        }
        if (group == null) {
            return;
        }
        iqy iqyVar = new iqy();
        iqyVar.d = iqx.MAP;
        dwim bZ = dwir.R.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar = (dwir) bZ.b;
        group.getClass();
        dwirVar.a |= 1;
        dwirVar.c = group;
        dnqg bZ2 = dnqh.p.bZ();
        ddxw bZ3 = ddxx.j.bZ();
        int i2 = ddda.f.b;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        ddxx ddxxVar = (ddxx) bZ3.b;
        ddxxVar.a |= 8;
        ddxxVar.d = i2;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ2.b;
        ddxx bK = bZ3.bK();
        bK.getClass();
        dnqhVar.f = bK;
        dnqhVar.a |= 16;
        dnqh bK2 = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar2 = (dwir) bZ.b;
        bK2.getClass();
        dwirVar2.s = bK2;
        dwirVar2.a |= 33554432;
        dhkd dhkdVar = this.e.Z().d;
        if (dhkdVar == null) {
            dhkdVar = dhkd.d;
        }
        dhjw bZ4 = dhjx.f.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dhjx dhjxVar = (dhjx) bZ4.b;
        dhjxVar.a |= 8;
        dhjxVar.e = 15.0f;
        dhjy bZ5 = dhjz.e.bZ();
        double m = akqo.m(15.0d, dcyn.a, 30.0d, dhkdVar.c);
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ5.b;
        int i3 = dhjzVar.a | 4;
        dhjzVar.a = i3;
        dhjzVar.d = m;
        int i4 = i3 | 2;
        dhjzVar.a = i4;
        dhjzVar.c = dcyn.a;
        dhjzVar.a = i4 | 1;
        dhjzVar.b = dcyn.a;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dhjx dhjxVar2 = (dhjx) bZ4.b;
        dhjz bK3 = bZ5.bK();
        bK3.getClass();
        dhjxVar2.b = bK3;
        dhjxVar2.a = 1 | dhjxVar2.a;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dhjx dhjxVar3 = (dhjx) bZ4.b;
        dhkdVar.getClass();
        dhjxVar3.d = dhkdVar;
        dhjxVar3.a |= 4;
        dhjx bK4 = bZ4.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar3 = (dwir) bZ.b;
        bK4.getClass();
        dwirVar3.d = bK4;
        dwirVar3.a |= 2;
        this.d.s(bZ.bK(), iqyVar);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_PLUS_CODE_LOCATION;
    }
}
