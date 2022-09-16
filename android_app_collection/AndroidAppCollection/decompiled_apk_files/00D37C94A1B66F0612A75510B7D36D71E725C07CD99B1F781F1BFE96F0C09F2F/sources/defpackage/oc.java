package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: oc  reason: default package */
/* loaded from: classes3.dex */
public abstract class oc {
    public static final afy a = new afy();
    public static final Object b = new Object();

    public static oc e(Activity activity, ob obVar) {
        return new ot(activity, null, obVar, activity);
    }

    public static oc f(Dialog dialog, ob obVar) {
        return new ot(dialog.getContext(), dialog.getWindow(), obVar, dialog);
    }

    public static void q(oc ocVar) {
        synchronized (b) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                oc ocVar2 = (oc) ((WeakReference) it.next()).get();
                if (ocVar2 == ocVar || ocVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A();

    public abstract void B();

    public abstract void C();

    public int a() {
        throw null;
    }

    public Context b(Context context) {
        throw null;
    }

    public abstract nj c();

    public abstract nk d();

    public abstract re g(rd rdVar);

    public abstract MenuInflater h();

    public abstract View i(int i);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract void r(int i);

    public abstract void s(View view);

    public abstract void t(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void u(int i);

    public abstract void v(Toolbar toolbar);

    public void w(int i) {
        throw null;
    }

    public abstract void x(CharSequence charSequence);

    public abstract boolean y(int i);

    public abstract void z();
}
