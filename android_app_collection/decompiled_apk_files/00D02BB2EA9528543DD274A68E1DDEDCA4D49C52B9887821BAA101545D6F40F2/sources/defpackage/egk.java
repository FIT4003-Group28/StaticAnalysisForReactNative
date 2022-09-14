package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: egk  reason: default package */
/* loaded from: classes6.dex */
public class egk {
    @dzsi
    public View a;
    @dzsi
    public Runnable b;
    public int c = 0;

    public final void a(@dzsi View view) {
        this.a = view;
        b();
    }

    public final void b() {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
