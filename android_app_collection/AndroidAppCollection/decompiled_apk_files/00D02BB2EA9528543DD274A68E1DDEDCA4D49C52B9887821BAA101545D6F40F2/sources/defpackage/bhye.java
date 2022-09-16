package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhye  reason: default package */
/* loaded from: classes3.dex */
public final class bhye implements Runnable {
    final /* synthetic */ bhyo a;

    public bhye(bhyo bhyoVar) {
        this.a = bhyoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bhyo bhyoVar = this.a;
        if (bhyoVar.a.aD) {
            cqkx.p(bhyoVar);
        }
        Toast.makeText(this.a.f, (int) R.string.CONTACT_WRITE_ERROR_MESSAGE, 0).show();
        bhyo bhyoVar2 = this.a;
        bhyoVar2.a.Nw(new bhwt(2, bhyoVar2.d.c()));
    }
}
