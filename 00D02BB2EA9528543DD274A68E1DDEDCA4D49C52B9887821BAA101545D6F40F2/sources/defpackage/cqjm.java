package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqjm  reason: default package */
/* loaded from: classes5.dex */
public final class cqjm implements cqjb {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    public cqjm(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Object a(cqkp cqkpVar, Context context) {
        Object obj = this.a;
        Object b = obj == null ? this.b : cqjv.b(obj, cqkpVar, context);
        Object obj2 = this.c;
        return Boolean.valueOf(dbsd.a(b, obj2 == null ? this.d : cqjv.b(obj2, cqkpVar, context)));
    }
}
