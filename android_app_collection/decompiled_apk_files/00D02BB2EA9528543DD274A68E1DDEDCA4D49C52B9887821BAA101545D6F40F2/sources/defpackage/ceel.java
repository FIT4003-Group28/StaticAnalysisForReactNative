package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ceel  reason: default package */
/* loaded from: classes4.dex */
public final class ceel implements akey {
    final /* synthetic */ ceen a;
    private final ceek b;

    public ceel(ceen ceenVar, ceek ceekVar) {
        this.a = ceenVar;
        this.b = ceekVar;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        if (z) {
            this.a.c.p(false);
        }
        btlu j = this.a.b.j();
        if (j == null) {
            gga ggaVar = this.a.a;
            Toast.makeText(ggaVar, ggaVar.getString(R.string.GENERIC_ERROR_MESSAGE), 1).show();
            return;
        }
        this.b.a(j.d);
    }

    @Override // defpackage.akey
    public final void b() {
    }
}
