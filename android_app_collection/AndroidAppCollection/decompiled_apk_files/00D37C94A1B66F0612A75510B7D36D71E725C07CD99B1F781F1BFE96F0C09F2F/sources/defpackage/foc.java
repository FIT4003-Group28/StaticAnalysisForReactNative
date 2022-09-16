package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: foc  reason: default package */
/* loaded from: classes3.dex */
public final class foc extends fnq implements DialogInterface {
    public akjr ae;
    private akjq af;
    private akjs ag;

    public final void aG(Bundle bundle) {
        avbp[] c;
        avbq[] d;
        try {
            Bundle bundle2 = this.m;
            if (bundle2 != null) {
                akjs akjsVar = new akjs();
                if (akjsVar.a == null) {
                    try {
                        avbl avblVar = (avbl) aopi.parseFrom(avbl.a, bundle2.getByteArray("model"), aoos.b());
                        avblVar.getClass();
                        akjsVar.a = avblVar;
                    } catch (aopx unused) {
                        throw new IllegalStateException("SubscriptionNotificationOptionsDialogModel was not able to be built correctly.");
                    }
                }
                if (bundle != null) {
                    akjsVar.e = new HashSet();
                    akjsVar.d = (avbp) aopi.parseFrom(avbp.a, bundle.getByteArray("primary"), aoos.b());
                    akjsVar.e.addAll(bundle.getStringArrayList("secondary"));
                    akjsVar.b = (avbp) aopi.parseFrom(avbp.a, bundle.getByteArray("initial_primary"), aoos.b());
                    akjsVar.c = amvn.p(bundle.getStringArrayList("initial_secondary"));
                    if (bundle.containsKey("optimistic_primary")) {
                        akjsVar.f = (avbp) aopi.parseFrom(avbp.a, bundle.getByteArray("optimistic_primary"), aoos.b());
                    }
                    if (bundle.containsKey("optimistic_secondary")) {
                        akjsVar.g = amvn.p(bundle.getStringArrayList("optimistic_secondary"));
                    }
                }
                for (avbp avbpVar : akjsVar.c()) {
                    if (bundle == null && avbpVar.f) {
                        akjsVar.d = avbpVar;
                    }
                }
                if (akjsVar.d != null) {
                    if (akjsVar.e == null) {
                        akjsVar.e = new HashSet();
                    }
                    for (avbq avbqVar : akjsVar.d()) {
                        if (bundle == null && avbqVar.e == 1) {
                            akjsVar.e.add(avbqVar.f);
                        }
                    }
                    if (akjsVar.b == null || bundle == null) {
                        akjsVar.b = akjsVar.d;
                    }
                    if (akjsVar.c == null) {
                        akjsVar.c = amvn.p(akjsVar.e);
                    }
                    this.ag = akjsVar;
                    akjq akjqVar = this.af;
                    if (akjqVar == null) {
                        return;
                    }
                    akjqVar.f = akjsVar;
                    return;
                }
                throw new IllegalStateException("SubscriptionNotificationOptionsRenderer does not have a currently selected option.");
            }
            throw new IllegalArgumentException("SubscriptionNotificationOptionsRenderer or Bundle containing renderer not provided.");
        } catch (IllegalArgumentException unused2) {
            dismiss();
        } catch (IllegalStateException unused3) {
            dismiss();
        }
    }

