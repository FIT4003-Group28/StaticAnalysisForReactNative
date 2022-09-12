package defpackage;

import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: aqrs  reason: default package */
/* loaded from: classes2.dex */
final class aqrs implements degu<apzn> {
    private final WeakReference<aqru> a;
    private final apyz b;
    private final String c;
    @dzsi
    private final Runnable d;

    public aqrs(aqru aqruVar, apyz apyzVar, String str, @dzsi Runnable runnable) {
        this.a = new WeakReference<>(aqruVar);
        this.b = apyzVar;
        this.c = str;
        this.d = runnable;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        aqru aqruVar = this.a.get();
        if (aqruVar != null) {
            aqruVar.c();
            if (!aqruVar.b.b()) {
                return;
            }
            ckos.a(aqruVar.a.findViewById(16908290), aqruVar.a.getString(R.string.MERCHANT_MESSAGING_PROMO_TURN_ON_FAILED), 0).c();
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi apzn apznVar) {
        apzn apznVar2 = apznVar;
        aqru aqruVar = this.a.get();
        if (aqruVar != null) {
            aqruVar.c();
        }
        if (apznVar2 == null || !apznVar2.e()) {
            return;
        }
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
        } else {
            this.b.H(this.c);
        }
    }
}
