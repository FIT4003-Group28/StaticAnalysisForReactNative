package defpackage;

import android.content.Context;
import android.content.IntentFilter;
/* compiled from: PG */
/* renamed from: tyr  reason: default package */
/* loaded from: classes4.dex */
public final class tyr implements tyk {
    private final Context a;
    private final String b;
    private final aaeq c;

    public tyr(Context context, aaeq aaeqVar) {
        this.a = context;
        this.c = aaeqVar;
        this.b = context.getPackageName();
    }

    private final void m(int i, aopa aopaVar, long j) {
        aopaVar.copyOnWrite();
        angp angpVar = (angp) aopaVar.instance;
        angp angpVar2 = angp.a;
        angpVar.b |= 524288;
        angpVar.f = j;
        aopa createBuilder = ango.a.createBuilder();
        boolean z = this.a.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) != null;
        createBuilder.copyOnWrite();
        ango angoVar = (ango) createBuilder.instance;
        angoVar.b |= 1;
        angoVar.c = z;
        aopaVar.copyOnWrite();
        angp angpVar3 = (angp) aopaVar.instance;
        ango angoVar2 = (ango) createBuilder.mo39build();
        angoVar2.getClass();
        angpVar3.h = angoVar2;
        angpVar3.c |= 64;
        aopa createBuilder2 = angm.a.createBuilder();
        String str = this.b;
        createBuilder2.copyOnWrite();
        angm angmVar = (angm) createBuilder2.instance;
        str.getClass();
        angmVar.b |= 2;
        angmVar.d = str;
        createBuilder2.copyOnWrite();
        angm angmVar2 = (angm) createBuilder2.instance;
        angmVar2.b = 1 | angmVar2.b;
        angmVar2.c = 381083572;
        aopaVar.copyOnWrite();
        angp angpVar4 = (angp) aopaVar.instance;
        angm angmVar3 = (angm) createBuilder2.mo39build();
        angmVar3.getClass();
        angpVar4.l = angmVar3;
        angpVar4.c |= 131072;
        aaeq aaeqVar = this.c;
        aopi mo39build = aopaVar.mo39build();
        int i2 = i - 2;
        if (mo39build instanceof angp) {
            angn angnVar = ((angp) mo39build).e;
            if (angnVar == null) {
                angnVar = angn.a;
            }
            String str2 = angnVar.c;
            arrf a = arrh.a();
            aqkc a2 = aqkd.a();
            a2.copyOnWrite();
            ((aqkd) a2.instance).i(i2);
            a2.copyOnWrite();
            ((aqkd) a2.instance).g(str2);
            a.copyOnWrite();
            ((arrh) a.instance).cl((aqkd) a2.mo39build());
            aaeqVar.a.a((arrh) a.mo39build());
        }
    }

    @Override // defpackage.tyk
    public final void a(angq angqVar) {
        if (!typ.a(100L)) {
            return;
        }
        aopa createBuilder = angp.a.createBuilder();
        createBuilder.copyOnWrite();
        angp angpVar = (angp) createBuilder.instance;
        angqVar.getClass();
        angpVar.p = angqVar;
        angpVar.d |= 1;
        m(1075, createBuilder, 100L);
    }

    @Override // defpackage.tyk
    public final void b(angn angnVar, angr angrVar) {
        if (!typ.a(100L)) {
            return;
        }
        aopa createBuilder = angp.a.createBuilder();
        createBuilder.copyOnWrite();
        angp angpVar = (angp) createBuilder.instance;
        angnVar.getClass();
        angpVar.e = angnVar;
        angpVar.b |= 256;
        createBuilder.copyOnWrite();
        angp angpVar2 = (angp) createBuilder.instance;
        angrVar.getClass();
        angpVar2.q = angrVar;
        angpVar2.d |= 2;
        m(1082, createBuilder, 100L);
    }

    @Override // defpackage.tyk
    public final void c(angn angnVar) {
        if (!typ.a(100L)) {
            return;
        }
        aopa createBuilder = angp.a.createBuilder();
        aopa createBuilder2 = angy.a.createBuilder();
        createBuilder2.copyOnWrite();
        angy angyVar = (angy) createBuilder2.instance;
        angnVar.getClass();
        angyVar.c = angnVar;
        angyVar.b |= 1;
        createBuilder.copyOnWrite();
        angp angpVar = (angp) createBuilder.instance;
        angy angyVar2 = (angy) createBuilder2.mo39build();
        angyVar2.getClass();
        angpVar.o = angyVar2;
        angpVar.c |= 1073741824;
        m(1071, createBuilder, 100L);
    }

    @Override // defpackage.tyk
    public final void d(angn angnVar, angu anguVar) {
        aopa createBuilder = angp.a.createBuilder();
        createBuilder.copyOnWrite();
        angp angpVar = (angp) createBuilder.instance;
        angnVar.getClass();
        angpVar.e = angnVar;
        angpVar.b |= 256;
        createBuilder.copyOnWrite();
        angp angpVar2 = (angp) createBuilder.instance;
        anguVar.getClass();
        angpVar2.g = anguVar;
        angpVar2.b |= 1073741824;
        m(1046, createBuilder, 100L);
    }

    @Override // defpackage.tyk
    public final void e(angx angxVar) {
        aopa createBuilder = angp.a.createBuilder();
        createBuilder.copyOnWrite();
        angp angpVar = (angp) createBuilder.instance;
        angxVar.getClass();
        angpVar.k = angxVar;
        angpVar.c |= 32768;
        m(1058, createBuilder, 100L);
    }

    @Override // defpackage.tyk
    public final void f(angz angzVar) {
        aopa createBuilder = angp.a.createBuilder();
        createBuilder.copyOnWrite();
        angp angpVar = (angp) createBuilder.instance;
        angzVar.getClass();
        angpVar.i = angzVar;
        angpVar.c |= 4096;
        m(1057, createBuilder, 100L);
    }

    @Override // defpackage.tyk
    public final void g(int i) {
        if (!typ.a(100L)) {
            return;
        }
        m(i, angp.a.createBuilder(), 100L);
    }

    @Override // defpackage.tyk
    public final void h(int i, String str, int i2, long j, String str2) {
        if (!typ.a(100L)) {
            return;
        }
        aopa createBuilder = angn.a.createBuilder();
        createBuilder.copyOnWrite();
        angn angnVar = (angn) createBuilder.instance;
        str.getClass();
        angnVar.b |= 1;
        angnVar.c = str;
        createBuilder.copyOnWrite();
        angn angnVar2 = (angn) createBuilder.instance;
        angnVar2.b |= 2;
        angnVar2.d = i2;
        createBuilder.copyOnWrite();
        angn angnVar3 = (angn) createBuilder.instance;
        angnVar3.b |= 32;
        angnVar3.h = j;
        createBuilder.copyOnWrite();
        angn angnVar4 = (angn) createBuilder.instance;
        str2.getClass();
        angnVar4.b |= 64;
        angnVar4.i = str2;
        angn angnVar5 = (angn) createBuilder.mo39build();
        aopa createBuilder2 = angp.a.createBuilder();
        createBuilder2.copyOnWrite();
        angp angpVar = (angp) createBuilder2.instance;
        angnVar5.getClass();
        angpVar.e = angnVar5;
        angpVar.b |= 256;
        m(i, createBuilder2, 100L);
    }

    @Override // defpackage.tyk
    public final void i(int i, int i2) {
        if (!typ.a(100L)) {
            return;
        }
        aopa createBuilder = angp.a.createBuilder();
        aopa createBuilder2 = angt.a.createBuilder();
        createBuilder2.copyOnWrite();
        angt angtVar = (angt) createBuilder2.instance;
        angtVar.b |= 2;
        angtVar.d = i2;
        createBuilder2.copyOnWrite();
        angt angtVar2 = (angt) createBuilder2.instance;
        angtVar2.c = i - 2;
        angtVar2.b |= 1;
        createBuilder.copyOnWrite();
        angp angpVar = (angp) createBuilder.instance;
        angt angtVar3 = (angt) createBuilder2.mo39build();
        angtVar3.getClass();
        angpVar.j = angtVar3;
        angpVar.c |= 16384;
        m(1053, createBuilder, 100L);
    }

    @Override // defpackage.tyk
    public final void j(int i, angn angnVar) {
        if (!typ.a(100L)) {
            return;
        }
        aopa createBuilder = angp.a.createBuilder();
        aopa createBuilder2 = angs.a.createBuilder();
        createBuilder2.copyOnWrite();
        angs angsVar = (angs) createBuilder2.instance;
        if (i != 1) {
            angsVar.c = i - 2;
            angsVar.b |= 1;
            createBuilder2.copyOnWrite();
            angs angsVar2 = (angs) createBuilder2.instance;
            angnVar.getClass();
            angsVar2.d = angnVar;
            angsVar2.b |= 2;
            createBuilder.copyOnWrite();
            angp angpVar = (angp) createBuilder.instance;
            angs angsVar3 = (angs) createBuilder2.mo39build();
            angsVar3.getClass();
            angpVar.n = angsVar3;
            angpVar.c |= 536870912;
            m(1070, createBuilder, 100L);
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // defpackage.tyk
    public final void k(angn angnVar, int i, long j, long j2, String str, int i2) {
        if (!typ.a(100L)) {
            return;
        }
        aopa createBuilder = angp.a.createBuilder();
        aopa createBuilder2 = angv.a.createBuilder();
        createBuilder2.copyOnWrite();
        angv angvVar = (angv) createBuilder2.instance;
        angnVar.getClass();
        angvVar.c = angnVar;
        angvVar.b |= 1;
        createBuilder2.copyOnWrite();
        angv angvVar2 = (angv) createBuilder2.instance;
        angvVar2.d = i - 2;
        angvVar2.b |= 2;
        createBuilder2.copyOnWrite();
        angv angvVar3 = (angv) createBuilder2.instance;
        angvVar3.b |= 4;
        angvVar3.e = j;
        createBuilder2.copyOnWrite();
        angv angvVar4 = (angv) createBuilder2.instance;
        angvVar4.b |= 8;
        angvVar4.f = j2;
        createBuilder2.copyOnWrite();
        angv angvVar5 = (angv) createBuilder2.instance;
        str.getClass();
        angvVar5.b |= 16;
        angvVar5.g = str;
        createBuilder2.copyOnWrite();
        angv angvVar6 = (angv) createBuilder2.instance;
        angvVar6.b |= 32;
        angvVar6.h = i2;
        createBuilder.copyOnWrite();
        angp angpVar = (angp) createBuilder.instance;
        angv angvVar7 = (angv) createBuilder2.mo39build();
        angvVar7.getClass();
        angpVar.m = angvVar7;
        angpVar.c |= 1048576;
        m(1068, createBuilder, 100L);
    }

    @Override // defpackage.tyk
    public final void l(int i) {
        m(i, angp.a.createBuilder(), 10000L);
    }
}
