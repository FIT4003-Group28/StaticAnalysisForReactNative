package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.maps.R;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bido  reason: default package */
/* loaded from: classes3.dex */
public class bido implements bicv, bega {
    private static final dcqe b = dcqe.c("bido");
    private static int c;
    public bwrs<ilo> a;
    private final gga d;
    private final btvo e;
    private final ania f;
    private final bidl g;
    private final jht h;
    private final dxio<afha> i;
    private List<bicw> j;

    public bido(gga ggaVar, btvo btvoVar, ania aniaVar, bidl bidlVar, dxio<afha> dxioVar) {
        this.d = ggaVar;
        this.e = btvoVar;
        this.f = aniaVar;
        this.g = bidlVar;
        this.i = dxioVar;
        jhu h = jhv.h();
        ((jhi) h).e = ggaVar.getString(R.string.CONTACTS_CARD_OVERFLOW_CONTENT_DESCRIPTION);
        jhm jhmVar = new jhm();
        jhmVar.l = R.string.LEARN_MORE;
        jhmVar.a = ggaVar.getText(R.string.LEARN_MORE);
        jhmVar.d(new bidm(this));
        h.d(jhmVar.c());
        this.h = h.b();
        this.a = bwrs.a(null);
        this.j = new ArrayList();
    }

    @Override // defpackage.bicv
    public List<bicw> a() {
        return this.j;
    }

    @Override // defpackage.bicv
    public CharSequence b() {
        return this.d.getText(R.string.FROM_GOOGLE_CONTACTS);
    }

    @Override // defpackage.bicv
    public CharSequence c() {
        return this.d.getText(R.string.PERSONAL_VISIBLE_ONLY_TO_YOU);
    }

    @Override // defpackage.bicv
    public jht d() {
        return this.h;
    }

    public final void e() {
        String j = cjxr.j(this.e);
        try {
            this.i.a().f(this.d, Intent.parseUri(j, 1), 4);
        } catch (URISyntaxException unused) {
            bvoo.h("Failed to parse gmm help center link: %s", j);
        }
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        bido bidoVar = this;
        bidoVar.a = bwrsVar;
        ArrayList arrayList = new ArrayList();
        if (bidoVar.f.a()) {
            ilo c2 = bidoVar.a.c();
            dbsk.s(c2);
            List<azvo> list = c2.F;
            int i = 5;
            if (list.size() <= 5) {
                c = list.size();
            } else {
                c = 5;
            }
            bidn bidnVar = new bidn(bidoVar, list);
            int i2 = 0;
            while (i2 < c) {
                bidl bidlVar = bidoVar.g;
                azvo azvoVar = list.get(i2);
                bwrs<ilo> bwrsVar2 = bidoVar.a;
                Activity activity = (Activity) ((dxjd) bidlVar.a).a;
                bidl.a(activity, 1);
                axrx a = bidlVar.b.a();
                bidl.a(a, 2);
                axru a2 = bidlVar.c.a();
                bidl.a(a2, 3);
                axwq a3 = bidlVar.d.a();
                bidl.a(a3, 4);
                ckcw a4 = bidlVar.e.a();
                bidl.a(a4, i);
                akfa a5 = bidlVar.f.a();
                bidl.a(a5, 6);
                bvrb a6 = bidlVar.g.a();
                List<azvo> list2 = list;
                bidl.a(a6, 7);
                dxio a7 = ((dxjh) bidlVar.h).a();
                bidl.a(a7, 8);
                bidl.a(azvoVar, 9);
                bidl.a(bwrsVar2, 10);
                bidl.a(bidnVar, 11);
                arrayList.add(new bidk(activity, a, a2, a3, a4, a5, a6, a7, azvoVar, bwrsVar2, bidnVar));
                i2++;
                i = 5;
                bidoVar = this;
                list = list2;
            }
            bidoVar = this;
        }
        bidoVar.j = arrayList;
    }

    @Override // defpackage.bega
    public void u() {
    }

    @Override // defpackage.bega
    public Boolean w() {
        boolean z = false;
        if (this.f.a()) {
            ilo c2 = this.a.c();
            dbsk.s(c2);
            if (c2.bl()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
