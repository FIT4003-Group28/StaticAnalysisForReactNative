package defpackage;

import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: bsw  reason: default package */
/* loaded from: classes2.dex */
public final class bsw extends bst {
    static {
        bqf.b("NetworkNotRoamingCtrlr");
    }

    public bsw(Context context, bwn bwnVar) {
        super(btj.a(context, bwnVar).c);
    }

    @Override // defpackage.bst
    public final boolean b(bum bumVar) {
        return bumVar.k.i == 4;
    }

    @Override // defpackage.bst
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        bsn bsnVar = (bsn) obj;
        if (Build.VERSION.SDK_INT >= 24) {
            return !bsnVar.a || !bsnVar.d;
        }
        bqf.a().d(new Throwable[0]);
        return !bsnVar.a;
    }
}
