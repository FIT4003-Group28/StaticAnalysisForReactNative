package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhyb  reason: default package */
/* loaded from: classes3.dex */
public final class bhyb implements Runnable {
    final /* synthetic */ bhyo a;

    public bhyb(bhyo bhyoVar) {
        this.a = bhyoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.a.f, (int) R.string.CONTACT_READ_ERROR_MESSAGE, 0).show();
    }
}
