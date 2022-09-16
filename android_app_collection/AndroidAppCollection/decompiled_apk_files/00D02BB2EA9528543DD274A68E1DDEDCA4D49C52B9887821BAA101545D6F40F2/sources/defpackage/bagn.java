package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bagn  reason: default package */
/* loaded from: classes3.dex */
public final class bagn implements btzi<dwxn, dwxp> {
    final /* synthetic */ bago a;

    public bagn(bago bagoVar) {
        this.a = bagoVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwxn> btzrVar, btzy btzyVar) {
        if (!btzyVar.equals(btzy.d)) {
            Toast.makeText(this.a.a, this.a.a.getString(R.string.DATA_REQUEST_ERROR_NO_CONNECTIVITY), 1).show();
        }
        this.a.g = false;
        bago bagoVar = this.a;
        bagoVar.c = true;
        cqkx.p(bagoVar);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwxn> btzrVar, dwxp dwxpVar) {
        dccx F = dcdc.F();
        for (dvdd dvddVar : dwxpVar.c) {
            F.g(this.a.b.a(dvddVar));
        }
        this.a.d = F.f();
        this.a.g = false;
        cqkx.p(this.a);
    }
}
