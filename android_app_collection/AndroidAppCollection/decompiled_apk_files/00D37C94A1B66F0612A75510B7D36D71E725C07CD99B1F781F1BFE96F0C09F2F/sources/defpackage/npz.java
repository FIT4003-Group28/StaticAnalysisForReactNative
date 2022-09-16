package defpackage;

import com.google.protos.youtube.api.innertube.ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint;
import j$.util.Objects;
import java.util.Map;
/* compiled from: PG */
/* renamed from: npz  reason: default package */
/* loaded from: classes3.dex */
public final class npz implements ght {
    public apzg a;
    public boolean b = false;

    public npz(airw airwVar) {
        airwVar.ao().I().G(aypa.a()).aa(new ayqb() { // from class: npx
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                npz npzVar = npz.this;
                if (((ahhm) obj).c() == aijx.NEW) {
                    npzVar.a = null;
                    npzVar.b = false;
                }
            }
        }, npy.a);
    }

    public final void a() {
        this.b = true;
    }

    @Override // defpackage.ght
    public final boolean g(apzg apzgVar, Map map) {
        if (!apzgVar.qn(ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.showEngagementPanelNavigationEndpoint)) {
            return false;
        }
        if (Objects.equals(this.a, apzgVar) || !this.b) {
            return true;
        }
        this.a = apzgVar;
        return false;
    }
}
