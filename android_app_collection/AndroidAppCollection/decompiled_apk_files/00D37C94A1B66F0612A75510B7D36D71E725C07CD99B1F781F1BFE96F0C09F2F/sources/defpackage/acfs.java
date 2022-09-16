package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;
import com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
/* compiled from: PG */
/* renamed from: acfs  reason: default package */
/* loaded from: classes.dex */
public final class acfs implements ComponentCallbacks, aceu, acfj, acek, acet, acgb, acfe {
    public final Context a;
    public final acgd b;
    public final acfh c;
    public final acfq d;
    public final NetworkOperationView e;
    public final acfr f;
    public final String g;
    public boolean h;
    public int i = 1;
    public final aocm j;
    private final ViewGroup k;
    private final WindowManager l;

    public acfs(Context context, wal walVar, acti actiVar, axnm axnmVar, ajxz ajxzVar, ajmy ajmyVar, SharedPreferences sharedPreferences, acfr acfrVar) {
        this.a = context;
        this.f = acfrVar;
        this.j = new aocm(sharedPreferences);
        acfh acfhVar = new acfh(context, ajxzVar, actiVar);
        this.c = acfhVar;
        acfhVar.y = this;
        acfhVar.o(55);
        acfq acfqVar = (acfq) axnmVar.get();
        this.d = acfqVar;
        acfqVar.g.gravity = 83;
        acfqVar.c();
        this.b = new acgd(context, walVar, ajmyVar);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.spinner_window, (ViewGroup) null);
        this.k = viewGroup;
        this.e = (NetworkOperationView) viewGroup.findViewById(R.id.choose_thumbnail_network_operation);
        this.g = context.getResources().getString(R.string.lc_going_live);
        this.l = (WindowManager) context.getSystemService("window");
    }

    public static boolean m(acfs acfsVar) {
        return (acfsVar == null || acfsVar.i == 1) ? false : true;
    }

    public static boolean n(int i) {
        if (i != 1) {
            return true;
        }
        try {
            throw new IllegalStateException();
        } catch (IllegalStateException e) {
            Log.e("ScreencastControls", "Screencast controls not initialized", e);
            return false;
        }
    }

    @Override // defpackage.aceu
    public final void a() {
        ajfz ajfzVar;
        acfq acfqVar = this.d;
        if (acfqVar != null) {
            if (!acfqVar.v && (ajfzVar = acfqVar.u) != null) {
                acfqVar.v = true;
                acfqVar.h.z(ajfzVar);
            }
            this.d.d.setVisibility(0);
        }
    }

    public final void b() {
        WindowManager.LayoutParams b = achc.b();
        b.width = -1;
        b.height = -1;
        this.k.measure(0, 0);
        if (this.k.getParent() == null) {
            this.l.addView(this.k, b);
        }
    }

    public final void c() {
        String str;
        if (n(this.i) && this.i != 5) {
            e();
            this.c.b();
            acfh acfhVar = this.c;
            acfhVar.E = true;
            acfhVar.r();
            this.c.l.setVisibility(0);
            acfh acfhVar2 = this.c;
            acfhVar2.c.setVisibility(8);
            acfhVar2.d.setVisibility(0);
            acfhVar2.d.f(SystemClock.elapsedRealtime());
            acgd acgdVar = this.b;
            if (n(acgdVar.u) && acgdVar.u != 5) {
                acgdVar.g(false);
                acgdVar.c();
                acgdVar.d.setVisibility(8);
                acgdVar.a();
                acgdVar.g(true);
                acgdVar.u = 5;
            }
            int i = this.i;
            if (i == 4) {
                this.i = 5;
                ScreencastHostService screencastHostService = (ScreencastHostService) this.f;
                if (!m(screencastHostService.o)) {
                    return;
                }
                screencastHostService.o.j(acfg.DEFAULT, screencastHostService.getString(R.string.screencast_stream_transmitting));
                screencastHostService.r.a = true;
                return;
            }
            switch (i) {
                case 1:
                    str = "UNINITIALIZED";
                    break;
                case 2:
                    str = "INITIALIZED";
                    break;
                case 3:
                    str = "INITIAL";
                    break;
                case 4:
                    str = "LAUNCHING";
                    break;
                case 5:
                    str = "ACTIVE";
                    break;
                case 6:
                    str = "ERROR";
                    break;
                case 7:
                    str = "DONE";
                    break;
                default:
                    str = "null";
                    break;
            }
            if (i == 0) {
                throw null;
            }
            StringBuilder sb = new StringBuilder(str.length() + 49);
            sb.append("Unexpected state ");
            sb.append(str);
            sb.append(", not proceeding to ACTIVE state");
            Log.w("ScreencastControls", sb.toString());
        }
    }

    public final void d() {
        if (n(this.i) && this.i != 7) {
            e();
            acgd acgdVar = this.b;
            if (n(acgdVar.u) && acgdVar.u != 7) {
                acgdVar.a();
                acgdVar.g(false);
                acgdVar.c();
                acgdVar.d.setVisibility(0);
                acgdVar.u = 7;
            }
            this.c.b();
            this.c.c();
            acfq acfqVar = this.d;
            if (acfqVar != null) {
                acfqVar.b();
                this.d.a();
            }
            this.i = 7;
            ((ScreencastHostService) this.f).k();
        }
    }

    public final void e() {
        if (this.k.getParent() != null) {
            this.e.setVisibility(8);
            this.l.removeView(this.k);
        }
    }

    public final void f() {
        acfq acfqVar = this.d;
        if (acfqVar != null) {
            acfqVar.c();
        }
    }

    public final void g(boolean z) {
        this.c.q(z);
    }

    public final void h(String str) {
        b();
        this.e.d();
        this.e.b.setText(str);
        this.e.a(0);
        this.e.setVisibility(0);
    }

    public final void i(int i) {
        b();
        this.e.d();
        this.e.a(4);
        this.e.a.setText(i);
        this.e.setVisibility(0);
    }

    public final void j(acfg acfgVar, String str) {
        acfh acfhVar = this.c;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        acfhVar.v.removeCallbacks(acfhVar.u);
        Animator animator = acfhVar.x;
        if (animator != null) {
            animator.cancel();
        }
        acfhVar.f(false);
        acfhVar.p.setBackgroundResource(acfgVar.c);
        acfhVar.q.setTextColor(ake.d(acfhVar.f, acfgVar.d));
        acfhVar.q.setText(str);
        acfhVar.q.announceForAccessibility(str);
        acfhVar.v.removeCallbacks(acfhVar.u);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(acfhVar.p, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addListener(new acfb(acfhVar));
        acfhVar.w = ofFloat;
        acfhVar.w.start();
        acfhVar.v.postDelayed(acfhVar.u, 3000L);
    }

    public final void k() {
        acfq acfqVar = this.d;
        if (acfqVar != null) {
            acfqVar.c();
        }
    }

    public final void l(aths athsVar) {
        if (athsVar == null) {
            return;
        }
        acfh acfhVar = this.c;
        athq athqVar = athsVar.d;
        if (athqVar == null) {
            athqVar = athq.a;
        }
        if (athqVar.b == 65153809) {
            apoj apojVar = (apoj) athqVar.c;
            acfhVar.D = apojVar.t.I();
            acfhVar.o.D(new acte(acfhVar.D));
            if ((apojVar.b & 65536) != 0) {
                ImageButton imageButton = acfhVar.e;
                aovr aovrVar = apojVar.r;
                if (aovrVar == null) {
                    aovrVar = aovr.a;
                }
                imageButton.setContentDescription(aovrVar.c);
            }
        }
        ajfz ajfzVar = null;
        if ((athsVar.b & 16) != 0) {
            apzg apzgVar = athsVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            LiveChatEndpointOuterClass$LiveChatEndpoint liveChatEndpointOuterClass$LiveChatEndpoint = (LiveChatEndpointOuterClass$LiveChatEndpoint) apzgVar.qm(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint);
            if (liveChatEndpointOuterClass$LiveChatEndpoint != null && (liveChatEndpointOuterClass$LiveChatEndpoint.b & 2) != 0) {
                assp asspVar = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                if (asspVar == null) {
                    asspVar = assp.a;
                }
                if ((asspVar.b & 1) != 0) {
                    assp asspVar2 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                    if (asspVar2 == null) {
                        asspVar2 = assp.a;
                    }
                    aumx aumxVar = asspVar2.c;
                    if (aumxVar == null) {
                        aumxVar = aumx.a;
                    }
                    ajfzVar = ajna.g(aumxVar);
                } else {
                    assp asspVar3 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                    if (asspVar3 == null) {
                        asspVar3 = assp.a;
                    }
                    if ((asspVar3.b & 2) != 0) {
                        assp asspVar4 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                        if (asspVar4 == null) {
                            asspVar4 = assp.a;
                        }
                        avia aviaVar = asspVar4.d;
                        if (aviaVar == null) {
                            aviaVar = avia.a;
                        }
                        ajfzVar = ajna.g(aviaVar);
                    } else {
                        assp asspVar5 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                        if (asspVar5 == null) {
                            asspVar5 = assp.a;
                        }
                        if ((asspVar5.b & 4) != 0) {
                            assp asspVar6 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                            if (asspVar6 == null) {
                                asspVar6 = assp.a;
                            }
                            askw askwVar = asspVar6.e;
                            if (askwVar == null) {
                                askwVar = askw.a;
                            }
                            ajfzVar = ajna.g(askwVar);
                        } else {
                            assp asspVar7 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                            if (asspVar7 == null) {
                                asspVar7 = assp.a;
                            }
                            if ((asspVar7.b & 8) != 0) {
                                assp asspVar8 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                                if (asspVar8 == null) {
                                    asspVar8 = assp.a;
                                }
                                assq assqVar = asspVar8.f;
                                if (assqVar == null) {
                                    assqVar = assq.a;
                                }
                                ajfzVar = ajna.g(assqVar);
                            } else {
                                assp asspVar9 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                                if (asspVar9 == null) {
                                    asspVar9 = assp.a;
                                }
                                if ((asspVar9.b & 16) != 0) {
                                    assp asspVar10 = liveChatEndpointOuterClass$LiveChatEndpoint.d;
                                    if (asspVar10 == null) {
                                        asspVar10 = assp.a;
                                    }
                                    aubu aubuVar = asspVar10.g;
                                    if (aubuVar == null) {
                                        aubuVar = aubu.a;
                                    }
                                    ajfzVar = ajna.g(aubuVar);
                                }
                            }
                        }
                    }
                }
            }
        }
        acfq acfqVar = this.d;
        if (acfqVar == null || ajfzVar == null) {
            return;
        }
        acfqVar.u = ajfzVar;
        if (acfqVar.s == null) {
            acfqVar.s = new acfp(acfqVar);
        }
        if (acfqVar.d.getParent() == null) {
            acfqVar.f.addView(acfqVar.d, acfqVar.g);
        }
        acfqVar.d.setVisibility(8);
        acfqVar.h.w(acfqVar.s);
        if (!this.h) {
            return;
        }
        a();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.b.onConfigurationChanged(configuration);
        int j = zew.j(this.a);
        Rect rect = this.b.k;
        int height = (this.c.b.getHeight() * 5) / 4;
        if ((this.c.a.gravity & 48) == 48) {
            if (rect.bottom < j - height) {
                return;
            }
            this.c.o(87);
        } else if (rect.top > height) {
        } else {
            this.c.o(55);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
