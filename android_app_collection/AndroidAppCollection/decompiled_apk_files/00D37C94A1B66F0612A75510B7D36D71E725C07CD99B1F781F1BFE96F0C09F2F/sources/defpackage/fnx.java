package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fnx  reason: default package */
/* loaded from: classes3.dex */
public final class fnx implements aafl {
    public final azqb a;
    public final yzj b;
    public final ajqa c;
    private final Context d;
    private final abab e;
    private final agbd f;
    private final Executor g;

    public fnx(Context context, abab ababVar, azqb azqbVar, yzj yzjVar, ajqa ajqaVar, agbd agbdVar, Executor executor) {
        this.d = context;
        ababVar.getClass();
        this.e = ababVar;
        this.a = azqbVar;
        yzjVar.getClass();
        this.b = yzjVar;
        this.c = ajqaVar;
        this.f = agbdVar;
        this.g = executor;
    }

    public final void b(apzg apzgVar, Map map, ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint, boolean z) {
        hxb hxbVar;
        hxb fnuVar;
        aazx a = this.e.a();
        a.c = z;
        a.d = agel.f(this.d, this.f);
        a.a = modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.b;
        String[] strArr = (String[]) modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.c.toArray(new String[0]);
        strArr.getClass();
        a.b = strArr;
        a.k(apzgVar.c.I());
        Object I = zew.I(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        agcu agcuVar = (agcu) zew.K(map, "notification_data", agcu.class);
        abab ababVar = this.e;
        if (I instanceof fmr) {
            fnuVar = new fnw((fmr) I);
        } else if (I instanceof fnt) {
            fnuVar = new fnu((fnt) I);
        } else {
            hxbVar = new hxb();
            ababVar.b(a, new fnv(this, apzgVar, hxbVar, map, agcuVar, null, null));
        }
        hxbVar = fnuVar;
        ababVar.b(a, new fnv(this, apzgVar, hxbVar, map, agcuVar, null, null));
    }

    @Override // defpackage.aafl
    public final void kD(final apzg apzgVar, final Map map) {
        final ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint = (ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint) apzgVar.qm(ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint);
        ((aafo) this.a.get()).d(modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.d, map);
        ylx.k(this.f.c(), this.g, new ylv() { // from class: fnr
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                fnx fnxVar = fnx.this;
                apzg apzgVar2 = apzgVar;
                Map map2 = map;
                ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint2 = modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
                zep.d("Failed to read the notification enabled state.", th);
                fnxVar.b(apzgVar2, map2, modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint2, true);
            }
        }, new ylw() { // from class: fns
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                fnx.this.b(apzgVar, map, modifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint, ((Boolean) obj).booleanValue());
            }
        });
    }
}
