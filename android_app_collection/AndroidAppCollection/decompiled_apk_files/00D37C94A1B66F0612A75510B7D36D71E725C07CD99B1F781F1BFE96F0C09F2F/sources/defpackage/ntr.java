package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ntr  reason: default package */
/* loaded from: classes3.dex */
public final class ntr {
    public static aynx a(aynx aynxVar) {
        return aynxVar.L().aj().sq();
    }

    public static ayob b(final aynx aynxVar) {
        return new ayob() { // from class: ntq
            @Override // defpackage.ayob
            public final bamd a(aynx aynxVar2) {
                return aynx.this.O(new kaf(aynxVar2, 3));
            }
        };
    }

    public static ayoi c(ayoi ayoiVar) {
        return ayoiVar.aa().aE().d();
    }

    public static String d(aqvq aqvqVar) {
        aqvl aqvlVar;
        if (aqvqVar.d == 18) {
            aqvlVar = (aqvl) aqvqVar.e;
        } else {
            aqvlVar = aqvl.a;
        }
        if ((aqvlVar.b & 2) != 0) {
            return (aqvqVar.d == 18 ? (aqvl) aqvqVar.e : aqvl.a).d;
        } else if (aqvqVar.d != 1) {
            return null;
        } else {
            return (String) aqvqVar.e;
        }
    }

    public static String e(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) {
        aqvl aqvlVar;
        if (showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c == 10) {
            aqvlVar = (aqvl) showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d;
        } else {
            aqvlVar = aqvl.a;
        }
        if ((aqvlVar.b & 2) != 0) {
            return (showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c == 10 ? (aqvl) showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d : aqvl.a).d;
        } else if (showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c != 1) {
            return null;
        } else {
            return (String) showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d;
        }
    }

    public static String f(ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand) {
        aqvl aqvlVar;
        if (toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.b == 2) {
            aqvlVar = (aqvl) toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.c;
        } else {
            aqvlVar = aqvl.a;
        }
        if ((aqvlVar.b & 2) != 0) {
            return (toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.b == 2 ? (aqvl) toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.c : aqvl.a).d;
        } else if (toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.b != 1) {
            return null;
        } else {
            return (String) toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.c;
        }
    }

    public static Optional g(apzg apzgVar, nml nmlVar, nlz nlzVar, String str, boolean z, final Map map) {
        Optional ofNullable;
        String i = nmlVar.i();
        if (amps.e(i) || amps.e(str)) {
            ofNullable = Optional.ofNullable(nmlVar.e(apzgVar, nlzVar, z));
        } else if (akzj.f(str, i)) {
            ofNullable = Optional.ofNullable(nmlVar.d(apzgVar, nlzVar));
        } else {
            ofNullable = Optional.empty();
        }
        ofNullable.filter(lws.q).map(meg.q).ifPresent(new Consumer() { // from class: npw
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((nlc) obj).q = xme.b(map);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
        return ofNullable;
    }

    public static String h(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) {
        if ((showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b & 8) != 0) {
            return showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.f;
        }
        return null;
    }

    public static void i(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint, nix nixVar) {
        if (showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.g) {
            nixVar.p(false);
        }
    }

    public static boolean j(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint, nml nmlVar) {
        return nmlVar.A(showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint);
    }

    public static void k(ViewGroup viewGroup, nlx nlxVar, nnv nnvVar) {
        if (viewGroup == null || nlxVar == null) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.panel_header);
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            l(frameLayout, nlxVar.b());
        }
        View findViewById = viewGroup.findViewById(R.id.close_button);
        if (findViewById != null) {
            if ((nlxVar instanceof nkk) || (nlxVar instanceof nkm)) {
                findViewById.setVisibility(8);
            } else if (nnvVar == null || !nnvVar.e()) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
        }
        View a = nlxVar.a();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.panel_subheader);
        if (viewGroup2 == null) {
            return;
        }
        if (a != null) {
            viewGroup2.removeAllViews();
            l(viewGroup2, a);
            viewGroup2.setVisibility(0);
            return;
        }
        viewGroup2.setVisibility(8);
    }

    public static void l(ViewGroup viewGroup, View view) {
        if (viewGroup == null || view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        viewGroup.addView(view);
    }

    public static final krs m(Context context) {
        return new krs(context);
    }

    public static String n(avwa avwaVar) {
        arag aragVar = avwaVar.c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        return ((arai) aragVar.c.get(0)).c;
    }

    public static int[] o() {
        return new int[]{1, 2};
    }
}
