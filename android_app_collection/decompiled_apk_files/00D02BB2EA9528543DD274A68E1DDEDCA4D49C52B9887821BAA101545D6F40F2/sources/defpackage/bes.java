package defpackage;

import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: bes  reason: default package */
/* loaded from: classes3.dex */
public final class bes extends beq<bek> {
    static {
        bbz.f("NetworkMeteredCtrlr");
    }

    public bes(Context context, bif bifVar) {
        super(bfg.a(context, bifVar).c);
    }

    @Override // defpackage.beq
    public final boolean b(bgh bghVar) {
        return bghVar.i.i == 5;
    }

    @Override // defpackage.beq
    public final /* bridge */ /* synthetic */ boolean c(bek bekVar) {
        bek bekVar2 = bekVar;
        if (Build.VERSION.SDK_INT >= 26) {
            return !bekVar2.a || !bekVar2.c;
        }
        bbz.e().a(new Throwable[0]);
        return !bekVar2.a;
    }
}
