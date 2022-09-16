package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: afou  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afou implements Runnable {
    public final /* synthetic */ afoy a;
    public final /* synthetic */ cyv b;
    private final /* synthetic */ int c;

    public /* synthetic */ afou(afoy afoyVar, cyv cyvVar) {
        this.a = afoyVar;
        this.b = cyvVar;
    }

    public /* synthetic */ afou(afoy afoyVar, cyv cyvVar, int i) {
        this.c = i;
        this.a = afoyVar;
        this.b = cyvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            new Handler(Looper.getMainLooper()).post(new afou(this.a, this.b, 1));
            return;
        }
        afoy afoyVar = this.a;
        cyv cyvVar = this.b;
        amvn amvnVar = afpe.a;
        int lineCount = afoyVar.getLineCount();
        if (Build.VERSION.SDK_INT >= 29 && afoyVar.mo589getText().length() == 0) {
            lineCount = afpe.a(afoyVar);
        }
        int lineHeight = afoyVar.getLineHeight();
        int i = afop.L;
        if (cyvVar.f == null) {
            return;
        }
        cyvVar.h(new ddk(0, Integer.valueOf(lineCount), Integer.valueOf(lineHeight)), "updateState:SuggestEditableText.remeasureForUpdatedText");
    }
}