    @Override // android.content.DialogInterface
    public final void cancel() {
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        aG(null);
        akjs akjsVar = this.ag;
        if (akjsVar == null) {
            dismiss();
            return;
        }
        akjr akjrVar = this.ae;
        Context context = (Context) akjrVar.a.get();
        context.getClass();
        aafo aafoVar = (aafo) akjrVar.b.get();
        aafoVar.getClass();
        ajsg ajsgVar = (ajsg) akjrVar.e.get();
        ajsgVar.getClass();
        this.af = new akjq(context, aafoVar, (kxz) akjrVar.c.get(), (krb) akjrVar.d.get(), ajsgVar, this, akjsVar, null);
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.af.b();
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        String str;
        arag aragVar;
        Spanned b;
        aG(bundle);
        AlertDialog.Builder builder = new AlertDialog.Builder(mJ());
        final akjq akjqVar = this.af;
        if (akjqVar == null) {
            zag.q(mJ(), R.string.common_error_generic, 0);
            dismiss();
            return builder.create();
        }
        if (akjqVar.f != null) {
            akjqVar.g = LayoutInflater.from(akjqVar.a).inflate(R.layout.subscription_notification_options_fragment, (ViewGroup) null, false);
            ajsi ajsiVar = new ajsi();
            RecyclerView recyclerView = (RecyclerView) akjqVar.g.findViewById(R.id.options_list);
            ajsiVar.f(avbp.class, akjqVar.m);
            akjqVar.h = akjqVar.e.a(ajsiVar);
            akjqVar.h.rZ(akjqVar.d);
            recyclerView.ad(akjqVar.h);
            recyclerView.ag(new akjp());
            akjqVar.i = new ajsm();
            akjqVar.h.h(akjqVar.i);
            akjqVar.k = akjqVar.g.findViewById(R.id.divider);
            akjqVar.l = (RecyclerView) akjqVar.g.findViewById(R.id.secondary_options_list);
            RecyclerView recyclerView2 = akjqVar.l;
            ajsiVar.f(avbq.class, akjqVar.n);
            ajsf a = akjqVar.e.a(ajsiVar);
            recyclerView2.ad(a);
            recyclerView2.ag(new akjp());
            akjqVar.j = new ajsm();
            a.h(akjqVar.j);
            a.rZ(akjqVar.d);
            for (avbp avbpVar : akjqVar.f.c()) {
                akjqVar.i.add(avbpVar);
            }
            int i = akjqVar.f.a.d.size() != 0 ? 0 : 8;
            akjqVar.k.setVisibility(i);
            akjqVar.l.setVisibility(i);
            for (avbq avbqVar : akjqVar.f.d()) {
                akjqVar.j.add(avbqVar);
            }
            View view = akjqVar.g;
            akjs akjsVar = akjqVar.f;
            aovs aovsVar = akjsVar.a.k;
            if (aovsVar == null) {
                aovsVar = aovs.a;
            }
            if ((aovsVar.b & 1) != 0) {
                aovs aovsVar2 = akjsVar.a.k;
                if (aovsVar2 == null) {
                    aovsVar2 = aovs.a;
                }
                aovr aovrVar = aovsVar2.c;
                if (aovrVar == null) {
                    aovrVar = aovr.a;
                }
                str = aovrVar.c;
            } else {
                str = null;
            }
            view.setContentDescription(str);
            akjqVar.b();
            builder.setView(akjqVar.g);
            avbl avblVar = akjqVar.f.a;
            if (avblVar == null) {
                b = null;
            } else {
                if ((avblVar.b & 8) != 0) {
                    aragVar = avblVar.f;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                b = ajgl.b(aragVar);
            }
            builder.setTitle(b);
            if (akjqVar.f.b() != null) {
                builder.setPositiveButton(akjqVar.f.b(), new DialogInterface.OnClickListener() { // from class: akjn
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        akjq akjqVar2 = akjq.this;
                        akjs akjsVar2 = akjqVar2.f;
                        if (!akjsVar2.h ? akjsVar2.b.equals(akjsVar2.d) : akjsVar2.f.equals(akjsVar2.d)) {
                            akjs akjsVar3 = akjqVar2.f;
                            if (!akjsVar3.h) {
                            }
                            akjqVar2.c.dismiss();
                        }
                        akjs akjsVar4 = akjqVar2.f;
                        apzg apzgVar = akjsVar4.d.e;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
                        if (!akjsVar4.d.g) {
                            aopa mo52toBuilder = ((ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) aopcVar.qm(ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint)).mo52toBuilder();
                            mo52toBuilder.copyOnWrite();
                            ((ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) mo52toBuilder.instance).c = aopi.emptyProtobufList();
                            Set set = akjsVar4.e;
                            mo52toBuilder.copyOnWrite();
                            ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint = (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) mo52toBuilder.instance;
                            aopu aopuVar = modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.c;
                            if (!aopuVar.c()) {
                                modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.c = aopi.mutableCopy(aopuVar);
                            }
                            aonk.addAll((Iterable) set, (List) modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.c);
                            aopcVar.e(ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint, (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) mo52toBuilder.mo39build());
                        }
                        apzg apzgVar2 = (apzg) aopcVar.mo39build();
                        if (apzgVar2 != null) {
                            akjqVar2.b.c(apzgVar2, null);
                            akjs akjsVar5 = akjqVar2.f;
                            akjsVar5.h = true;
                            akjsVar5.f = akjsVar5.d;
                            akjsVar5.g = akjsVar5.e;
                        }
                        akjqVar2.c.dismiss();
                    }
                });
            }
            if (akjqVar.f.a() != null) {
                builder.setNegativeButton(akjqVar.f.a(), (DialogInterface.OnClickListener) null);
            }
        }
        return builder.create();
    }

    @Override // defpackage.dh, defpackage.dp
    public final void oz(Bundle bundle) {
        super.oz(bundle);
        akjs akjsVar = this.ag;
        bundle.putByteArray("primary", akjsVar.d.toByteArray());
        bundle.putStringArrayList("secondary", new ArrayList<>(akjsVar.e));
        bundle.putByteArray("initial_primary", akjsVar.b.toByteArray());
        bundle.putStringArrayList("initial_secondary", new ArrayList<>(akjsVar.c));
        avbp avbpVar = akjsVar.f;
        if (avbpVar != null) {
            bundle.putByteArray("optimistic_primary", avbpVar.toByteArray());
        }
        Set set = akjsVar.g;
        if (set != null) {
            bundle.putStringArrayList("optimistic_secondary", new ArrayList<>(set));
        }
    }
}
