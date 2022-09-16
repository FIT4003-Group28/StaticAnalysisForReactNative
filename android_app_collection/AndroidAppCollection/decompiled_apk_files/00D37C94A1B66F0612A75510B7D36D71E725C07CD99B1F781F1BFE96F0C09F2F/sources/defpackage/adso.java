package defpackage;

import android.content.Context;
import android.os.Handler;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import java.util.List;
/* compiled from: PG */
/* renamed from: adso  reason: default package */
/* loaded from: classes.dex */
public final class adso {
    public static final String a = zep.a("MdxSpeechController");
    public final adsn b;
    protected SpeechRecognizer c;
    public List d;
    public List e;
    public String f;
    public String g;
    protected final RecognitionListener h = new adsl(this);
    private final Context i;
    private final Handler j;
    private adsm k;

    public adso(Context context, Handler handler, adsn adsnVar) {
        this.i = context;
        this.j = handler;
        this.b = adsnVar;
        e();
    }

    public final String a() {
        StringBuilder b = b();
        if (!TextUtils.isEmpty(this.f)) {
            b.append(this.f);
        }
        return b.toString().trim();
    }

    public final StringBuilder b() {
        StringBuilder sb = new StringBuilder("");
        List<String> list = this.d;
        if (list != null) {
            for (String str : list) {
                sb.append(str);
                sb.append(" ");
            }
        }
        return sb;
    }

    public final void c() {
        adsm adsmVar = this.k;
        if (adsmVar != null) {
            this.j.removeCallbacks(adsmVar);
            this.k = null;
        }
    }

    public final void d() {
        c();
        adsm adsmVar = new adsm(this);
        this.k = adsmVar;
        this.j.postDelayed(adsmVar, 4000L);
    }

    public final void e() {
        if (SpeechRecognizer.isRecognitionAvailable(this.i)) {
            SpeechRecognizer speechRecognizer = this.c;
            if (speechRecognizer != null) {
                try {
                    speechRecognizer.destroy();
                } catch (Throwable th) {
                    try {
                        String str = a;
                        String valueOf = String.valueOf(th.getMessage());
                        zep.m(str, valueOf.length() != 0 ? "Non-Fatal error while destroying speech. ".concat(valueOf) : new String("Non-Fatal error while destroying speech. "));
                        this.c = null;
                    } finally {
                        this.c = null;
                    }
                }
            }
            SpeechRecognizer createSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(this.i);
            this.c = createSpeechRecognizer;
            createSpeechRecognizer.setRecognitionListener(this.h);
        } else {
            this.c = null;
            this.b.d();
        }
        this.e = null;
        this.d = null;
        this.f = null;
    }

    public final void f() {
        this.b.c(a());
        e();
    }

    public final void g() {
        SpeechRecognizer speechRecognizer = this.c;
        if (speechRecognizer == null) {
            this.b.d();
        } else {
            speechRecognizer.cancel();
        }
    }
}
