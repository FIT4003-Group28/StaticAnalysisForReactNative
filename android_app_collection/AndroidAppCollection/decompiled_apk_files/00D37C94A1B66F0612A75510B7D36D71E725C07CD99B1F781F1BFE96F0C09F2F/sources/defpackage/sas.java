package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: sas  reason: default package */
/* loaded from: classes4.dex */
public class sas extends sab {
    public sas(Context context) {
        super(context);
    }

    @Override // defpackage.sab
    protected final /* bridge */ /* synthetic */ scz f() {
        Context context = getContext();
        boolean z = ((sab) this).c;
        sde sdeVar = new sde(context);
        sdeVar.d.e = 45.0f;
        sdeVar.j();
        if (!(!z)) {
            sfc.b(sdeVar);
        } else {
            sfc.c(sdeVar);
        }
        return sdeVar;
    }

    @Override // defpackage.sai
    public final sgq k() {
        return sgq.d;
    }
}
