package defpackage;

import java.util.ArrayList;
import java.util.Date;
/* compiled from: PG */
/* renamed from: vtl  reason: default package */
/* loaded from: classes4.dex */
public final class vtl implements vtg {
    public vtk a;
    public Date b;
    public Date c;
    public Long d;
    public Long e;
    public Float f;
    public Float g;
    public Boolean h;
    public Boolean i;
    public Integer j;
    public Integer k;
    public Long l;
    public vti m;

    @Override // defpackage.vtg
    /* renamed from: b */
    public final cxd a() {
        this.a.getClass();
        this.m.getClass();
        cxd cxdVar = new cxd();
        cxe cxeVar = new cxe();
        Long l = this.e;
        if (l != null) {
            cxeVar.l(l.longValue());
        }
        Float f = this.f;
        if (f != null) {
            cxeVar.f = f.floatValue();
        }
        Float f2 = this.g;
        if (f2 != null) {
            cxeVar.g = f2.floatValue();
        }
        Boolean bool = this.h;
        if (bool != null) {
            cxeVar.m(bool.booleanValue());
        }
        Boolean bool2 = this.i;
        if (bool2 != null) {
            cxeVar.n(bool2.booleanValue());
        }
        Date date = this.b;
        if (date != null) {
            cxeVar.k(date);
        }
        Date date2 = this.c;
        if (date2 != null) {
            cxeVar.o(date2);
        }
        cxdVar.w(cxeVar);
        cwh cwhVar = new cwh();
        cwi cwiVar = new cwi();
        Date date3 = this.b;
        if (date3 != null) {
            cwiVar.a = date3;
        }
        Long l2 = this.d;
        if (l2 != null) {
            cwiVar.c = l2.longValue();
        }
        Long l3 = this.e;
        if (l3 != null) {
            cwiVar.d = l3.longValue();
        }
        Date date4 = this.c;
        if (date4 != null) {
            cwiVar.b = date4;
        }
        cwhVar.w(cwiVar);
        cwf cwfVar = new cwf();
        cwfVar.a = this.a.c;
        cwfVar.b = "VideoHandler";
        cwhVar.w(cwfVar);
        cwj cwjVar = new cwj();
        cwjVar.w((cvr) this.a.d.get());
        axiw axiwVar = new axiw();
        cvz cvzVar = new cvz();
        cvy cvyVar = new cvy();
        cvyVar.r = 1;
        cvzVar.w(cvyVar);
        axiwVar.w(cvzVar);
        cwjVar.w(axiwVar);
        cwr cwrVar = new cwr();
        cwp cwpVar = new cwp();
        vti vtiVar = this.m;
        cyc cycVar = new cyc("mp4v");
        Integer num = vtiVar.a;
        if (num != null) {
            cycVar.b = num.intValue();
        }
        Integer num2 = vtiVar.b;
        if (num2 != null) {
            cycVar.c = num2.intValue();
        }
        axka axkaVar = new axka();
        axki axkiVar = new axki();
        axkiVar.a = 1;
        axkf axkfVar = new axkf();
        axkfVar.a = 108;
        axkfVar.b = 4;
        Integer num3 = vtiVar.c;
        if (num3 != null) {
            axkfVar.e = num3.intValue();
        }
        Integer num4 = vtiVar.d;
        if (num4 != null) {
            axkfVar.f = num4.intValue();
        }
        axkiVar.j = axkfVar;
        axko axkoVar = new axko();
        axkoVar.b();
        axkiVar.k = axkoVar;
        axkaVar.a = axkiVar;
        ((axjz) axkaVar).b = axkiVar.d();
        cycVar.w(axkaVar);
        axjy axjyVar = new axjy();
        axjyVar.a = 1;
        axjyVar.b = 1;
        cycVar.w(axjyVar);
        cwpVar.w(cycVar);
        cwrVar.w(cwpVar);
        cxc cxcVar = new cxc();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new cxb(1L, this.j.intValue()));
        cxcVar.b = arrayList;
        cwrVar.w(cxcVar);
        cwt cwtVar = new cwt();
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(new cws(1L, 1L, 1L));
        cwtVar.a = arrayList2;
        cwrVar.w(cwtVar);
        cwq cwqVar = new cwq();
        Integer num5 = this.k;
        if (num5 != null) {
            cwqVar.a = new long[]{num5.intValue()};
        }
        cwrVar.w(cwqVar);
        cwv cwvVar = new cwv();
        Long l4 = this.l;
        if (l4 != null) {
            cwvVar.a = new long[]{l4.longValue()};
        }
        cwrVar.w(cwvVar);
        cwjVar.w(cwrVar);
        cwhVar.w(cwjVar);
        cxdVar.w(cwhVar);
        return cxdVar;
    }
}
