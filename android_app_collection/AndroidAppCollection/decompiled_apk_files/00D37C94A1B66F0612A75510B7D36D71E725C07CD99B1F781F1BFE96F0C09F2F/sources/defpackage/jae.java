package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.ApplicationHelpEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineVideosEndpointOuterClass;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: jae  reason: default package */
/* loaded from: classes3.dex */
public final class jae implements ete, faq {
    private final gbq a;
    private final azqb b;
    private final Set c = new HashSet();
    private final ipn d;
    private final ind e;
    private final ise f;
    private final sdb g;

    public jae(sdb sdbVar, gbq gbqVar, azqb azqbVar, ipn ipnVar, ind indVar, ise iseVar, byte[] bArr) {
        this.g = sdbVar;
        this.a = gbqVar;
        this.b = azqbVar;
        this.d = ipnVar;
        this.e = indVar;
        this.f = iseVar;
        sdbVar.a(this);
    }

    private static void d(ajru ajruVar, boolean z) {
        View a = ajruVar.a();
        if (a != null) {
            a.setEnabled(true);
            if (a instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) a;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    viewGroup.getChildAt(i).setEnabled(true);
                }
            }
            a.setAlpha(true != z ? 0.4f : 1.0f);
        }
    }

    @Override // defpackage.faq
    public final void a(ajru ajruVar) {
        b(ajruVar, null);
    }

    @Override // defpackage.faq
    public final void b(ajru ajruVar, apzg apzgVar) {
        if (apzgVar == null || (!apzgVar.qn(ApplicationHelpEndpointOuterClass.applicationHelpEndpoint) && !apzgVar.qn(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint) && !apzgVar.qn(DownloadsPageEndpointOuterClass.downloadsPageEndpoint) && !apzgVar.qn(OfflineVideosEndpointOuterClass.offlineVideosEndpoint) && !far.c(apzgVar, this.b))) {
            Set set = this.c;
            ajruVar.getClass();
            set.add(ajruVar);
            d(ajruVar, !this.g.a);
        }
    }

    @Override // defpackage.faq
    public final void c(ajru ajruVar) {
        ajruVar.getClass();
        if (this.c.contains(ajruVar)) {
            d(ajruVar, true);
            this.c.remove(ajruVar);
        }
    }

    @Override // defpackage.ete
    public final void g(boolean z) {
        apzg e;
        PaneDescriptor c = this.a.c();
        if (c != null) {
            if ((!this.e.h(c) && !this.d.b(c) && !this.f.a(c)) || (e = c.e()) == null || !e.qn(BrowseEndpointOuterClass.browseEndpoint) || !"FElibrary".equals(((apnv) e.qm(BrowseEndpointOuterClass.browseEndpoint)).c)) {
                return;
            }
            for (ajru ajruVar : this.c) {
                d(ajruVar, !z);
            }
        }
    }
}
