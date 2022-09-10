package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqjr  reason: default package */
/* loaded from: classes.dex */
public final class cqjr implements cqjb {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public cqjr(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Object a(cqkp cqkpVar, Context context) {
        return Boolean.TRUE.equals((Boolean) cqjv.b(this.a, cqkpVar, context)) ? Boolean.TRUE : (Boolean) cqjv.b(this.b, cqkpVar, context);
    }
}
