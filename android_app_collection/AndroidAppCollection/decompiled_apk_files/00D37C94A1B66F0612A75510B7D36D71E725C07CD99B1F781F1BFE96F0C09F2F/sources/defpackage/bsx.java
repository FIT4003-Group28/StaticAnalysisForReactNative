package defpackage;

import android.content.Context;
import android.os.Build;
/* compiled from: PG */
/* renamed from: bsx  reason: default package */
/* loaded from: classes2.dex */
public final class bsx extends bst {
    public bsx(Context context, bwn bwnVar) {
        super(btj.a(context, bwnVar).c);
    }

    @Override // defpackage.bst
    public final boolean b(bum bumVar) {
        return bumVar.k.i == 3 || (Build.VERSION.SDK_INT >= 30 && bumVar.k.i == 6);
    }

    @Override // defpackage.bst
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        bsn bsnVar = (bsn) obj;
        return !bsnVar.a || bsnVar.c;
    }
}
