package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: yyg  reason: default package */
/* loaded from: classes7.dex */
public class yyg extends acoi implements yyc {
    private final String a;
    private final List<yyd> b;
    private final jam c;

    public yyg(Context context, djyo djyoVar, int i, @dzsi Runnable runnable) {
        this.a = djyoVar.e;
        dccx F = dcdc.F();
        dsrj<djym> dsrjVar = djyoVar.g;
        for (int i2 = 0; i2 < dsrjVar.size(); i2++) {
            F.g(new yyh(this, dsrjVar.get(i2), i2));
        }
        dcdc f = F.f();
        this.b = f;
        this.c = new yyf(context.getString(R.string.DATA_REQUEST_ERROR), runnable);
        if (i <= 0 || i >= f.size()) {
            return;
        }
        super.Z(i);
    }

    @Override // defpackage.yyc
    public Boolean a() {
        return false;
    }

    @Override // defpackage.yyc
    public List<? extends yyd> c() {
        return this.b;
    }

    @Override // defpackage.yyc
    public jam d() {
        return this.c;
    }

    public String e() {
        return this.a;
    }
}
