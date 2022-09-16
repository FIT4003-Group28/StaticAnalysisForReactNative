package defpackage;

import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: bsu  reason: default package */
/* loaded from: classes2.dex */
public final class bsu extends bst {
    public bsu(Context context, bwn bwnVar) {
        super(btj.a(context, bwnVar).c);
    }

    @Override // defpackage.bst
    public final boolean b(bum bumVar) {
        return bumVar.k.i == 2;
    }

    @Override // defpackage.bst
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        bsn bsnVar = (bsn) obj;
        return Build.VERSION.SDK_INT >= 26 ? !bsnVar.a || !bsnVar.b : !bsnVar.a;
    }
}
