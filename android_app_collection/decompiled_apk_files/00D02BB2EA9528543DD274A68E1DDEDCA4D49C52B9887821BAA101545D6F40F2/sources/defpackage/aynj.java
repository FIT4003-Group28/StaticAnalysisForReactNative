package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aynj  reason: default package */
/* loaded from: classes3.dex */
final class aynj implements degu<baad> {
    final /* synthetic */ aynl a;

    public aynj(aynl aynlVar) {
        this.a = aynlVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.c.a(new Runnable(this) { // from class: ayni
            private final aynj a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b.f();
            }
        });
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi baad baadVar) {
        baad baadVar2 = baadVar;
        if (baadVar2 != null) {
            bwrs<baad> bwrsVar = this.a.e;
            dbsk.s(bwrsVar);
            bwrsVar.d(baadVar2);
            aynl aynlVar = this.a;
            String string = aynlVar.a.getString(R.string.LIST_LANGUAGE_HAS_CHANGED);
            View view = (View) dcft.r(cqkx.n(aynlVar), null);
            if (view == null) {
                return;
            }
            aynlVar.d.f(view, string);
        }
    }
}
