package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdby  reason: default package */
/* loaded from: classes3.dex */
public class bdby extends ivw {
    private static final dcqe c = dcqe.c("bdby");
    private final bwsh d;
    private final dwfl e;
    @dzsi
    private final ilo f;

    public bdby(Context context, dwfl dwflVar, @dzsi ilo iloVar, bwsh bwshVar, cjtd cjtdVar, boolean z, int i) {
        super(context, ivu.FIXED, jaq.NO_TINT_DAY_NIGHT_ON_WHITE, cqrt.h(2131231579, iva.b(cqrt.c(R.color.lightbox_360_expand_tint), ibl.b())), context.getString(R.string.ACCESSIBILITY_LIGHTBOX_360_EXPAND), cjtdVar, z, i);
        this.d = bwshVar;
        this.e = dwflVar;
        this.f = iloVar;
    }

    @Override // defpackage.ivw, defpackage.jar
    public Integer I() {
        return 8388661;
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        dwfl dwflVar = this.e;
        if (dwflVar == null) {
            bvoo.h("Photo description not set on 360 Fab.", new Object[0]);
            return cqkl.a;
        }
        if (cknv.f(dwflVar)) {
            this.d.e(this.e, null, this.f);
        }
        return cqkl.a;
    }
}
