package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: ahbm  reason: default package */
/* loaded from: classes2.dex */
final class ahbm implements degu<dirj> {
    private final WeakReference<ahbn> a;

    public ahbm(ahbn ahbnVar) {
        this.a = new WeakReference<>(ahbnVar);
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ahbn ahbnVar = this.a.get();
        if (ahbnVar == null) {
            return;
        }
        Toast.makeText(ahbnVar.a, (int) R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_NETWORK_ERROR_TEXT, 1).show();
        ahbnVar.h = false;
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dirj dirjVar) {
        ahbn ahbnVar = this.a.get();
        if (ahbnVar == null) {
            return;
        }
        ahbnVar.h = false;
        ahbnVar.b.h(ahbnVar);
    }
}
