package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: fr  reason: default package */
/* loaded from: classes.dex */
public abstract class fr<E> extends fn {
    public final Activity b;
    public final Context c;
    public final Handler d;
    final gn e = new go();

    public fr(Activity activity, Context context, Handler handler) {
        this.b = activity;
        this.c = context;
        this.d = handler;
    }

    @Override // defpackage.fn
    public boolean MW() {
        throw null;
    }

    @Override // defpackage.fn
    public View a(int i) {
        throw null;
    }

    public LayoutInflater e() {
        throw null;
    }

    public void f() {
        throw null;
    }

    public boolean g(String str) {
        return false;
    }

    public abstract E i();

    public void k(PrintWriter printWriter, String[] strArr) {
        throw null;
    }

    public boolean l() {
        throw null;
    }

    public final void m(Intent intent, int i) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        akm.i(this.c, intent);
    }
}
