package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import java.util.List;
/* compiled from: PG */
/* renamed from: avsp  reason: default package */
/* loaded from: classes.dex */
public final class avsp extends afhx {
    public static final dbsl<afga> a = avso.a;
    private final dxio<avsr> b;
    private final Uri c;

    public avsp(Intent intent, @dzsi String str, dxio<avsr> dxioVar) {
        super(intent, str, afid.OFFLINE);
        this.b = dxioVar;
        this.c = afhg.b(intent);
    }

    @Override // defpackage.afhx
    public final void a() {
        List<String> pathSegments = this.c.getPathSegments();
        if (pathSegments.size() < 2 || !pathSegments.get(0).equals("maps") || !pathSegments.get(1).equals("offline")) {
            this.c.getPath();
        } else if (pathSegments.size() < 3 || !pathSegments.get(2).equals("settings")) {
            if (pathSegments.size() < 5 || !pathSegments.get(2).equals("region") || !pathSegments.get(3).equals("view")) {
                if (this.f.getBooleanExtra("OfflineCancelUpdateExtra", false)) {
                    this.b.a().c();
                    return;
                } else if (this.f.getBooleanExtra("OfflineDownloadHomeAreaExtra", false)) {
                    this.b.a().d();
                    return;
                } else {
                    if (this.f.getBooleanExtra("OfflineUpdateExpiringRegionsExtra", false)) {
                        this.b.a().e();
                    }
                    if (this.f.getBooleanExtra("OfflinePreviewTripRegionsButtonExtra", false)) {
                        this.b.a().f(dspd.x(this.f.getByteArrayExtra("OfflineRegionIdExtra")));
                        return;
                    } else if (this.f.getBooleanExtra("OfflineDownloadTripRegionsButtonExtra", false)) {
                        Intent intent = this.f;
                        dlug dlugVar = (dlug) bvrs.b(intent.getByteArrayExtra("RegionGeometryExtra"), (dssr) dlug.c.cu(7));
                        byte[] byteArrayExtra = intent.getByteArrayExtra("OfflineRegionIdExtra");
                        dspd x = byteArrayExtra == null ? null : dspd.x(byteArrayExtra);
                        String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                        if (x == null || dlugVar == null) {
                            return;
                        }
                        this.b.a().g(x, dlugVar, stringExtra);
                        return;
                    } else if (this.f.getBooleanExtra("SideloadExtra", false)) {
                        this.b.a().h();
                        return;
                    } else if (this.f.getBooleanExtra("OfflineLearnMore", false)) {
                        this.b.a().i();
                        return;
                    } else {
                        this.b.a().j();
                        return;
                    }
                }
            }
            this.b.a().b(dspd.x(Base64.decode(pathSegments.get(4), 8)));
        } else {
            this.b.a().a();
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_OFFLINE;
    }
}
