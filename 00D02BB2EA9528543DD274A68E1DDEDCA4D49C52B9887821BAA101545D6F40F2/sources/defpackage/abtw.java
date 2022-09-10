package defpackage;

import android.app.Activity;
import android.text.Spannable;
import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: abtw  reason: default package */
/* loaded from: classes2.dex */
public class abtw implements abjt {
    private final CharSequence a;
    private final cklf b;

    public abtw(Activity activity, cklf cklfVar, List<String> list) {
        int i;
        dcdc z = dcbg.b(list).o(dbst.a(dbst.c(""))).z();
        dbsk.a(!z.isEmpty());
        final bvsx bvsxVar = new bvsx(activity.getResources());
        List z2 = dcbg.b(z).s(new dbrn(bvsxVar) { // from class: abtv
            private final bvsx a;

            {
                this.a = bvsxVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bvsv a = this.a.a((String) obj);
                a.i();
                a.n();
                return a.c();
            }
        }).z();
        int size = z.size();
        if (size == 1) {
            i = R.string.EXPLORE_LOCATION_DISCLAIMER_ONE_MODULE;
        } else if (size == 2) {
            i = R.string.EXPLORE_LOCATION_DISCLAIMER_TWO_MODULES;
        } else if (size != 3) {
            Spannable[] spannableArr = new Spannable[1];
            bvsv a = bvsxVar.a("");
            for (int i2 = 0; i2 < z2.size(); i2++) {
                if (i2 > 0) {
                    a.g(", ");
                }
                a.g((CharSequence) z2.get(i2));
            }
            spannableArr[0] = a.c();
            z2 = Arrays.asList(spannableArr);
            i = R.string.EXPLORE_LOCATION_DISCLAIMER_MANY_MODULES;
        } else {
            i = R.string.EXPLORE_LOCATION_DISCLAIMER_THREE_MODULES;
        }
        bvsu c = bvsxVar.c(i);
        c.a(z2.toArray());
        this.a = c.c();
        this.b = cklfVar;
    }

    @Override // defpackage.abjt
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.abjt
    public cqkl b() {
        this.b.a("location_history");
        return cqkl.a;
    }
}
