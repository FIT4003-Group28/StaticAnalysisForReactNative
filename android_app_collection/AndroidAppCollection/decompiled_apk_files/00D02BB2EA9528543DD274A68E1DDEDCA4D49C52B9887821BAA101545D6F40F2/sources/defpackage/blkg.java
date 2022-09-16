package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: blkg  reason: default package */
/* loaded from: classes3.dex */
final class blkg extends cqqw {
    final /* synthetic */ blkh a;

    public blkg(blkh blkhVar) {
        this.a = blkhVar;
    }

    @Override // defpackage.abx
    public final void QA(RecyclerView recyclerView, int i) {
    }

    @Override // defpackage.abx
    public final void a(RecyclerView recyclerView, int i, int i2) {
        blkh blkhVar = this.a;
        if (!blkhVar.c) {
            return;
        }
        bkpj bkpjVar = blkhVar.a;
        if (bkpjVar.d != 2) {
            return;
        }
        final int intValue = bkpjVar.e().intValue();
        recyclerView.getGlobalVisibleRect(this.a.d);
        final int i3 = this.a.d.top;
        blkh.a(recyclerView, new dbrn(this, intValue, i3) { // from class: blkf
            private final blkg a;
            private final int b;
            private final int c;

            {
                this.a = this;
                this.b = intValue;
                this.c = i3;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                blkg blkgVar = this.a;
                int i4 = this.b;
                int i5 = this.c;
                View view = (View) obj;
                view.getGlobalVisibleRect(blkgVar.a.d);
                int i6 = blkgVar.a.d.top - i5;
                int i7 = blkgVar.a.d.bottom - i5;
                boolean z = false;
                if (i7 >= 0 && i4 >= i6) {
                    if (!view.isAccessibilityFocused()) {
                        z = true;
                    } else if (i7 <= i4) {
                        view.performAccessibilityAction(128, null);
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }
}
