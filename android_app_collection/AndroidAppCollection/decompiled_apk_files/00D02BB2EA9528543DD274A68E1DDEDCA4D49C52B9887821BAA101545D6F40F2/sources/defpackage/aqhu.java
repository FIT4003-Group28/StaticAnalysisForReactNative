package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: aqhu  reason: default package */
/* loaded from: classes2.dex */
public class aqhu implements aqhr {
    private final Activity a;
    private int f = 0;
    private aqht g = aqhs.a;
    private final HashMap<Integer, hxy> b = new HashMap<>();
    private final HashMap<Integer, String> c = new HashMap<>();
    private final HashMap<Integer, String> d = new HashMap<>();
    private final HashMap<Integer, cjtd> e = new HashMap<>();

    public aqhu(Activity activity, cqhn cqhnVar) {
        this.a = activity;
    }

    @Override // defpackage.aqhr
    public Integer a() {
        return Integer.valueOf(this.f);
    }

    @Override // defpackage.aqhr
    public String b(int i) {
        return dbsj.e(this.c.get(Integer.valueOf(i)));
    }

    @Override // defpackage.aqhr
    public String c(int i) {
        String e = dbsj.e(this.c.get(Integer.valueOf(i)));
        return i == this.f ? this.a.getString(R.string.ACCESSIBILITY_SELECTED_TOGGLE, new Object[]{e}) : e;
    }

    @Override // defpackage.aqhr
    public cqkl d(int i) {
        if (this.f != i) {
            this.f = i;
            this.g.a();
            cqkx.p(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.aqhr
    @dzsi
    public hxy e(int i) {
        return this.b.get(Integer.valueOf(i));
    }

    @Override // defpackage.aqhr
    public String f(int i) {
        return dbsj.e(this.d.get(Integer.valueOf(i)));
    }

    @Override // defpackage.aqhr
    @dzsi
    public cjtd g(int i) {
        return this.e.get(Integer.valueOf(i));
    }

    public void h(int i, String str) {
        this.c.put(Integer.valueOf(i), str);
        cqkx.p(this);
    }

    public void i(int i) {
        d(i);
    }

    public void j(int i, @dzsi hxy hxyVar) {
        HashMap<Integer, hxy> hashMap = this.b;
        Integer valueOf = Integer.valueOf(i);
        if (dbsd.a(hashMap.get(valueOf), hxyVar)) {
            return;
        }
        if (hxyVar != null) {
            this.b.put(valueOf, hxyVar);
        } else {
            this.b.remove(valueOf);
        }
        cqkx.p(this);
    }

    public void k(int i, String str) {
        this.d.put(Integer.valueOf(i), str);
        cqkx.p(this);
    }

    public void l(int i, cjtd cjtdVar) {
        this.e.put(Integer.valueOf(i), cjtdVar);
    }

    public void m(aqht aqhtVar) {
        this.g = aqhtVar;
    }
}
