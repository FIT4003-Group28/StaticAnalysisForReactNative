package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: iud  reason: default package */
/* loaded from: classes6.dex */
public final class iud implements cqjb {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public iud(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Object a(cqkp cqkpVar, Context context) {
        Object obj = this.a;
        if (obj instanceof cqnx) {
            obj = ((cqnx) obj).a(cqkpVar, new Object[0]);
        }
        cjtd cjtdVar = (cjtd) obj;
        Object obj2 = this.b;
        return dbsi.a(cjtdVar, obj2 instanceof cqnx ? (ddho) ((cqnx) obj2).a(cqkpVar, new Object[0]) : (ddho) obj2);
    }
}
