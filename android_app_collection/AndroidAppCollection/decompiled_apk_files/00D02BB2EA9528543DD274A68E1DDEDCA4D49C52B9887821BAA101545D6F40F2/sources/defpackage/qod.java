package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qod  reason: default package */
/* loaded from: classes7.dex */
public class qod extends qno {
    final /* synthetic */ qoj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qod(qoj qojVar, Context context, qnn qnnVar) {
        super(context, qnnVar);
        this.b = qojVar;
    }

    @Override // defpackage.qno, defpackage.jam
    public cqkl f() {
        qoj qojVar = this.b;
        qojVar.u = true;
        qojVar.x = false;
        qojVar.h.a(dtyc.cc, dtyc.cd, dtyc.ca, dtyc.cb, new gul(this) { // from class: qoc
            private final qod a;

            {
                this.a = this;
            }

            @Override // defpackage.gul
            public final void a(boolean z) {
                qod qodVar = this.a;
                if (z) {
                    qodVar.b.D(true);
                    qodVar.b.R();
                    return;
                }
                qoj qojVar2 = qodVar.b;
                qojVar2.u = false;
                qojVar2.x = true;
                qojVar2.R();
            }
        }).a();
        return cqkl.a;
    }
}
