package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqqf  reason: default package */
/* loaded from: classes5.dex */
public final class cqqf extends cqtd {
    final /* synthetic */ cqqg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqqf(Object[] objArr, cqqg cqqgVar) {
        super(objArr);
        this.a = cqqgVar;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        return bam.a(context.getResources(), this.a.a, null);
    }
}
