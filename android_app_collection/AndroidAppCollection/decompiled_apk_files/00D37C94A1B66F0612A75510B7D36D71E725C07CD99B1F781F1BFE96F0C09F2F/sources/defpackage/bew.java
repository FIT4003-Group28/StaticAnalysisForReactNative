package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bew  reason: default package */
/* loaded from: classes2.dex */
public class bew extends dh {
    private Dialog ae;
    private bgo af;

    public bew() {
        n(true);
    }

    private final void aG() {
        if (this.af == null) {
            Bundle bundle = this.m;
            if (bundle != null) {
                this.af = bgo.a(bundle.getBundle("selector"));
            }
            if (this.af != null) {
                return;
            }
            this.af = bgo.a;
        }
    }

    public bev aF(Context context) {
        return new bev(context);
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.ae;
        if (dialog == null) {
            return;
        }
        ((bev) dialog).g();
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        bev aF = aF(rb());
        this.ae = aF;
        aG();
        aF.f(this.af);
        return this.ae;
    }

    public final void aE(bgo bgoVar) {
        if (bgoVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        aG();
        if (this.af.equals(bgoVar)) {
            return;
        }
        this.af = bgoVar;
        Bundle bundle = this.m;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBundle("selector", bgoVar.b);
        ae(bundle);
        Dialog dialog = this.ae;
        if (dialog == null) {
            return;
        }
        ((bev) dialog).f(bgoVar);
    }
}
