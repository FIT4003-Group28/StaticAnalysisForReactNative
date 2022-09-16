package defpackage;

import android.view.View;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: kkk  reason: default package */
/* loaded from: classes3.dex */
final class kkk implements View.OnClickListener {
    final /* synthetic */ kkm a;

    public kkk(kkm kkmVar) {
        this.a = kkmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj;
        apoj apojVar;
        kkm kkmVar = this.a;
        if (kkmVar.q == null || (obj = kkmVar.p) == null) {
            return;
        }
        if (kkmVar.t == 4) {
            aphm aphmVar = ((aphn) obj).d;
            if (aphmVar == null) {
                aphmVar = aphm.a;
            }
            apok apokVar = aphmVar.c;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
        } else {
            aphl aphlVar = ((aphn) obj).e;
            if (aphlVar == null) {
                aphlVar = aphl.a;
            }
            apok apokVar2 = aphlVar.b;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
        }
        if (apojVar == null || (apojVar.b & 16384) == 0) {
            return;
        }
        wlv wlvVar = this.a.q;
        apzg apzgVar = apojVar.o;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        wlvVar.qL(apojVar, Collections.singletonList(apzgVar));
    }
}
