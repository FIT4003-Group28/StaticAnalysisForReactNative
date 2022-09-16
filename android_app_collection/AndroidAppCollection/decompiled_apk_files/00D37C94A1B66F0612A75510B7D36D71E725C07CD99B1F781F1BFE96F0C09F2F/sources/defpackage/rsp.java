package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rsp  reason: default package */
/* loaded from: classes4.dex */
public final class rsp extends rsl {
    private final qtu a;

    public rsp(qtu qtuVar) {
        this.a = qtuVar;
    }

    @Override // defpackage.rsl
    public final void a(int i, Bundle bundle, DataHolder dataHolder) {
        this.a.d(new rsr(rst.n(i, bundle), dataHolder == null ? null : new qwd(dataHolder)));
    }
}
