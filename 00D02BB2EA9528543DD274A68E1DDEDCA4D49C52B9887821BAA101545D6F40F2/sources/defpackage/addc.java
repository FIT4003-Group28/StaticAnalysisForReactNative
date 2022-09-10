package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: addc  reason: default package */
/* loaded from: classes2.dex */
public class addc extends aczs implements adda {
    private final dxio<brba> a;
    private final dxio<bwjz> b;
    private final acwt c;
    private final Activity d;
    private final List<addb> e;
    private final ddho f;
    private final ddho g;
    private List<addb> h;
    private String i = "";
    @dzsi
    private jic j;
    @dzsi
    private String k;
    private cjtd l;

    public addc(dxio<brba> dxioVar, dxio<bwjz> dxioVar2, acwt acwtVar, acyr acyrVar, Activity activity, absg absgVar) {
        ddho ddhoVar = absgVar == absg.AREA_EXPLORE ? dtxj.cf : dtxr.G;
        this.f = ddhoVar;
        this.g = absgVar == absg.AREA_EXPLORE ? dtxj.ck : dtxr.U;
        this.l = cjtd.a(ddhoVar);
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = acwtVar;
        this.d = activity;
        dsrj<dktw> dsrjVar = acyrVar.a().ag;
        ArrayList arrayList = new ArrayList();
        for (dktw dktwVar : dsrjVar) {
            int i = dktwVar.a;
            if ((i & 1) != 0 && (i & 4) != 0) {
                dqfk bZ = dqfo.j.bZ();
                String str = dktwVar.b;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dqfo dqfoVar = (dqfo) bZ.b;
                str.getClass();
                int i2 = dqfoVar.a | 4;
                dqfoVar.a = i2;
                dqfoVar.e = str;
                String str2 = dktwVar.b;
                str2.getClass();
                dqfoVar.b = 2;
                dqfoVar.c = str2;
                String str3 = dktwVar.c;
                str3.getClass();
                dqfoVar.a = i2 | 128;
                dqfoVar.f = str3;
                addb k = k(bZ.bK());
                if (k != null) {
                    arrayList.add(k);
                }
            }
        }
        this.e = arrayList;
        this.h = arrayList;
    }

    private final void l(awwb awwbVar) {
        dvha dvhaVar = (dvha) awwbVar.a(awvv.a).f();
        if (dvhaVar != null) {
            this.i = dvhaVar.d;
            dvhm dvhmVar = dvhaVar.f;
            if (dvhmVar == null) {
                dvhmVar = dvhm.d;
            }
            this.j = new jic(dvhmVar.a, ckqc.FULLY_QUALIFIED, 0);
            dvhm dvhmVar2 = dvhaVar.f;
            if (dvhmVar2 == null) {
                dvhmVar2 = dvhm.d;
            }
            this.k = dvhmVar2.b;
        }
    }

    @Override // defpackage.adda
    public List<? extends adfr> a() {
        return this.h;
    }

    @Override // defpackage.adda
    public String b() {
        if (this.i.isEmpty()) {
            return this.d.getString(R.string.EXPLORE_GUIDE_DEFAULT_TITLE);
        }
        return this.d.getString(R.string.EXPLORE_GUIDE_TITLE, new Object[]{this.i});
    }

    @Override // defpackage.adda
    @dzsi
    public jic c() {
        return this.j;
    }

    @Override // defpackage.aczr
    public cjtd e() {
        return this.l;
    }

    @Override // defpackage.adda
    @dzsi
    public String f() {
        return this.k;
    }

    public boolean g() {
        return !this.h.isEmpty();
    }

    public void h(awwb awwbVar) {
        addb k;
        Object obj;
        if (awwbVar.c(awvv.b).b()) {
            return;
        }
        if (!awwbVar.c(awvv.a).b()) {
            l(awwbVar);
        }
        dqfq dqfqVar = (dqfq) awwbVar.a(awvv.b).f();
        if (dqfqVar == null) {
            this.h = this.e;
            this.l = cjtd.a(this.f);
            return;
        }
        List<addb> list = this.h;
        ArrayList arrayList = new ArrayList(dqfqVar.f);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            addb addbVar = list.get(i);
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i2);
                i2++;
                if (addbVar.d(obj)) {
                    break;
                }
            }
            if (obj != null) {
                addbVar.e(obj);
                arrayList2.add(addbVar);
                arrayList.remove(obj);
            } else if (addbVar.c()) {
                arrayList2.add(addbVar);
            } else {
                arrayList3.add(Integer.valueOf(i));
            }
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Object obj2 = arrayList.get(i3);
            if (obj2 != null && (k = k((dqfo) obj2)) != null) {
                if (!arrayList3.isEmpty()) {
                    arrayList2.add(((Integer) arrayList3.remove(0)).intValue(), k);
                } else {
                    arrayList2.add(k);
                }
            }
        }
        this.h = arrayList2;
        cjta b = cjtd.b();
        b.g(dqfqVar.b);
        b.d = this.f;
        this.l = b.a();
    }

    public void j(awwb awwbVar) {
        this.h = this.e;
        this.i = "";
        this.j = null;
        this.k = null;
        this.l = cjtd.a(this.f);
        l(awwbVar);
        dqfq dqfqVar = (dqfq) awwbVar.a(awvv.b).f();
        if (dqfqVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (dqfo dqfoVar : dqfqVar.f) {
            addb k = k(dqfoVar);
            if (k != null) {
                arrayList.add(k);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        cjta b = cjtd.b();
        b.g(dqfqVar.b);
        b.d = this.f;
        this.l = b.a();
        this.h = arrayList;
    }

    @dzsi
    final addb k(dqfo dqfoVar) {
        if (dqfoVar.e.isEmpty() || dqfoVar.f.isEmpty()) {
            return null;
        }
        if ((dqfoVar.b == 2 ? (String) dqfoVar.c : "").isEmpty()) {
            return null;
        }
        cjta b = cjtd.b();
        b.g(dqfoVar.d);
        b.d = this.g;
        return new addb(this.a, this.b, this.c, dqfoVar, b.a());
    }
}
