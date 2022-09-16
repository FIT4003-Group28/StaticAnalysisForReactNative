package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.DeleteVideoEndpointOuterClass$DeleteVideoEndpoint;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupEventButtonRendererOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aclr  reason: default package */
/* loaded from: classes.dex */
public final class aclr extends acjl implements View.OnClickListener, acmp, abzf, abzh, abzj {
    public abzn a;
    public ajsg ae;
    public abtc af;
    public Executor ag;
    acmq ah;
    private ImageButton ai;
    private TextView aj;
    private RecyclerView ak;
    private GridLayoutManager al;
    private ViewGroup am;
    private NetworkOperationView an;
    private atgr ao;
    public aclq b;
    public ajmy c;
    public ache d;
    public aafo e;

    private final void s() {
        atgr atgrVar = this.ao;
        if (atgrVar == null) {
            return;
        }
        aunb aunbVar = atgrVar.c;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar2 = this.ao.c;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            apoj apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
            if ((apojVar.b & 32) != 0) {
                ache acheVar = this.d;
                arhs arhsVar = apojVar.g;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                arhr b = arhr.b(arhsVar.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                int a = acheVar.a(b);
                if (a != 0) {
                    this.ai.setImageResource(a);
                    this.ai.setOnClickListener(this);
                }
                if ((apojVar.b & 65536) != 0) {
                    ImageButton imageButton = this.ai;
                    aovr aovrVar = apojVar.r;
                    if (aovrVar == null) {
                        aovrVar = aovr.a;
                    }
                    imageButton.setContentDescription(aovrVar.c);
                }
            }
        }
        atgr atgrVar2 = this.ao;
        if ((atgrVar2.b & 2) != 0) {
            TextView textView = this.aj;
            arag aragVar = atgrVar2.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
        }
        acmq acmqVar = this.ah;
        aopu<aunb> aopuVar = this.ao.e;
        acmqVar.a.clear();
        acmqVar.a.l();
        for (aunb aunbVar3 : aopuVar) {
            atgh atghVar = (atgh) aunbVar3.qm(MobileBroadcastSetupEventButtonRendererOuterClass.mobileBroadcastSetupEventButtonRenderer);
            if (aunbVar3.qn(MobileBroadcastSetupEventButtonRendererOuterClass.mobileBroadcastSetupEventButtonRenderer)) {
                acmqVar.a.add(atghVar);
            }
            aunb aunbVar4 = atghVar.h;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            if (aunbVar4.qn(ButtonRendererOuterClass.buttonRenderer)) {
                aunb aunbVar5 = atghVar.h;
                if (aunbVar5 == null) {
                    aunbVar5 = aunb.a;
                }
                apoj apojVar2 = (apoj) aunbVar5.qm(ButtonRendererOuterClass.buttonRenderer);
                apzg apzgVar = apojVar2.n;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                if (apzgVar.qn(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint)) {
                    apzg apzgVar2 = apojVar2.n;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    DeleteVideoEndpointOuterClass$DeleteVideoEndpoint deleteVideoEndpointOuterClass$DeleteVideoEndpoint = (DeleteVideoEndpointOuterClass$DeleteVideoEndpoint) apzgVar2.qm(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint);
                    if ((deleteVideoEndpointOuterClass$DeleteVideoEndpoint.b & 1) != 0) {
                        acmqVar.b.put(deleteVideoEndpointOuterClass$DeleteVideoEndpoint.c, atghVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.abzf
    public final void a(String str) {
        acmq acmqVar = this.ah;
        atgh atghVar = (atgh) acmqVar.b.get(str);
        if (atghVar != null) {
            acmqVar.a.remove(atghVar);
        }
        this.an.a(0);
        if (this.ah.a.size() == 0) {
            q();
        }
    }

    @Override // defpackage.abzf
    public final void b() {
        Toast.makeText(mJ(), (int) R.string.lc_error_delete_broadcast, 0).show();
    }

    @Override // defpackage.abzh
    public final void c() {
        this.an.a(1);
        this.an.setVisibility(0);
        this.am.setVisibility(8);
    }

    @Override // defpackage.abzh
    public final void d(atgr atgrVar) {
        if (atgrVar != null) {
            this.ao = atgrVar;
            s();
            this.an.a(2);
            this.am.setVisibility(0);
            this.an.setVisibility(8);
            return;
        }
        c();
    }

    @Override // defpackage.abzj
    public final void e() {
        zep.l("Get confirm broadcast for scheduled broadcast failed");
        Toast.makeText(mJ(), (int) R.string.lc_error_load_scheduled_broadcast, 0).show();
    }

    @Override // defpackage.abzj
    public final void h(artf artfVar) {
        atgl atglVar;
        if (achk.b(this)) {
            artd artdVar = artfVar.c;
            if (artdVar == null) {
                artdVar = artd.a;
            }
            if (artdVar.b != 126007832) {
                e();
                return;
            }
            aclq aclqVar = this.b;
            artd artdVar2 = artfVar.c;
            if (artdVar2 == null) {
                artdVar2 = artd.a;
            }
            if (artdVar2.b == 126007832) {
                atglVar = (atgl) artdVar2.c;
            } else {
                atglVar = atgl.a;
            }
            aclqVar.ad(atglVar);
            this.an.a(2);
        }
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.ah = new acmq(rb(), this.c, this.d, this.af, this.e, this.ag, this.ae, this);
    }

    @Override // defpackage.dp
    public final void mS() {
        super.mS();
        int i = this.an.c;
        if (i == 1) {
            c();
        } else if (i == 2) {
            d(this.ao);
        } else {
            r();
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ParcelableMessageLite parcelableMessageLite;
        super.mc(layoutInflater, viewGroup, bundle);
        if (bundle != null && bundle.containsKey("STATE_SCHEDULE_SCREEN_RENDERER") && (parcelableMessageLite = (ParcelableMessageLite) bundle.getParcelable("STATE_SCHEDULE_SCREEN_RENDERER")) != null) {
            this.ao = (atgr) parcelableMessageLite.a(atgr.a);
        }
        View inflate = layoutInflater.inflate(R.layout.lc_scheduled_events_fragment, viewGroup, false);
        this.ai = (ImageButton) inflate.findViewById(R.id.close_button);
        this.aj = (TextView) inflate.findViewById(R.id.scheduled_events_title);
        NetworkOperationView networkOperationView = (NetworkOperationView) inflate.findViewById(R.id.scheduled_events_network_operation);
        this.an = networkOperationView;
        networkOperationView.b(new aclo(this, 1));
        this.an.c(new aclo(this));
        this.ak = (RecyclerView) inflate.findViewById(R.id.scheduled_events);
        this.am = (ViewGroup) inflate.findViewById(R.id.scheduled_events_container);
        this.al = new GridLayoutManager(rh().getInteger(R.integer.lc_scheduled_events_columns), null);
        this.ak.aC(new aclp(this));
        this.ak.ag(this.al);
        this.ak.ad(this.ah.c);
        s();
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.ai) {
            q();
        }
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int J2 = this.al.J();
        this.al.q(rh().getInteger(R.integer.lc_scheduled_events_columns));
        this.ak.N();
        this.al.Z(J2);
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        atgr atgrVar = this.ao;
        if (atgrVar != null) {
            bundle.putParcelable("STATE_SCHEDULE_SCREEN_RENDERER", new ParcelableMessageLite(atgrVar));
        }
    }

    @Override // defpackage.acmp
    public final Map p() {
        return amup.k("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
    }

    public final void q() {
        this.b.ae();
    }

    public final void r() {
        this.an.a(0);
        this.an.setVisibility(0);
        this.am.setVisibility(8);
        this.a.c(this);
    }
}
