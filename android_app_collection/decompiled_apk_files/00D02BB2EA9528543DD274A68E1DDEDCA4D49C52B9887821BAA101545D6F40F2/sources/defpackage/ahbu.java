package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: ahbu  reason: default package */
/* loaded from: classes2.dex */
final class ahbu implements degu<dirj> {
    private final WeakReference<ahbw> a;

    public ahbu(ahbw ahbwVar) {
        this.a = new WeakReference<>(ahbwVar);
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ahbw ahbwVar = this.a.get();
        if (ahbwVar == null) {
            return;
        }
        ahbwVar.h = false;
        ahbwVar.r(R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_NETWORK_ERROR_TEXT);
        ahbwVar.p();
        ahbwVar.k(false);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dirj dirjVar) {
        int a;
        int a2;
        dirj dirjVar2 = dirjVar;
        ahbw ahbwVar = this.a.get();
        if (ahbwVar == null) {
            return;
        }
        int a3 = diri.a(dirjVar2.b);
        if ((a3 != 0 && a3 == 2) || ((a = diri.a(dirjVar2.b)) != 0 && a == 3)) {
            ahbwVar.n();
            return;
        }
        if (!dirjVar2.c.isEmpty()) {
            Toast.makeText(ahbwVar.b, dirjVar2.c, 1).show();
        } else {
            int a4 = diri.a(dirjVar2.b);
            ahbwVar.r((a4 != 0 && a4 == 6) ? R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_MAXIMUM_AREAS_ERROR_TEXT : R.string.LOCALSTREAM_FOLLOW_AREA_PICKER_INTERNAL_ERROR_TEXT);
        }
        int a5 = diri.a(dirjVar2.b);
        if ((a5 == 0 || a5 != 4) && ((a2 = diri.a(dirjVar2.b)) == 0 || a2 != 5)) {
            return;
        }
        int i = dirjVar2.b;
        String str = dirjVar2.c;
    }
}
