package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
/* compiled from: PG */
/* renamed from: wsq  reason: default package */
/* loaded from: classes4.dex */
public final class wsq implements wsg, xgo {
    public int a = -1;
    private final /* synthetic */ int b;

    public wsq() {
    }

    public wsq(int i) {
        this.b = i;
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void c(Bundle bundle) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void i(xgb xgbVar) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.xgo
    public final void q(int i, int i2) {
        if (this.b != 0) {
            this.a = i;
        } else {
            this.a = i2;
        }
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void r(DisplayMetrics displayMetrics, Rect rect, Rect rect2) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void t(boolean z) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void u(boolean z) {
    }

    @Override // defpackage.wsg
    public final String a() {
        if (this.b == 0) {
            return Integer.toString(-1);
        }
        return Integer.toString(-1);
    }

    @Override // defpackage.wsg
    public final String b(xac xacVar) {
        if (this.b == 0) {
            return Integer.toString(this.a);
        }
        return Integer.toString(this.a);
    }
}
