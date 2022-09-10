package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: beuo  reason: default package */
/* loaded from: classes3.dex */
public class beuo implements beun {
    private final dzsj<beuq> a;
    private final List<bevm> b = new ArrayList();
    private final cjta c;
    private final Activity d;
    private boolean e;

    public beuo(dzsj<beuq> dzsjVar, Activity activity, bevy bevyVar) {
        cjta b = cjtd.b();
        b.d = dtxy.is;
        this.c = b;
        this.a = dzsjVar;
        this.d = activity;
    }

    @Override // defpackage.beun
    public bevj a(int i) {
        return this.b.get(i);
    }

    @Override // defpackage.beun
    @dzsi
    public bevx b() {
        return null;
    }

    @Override // defpackage.beun
    public int c() {
        return this.b.size();
    }

    @Override // defpackage.beun
    public cjtd d() {
        return this.c.a();
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        dnjf ad;
        int a;
        int i = 0;
        this.e = false;
        this.b.clear();
        ilo c = bwrsVar.c();
        if (c == null || (ad = c.ad()) == null || (a = dnje.a(ad.a)) == 0 || a != 2 || ad.b.size() != 1) {
            return;
        }
        this.c.g(ad.c);
        if (!this.a.a().a()) {
            return;
        }
        dsrj<dngk> dsrjVar = ad.b.get(0).c;
        while (i < dsrjVar.size()) {
            this.b.add(new bevm(dsrjVar.get(i), this.d, i, this.a.a().c(), false, null, ad.c, dtxo.an, dtxo.ap, dtxo.ao));
            i++;
            ad = ad;
        }
        this.a.a().a.a().l();
        this.e = !this.b.isEmpty();
    }

    @Override // defpackage.bega
    public void u() {
        this.e = false;
        this.b.clear();
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.e);
    }
}
