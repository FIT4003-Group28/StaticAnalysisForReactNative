package defpackage;

import android.app.Activity;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: afgr  reason: default package */
/* loaded from: classes2.dex */
public final class afgr implements Runnable {
    final /* synthetic */ Activity a;
    final /* synthetic */ afbp b;
    public final /* synthetic */ deig c;
    public final /* synthetic */ Callable d;
    public final /* synthetic */ afgs e;

    public afgr(afgs afgsVar, Activity activity, afbp afbpVar, deig deigVar, Callable callable) {
        this.e = afgsVar;
        this.a = activity;
        this.b = afbpVar;
        this.c = deigVar;
        this.d = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afbj afbjVar = new afbj(this.a, this.b, this.e.c);
        this.b.c(new afgq(this, afbjVar));
        afbjVar.show();
    }
}
