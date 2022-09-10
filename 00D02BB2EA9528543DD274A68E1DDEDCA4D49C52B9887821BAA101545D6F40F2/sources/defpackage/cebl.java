package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cebl  reason: default package */
/* loaded from: classes4.dex */
public class cebl implements cebg {
    private final List<cebj> a = new ArrayList();
    private final Activity b;
    private int c;

    public cebl(Activity activity, cebk cebkVar, bbtu bbtuVar, bwrs<ilo> bwrsVar, cdjd cdjdVar, cebe cebeVar) {
        cebk cebkVar2 = cebkVar;
        this.b = activity;
        int size = cdjdVar.c().a().size();
        dcdc<cdji> a = cdjdVar.c().a();
        int size2 = a.size();
        int i = 0;
        while (i < size2) {
            cdji cdjiVar = a.get(i);
            bbtm a2 = cdjiVar.a(bbtuVar);
            String b = cdjiVar.b();
            int size3 = this.a.size();
            cebk.a(a2, 1);
            cebk.a(b, 2);
            cebk.a(bwrsVar, 5);
            cebk.a(cebeVar, 6);
            dxio a3 = ((dxjh) cebkVar2.a).a();
            cebk.a(a3, 7);
            gga a4 = cebkVar2.b.a();
            cebk.a(a4, 8);
            bwqv a5 = cebkVar2.c.a();
            cebk.a(a5, 9);
            btvo a6 = cebkVar2.d.a();
            cebk.a(a6, 10);
            this.a.add(new cebj(a2, b, size3, size, bwrsVar, cebeVar, a3, a4, a5, a6));
            i++;
            size = size;
            cebkVar2 = cebkVar;
        }
    }

    @Override // defpackage.cebg
    public Integer a() {
        return Integer.valueOf(this.a.size());
    }

    @Override // defpackage.cebg
    @dzsi
    public cebf b(int i) {
        if (i < 0 || i >= this.a.size()) {
            return null;
        }
        return this.a.get(i);
    }

    @Override // defpackage.cebg
    @dzsi
    public String c(int i) {
        if (this.a.size() <= i) {
            return null;
        }
        return String.format(Locale.US, "+%d", Integer.valueOf(this.a.size() - i));
    }

    @Override // defpackage.cebg
    @dzsi
    public String d() {
        int i = this.c;
        if (i > 0) {
            return this.b.getString(R.string.REVIEW_WITH_ORDINAL_PREFIX, new Object[]{Integer.valueOf(i)});
        }
        return null;
    }

    public void e(int i) {
        this.c = i;
    }

    public boolean equals(@dzsi Object obj) {
        if (!(obj instanceof cebl)) {
            return false;
        }
        return dbsd.a(this.a, ((cebl) obj).a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
