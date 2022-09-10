package defpackage;

import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: aqss  reason: default package */
/* loaded from: classes2.dex */
final class aqss implements degu<Void> {
    private final WeakReference<ff> a;
    private final String b;

    public aqss(ff ffVar, String str) {
        this.a = new WeakReference<>(ffVar);
        this.b = str;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ff ffVar = this.a.get();
        if (ffVar == null) {
            return;
        }
        ckos.a(ffVar.findViewById(16908290), ffVar.getString(R.string.MESSAGING_GENERIC_ERROR_MESSAGE), 0).c();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r3) {
        ff ffVar = this.a.get();
        if (ffVar == null) {
            return;
        }
        ffVar.g().g(this.b, 1);
    }
}
