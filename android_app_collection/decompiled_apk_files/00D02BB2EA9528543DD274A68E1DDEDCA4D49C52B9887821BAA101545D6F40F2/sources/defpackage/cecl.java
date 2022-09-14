package defpackage;

import android.text.Spannable;
import com.google.android.apps.maps.R;
import java.text.NumberFormat;
/* compiled from: PG */
/* renamed from: cecl  reason: default package */
/* loaded from: classes4.dex */
class cecl implements oxj {
    private static final dcdn<dqwi, Integer> b;
    @dzsi
    private final CharSequence a;

    static {
        dcdg p = dcdn.p();
        p.f(dqwi.ROOMS, Integer.valueOf((int) R.string.ROOMS_ATTRIBUTE_TYPE_TEXT));
        p.f(dqwi.SERVICE, Integer.valueOf((int) R.string.SERVICE_ATTRIBUTE_TYPE_TEXT));
        p.f(dqwi.LOCATION, Integer.valueOf((int) R.string.LOCATION_ATTRIBUTE_TYPE_TEXT));
        b = dcjz.c(p.b());
    }

    public cecl(bvsx bvsxVar, dqwo dqwoVar) {
        dqxu dqxuVar;
        dqxu dqxuVar2;
        dqxu dqxuVar3;
        int i = dqwoVar.a;
        Spannable spannable = null;
        if ((i & 1) != 0 && (i & 2) != 0) {
            dqwm dqwmVar = dqwoVar.b;
            dqwmVar = dqwmVar == null ? dqwm.d : dqwmVar;
            dqwg dqwgVar = dqwoVar.c;
            dqwgVar = dqwgVar == null ? dqwg.c : dqwgVar;
            int a = dqwl.a(dqwmVar.c);
            if ((a == 0 ? 1 : a) - 1 == 1) {
                dqwi b2 = dqwi.b(dqwmVar.b);
                b2 = b2 == null ? dqwi.UNKNOWN_ATTRIBUTE_TYPE : b2;
                if (dqwgVar.a == 1) {
                    dqxuVar = (dqxu) dqwgVar.b;
                } else {
                    dqxuVar = dqxu.c;
                }
                if ((dqxuVar.a & 1) != 0) {
                    if (dqwgVar.a == 1) {
                        dqxuVar2 = (dqxu) dqwgVar.b;
                    } else {
                        dqxuVar2 = dqxu.c;
                    }
                    if (dqxuVar2.b != 0) {
                        NumberFormat numberFormat = NumberFormat.getInstance();
                        numberFormat.setMinimumFractionDigits(1);
                        numberFormat.setMaximumFractionDigits(1);
                        if (dqwgVar.a == 1) {
                            dqxuVar3 = (dqxu) dqwgVar.b;
                        } else {
                            dqxuVar3 = dqxu.c;
                        }
                        String format = numberFormat.format(dqxuVar3.b);
                        dcdn<dqwi, Integer> dcdnVar = b;
                        if (dcdnVar.containsKey(b2)) {
                            bvsu c = bvsxVar.c(dcdnVar.get(b2).intValue());
                            bvsw bvswVar = new bvsw();
                            bvswVar.c();
                            c.b(bvswVar);
                            c.a(format);
                            spannable = c.c();
                        }
                    }
                }
            }
        }
        this.a = spannable;
    }

    @Override // defpackage.oxj
    @dzsi
    public CharSequence a() {
        return this.a;
    }
}
