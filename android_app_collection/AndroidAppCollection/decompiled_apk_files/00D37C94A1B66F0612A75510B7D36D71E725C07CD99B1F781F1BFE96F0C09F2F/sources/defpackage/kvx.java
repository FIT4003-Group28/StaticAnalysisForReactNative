package defpackage;

import com.google.android.youtube.R;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: kvx  reason: default package */
/* loaded from: classes3.dex */
public final class kvx implements Runnable {
    final /* synthetic */ kvz a;
    private final akhl b;

    public kvx(kvz kvzVar, akhl akhlVar) {
        this.a = kvzVar;
        this.b = akhlVar;
    }

    private final void a() {
        this.a.ap.runOnUiThread(new Runnable() { // from class: kvw
            @Override // java.lang.Runnable
            public final void run() {
                zag.q(kvx.this.a.ap, R.string.delete_search_suggestion_error, 0);
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            akib a = this.a.e.a();
            akhl akhlVar = this.b;
            akhlVar.getClass();
            if (akhlVar.b()) {
                akhr akhrVar = new akhr();
                akhrVar.e = akhlVar.e;
                akhrVar.d(a.e(), a.g());
                if (a.b.d(akhrVar)) {
                    return;
                }
            }
            a();
        } catch (IOException e) {
            kvz kvzVar = this.a;
            kwn kwnVar = kvzVar.aO;
            akvm akvmVar = kvzVar.aw;
            if (kwnVar.b() && akvmVar != null) {
                akvmVar.c("IOException", "DeleteSuggestion");
            }
            this.a.aO.a("Error deleting search suggestions", e);
            zep.n("Error deleting search suggestions", e);
            a();
        }
    }
}
