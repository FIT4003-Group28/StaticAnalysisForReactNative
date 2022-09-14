package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: anfi  reason: default package */
/* loaded from: classes2.dex */
public class anfi implements anfc {
    private final Activity b;
    private final aneg c;
    private final iol d;
    private final jam f;
    public anfb a = anfb.LOADING;
    private List<jbf> g = new ArrayList();
    private final jby e = new anfg();

    public anfi(Activity activity, aneg anegVar, iol iolVar, int i, Runnable runnable) {
        this.b = activity;
        this.c = anegVar;
        this.d = iolVar;
        this.f = new anfh(this, activity, runnable);
    }

    @Override // defpackage.anfc
    public Iterable<jbf> a() {
        return this.g;
    }

    @Override // defpackage.anfc
    public Boolean b() {
        return Boolean.valueOf(this.a == anfb.LOADING);
    }

    @Override // defpackage.anfc
    public jby c() {
        return this.e;
    }

    @Override // defpackage.anfc
    public cqkl d() {
        this.c.a(null);
        return cqkl.a;
    }

    @Override // defpackage.anfc
    public String e() {
        return this.b.getString(R.string.DROPPED_PIN_TEXT);
    }

    @Override // defpackage.anfc
    public cqtd f() {
        return iup.e(R.raw.dropped_pin);
    }

    @Override // defpackage.anfc
    public cjtd g() {
        return cjtd.a(dtxl.v);
    }

    @Override // defpackage.anfc
    @dzsi
    public jam h() {
        if (this.a == anfb.FAILURE) {
            return this.f;
        }
        return null;
    }

    public void i(List<ilo> list) {
        this.g = new ArrayList();
        for (ilo iloVar : list) {
            this.g.add(new anff(this.c, iloVar, this.d.g(iloVar)));
        }
    }

    public void j(anfb anfbVar) {
        this.a = anfbVar;
    }
}
