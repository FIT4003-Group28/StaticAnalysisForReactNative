package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqjo  reason: default package */
/* loaded from: classes5.dex */
public final class cqjo implements cqjb {
    final /* synthetic */ Object[] a;

    public cqjo(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Object a(cqkp cqkpVar, Context context) {
        int length = this.a.length;
        for (int i = 0; i < length; i++) {
            Object obj = this.a[i];
            if (!(obj instanceof Boolean)) {
                if (Boolean.FALSE.equals((Boolean) cqjv.b(obj, cqkpVar, context))) {
                    return Boolean.FALSE;
                }
            }
        }
        return Boolean.TRUE;
    }
}
