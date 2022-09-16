package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iof  reason: default package */
/* loaded from: classes3.dex */
public final class iof extends ajwe {
    final /* synthetic */ mbt a;
    final /* synthetic */ iou b;

    public iof(iou iouVar, mbt mbtVar) {
        this.b = iouVar;
        this.a = mbtVar;
    }

    @Override // defpackage.ajwe, defpackage.akae
    public final void a() {
        mbt mbtVar = this.a;
        fcw.d(mbtVar.k, ((ajwb) mbtVar).e, this.b.cm);
        boolean n = this.a.n();
        iou iouVar = this.b;
        if (n != iouVar.az) {
            iouVar.az = n;
            iouVar.bj();
        }
    }

    @Override // defpackage.ajwe, defpackage.akae
    public final void b() {
        this.b.aO.post(new Runnable() { // from class: ioe
            @Override // java.lang.Runnable
            public final void run() {
                iof.this.b.bE.b();
            }
        });
    }

    @Override // defpackage.ajwe, defpackage.akae
    public final void c(aakw aakwVar, boolean z) {
        if (z) {
            if (this.a == this.b.q()) {
                iou iouVar = this.b;
                if (!iouVar.bZ.k(PaneDescriptor.b(iouVar))) {
                    this.b.bq();
                }
                iou iouVar2 = this.b;
                if (iouVar2.bZ.i(PaneDescriptor.b(iouVar2))) {
                    this.b.bt();
                }
            }
            mas masVar = this.b.cb;
            if (masVar != null) {
                auqh auqhVar = aakwVar.a;
                if (masVar.c.isEmpty()) {
                    List list = (List) masVar.b.get(auqhVar);
                    masVar.b.clear();
                    masVar.a.clear();
                    if (list != null) {
                        masVar.b.put(auqhVar, list);
                        masVar.c(list);
                    }
                }
            }
        }
        mbt mbtVar = this.a;
        fcw.d(mbtVar.k, ((ajwb) mbtVar).e, this.b.cm);
        if (this.a.n()) {
            iou iouVar3 = this.b;
            if (iouVar3.az) {
                return;
            }
            iouVar3.az = true;
            iouVar3.bj();
        }
    }
}
