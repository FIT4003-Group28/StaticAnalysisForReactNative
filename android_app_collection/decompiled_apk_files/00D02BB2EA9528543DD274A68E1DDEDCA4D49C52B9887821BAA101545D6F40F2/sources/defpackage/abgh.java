package defpackage;

import android.content.Context;
import android.view.View;
/* renamed from: abgh  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class abgh implements cqjb {
    static final cqjb a = new abgh();

    private abgh() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        final absq absqVar = (absq) cqkpVar;
        return new cqfc(absqVar) { // from class: abgi
            private final absq a;

            {
                this.a = absqVar;
            }

            @Override // defpackage.cqfc
            public final void a(View view, boolean z) {
                absq absqVar2 = this.a;
                int i = abgj.a;
                absqVar2.e();
            }
        };
    }
}
