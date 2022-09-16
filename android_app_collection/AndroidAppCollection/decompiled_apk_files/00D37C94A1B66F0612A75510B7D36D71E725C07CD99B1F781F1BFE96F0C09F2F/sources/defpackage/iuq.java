package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.libraries.youtube.livechat.ui.common.WrappedLinearLayoutManager;
import com.google.android.libraries.youtube.livechat.ui.view.LiveChatRecyclerView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: iuq  reason: default package */
/* loaded from: classes3.dex */
public final class iuq extends ahyf implements View.OnClickListener, fgd {
    private ViewGroup A;
    private ViewGroup B;
    private iup C;
    private boolean D;
    public final azqb a;
    public final Context b;
    public final ajjr c;
    public final tdu d;
    public final azqb e;
    public final boolean f;
    public boolean g;
    public LiveChatRecyclerView h;
    public ViewGroup i;
    public iun j;
    public ajzn k;
    public OrientationEventListener l;
    public final swq m;
    private final azqb n;
    private final ajsg o;
    private final ajyi p;
    private final abhz q;
    private final abpx r;
    private final abpy s;
    private final ayom t;
    private final abjy u;
    private final int v;
    private final int w;
    private final int x;
    private abpw y;
    private RelativeLayout z;

    public iuq(Context context, azqb azqbVar, ajyi ajyiVar, azqb azqbVar2, ajsg ajsgVar, abhz abhzVar, abpx abpxVar, abpy abpyVar, abjy abjyVar, ayom ayomVar, swq swqVar, ajjr ajjrVar, tdu tduVar, azqb azqbVar3) {
        super(context);
        this.b = context;
        this.a = azqbVar;
        this.n = azqbVar2;
        this.p = ajyiVar;
        this.o = ajsgVar;
        this.q = abhzVar;
        this.r = abpxVar;
        this.s = abpyVar;
        this.t = ayomVar;
        this.u = abjyVar;
        this.m = swqVar;
        this.c = ajjrVar;
        this.d = tduVar;
        this.e = azqbVar3;
        this.j = iuo.a();
        this.f = abjyVar.a.d;
        this.v = context.getResources().getDimensionPixelSize(R.dimen.live_chat_overlay_action_panel_collapsed_width);
        this.x = context.getResources().getDimensionPixelSize(R.dimen.live_chat_overlay_conversation_list_width);
        this.w = context.getResources().getDimensionPixelSize(R.dimen.live_chat_overlay_banner_container_width);
    }

    private final void l(View view, int i) {
        zgd.t(view, zgd.r(Math.min(i, ((Integer) zew.p(this.b).first).intValue())), ViewGroup.LayoutParams.class);
    }

    private final void m() {
        this.D = true;
        kU();
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ View a(Context context) {
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, R.layout.live_chat_overlay, null);
        this.i = viewGroup;
        this.h = (LiveChatRecyclerView) viewGroup.findViewById(R.id.conversation_list);
        this.z = (RelativeLayout) this.i.findViewById(R.id.live_chat_overlay_frame);
        this.B = (ViewGroup) this.i.findViewById(R.id.live_chat_banner_container);
        this.A = (ViewGroup) this.i.findViewById(R.id.live_chat_action_panel);
        if (this.y == null) {
            this.y = this.r.a(this.i, true, ((abiq) this.a.get()).p);
        }
        this.h.setOnClickListener(this);
        this.h.ag(new WrappedLinearLayoutManager());
        this.C = new iup(this, this.p, this.o, ((abiq) this.a.get()).p, this.u);
        ium iumVar = new ium(this, context);
        this.l = iumVar;
        iumVar.enable();
        return this.i;
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahyl
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        if (this.D) {
            iuo a = this.j.a();
            if (a.b && a.c != null) {
                abiq abiqVar = (abiq) this.a.get();
                ((abie) this.n.get()).a = abiqVar;
                abiqVar.w(this.C);
                abiqVar.v(a.c);
                abpw abpwVar = this.y;
                if (abpwVar != null) {
                    this.q.c(abpwVar);
                }
                abic abicVar = abiqVar.k;
                abow a2 = this.s.a(viewGroup);
                a2.s = true;
                abiqVar.k.b(a2);
            }
            if (this.f) {
                g();
            }
            e();
            this.D = false;
        }
    }

    public final void e() {
        l(this.A, this.v);
        l(this.B, this.w);
        l(this.h, this.x);
    }

    public final void f(boolean z) {
        this.j.b(z);
        if (z) {
            m();
        } else {
            kT();
            ((abiq) this.a.get()).r();
        }
        X();
    }

    public final void g() {
        RelativeLayout relativeLayout = this.z;
        if (relativeLayout != null) {
            relativeLayout.setAlpha(true != this.g ? 1.0f : 0.3f);
        }
    }

    @Override // defpackage.fgd
    public final void h(ezx ezxVar) {
        this.j.c(ezxVar);
        if (!mY(ezxVar) || !this.j.a().b) {
            kT();
        } else {
            m();
        }
        X();
    }

    public final void i(boolean z) {
        this.j.b(z);
    }

    public final boolean j() {
        return this.j.a().b;
    }

    @Override // defpackage.fgd
    public final boolean mY(ezx ezxVar) {
        return etk.f(ezxVar) && ezxVar.b() && !ezxVar.g() && !ezxVar.e();
    }

    @Override // defpackage.ahyl
    public final boolean mZ() {
        if (this.u.a()) {
            return false;
        }
        iuo a = this.j.a();
        return a.b && a.c != null && mY(a.a);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.t.c(ffv.a);
    }
}
