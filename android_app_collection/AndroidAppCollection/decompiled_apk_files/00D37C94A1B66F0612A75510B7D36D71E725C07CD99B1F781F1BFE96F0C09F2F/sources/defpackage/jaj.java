package defpackage;

import com.google.android.apps.youtube.app.offline.OfflineModeChangedMealbarController;
/* compiled from: PG */
/* renamed from: jaj  reason: default package */
/* loaded from: classes3.dex */
public final class jaj implements ynl {
    final /* synthetic */ OfflineModeChangedMealbarController a;

    public jaj(OfflineModeChangedMealbarController offlineModeChangedMealbarController) {
        this.a = offlineModeChangedMealbarController;
    }

    public final void a(ahia ahiaVar) {
        if (this.a.c.g().h() && !this.a.b.o() && this.a.d.a() != null && !this.a.d.a().e() && ((this.a.f == 2 && ahiaVar.a() == 5) || ahiaVar.a() == 8)) {
            this.a.e.postDelayed(new Runnable() { // from class: jai
                @Override // java.lang.Runnable
                public final void run() {
                    OfflineModeChangedMealbarController offlineModeChangedMealbarController = jaj.this.a;
                    offlineModeChangedMealbarController.k(offlineModeChangedMealbarController.h());
                }
            }, 500L);
        }
        this.a.f = ahiaVar.a();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a((ahia) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahia.class};
    }
}
