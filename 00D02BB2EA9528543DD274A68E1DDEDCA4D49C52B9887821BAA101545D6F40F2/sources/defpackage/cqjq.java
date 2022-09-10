package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqjq  reason: default package */
/* loaded from: classes5.dex */
public final class cqjq implements cqjb {
    final /* synthetic */ Object[] a;

    public cqjq(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Object a(cqkp cqkpVar, Context context) {
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            Object obj = this.a[i];
            if (!(obj instanceof Boolean)) {
                if (Boolean.TRUE.equals((Boolean) cqjv.b(obj, cqkpVar, context))) {
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }
}
