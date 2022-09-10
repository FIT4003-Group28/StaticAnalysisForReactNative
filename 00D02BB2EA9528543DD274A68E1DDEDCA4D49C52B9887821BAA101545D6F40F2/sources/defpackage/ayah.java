package defpackage;

import android.app.ProgressDialog;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ayah  reason: default package */
/* loaded from: classes3.dex */
final class ayah implements ayax {
    @dzsi
    ProgressDialog a;
    final /* synthetic */ ayai b;

    public ayah(ayai ayaiVar) {
        this.b = ayaiVar;
    }

    private final void d() {
        ProgressDialog progressDialog = this.a;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // defpackage.ayax
    public final void a() {
        this.a = this.b.b.j(R.string.SAVING);
    }

    @Override // defpackage.ayax
    public final void b(baad baadVar) {
        d();
    }

    @Override // defpackage.ayax
    public final void c() {
        d();
    }
}
