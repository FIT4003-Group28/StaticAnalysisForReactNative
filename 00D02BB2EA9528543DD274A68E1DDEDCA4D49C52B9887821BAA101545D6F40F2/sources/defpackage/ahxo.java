package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahxo  reason: default package */
/* loaded from: classes2.dex */
public final class ahxo implements aa<ajqc<btlu>> {
    final /* synthetic */ ahxx a;

    public ahxo(ahxx ahxxVar) {
        this.a = ahxxVar;
    }

    @Override // defpackage.aa
    public final /* bridge */ /* synthetic */ void m(ajqc<btlu> ajqcVar) {
        ajqc<btlu> ajqcVar2 = ajqcVar;
        this.a.q.d(this);
        ahxx ahxxVar = this.a;
        final View view = null;
        ahxxVar.q = null;
        ahxxVar.r = 2;
        int b = ajqcVar2.b();
        if (b != 0) {
            if (b == 1) {
                btlu c = ajqcVar2.c();
                akah a = this.a.c.a(c);
                if (ahxx.h(a) && (!this.a.o || ahxx.i(a))) {
                    final ahxx ahxxVar2 = this.a;
                    ahxxVar2.r = 3;
                    if (ahxxVar2.l.e(ahxxVar2.b.a())) {
                        View o = cqkx.o(ahxxVar2);
                        if (o != null) {
                            view = cqhu.a(o, ahxi.a);
                        }
                        if (view != null) {
                            view.post(new Runnable(ahxxVar2, view) { // from class: ahxn
                                private final ahxx a;
                                private final View b;

                                {
                                    this.a = ahxxVar2;
                                    this.b = view;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ahxx ahxxVar3 = this.a;
                                    ahxxVar3.l.a(this.b);
                                }
                            });
                        }
                    }
                } else if (ahxx.h(a) && this.a.o && !ahxx.i(a)) {
                    this.a.m.a(c, ckgd.z);
                    ckos.b(this.a.b.a().findViewById(16908290), R.string.PERSONAL_SAFETY_BECOME_PRIMARY_FAILED_TEXT, -1).c();
                }
            }
            cqkx.p(this.a);
            return;
        }
        throw null;
    }
}
