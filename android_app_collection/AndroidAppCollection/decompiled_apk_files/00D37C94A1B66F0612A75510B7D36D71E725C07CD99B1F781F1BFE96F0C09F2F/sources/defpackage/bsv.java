package defpackage;

import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: bsv  reason: default package */
/* loaded from: classes2.dex */
public final class bsv extends bst {
    static {
        bqf.b("NetworkMeteredCtrlr");
    }

    public bsv(Context context, bwn bwnVar) {
        super(btj.a(context, bwnVar).c);
    }

    @Override // defpackage.bst
    public final boolean b(bum bumVar) {
        return bumVar.k.i == 5;
    }

    @Override // defpackage.bst
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        bsn bsnVar = (bsn) obj;
        if (Build.VERSION.SDK_INT >= 26) {
            return !bsnVar.a || !bsnVar.c;
        }
        bqf.a().d(new Throwable[0]);
        return !bsnVar.a;
    }
}
