package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.text.BreakIterator;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: bjdh  reason: default package */
/* loaded from: classes3.dex */
class bjdh implements bjdf {
    final /* synthetic */ bjdi a;
    private Boolean b = false;

    public bjdh(bjdi bjdiVar) {
        this.a = bjdiVar;
    }

    @Override // defpackage.jbk
    public jib NC() {
        final gga ggaVar = this.a.a;
        String string = ggaVar.getString(R.string.POST_BUTTON);
        boolean booleanValue = this.b.booleanValue();
        jhn jhnVar = new jhn(this) { // from class: bjdg
            private final bjdh a;

            {
                this.a = this;
            }

            @Override // defpackage.jhn
            public final void a(View view, cjqm cjqmVar) {
                this.a.c();
            }
        };
        jhm a = jhm.a();
        a.g = jhnVar;
        a.a = string;
        a.b = string;
        a.h = 1;
        a.n = booleanValue;
        a.o = false;
        a.f = cjtd.a(dtxy.gN);
        jhz a2 = jhz.a();
        a2.a = ggaVar.getString(R.string.PLACE_QA_ASK_A_QUESTION_PAGE_TITLE);
        a2.C = 1;
        a2.D = 0;
        a2.f(new View.OnClickListener(ggaVar) { // from class: bjdd
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.s();
            }
        });
        a2.o = cjtd.a(dtxy.fU);
        a2.d = ibq.E();
        a2.c(a.c());
        return a2.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r4.a.j.booleanValue() == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.bjdf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r4 = this;
            bjdi r0 = r4.a
            boolean r1 = r0.k
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L27
            java.lang.String r0 = r0.i
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
            bjdi r0 = r4.a
            java.lang.String r1 = r0.i
            java.lang.String r0 = r0.h
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L28
            bjdi r0 = r4.a
            java.lang.Boolean r0 = r0.j
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            goto L28
        L27:
            r2 = 0
        L28:
            java.lang.Boolean r0 = r4.b
            boolean r0 = r0.booleanValue()
            if (r0 == r2) goto L39
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.b = r0
            defpackage.cqkx.p(r4)
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjdh.b():void");
    }

    public final void c() {
        if (this.b.booleanValue()) {
            bjdi bjdiVar = this.a;
            String str = bjdiVar.i;
            BreakIterator wordInstance = BreakIterator.getWordInstance(Locale.getDefault());
            wordInstance.setText(str);
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (int first = wordInstance.first(); first != -1; first = wordInstance.next()) {
                String trim = str.substring(i2, first).trim();
                if (trim.length() == 1) {
                    if (!Character.isLetterOrDigit(trim.charAt(0))) {
                        i2 = first;
                    }
                    i++;
                    i3 += first - i2;
                    i2 = first;
                } else {
                    if (trim.isEmpty()) {
                        i2 = first;
                    }
                    i++;
                    i3 += first - i2;
                    i2 = first;
                }
            }
            if (i >= 3 && i3 >= 10) {
                bjea bjeaVar = bjdiVar.d;
                if (bjeaVar == null || !bjeaVar.g().isEmpty()) {
                    bjea bjeaVar2 = bjdiVar.d;
                    if (bjeaVar2 != null) {
                        djap djapVar = bjdiVar.f;
                        List<dqcq> g = bjeaVar2.g();
                        if (djapVar.c) {
                            djapVar.bF();
                            djapVar.c = false;
                        }
                        djar djarVar = (djar) djapVar.b;
                        djar djarVar2 = djar.l;
                        dsrj<dqcq> dsrjVar = djarVar.g;
                        if (!dsrjVar.a()) {
                            djarVar.g = dsqw.cl(dsrjVar);
                        }
                        dsod.bv(g, djarVar.g);
                    }
                    djap djapVar2 = bjdiVar.f;
                    if (djapVar2.c) {
                        djapVar2.bF();
                        djapVar2.c = false;
                    }
                    djar djarVar3 = (djar) djapVar2.b;
                    djar djarVar4 = djar.l;
                    str.getClass();
                    djarVar3.a |= 32;
                    djarVar3.h = str;
                    bjdiVar.s(djapVar2.bK());
                    return;
                }
                bjdiVar.p(true);
                return;
            }
            gcz a = bjdiVar.b.a();
            a.j();
            a.i(R.string.PLACE_QA_QUESTION_TOO_SHORT_ALERT_DIALOG_TITLE);
            a.d(R.string.PLACE_QA_QUESTION_TOO_SHORT_ALERT_DIALOG_MESSAGE);
            cjta c = cjtd.c(bjdiVar.e.bZ());
            c.d = dtxy.go;
            a.i = c.a();
            cjta c2 = cjtd.c(bjdiVar.e.bZ());
            c2.d = dtxy.gp;
            a.h(R.string.OK_BUTTON, c2.a(), bjdc.a);
            a.b();
        }
    }
}
