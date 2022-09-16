package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
/* compiled from: PG */
/* renamed from: sar  reason: default package */
/* loaded from: classes4.dex */
public final class sar extends sab {
    public sar(Context context) {
        super(context);
    }

    @Override // defpackage.sab
    protected final /* bridge */ /* synthetic */ scz f() {
        Context context = getContext();
        boolean z = ((sab) this).c;
        sdc sdcVar = new sdc(context);
        sdd sddVar = new sdd();
        sddVar.a = false;
        sdcVar.m();
        sdcVar.b = sddVar;
        sdcVar.j();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, rzz.a, 0, 0);
        sddVar.a(Integer.valueOf(obtainStyledAttributes.getInt(6, 0)));
        sdcVar.i(obtainStyledAttributes.getDimensionPixelSize(5, (int) scf.b(context, 10.0f)));
        obtainStyledAttributes.recycle();
        if (!(!z)) {
            sfc.b(sdcVar);
        } else {
            sfc.c(sdcVar);
        }
        return sdcVar;
    }

    @Override // defpackage.sai
    public final sgq k() {
        return sgq.c;
    }
}
