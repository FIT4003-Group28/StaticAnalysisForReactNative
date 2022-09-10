package defpackage;

import android.os.Build;
import android.util.DisplayMetrics;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: btxo  reason: default package */
/* loaded from: classes.dex */
public final class btxo implements btxn {
    private final DisplayMetrics a;
    private final dxio<bvjj> b;
    private final dxio<bttf> c;
    private final dxio<bvtd> d;
    private final dbsg<String> e;

    public btxo(DisplayMetrics displayMetrics, dxio<bvjj> dxioVar, dxio<bttf> dxioVar2, dxio<bvtd> dxioVar3, dbsg<String> dbsgVar) {
        this.a = displayMetrics;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
        this.e = dbsgVar;
    }

    @Override // defpackage.btxn
    public final dmxb a(dmxf dmxfVar, Locale locale) {
        dmwb dmwbVar = dmwb.COMPACT_MULTIZOOM_STYLE_TABLE;
        dmxa bZ = dmxb.o.bZ();
        String c = bvnz.c(this.d.a().b());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmxb dmxbVar = (dmxb) bZ.b;
        c.getClass();
        dmxbVar.a |= 64;
        dmxbVar.g = c;
        String b = bvnz.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmxb dmxbVar2 = (dmxb) bZ.b;
        b.getClass();
        dmxbVar2.a |= 2;
        dmxbVar2.c = b;
        float f = this.a.density;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmxb dmxbVar3 = (dmxb) bZ.b;
        int i = dmxbVar3.a | 1024;
        dmxbVar3.a = i;
        dmxbVar3.i = f;
        dmxbVar3.a = i | 4;
        dmxbVar3.d = "prod";
        String language = locale.getLanguage();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmxb dmxbVar4 = (dmxb) bZ.b;
        language.getClass();
        dmxbVar4.a |= 1;
        dmxbVar4.b = language;
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmxb dmxbVar5 = (dmxb) bZ.b;
        valueOf.getClass();
        int i2 = dmxbVar5.a | 8;
        dmxbVar5.a = i2;
        dmxbVar5.e = valueOf;
        dmxbVar5.m = dmwbVar.d;
        int i3 = i2 | 8192;
        dmxbVar5.a = i3;
        dmxbVar5.a = i3 | 262144;
        dmxbVar5.n = true;
        dmxb dmxbVar6 = (dmxb) bZ.b;
        dmxbVar6.a |= 16;
        dmxbVar6.f = "GMM";
        this.d.a();
        String a = this.c.a().a();
        if (!a.isEmpty()) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmxb dmxbVar7 = (dmxb) bZ.b;
            a.getClass();
            dmxbVar7.a |= 512;
            dmxbVar7.h = a;
        }
        dmyg bZ2 = dmyh.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmyh dmyhVar = (dmyh) bZ2.b;
        dmyhVar.a |= 1;
        dmyhVar.b = 18;
        dmyh dmyhVar2 = (dmyh) bZ2.b;
        dmyhVar2.a |= 2;
        dmyhVar2.c = 1;
        dmyl dmylVar = dmxfVar.e;
        if (dmylVar == null) {
            dmylVar = dmyl.b;
        }
        int i4 = dmylVar.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmyh dmyhVar3 = (dmyh) bZ2.b;
        dmyhVar3.a |= 4;
        dmyhVar3.d = i4;
        dmyh bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmxb dmxbVar8 = (dmxb) bZ.b;
        bK.getClass();
        dmxbVar8.l = bK;
        dmxbVar8.a |= 4096;
        this.b.a();
        List<bviu> list = bviv.a;
        for (Integer num : bviv.a()) {
            int intValue = num.intValue();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmxb dmxbVar9 = (dmxb) bZ.b;
            dsrf dsrfVar = dmxbVar9.j;
            if (!dsrfVar.a()) {
                dmxbVar9.j = dsqw.cg(dsrfVar);
            }
            dmxbVar9.j.h(intValue);
        }
        return bZ.bK();
    }
}
