package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: rd  reason: default package */
/* loaded from: classes.dex */
public abstract class rd {
    public static int a = -100;
    public static final aih<WeakReference<rd>> b = new aih<>();
    public static final Object c = new Object();

    public static rd a(Activity activity, rc rcVar) {
        return new rv(activity, null, rcVar, activity);
    }

    public static rd b(Dialog dialog, rc rcVar) {
        return new rv(dialog.getContext(), dialog.getWindow(), rcVar, dialog);
    }

    public static void n(int i) {
        if (a != i) {
            a = i;
            synchronized (c) {
                Iterator<WeakReference<rd>> it = b.iterator();
                while (it.hasNext()) {
                    rd rdVar = it.next().get();
                    if (rdVar != null) {
                        rdVar.p();
                    }
                }
            }
        }
    }

    public static void o(rd rdVar) {
        synchronized (c) {
            Iterator<WeakReference<rd>> it = b.iterator();
            while (it.hasNext()) {
                rd rdVar2 = it.next().get();
                if (rdVar2 == rdVar || rdVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract qk c();

    public abstract void d();

    public abstract <T extends View> T e(int i);

    public abstract void f(View view);

    public abstract void g(int i);

    public abstract void h(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void i(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void j(CharSequence charSequence);

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s(int i);
}
