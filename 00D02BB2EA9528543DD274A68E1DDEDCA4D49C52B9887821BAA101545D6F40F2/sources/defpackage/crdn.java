package defpackage;

import android.app.Application;
import android.speech.tts.TextToSpeech;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: crdn  reason: default package */
/* loaded from: classes5.dex */
public final class crdn implements crep {
    public volatile int a;
    private final Application b;
    private final bvrb c;
    private final Executor d;
    private final dwkj e;
    @dzsi
    private creq f = null;
    private volatile boolean g;
    private final crdl h;

    public crdn(Application application, bvrb bvrbVar, Executor executor, btvo btvoVar, crdl crdlVar) {
        this.b = application;
        this.c = bvrbVar;
        this.d = executor;
        this.e = btvoVar.getTextToSpeechParameters();
        this.h = crdlVar;
    }

    private final synchronized void e(creo creoVar, creq creqVar) {
        this.f = creqVar;
        crdm crdmVar = new crdm(this, creoVar);
        if (((crdr) creqVar).g == null) {
            final crdq crdqVar = new crdq((crdr) creqVar, crdmVar);
            final crdr crdrVar = (crdr) creqVar;
            ((crdr) creqVar).c.b(new Runnable(crdrVar, crdqVar) { // from class: crdo
                private final crdr a;
                private final TextToSpeech.OnInitListener b;

                {
                    this.a = crdrVar;
                    this.b = crdqVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    deig<Void> deigVar;
                    crdr crdrVar2 = this.a;
                    TextToSpeech.OnInitListener onInitListener = this.b;
                    bvrj.ALERT_CONTROLLER.c();
                    try {
                        crdrVar2.g = new TextToSpeech(crdrVar2.b, onInitListener, "com.google.android.tts");
                        deigVar = crdrVar2.f;
                    } catch (Throwable th) {
                        try {
                            bvoo.f(new RuntimeException("Exception or error creating TTS", th));
                            onInitListener.onInit(-1);
                            deigVar = crdrVar2.f;
                        } catch (Throwable th2) {
                            crdrVar2.f.j(null);
                            throw th2;
                        }
                    }
                    deigVar.j(null);
                }
            }, bvrj.ALERT_CONTROLLER);
        }
    }

    @Override // defpackage.crep
    public final void a(creo creoVar, crox croxVar) {
        e(creoVar, new crdr(this.b, this.c, this.d, this.e, croxVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(int r8, java.util.Locale r9, defpackage.creo r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = -1
            r1 = 1
            r2 = -2
            r3 = 0
            if (r8 != 0) goto L81
            creq r8 = r7.f     // Catch: java.lang.Throwable -> L7f
            if (r8 == 0) goto L7d
            java.util.Locale r4 = r8.a()     // Catch: java.lang.Throwable -> L7f
            if (r4 == 0) goto L1d
            r5 = r8
            crdr r5 = (defpackage.crdr) r5     // Catch: java.lang.Throwable -> L7f
            android.speech.tts.TextToSpeech r5 = r5.g     // Catch: java.lang.Throwable -> L7f
            if (r5 == 0) goto L1d
            int r5 = r5.isLanguageAvailable(r4)     // Catch: java.lang.Throwable -> L7f
            goto L1e
        L1d:
            r5 = -2
        L1e:
            boolean r4 = defpackage.crdr.e(r9, r4)     // Catch: java.lang.Throwable -> L7f
            if (r4 != 0) goto L66
            if (r9 != 0) goto L28
            r5 = -2
            goto L63
        L28:
            r4 = r8
            crdr r4 = (defpackage.crdr) r4     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L7f
            android.speech.tts.TextToSpeech r4 = r4.g     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L7f
            if (r4 == 0) goto L34
            int r4 = r4.setLanguage(r9)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L7f
            goto L35
        L34:
            r4 = -1
        L35:
            r5 = r8
            crdr r5 = (defpackage.crdr) r5     // Catch: java.lang.Throwable -> L7f
            java.util.Locale r5 = r5.a()     // Catch: java.lang.Throwable -> L7f
            boolean r6 = defpackage.crdr.e(r9, r5)     // Catch: java.lang.Throwable -> L7f
            boolean r9 = defpackage.crdr.f(r9, r5)     // Catch: java.lang.Throwable -> L7f
            if (r4 == r2) goto L51
            if (r4 == r0) goto L51
            if (r6 == 0) goto L4c
            r4 = 1
            goto L51
        L4c:
            if (r9 == 0) goto L50
            r4 = 0
            goto L51
        L50:
            r4 = -2
        L51:
            r9 = r8
            crdr r9 = (defpackage.crdr) r9     // Catch: java.lang.Throwable -> L7f
            r9.h = r5     // Catch: java.lang.Throwable -> L7f
            r5 = r4
            goto L63
        L58:
            r9 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L7f
            r4[r3] = r9     // Catch: java.lang.Throwable -> L7f
            java.lang.String r9 = "Exception in TTS.setLanguage(): %s"
            defpackage.bvoo.h(r9, r4)     // Catch: java.lang.Throwable -> L7f
            r5 = -1
        L63:
            r8.a()     // Catch: java.lang.Throwable -> L7f
        L66:
            if (r5 == r2) goto L7c
            if (r5 != r0) goto L6b
            goto L7c
        L6b:
            creq r8 = r7.f     // Catch: java.lang.Throwable -> L7f
            crdr r8 = (defpackage.crdr) r8     // Catch: java.lang.Throwable -> L7f
            android.speech.tts.TextToSpeech r8 = r8.g     // Catch: java.lang.Throwable -> L7f
            if (r8 == 0) goto L78
            r9 = 1065353216(0x3f800000, float:1.0)
            r8.setSpeechRate(r9)     // Catch: java.lang.Throwable -> L7f
        L78:
            r2 = r5
            r8 = 0
            r9 = 1
            goto L82
        L7c:
            r2 = r5
        L7d:
            r8 = 0
            goto L81
        L7f:
            r8 = move-exception
            goto La4
        L81:
            r9 = 0
        L82:
            r7.g = r1     // Catch: java.lang.Throwable -> L7f
            if (r8 != 0) goto L8d
            creq r8 = r7.f     // Catch: java.lang.Throwable -> L7f
            if (r8 == 0) goto L8d
            r8.a()     // Catch: java.lang.Throwable -> L7f
        L8d:
            if (r10 == 0) goto L9f
            if (r9 == 0) goto L95
            r10.a(r3)     // Catch: java.lang.Throwable -> L7f
            goto L9f
        L95:
            if (r2 != r0) goto L9b
            r10.a(r1)     // Catch: java.lang.Throwable -> L7f
            goto L9f
        L9b:
            r8 = 2
            r10.a(r8)     // Catch: java.lang.Throwable -> L7f
        L9f:
            r7.notifyAll()     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r7)
            return
        La4:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crdn.b(int, java.util.Locale, creo):void");
    }

    @Override // defpackage.crep
    @dzsi
    public final creq c() {
        return this.f;
    }

    @Override // defpackage.crep
    public final synchronized void d(Locale locale, creo creoVar) {
        if (this.g) {
            this.g = false;
            b(this.a, locale, creoVar);
        }
    }
}
