package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ueu  reason: default package */
/* loaded from: classes4.dex */
public final class ueu implements uep {
    static final List a = Arrays.asList(aojw.SHOWN, aojw.SHOWN_REPLACED, aojw.SHOWN_FORCED);
    private final uee A;
    public final aojw b;
    public final aojs c;
    public final ucj d;
    public final ufv e;
    public final ufu f;
    public final uhe g;
    public Long r;
    public final Long s;
    public final int u;
    public final ues z;
    public String h = null;
    public int v = 0;
    public final List i = new ArrayList();
    public int w = 0;
    public aojl j = null;
    public uiu k = null;
    public String l = null;
    public String m = null;
    public aojd n = null;
    public uhb o = null;
    public uhd p = null;
    public final List q = new ArrayList();
    public uer t = null;
    public int x = 0;
    public int y = 0;

    public ueu(ues uesVar, snc sncVar, aojw aojwVar, int i, aojs aojsVar, ucj ucjVar, ufv ufvVar, ufu ufuVar, uhe uheVar, uee ueeVar) {
        this.z = uesVar;
        this.b = aojwVar;
        this.u = i;
        this.c = aojsVar;
        this.d = ucjVar;
        this.e = ufvVar;
        this.f = ufuVar;
        this.g = uheVar;
        this.A = ueeVar;
        this.r = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(sncVar.c()));
        this.s = Long.valueOf(sncVar.d());
    }

    @Override // defpackage.uep
    public final uep a(String str) {
        uhb uhbVar;
        Iterator it = this.g.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                uhbVar = null;
                break;
            }
            uhbVar = (uhb) it.next();
            if (uhbVar.a.equals(str)) {
                break;
            }
        }
        this.o = uhbVar;
        return this;
    }

    @Override // defpackage.uep
    public final uep b(ucw ucwVar) {
        List list = this.q;
        aopa createBuilder = aoiu.a.createBuilder();
        String str = ucwVar.a;
        createBuilder.copyOnWrite();
        aoiu aoiuVar = (aoiu) createBuilder.instance;
        str.getClass();
        aoiuVar.b |= 1;
        aoiuVar.c = str;
        long longValue = ucwVar.b.longValue();
        createBuilder.copyOnWrite();
        aoiu aoiuVar2 = (aoiu) createBuilder.instance;
        aoiuVar2.b |= 2;
        aoiuVar2.d = longValue;
        long longValue2 = ucwVar.f.longValue();
        createBuilder.copyOnWrite();
        aoiu aoiuVar3 = (aoiu) createBuilder.instance;
        aoiuVar3.b |= 4;
        aoiuVar3.e = longValue2;
        String str2 = ucwVar.j;
        createBuilder.copyOnWrite();
        aoiu aoiuVar4 = (aoiu) createBuilder.instance;
        str2.getClass();
        aoiuVar4.b |= 8;
        aoiuVar4.f = str2;
        aolv aolvVar = ucwVar.d.o;
        if (aolvVar == null) {
            aolvVar = aolv.a;
        }
        String str3 = aolvVar.b;
        createBuilder.copyOnWrite();
        aoiu aoiuVar5 = (aoiu) createBuilder.instance;
        str3.getClass();
        aoiuVar5.b |= 16;
        aoiuVar5.g = str3;
        list.add((aoiu) createBuilder.mo39build());
        return this;
    }

    @Override // defpackage.uep
    public final uep c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((ucw) it.next());
        }
        return this;
    }

    @Override // defpackage.uep
    public final uep d(ucp ucpVar) {
        if (ucpVar != null) {
            this.l = ucpVar.b;
            this.m = ucpVar.c;
        }
        return this;
    }

    @Override // defpackage.uep
    public final uep e(aomd aomdVar) {
        aolz aolzVar;
        aolz aolzVar2;
        if (aomdVar != null && !TextUtils.isEmpty(aomdVar.d)) {
            List list = this.q;
            aopa createBuilder = aoiu.a.createBuilder();
            String str = aomdVar.d;
            createBuilder.copyOnWrite();
            aoiu aoiuVar = (aoiu) createBuilder.instance;
            str.getClass();
            aoiuVar.b |= 1;
            aoiuVar.c = str;
            long j = aomdVar.h;
            createBuilder.copyOnWrite();
            aoiu aoiuVar2 = (aoiu) createBuilder.instance;
            aoiuVar2.b |= 2;
            aoiuVar2.d = j;
            long j2 = aomdVar.e;
            createBuilder.copyOnWrite();
            aoiu aoiuVar3 = (aoiu) createBuilder.instance;
            aoiuVar3.b |= 4;
            aoiuVar3.e = j2;
            if (aomdVar.b == 12) {
                aolzVar = (aolz) aomdVar.c;
            } else {
                aolzVar = aolz.a;
            }
            String str2 = aolzVar.n;
            createBuilder.copyOnWrite();
            aoiu aoiuVar4 = (aoiu) createBuilder.instance;
            str2.getClass();
            aoiuVar4.b |= 8;
            aoiuVar4.f = str2;
            if (aomdVar.b == 12) {
                aolzVar2 = (aolz) aomdVar.c;
            } else {
                aolzVar2 = aolz.a;
            }
            aolv aolvVar = aolzVar2.o;
            if (aolvVar == null) {
                aolvVar = aolv.a;
            }
            String str3 = aolvVar.b;
            createBuilder.copyOnWrite();
            aoiu aoiuVar5 = (aoiu) createBuilder.instance;
            str3.getClass();
            aoiuVar5.b |= 16;
            aoiuVar5.g = str3;
            list.add((aoiu) createBuilder.mo39build());
        }
        return this;
    }

    @Override // defpackage.uep
    public final uep f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((aomd) it.next());
        }
        return this;
    }

    @Override // defpackage.uep
    public final uep g(long j) {
        this.r = Long.valueOf(j);
        return this;
    }

    @Override // defpackage.uep
    public final uep h(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aolq aolqVar = (aolq) it.next();
            List list2 = this.q;
            aopa createBuilder = aoiu.a.createBuilder();
            String str = aolqVar.c;
            createBuilder.copyOnWrite();
            aoiu aoiuVar = (aoiu) createBuilder.instance;
            str.getClass();
            aoiuVar.b |= 1;
            aoiuVar.c = str;
            long j = aolqVar.d;
            createBuilder.copyOnWrite();
            aoiu aoiuVar2 = (aoiu) createBuilder.instance;
            aoiuVar2.b |= 2;
            aoiuVar2.d = j;
            long j2 = aolqVar.e;
            createBuilder.copyOnWrite();
            aoiu aoiuVar3 = (aoiu) createBuilder.instance;
            aoiuVar3.b |= 4;
            aoiuVar3.e = j2;
            list2.add((aoiu) createBuilder.mo39build());
        }
        return this;
    }

    @Override // defpackage.uep
    public final void i() {
        this.A.b(new Runnable() { // from class: uet
            /* JADX WARN: Removed duplicated region for block: B:109:0x0455  */
            /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1434
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.uet.run():void");
            }
        });
    }
}
