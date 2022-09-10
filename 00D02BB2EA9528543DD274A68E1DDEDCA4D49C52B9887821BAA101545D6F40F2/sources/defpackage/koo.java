package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: koo  reason: default package */
/* loaded from: classes7.dex */
public class koo implements koh {
    private final Context a;
    private final noo b;
    private final List<cqix<?>> c;

    public koo(Context context, noo nooVar, List<doew> list) {
        this.a = context;
        this.b = nooVar;
        dcdc z = dcbg.b(list).s(kol.a).o(kom.a).z();
        dccx F = dcdc.F();
        int i = 0;
        while (i < z.size()) {
            F.g(cqgr.fT(new knm(), new kon((String) z.get(i), i == z.size() + (-1))));
            i++;
        }
        this.c = F.f();
    }

    @Override // defpackage.koh
    public String a() {
        return this.a.getString(R.string.CAR_EV_PAYMENT_METHODS_TITLE);
    }

    @Override // defpackage.koh
    public List<cqix<?>> b() {
        return this.c;
    }

    @Override // defpackage.koh
    public cqkl c() {
        this.b.b();
        return cqkl.a;
    }
}
