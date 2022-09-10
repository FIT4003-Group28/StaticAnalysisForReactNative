package defpackage;

import android.widget.Toast;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ancu  reason: default package */
/* loaded from: classes2.dex */
public final class ancu implements ancl {
    private final Toast a;

    public ancu(ancv ancvVar, String str) {
        this.a = Toast.makeText(ancvVar.H(), str, 0);
    }

    @Override // defpackage.ancl
    public final void a() {
        this.a.show();
    }

    @Override // defpackage.ancl
    public final void b() {
        this.a.cancel();
    }

    @Override // defpackage.ancl
    public final boolean c() {
        return false;
    }
}
