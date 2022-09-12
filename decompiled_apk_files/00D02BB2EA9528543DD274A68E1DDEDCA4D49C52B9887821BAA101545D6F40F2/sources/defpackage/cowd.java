package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cowd  reason: default package */
/* loaded from: classes.dex */
public final class cowd extends covv {
    private final cnph<couj> a;

    public cowd(cnph<couj> cnphVar) {
        this.a = cnphVar;
    }

    @Override // defpackage.covv, defpackage.covx
    public final void b(int i, Bundle bundle, DataHolder dataHolder) {
        this.a.c(new cowf(cowh.R(i, bundle), dataHolder == null ? null : new cowv(dataHolder)));
    }
}
