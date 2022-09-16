package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: acfq  reason: default package */
/* loaded from: classes.dex */
public final class acfq implements ComponentCallbacks {
    public azqb a;
    public azqb b;
    public final Context c;
    public final View d;
    public final RecyclerView e;
    public final WindowManager f;
    public final WindowManager.LayoutParams g;
    public final abiq h;
    public final acti i;
    public final ajyi j;
    public final ajxz k;
    public final ajmr l;
    public final ajvm m;
    public final ajjr n;
    public final tdu o;
    public final azqb p;
    public final abjy q;
    public final abka r;
    public acfp s;
    public ajzn t;
    public ajfz u;
    public boolean v;
    public final swq w;

    public acfq(Context context, yzj yzjVar, acti actiVar, ajxz ajxzVar, ajmr ajmrVar, abiq abiqVar, ajvm ajvmVar, swq swqVar, ajjr ajjrVar, tdu tduVar, azqb azqbVar, abjy abjyVar, abka abkaVar) {
        this.c = context;
        this.i = actiVar;
        this.p = azqbVar;
        yzjVar.getClass();
        ajxzVar.getClass();
        this.k = ajxzVar;
        this.l = ajmrVar;
        this.h = abiqVar;
        this.m = ajvmVar;
        this.w = swqVar;
        this.n = ajjrVar;
        this.o = tduVar;
        this.q = abjyVar;
        this.r = abkaVar;
        this.f = (WindowManager) context.getSystemService("window");
        View inflate = LayoutInflater.from(context).inflate(R.layout.live_chat_window, (ViewGroup) null);
        this.d = inflate;
        this.e = (RecyclerView) inflate.findViewById(R.id.conversation_list);
        this.j = new acfm(this);
        WindowManager.LayoutParams b = achc.b();
        this.g = b;
        b.flags |= 16;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.screencast_live_chat_window_alpha, typedValue, true);
        b.alpha = typedValue.getFloat();
        d();
        context.registerComponentCallbacks(this);
    }

    private final void d() {
        Resources resources = this.c.getResources();
        int integer = resources.getInteger(R.integer.screencast_live_chat_width_percent);
        int integer2 = resources.getInteger(R.integer.screencast_live_chat_height_percent);
        int l = zew.l(this.c);
        int j = zew.j(this.c);
        this.g.width = (l * integer) / 100;
        this.g.height = (j * integer2) / 100;
    }

    public final void a() {
        if (this.d.getParent() != null) {
            this.f.removeView(this.d);
        }
        this.u = null;
        this.c.unregisterComponentCallbacks(this);
    }

    public final void b() {
        if (this.v) {
            this.v = false;
            if (this.u == null) {
                return;
            }
            this.h.C();
        }
    }

    public final void c() {
        if (!this.v || this.d.getParent() == null) {
            return;
        }
        this.f.updateViewLayout(this.d, this.g);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        d();
        c();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
