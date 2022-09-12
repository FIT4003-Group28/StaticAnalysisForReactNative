package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqjn  reason: default package */
/* loaded from: classes.dex */
public final class cqjn implements cqjb<cqkp, CharSequence> {
    final /* synthetic */ Object a;

    public cqjn(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ CharSequence a(cqkp cqkpVar, Context context) {
        Object obj = this.a;
        return context.getResources().getString(obj instanceof Integer ? ((Integer) obj).intValue() : ((Integer) cqjv.b(obj, cqkpVar, context)).intValue());
    }
}
