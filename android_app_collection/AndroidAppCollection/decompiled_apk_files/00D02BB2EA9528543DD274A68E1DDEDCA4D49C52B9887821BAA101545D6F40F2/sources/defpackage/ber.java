package defpackage;

import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: ber  reason: default package */
/* loaded from: classes3.dex */
public final class ber extends beq<bek> {
    public ber(Context context, bif bifVar) {
        super(bfg.a(context, bifVar).c);
    }

    @Override // defpackage.beq
    public final boolean b(bgh bghVar) {
        return bghVar.i.i == 2;
    }

    @Override // defpackage.beq
    public final /* bridge */ /* synthetic */ boolean c(bek bekVar) {
        bek bekVar2 = bekVar;
        return Build.VERSION.SDK_INT >= 26 ? !bekVar2.a || !bekVar2.b : !bekVar2.a;
    }
}
