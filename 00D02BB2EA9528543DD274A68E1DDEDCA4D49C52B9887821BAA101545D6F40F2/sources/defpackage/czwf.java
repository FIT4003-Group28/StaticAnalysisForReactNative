package defpackage;

import android.app.Dialog;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: czwf  reason: default package */
/* loaded from: classes5.dex */
public class czwf extends ry {
    @Override // defpackage.ex, defpackage.ajyl
    public final void f() {
        Dialog dialog = this.d;
        if (dialog instanceof czwe) {
            boolean z = ((czwe) dialog).a().l;
        }
        super.f();
    }

    @Override // defpackage.ry, defpackage.ex
    public Dialog q(Bundle bundle) {
        return new czwe(H(), this.b);
    }
}
