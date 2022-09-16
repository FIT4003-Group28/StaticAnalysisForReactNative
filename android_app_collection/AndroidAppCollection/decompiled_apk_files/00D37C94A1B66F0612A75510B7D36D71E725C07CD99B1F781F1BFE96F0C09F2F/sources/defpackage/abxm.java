package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abxm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abxm implements Runnable {
    public final /* synthetic */ abyk a;
    private final /* synthetic */ int b;

    public /* synthetic */ abxm(abyk abykVar) {
        this.a = abykVar;
    }

    public /* synthetic */ abxm(abyk abykVar, int i) {
        this.b = i;
        this.a = abykVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            abyk abykVar = this.a;
            zep.b("Kill connection dead man's switch triggered, stopping stream.");
            abxa.b().n(9, 19, null);
            abykVar.i(11, abykVar.u.getString(R.string.lc_error_generic), false);
        } else if (i == 1) {
            this.a.f();
        } else if (i == 2) {
            this.a.f();
        } else {
            this.a.o();
        }
    }
}
