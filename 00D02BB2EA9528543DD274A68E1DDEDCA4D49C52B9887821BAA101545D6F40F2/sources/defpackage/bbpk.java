package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bbpk  reason: default package */
/* loaded from: classes3.dex */
public class bbpk implements bbnj {
    public final bbnc a;
    public final Executor b;
    public final Activity c;
    @dzsi
    public bbmn d = null;
    @dzsi
    public List<bbni> e;
    private final cqhn f;

    public bbpk(bbnc bbncVar, cqhn cqhnVar, Executor executor, Activity activity) {
        this.a = bbncVar;
        this.f = cqhnVar;
        this.b = executor;
        this.c = activity;
    }

    @Override // defpackage.bbnj
    public Boolean a() {
        return Boolean.valueOf(this.d == null);
    }

    @Override // defpackage.bbnj
    public List<bbni> b() {
        List<bbni> list = this.e;
        if (list != null) {
            return list;
        }
        if (this.d == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        dcdc<bbmo> b = this.d.b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new bbpi(this, b.get(i), this.b));
        }
        this.e = arrayList;
        return arrayList;
    }

    public void c(bbmn bbmnVar) {
        this.d = bbmnVar;
        cqkx.p(this);
    }
}
