package defpackage;

import android.app.Activity;
import android.app.Dialog;
import com.google.android.libraries.youtube.player.playability.AgeVerificationDialog$CustomWebView;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aiom  reason: default package */
/* loaded from: classes.dex */
public final class aiom implements aion {
    public final WeakReference a;
    public final Executor b;
    public final afvn c;
    public Dialog d;
    public AgeVerificationDialog$CustomWebView e;
    public yiy f;
    public final vzc g;
    public aior h;

    public aiom(Activity activity, Executor executor, afvn afvnVar, vzc vzcVar) {
        this.a = new WeakReference(activity);
        executor.getClass();
        this.b = executor;
        afvnVar.getClass();
        this.c = afvnVar;
        vzcVar.getClass();
        this.g = vzcVar;
    }

    public final void a() {
        yiy yiyVar = this.f;
        if (yiyVar != null) {
            yiyVar.d();
        }
        this.d.dismiss();
        this.e.loadUrl("about:blank");
    }

    public final void b() {
        a();
        this.h.b();
    }

    public final void c() {
        a();
        aior aiorVar = this.h;
        aiot.a(aiorVar.b, aiorVar.c.i(aiorVar.a));
    }
}
