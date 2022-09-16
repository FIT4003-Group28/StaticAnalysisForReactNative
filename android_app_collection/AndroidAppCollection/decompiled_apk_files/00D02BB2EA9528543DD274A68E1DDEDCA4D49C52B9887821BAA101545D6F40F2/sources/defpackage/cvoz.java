package defpackage;

import android.app.RemoteInput;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cvoz  reason: default package */
/* loaded from: classes5.dex */
public final class cvoz implements cvos {
    private final cvot a;
    private final dbsg<cvtk> b;
    private final cvlr c;

    public cvoz(cvot cvotVar, dbsg dbsgVar, cvlr cvlrVar) {
        this.a = cvotVar;
        this.b = dbsgVar;
        this.c = cvlrVar;
    }

    @Override // defpackage.cvos
    public final void a(cvlm cvlmVar) {
        cvte bK;
        if (!this.b.a()) {
            cvlw.b("ReplyActionEventHandler", "No collaborator handler provided.", new Object[0]);
        } else if (cvlmVar.d().isEmpty()) {
            cvlw.d("ReplyActionEventHandler", "No threads associated with this event.", new Object[0]);
        } else {
            Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(cvlmVar.f());
            if (resultsFromIntent == null) {
                cvlw.d("ReplyActionEventHandler", "Reply action text could not be retrieved from intent.", new Object[0]);
                return;
            }
            CharSequence charSequence = resultsFromIntent.getCharSequence("com.google.android.libraries.notifications.REPLY_TEXT_KEY");
            if (charSequence == null) {
                return;
            }
            cvlp a = this.c.a(drwv.ACTION_CLICK);
            a.s(2);
            a.r(2);
            a.i(cvlmVar.c());
            a.d(cvlmVar.d().get(0));
            a.a();
            cvlmVar.c();
            cvlmVar.d().get(0);
            charSequence.toString();
            this.b.b().g();
            cvot cvotVar = this.a;
            cvkc c = cvlmVar.c();
            cvkj cvkjVar = cvlmVar.d().get(0);
            cvix d = cvix.d();
            String charSequence2 = charSequence.toString();
            cvte g = cvlmVar.g();
            if (g.a.size() == 0) {
                cvtd bZ = cvte.b.bZ();
                bZ.a(charSequence2);
                bK = bZ.bK();
            } else {
                dsrj<String> dsrjVar = g.a;
                dsqp dsqpVar = (dsqp) g.cu(5);
                dsqpVar.bC(g);
                cvtd cvtdVar = (cvtd) dsqpVar;
                if (cvtdVar.c) {
                    cvtdVar.bF();
                    cvtdVar.c = false;
                }
                ((cvte) cvtdVar.b).a = dsqw.ck();
                cvtdVar.a(charSequence2);
                if (cvtdVar.c) {
                    cvtdVar.bF();
                    cvtdVar.c = false;
                }
                cvte cvteVar = (cvte) cvtdVar.b;
                cvteVar.b();
                dsod.bv(dsrjVar, cvteVar.a);
                bK = cvtdVar.bK();
            }
            cvotVar.a(c, cvkjVar, true, true, d, bK, null);
        }
    }
}
