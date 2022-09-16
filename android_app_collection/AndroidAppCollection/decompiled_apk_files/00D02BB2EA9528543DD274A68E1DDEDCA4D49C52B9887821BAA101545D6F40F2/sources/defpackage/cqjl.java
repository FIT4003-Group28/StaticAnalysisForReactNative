package defpackage;

import android.content.Context;
import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqjl  reason: default package */
/* loaded from: classes.dex */
public final class cqjl implements cqjb {
    final /* synthetic */ Object a;

    public cqjl(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Object a(cqkp cqkpVar, Context context) {
        Object b = cqjv.b(this.a, cqkpVar, context);
        if (b instanceof Collection) {
            return Integer.valueOf(((Collection) b).size());
        }
        String valueOf = String.valueOf(b.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
        sb.append("size() should take Collection argument, but actually ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
