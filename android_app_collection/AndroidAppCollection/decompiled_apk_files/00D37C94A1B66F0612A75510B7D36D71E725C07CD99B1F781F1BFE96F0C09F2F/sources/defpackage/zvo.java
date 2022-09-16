package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: zvo  reason: default package */
/* loaded from: classes4.dex */
public final class zvo extends xo {
    public zvl d;
    public boolean e;
    private final Context f;
    private final List g = new ArrayList();
    private final Executor h;
    private final int i;
    private final zvn j;

    public zvo(Context context, Executor executor, int i) {
        context.getClass();
        this.f = context;
        executor.getClass();
        this.h = executor;
        this.i = i;
        this.j = new zvn((((ActivityManager) context.getSystemService("activity")).getMemoryClass() * 1048576) / 4);
    }

    private static void D(zvp zvpVar) {
        zvm zvmVar;
        if (zvpVar == null || (zvmVar = zvpVar.d) == null) {
            return;
        }
        zvmVar.a();
        zvpVar.d = null;
    }

    public static void y(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt instanceof zvp) {
                D((zvp) childAt);
            }
        }
    }

    final boolean A() {
        return this.i != 0;
    }

    public final boolean B() {
        return this.g.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean C(int i) {
        return i == 0 && A();
    }

    @Override // defpackage.xo
    public final int b() {
        return A() ? this.g.size() + 1 : this.g.size();
    }

    @Override // defpackage.xo
    public final int c(int i) {
        return C(i) ? 0 : 1;
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void o(yo yoVar, int i) {
        zvk zvkVar = (zvk) yoVar;
        if (C(i)) {
            return;
        }
        DeviceLocalFile w = w(i);
        zvp E = zvkVar.E();
        D(E);
        E.a.setContentDescription(w.h());
        ampq ampqVar = (ampq) this.j.c(w);
        if (ampqVar == null) {
            E.a();
            E.d(null);
            E.c(0L);
            zvm zvmVar = new zvm(this.f, this, this.j, w, E, i);
            E.d = zvmVar;
            zvmVar.executeOnExecutor(this.h, new Void[0]);
        } else if (!ampqVar.h()) {
            E.a.setBackgroundColor(E.c);
            E.b.setVisibility(0);
            E.d(null);
            E.c(w.b());
        } else {
            E.a();
            E.d((Bitmap) ampqVar.c());
            E.c(w.b());
        }
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ void p(yo yoVar) {
        D(((zvk) yoVar).E());
    }

    final DeviceLocalFile w(int i) {
        List list = this.g;
        if (A()) {
            i--;
        }
        return (DeviceLocalFile) list.get(i);
    }

    public final Object x(int i) {
        if (i == -1 || C(i) || i >= b()) {
            return null;
        }
        return w(i);
    }

    public final void z(List list) {
        this.g.clear();
        this.g.addAll(list);
        mr();
    }

    @Override // defpackage.xo
    public final /* bridge */ /* synthetic */ yo f(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new zvk(this, LayoutInflater.from(viewGroup.getContext()).inflate(this.i, viewGroup, false));
        }
        if (A()) {
            return new zvk(this, new zvq(this.f));
        }
        return new zvk(this, new zvp(this.f, this.e));
    }
}
