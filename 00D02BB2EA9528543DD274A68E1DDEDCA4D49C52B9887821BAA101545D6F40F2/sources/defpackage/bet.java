package defpackage;

import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: bet  reason: default package */
/* loaded from: classes3.dex */
public final class bet extends beq<bek> {
    static {
        bbz.f("NetworkNotRoamingCtrlr");
    }

    public bet(Context context, bif bifVar) {
        super(bfg.a(context, bifVar).c);
    }

    @Override // defpackage.beq
    public final boolean b(bgh bghVar) {
        return bghVar.i.i == 4;
    }

    @Override // defpackage.beq
    public final /* bridge */ /* synthetic */ boolean c(bek bekVar) {
        bek bekVar2 = bekVar;
        if (Build.VERSION.SDK_INT >= 24) {
            return !bekVar2.a || !bekVar2.d;
        }
        bbz.e().a(new Throwable[0]);
        return !bekVar2.a;
    }
}
