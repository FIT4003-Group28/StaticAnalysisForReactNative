package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ahhf  reason: default package */
/* loaded from: classes2.dex */
public abstract class ahhf extends ahhe {
    private final int a;

    /* JADX INFO: Access modifiers changed from: protected */
    public ahhf(Activity activity, @dzsi dlam dlamVar, ahhv ahhvVar, int i) {
        super(activity, dlamVar, ahhvVar);
        this.a = i;
    }

    @Override // defpackage.agxd
    public final Boolean f() {
        boolean z = false;
        if (this.a == 2 && !e().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.agxd
    public final Boolean g() {
        boolean z = false;
        if (this.a == 4 && !e().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.agxd
    public final Boolean h() {
        return false;
    }
}
