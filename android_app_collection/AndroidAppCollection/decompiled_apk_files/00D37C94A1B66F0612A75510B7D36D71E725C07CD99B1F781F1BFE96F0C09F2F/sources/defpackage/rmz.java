package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rmz  reason: default package */
/* loaded from: classes4.dex */
public final class rmz implements rpr {
    final /* synthetic */ rng a;

    public rmz(rng rngVar) {
        this.a = rngVar;
    }

    @Override // defpackage.rpr
    public final void a(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.a.X("_err", bundle, str);
        } else {
            this.a.s("auto", "_err", bundle);
        }
    }
}
