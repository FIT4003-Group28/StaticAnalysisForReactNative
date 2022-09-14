package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.google.android.apps.maps.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aayz  reason: default package */
/* loaded from: classes2.dex */
public class aayz implements aayw {
    private final Activity a;
    private final dxio<afha> b;
    private final bvpe c;
    private final huc d;
    private final aazb e;
    private final iic f;
    private iid g;
    private diwb h;
    private String i;
    @dzsi
    private String j;
    @dzsi
    private String k;

    public aayz(Activity activity, dxio<afha> dxioVar, bvpe bvpeVar, huc hucVar, aazb aazbVar) {
        this.a = activity;
        this.b = dxioVar;
        this.c = bvpeVar;
        this.d = hucVar;
        this.e = aazbVar;
        iic j = iid.j();
        j.e(dcdc.e());
        this.f = j;
        this.g = j.f();
    }

    @Override // defpackage.aayw
    public iib a() {
        return this.g;
    }

    @Override // defpackage.aayw
    public CharSequence b() {
        return dbsj.d(this.k) ? this.a.getString(R.string.EXPERIENCE_SHEET_TOP_STORIES_TITLE) : this.k;
    }

    @Override // defpackage.aakt
    public Boolean c() {
        return Boolean.valueOf(!this.g.a().isEmpty());
    }

    @Override // defpackage.aayw
    public Boolean d() {
        return Boolean.valueOf(this.j != null);
    }

    @Override // defpackage.aayw
    public cqkl e() {
        if (this.j != null) {
            Activity activity = this.a;
            String str = this.j;
            dbsk.s(str);
            this.b.a().l(activity, Uri.parse(str), 2);
        }
        return cqkl.a;
    }

    @Override // defpackage.aayw
    public cjtd f() {
        cjta b = cjtd.b();
        b.d = dtxo.ci;
        b.g(this.i);
        return b.a();
    }

    public final cjtd g() {
        cjta b = cjtd.b();
        b.d = dtxo.cg;
        b.g(this.i);
        return b.a();
    }

    public void h(diwb diwbVar) {
        String str;
        if (diwbVar.equals(this.h)) {
            return;
        }
        this.h = diwbVar;
        ditt dittVar = diwbVar.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        this.i = dittVar.b;
        dccx F = dcdc.F();
        divw divwVar = this.h.S;
        if (divwVar == null) {
            divwVar = divw.e;
        }
        Iterator<divv> it = divwVar.b.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            divv next = it.next();
            aayv aayvVar = new aayv();
            aazb aazbVar = this.e;
            String str2 = this.i;
            String str3 = next.b;
            String str4 = next.c;
            if ((next.a & 32) != 0) {
                str = next.f;
            }
            String str5 = str;
            String str6 = next.d;
            String str7 = next.e;
            Activity activity = (Activity) ((dxjd) aazbVar.a).a;
            aazb.a(activity, 1);
            dxio a = ((dxjh) aazbVar.b).a();
            aazb.a(a, 2);
            aazb.a(str2, 3);
            aazb.a(str3, 4);
            aazb.a(str4, 5);
            aazb.a(str6, 7);
            aazb.a(str7, 8);
            F.g(cqgr.fT(aayvVar, new aaza(activity, a, str2, str3, str4, str5, str6, str7)));
        }
        iic iicVar = this.f;
        iicVar.e(F.f());
        ifj ifjVar = (ifj) iicVar;
        ifjVar.e = new bvob(this.c.b, this.d.a(new htz(this) { // from class: aayy
            private final aayz a;

            {
                this.a = this;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a.g();
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        }));
        ifjVar.f = g();
        this.g = this.f.f();
        divw divwVar2 = this.h.S;
        if (divwVar2 == null) {
            divwVar2 = divw.e;
        }
        if ((divwVar2.a & 1) != 0) {
            divw divwVar3 = this.h.S;
            if (divwVar3 == null) {
                divwVar3 = divw.e;
            }
            str = divwVar3.c;
        }
        this.j = str;
        divw divwVar4 = this.h.S;
        if (divwVar4 == null) {
            divwVar4 = divw.e;
        }
        this.k = divwVar4.d;
    }
}
