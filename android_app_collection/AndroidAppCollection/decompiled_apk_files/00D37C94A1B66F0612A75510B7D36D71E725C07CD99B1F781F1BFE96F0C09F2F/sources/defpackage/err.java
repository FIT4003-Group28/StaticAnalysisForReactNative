package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SetClientSettingEndpointOuterClass$SetClientSettingEndpoint;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: err */
/* loaded from: classes3.dex */
public final class err implements aafl {
    public final aafo a;
    public final azqb b;
    public final azqb c;
    private final agcp d;
    private final Executor e;
    private final Executor f;
    private final Set g = amvn.s(ausi.MAIN_SMART_DOWNLOADS_ENABLED, ausi.MAIN_SMART_DOWNLOADS_OPT_IN_BANNER_DISMISSED);
    private final lfv h;

    public err(aafo aafoVar, agcp agcpVar, lfv lfvVar, azqb azqbVar, azqb azqbVar2, Executor executor, Executor executor2) {
        this.a = aafoVar;
        this.d = agcpVar;
        this.h = lfvVar;
        this.b = azqbVar;
        this.c = azqbVar2;
        this.e = executor;
        this.f = executor2;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint)) {
            return;
        }
        SetClientSettingEndpointOuterClass$SetClientSettingEndpoint setClientSettingEndpointOuterClass$SetClientSettingEndpoint = (SetClientSettingEndpointOuterClass$SetClientSettingEndpoint) apzgVar.qm(SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint);
        boolean z = false;
        for (auqu auquVar : setClientSettingEndpointOuterClass$SetClientSettingEndpoint.b) {
            ausj ausjVar = auquVar.d;
            if (ausjVar == null) {
                ausjVar = ausj.a;
            }
            ausi b = ausi.b(ausjVar.b);
            if (b == null) {
                b = ausi.UNKNOWN;
            }
            boolean z2 = true;
            if (!TextUtils.isEmpty(this.h.a(b.bS)) || this.g.contains(b)) {
                ausj ausjVar2 = auquVar.d;
                if (ausjVar2 == null) {
                    ausjVar2 = ausj.a;
                }
                ausi b2 = ausi.b(ausjVar2.b);
                if (b2 == null) {
                    b2 = ausi.UNKNOWN;
                }
                int ordinal = b2.ordinal();
                if (ordinal == 30) {
                    agel.b(this.d);
                    lfv lfvVar = this.h;
                    ausj ausjVar3 = auquVar.d;
                    if (ausjVar3 == null) {
                        ausjVar3 = ausj.a;
                    }
                    ausi b3 = ausi.b(ausjVar3.b);
                    if (b3 == null) {
                        b3 = ausi.UNKNOWN;
                    }
                    String a = lfvVar.a(b3.bS);
                    if (!TextUtils.isEmpty(a)) {
                        this.d.a(a, auquVar.b == 3 ? ((Boolean) auquVar.c).booleanValue() : false);
                        z |= z2;
                    }
                } else if (ordinal == 127) {
                    ylx.k(anlz.v(new erq(this, auquVar, 1), this.e), this.f, dzl.i, new erp(this, setClientSettingEndpointOuterClass$SetClientSettingEndpoint, 1));
                } else if (ordinal == 128) {
                    ylx.k(anlz.v(new erq(this, auquVar), this.e), this.f, dzl.j, new erp(this, setClientSettingEndpointOuterClass$SetClientSettingEndpoint));
                }
            }
            z2 = false;
            z |= z2;
        }
        if (!z) {
            return;
        }
        this.a.d(setClientSettingEndpointOuterClass$SetClientSettingEndpoint.c, map);
    }
}
