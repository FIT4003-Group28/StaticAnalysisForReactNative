package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fli  reason: default package */
/* loaded from: classes3.dex */
public final class fli implements View.OnClickListener {
    final /* synthetic */ flj a;
    private final /* synthetic */ int b;

    public fli(flj fljVar) {
        this.a = fljVar;
    }

    public fli(flj fljVar, int i) {
        this.b = i;
        this.a = fljVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            flk flkVar = this.a.h;
            aafo aafoVar = flkVar.b;
            apzg apzgVar = flkVar.c.i;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
            flk flkVar2 = this.a.h;
            flkVar2.a.f(new ajym(flkVar2.c));
            return;
        }
        apok apokVar = this.a.h.c.e;
        if (apokVar == null) {
            apokVar = apok.a;
        }
        if ((apokVar.b & 1) == 0) {
            return;
        }
        apok apokVar2 = this.a.h.c.e;
        if (apokVar2 == null) {
            apokVar2 = apok.a;
        }
        apoj apojVar = apokVar2.c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        int i = apojVar.b;
        if ((i & 16384) != 0) {
            aafo aafoVar2 = this.a.h.b;
            apzg apzgVar2 = apojVar.o;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar2.c(apzgVar2, null);
        } else if ((i & 8192) == 0) {
        } else {
            apzg apzgVar3 = apojVar.n;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            this.a.h.b.c(apzgVar3, null);
            if (!apzgVar3.qn(FeedbackEndpointOuterClass.feedbackEndpoint)) {
                return;
            }
            aqyi aqyiVar = ((aqyh) apzgVar3.qm(FeedbackEndpointOuterClass.feedbackEndpoint)).i;
            if (aqyiVar == null) {
                aqyiVar = aqyi.a;
            }
            if (!aqyiVar.b) {
                return;
            }
            flk flkVar3 = this.a.h;
            flkVar3.a.f(new ajym(flkVar3.c));
        }
    }
}
