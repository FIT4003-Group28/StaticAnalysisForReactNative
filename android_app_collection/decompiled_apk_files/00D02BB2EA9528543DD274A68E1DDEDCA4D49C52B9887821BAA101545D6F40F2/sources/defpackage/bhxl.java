package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bhxl  reason: default package */
/* loaded from: classes3.dex */
final class bhxl implements Runnable {
    final /* synthetic */ bhxm a;

    public bhxl(bhxm bhxmVar) {
        this.a = bhxmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.a.b.a, (int) R.string.CONTACT_SUGGEST_ERROR_MESSAGE, 0).show();
    }
}
