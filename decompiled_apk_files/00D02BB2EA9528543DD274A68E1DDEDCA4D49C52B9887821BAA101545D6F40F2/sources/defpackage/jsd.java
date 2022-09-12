package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: jsd  reason: default package */
/* loaded from: classes7.dex */
public class jsd implements jrf {
    private final String a;
    private final duhg b;
    private final cpf c;
    private final Context d;

    @Override // defpackage.jrf
    public String a() {
        return this.a;
    }

    @Override // defpackage.jrf
    public String b() {
        return this.d.getString(R.string.PRICING_OPTION_PRICE, cpg.b(this.b, this.c));
    }

    public jsd(djia djiaVar, Locale locale, Context context) {
        int a = djhz.a(djiaVar.b);
        int i = (a == 0 ? 1 : a) - 1;
        if (i == 2) {
            this.a = bqq.c(context, R.string.PRICING_OPTION_DESCRIPTION, "session_count", Integer.valueOf(djiaVar.a));
        } else if (i == 3) {
            this.a = context.getString(R.string.PRICING_OPTION_UNLIMITED);
        } else {
            this.a = bqq.c(context, R.string.PRICING_OPTION_DESCRIPTION, "session_count", 1);
        }
        dpyc dpycVar = djiaVar.c;
        dpycVar = dpycVar == null ? dpyc.d : dpycVar;
        duhf bZ = duhg.d.bZ();
        String str = dpycVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duhg duhgVar = (duhg) bZ.b;
        str.getClass();
        duhgVar.a = str;
        duhgVar.b = dpycVar.b;
        duhgVar.c = dpycVar.c;
        this.b = bZ.bK();
        cpe d = cpf.d(locale);
        d.b(true);
        d.c(true);
        this.c = d.a();
        this.d = context;
    }
}
