package defpackage;

import android.app.Activity;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ytc  reason: default package */
/* loaded from: classes7.dex */
public class ytc {
    public static final dcqe a = dcqe.c("ytc");
    public final qed b;
    public final vtn c;
    public final yux d;
    public final Executor e;
    public final Activity f;
    @dzsi
    public cryz<List<ysz>> g;
    public int h = 5;

    public ytc(Activity activity, qed qedVar, vtn vtnVar, yux yuxVar, Executor executor) {
        this.b = qedVar;
        this.c = vtnVar;
        this.d = yuxVar;
        this.e = executor;
        this.f = activity;
    }

    public final void a() {
        cryz<List<ysz>> cryzVar = this.g;
        if (cryzVar != null) {
            cryzVar.c();
            this.g = null;
        }
        this.b.b();
    }
}
