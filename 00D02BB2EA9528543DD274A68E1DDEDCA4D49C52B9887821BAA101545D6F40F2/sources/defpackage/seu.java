package defpackage;

import android.app.Application;
import android.content.Context;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: seu  reason: default package */
/* loaded from: classes7.dex */
public class seu implements sas {
    public final set a;
    public final cjqb b;
    public int c;
    private final Context d;
    private final String e;
    private final List<sat> f;
    private final cjtd g;
    private Boolean h;
    private int i;
    private final cqkn<sat> j;
    private final cqqw k;

    public seu(Application application, cjqy cjqyVar, cqat cqatVar, String str, set setVar, @dzsi View.AccessibilityDelegate accessibilityDelegate, ddho ddhoVar, ddho ddhoVar2) {
        cqkn<sat> cqknVar = ser.a;
        this.j = cqknVar;
        this.k = new ses(this);
        this.d = application;
        this.e = str;
        this.h = false;
        this.a = setVar;
        ArrayList arrayList = new ArrayList();
        eapi eapiVar = eapi.a;
        for (int i = 0; i < eaow.a(1L).f() / 15; i++) {
            cjta b = cjtd.b();
            b.d = ddhoVar2;
            b.i(i);
            arrayList.add(new sew(eapiVar, cqknVar, accessibilityDelegate, b.a()));
            eapiVar = eapiVar.b(eapiVar.c.r().e(eapiVar.b, 15));
        }
        this.f = arrayList;
        cjtd a = cjtd.a(ddhoVar);
        this.g = a;
        this.b = new cjqb(cqatVar, cjqyVar, a);
    }

    @Override // defpackage.sas
    public String a() {
        return this.e;
    }

    @Override // defpackage.sas
    public Boolean b() {
        return this.h;
    }

    @Override // defpackage.sas
    public String c() {
        bvsi bvsiVar = new bvsi(this.d);
        bvsiVar.c(this.e);
        bvsiVar.c(this.d.getString(R.string.HORIZONTAL_LIST_HINT));
        return bvsiVar.toString();
    }

    @Override // defpackage.sas
    public sat d() {
        return this.f.get(this.i);
    }

    @Override // defpackage.sas
    public List<sat> e() {
        return this.f;
    }

    @Override // defpackage.sas
    public cqqw f() {
        return this.k;
    }

    @Override // defpackage.sas
    public cjtd g() {
        return this.g;
    }

    @Override // defpackage.sas
    public void h(dngu dnguVar) {
        for (sat satVar : this.f) {
            if (dnguVar.b == satVar.b().c() && dnguVar.c == satVar.b().d()) {
                i(this.f.indexOf(satVar));
            }
        }
    }

    public void i(int i) {
        for (sat satVar : e()) {
            satVar.d(false);
        }
        this.i = i;
        e().get(i).d(true);
    }

    public void j(Boolean bool) {
        this.h = bool;
    }

    public sat k() {
        return this.f.get(this.c);
    }
}
