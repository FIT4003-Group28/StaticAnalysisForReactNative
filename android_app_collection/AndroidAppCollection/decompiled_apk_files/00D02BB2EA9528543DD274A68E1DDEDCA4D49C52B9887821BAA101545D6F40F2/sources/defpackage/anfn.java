package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anfn  reason: default package */
/* loaded from: classes2.dex */
public final class anfn implements btzi<dixa, dixc> {
    final /* synthetic */ gfw a;
    final /* synthetic */ Object b;
    final /* synthetic */ anft c;

    public anfn(anft anftVar, gfw gfwVar, Object obj) {
        this.c = anftVar;
        this.a = gfwVar;
        this.b = obj;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dixa> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dixa> btzrVar, dixc dixcVar) {
        this.c.a.runOnUiThread(new Runnable(this) { // from class: anfm
            private final anfn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ckos.b(this.a.c.a.findViewById(16908290), R.string.MAPS_ACTIVITY_TIMELINE_RECEIPT_PROCESSING_IN_PROGRESS, 0).c();
            }
        });
        this.a.Qn(this.b);
        this.c.f.a().e();
    }
}
