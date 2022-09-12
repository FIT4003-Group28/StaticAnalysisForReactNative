package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqjp  reason: default package */
/* loaded from: classes.dex */
public final class cqjp implements cqjb {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public cqjp(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Object a(cqkp cqkpVar, Context context) {
        return Boolean.FALSE.equals((Boolean) cqjv.b(this.a, cqkpVar, context)) ? Boolean.FALSE : (Boolean) cqjv.b(this.b, cqkpVar, context);
    }
}
