package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bkom  reason: default package */
/* loaded from: classes3.dex */
public class bkom implements bnia, bega {
    private final List<jba> a = dchl.a();
    private final dxio<begg> b;
    private final bnjv c;
    private final String d;

    public bkom(Activity activity, dxio<begg> dxioVar, bnjv bnjvVar) {
        this.b = dxioVar;
        this.c = bnjvVar;
        this.d = activity.getString(R.string.AT_THIS_ADDRESS);
    }

    @Override // defpackage.bnia
    @Deprecated
    public Boolean a() {
        return w();
    }

    @Override // defpackage.bnia
    public List<jba> b() {
        return this.a;
    }

    @Override // defpackage.bnia
    public String c() {
        return this.d;
    }

    @Override // defpackage.bnia
    @dzsi
    public cjtd d() {
        return null;
    }

    @Override // defpackage.bnia
    public Boolean e() {
        return false;
    }

    @Override // defpackage.bnia
    @dzsi
    public String f() {
        return null;
    }

    @Override // defpackage.bnia
    @dzsi
    public cjtd g() {
        return null;
    }

    @Override // defpackage.bnia
    @dzsi
    public cjtd h() {
        return null;
    }

    @Override // defpackage.bnia
    public cqkl l(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.bnia
    public Boolean m() {
        return true;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        if (c == null) {
            u();
            return;
        }
        dcdc<ilo> H = c.H();
        int size = H.size();
        for (int i = 0; i < size; i++) {
            ilo iloVar = H.get(i);
            List<jba> list = this.a;
            bnjs a = this.c.a(iloVar);
            a.a = new bkol(this.b.a(), iloVar);
            cjta c2 = cjtd.c(iloVar.a());
            c2.d = dtxj.dw;
            a.n = c2.a();
            list.add(a.a());
        }
    }

    @Override // defpackage.bega
    public void u() {
        this.a.clear();
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(!b().isEmpty());
    }
}
