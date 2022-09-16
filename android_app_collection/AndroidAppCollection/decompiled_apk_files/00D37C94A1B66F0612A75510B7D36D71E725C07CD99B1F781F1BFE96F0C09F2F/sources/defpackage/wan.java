package defpackage;

import android.net.Uri;
import com.google.protos.youtube.api.innertube.EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint;
import com.google.protos.youtube.api.innertube.EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint;
import com.google.protos.youtube.api.innertube.GetPhotoEndpointOuterClass$GetPhotoEndpoint;
import com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wan  reason: default package */
/* loaded from: classes4.dex */
public final class wan implements was {
    public final dt a;
    public wax b;
    public boolean c;
    public boolean d;
    public boolean e;
    private final aafo f;
    private final Set g;

    public wan(dt dtVar, aafo aafoVar) {
        dtVar.getClass();
        this.a = dtVar;
        aafoVar.getClass();
        this.f = aafoVar;
        this.c = true;
        this.g = new HashSet();
    }

    private final void l(int i) {
        for (war warVar : this.g) {
            warVar.q(i);
        }
    }

    @Override // defpackage.was
    public final int a() {
        if (b() != null) {
            wax b = b();
            b.getClass();
            return b.am ? 0 : 1;
        }
        return 0;
    }

    public final wax b() {
        wax waxVar = this.b;
        if (waxVar != null) {
            return waxVar;
        }
        wax waxVar2 = (wax) this.a.getSupportFragmentManager().f("update_image_fragment");
        this.b = waxVar2;
        if (waxVar2 == null) {
            this.e = false;
        }
        return waxVar2;
    }

    @Override // defpackage.was
    public final aafo c() {
        return this.f;
    }

    @Override // defpackage.was
    public final void d() {
        if (!this.c && b() != null) {
            if (this.d) {
                this.e = true;
                return;
            }
            ex l = this.a.getSupportFragmentManager().l();
            l.m(this.b);
            l.d();
            this.b = null;
        }
    }

    @Override // defpackage.was
    public final void e(apzg apzgVar) {
        apzgVar.getClass();
        if (apzgVar.qn(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.uploadPhotoEndpoint)) {
            UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = (UploadPhotoEndpointOuterClass$UploadPhotoEndpoint) apzgVar.qm(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.uploadPhotoEndpoint);
            wax b = b();
            if (b == null) {
                return;
            }
            b.r(uploadPhotoEndpointOuterClass$UploadPhotoEndpoint);
        } else if (apzgVar.qn(EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.editChannelBannerEndpoint)) {
            EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint editChannelBannerEndpointOuterClass$EditChannelBannerEndpoint = (EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint) apzgVar.qm(EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.editChannelBannerEndpoint);
            wax b2 = b();
            if (b2 == null) {
                return;
            }
            b2.s(3);
        } else if (apzgVar.qn(EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.editChannelAvatarEndpoint)) {
            EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint editChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint = (EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint) apzgVar.qm(EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.editChannelAvatarEndpoint);
            wax b3 = b();
            if (b3 == null) {
                return;
            }
            b3.s(2);
        } else if (!apzgVar.qn(GetPhotoEndpointOuterClass$GetPhotoEndpoint.getPhotoEndpoint)) {
            h(new wat("Unknown command."));
        } else if (this.c) {
        } else {
            ex l = this.a.getSupportFragmentManager().l();
            if (b() != null) {
                l.m(this.b);
                this.e = false;
            }
            l(1);
            wax o = wax.o((GetPhotoEndpointOuterClass$GetPhotoEndpoint) apzgVar.qm(GetPhotoEndpointOuterClass$GetPhotoEndpoint.getPhotoEndpoint));
            this.b = o;
            l.r(o, "update_image_fragment");
            l.d();
        }
    }

    public final void f() {
        this.c = false;
    }

    @Override // defpackage.was
    public final void g() {
        d();
        l(4);
    }

    @Override // defpackage.was
    public final void h(Throwable th) {
        afus.c(2, 25, "Editing channel image failed.", th);
        zep.d("Failed image upload.", th);
        d();
        l(3);
    }

    @Override // defpackage.was
    public final void i(String str, Uri uri) {
        d();
        for (war warVar : this.g) {
            warVar.r(2, str, uri);
        }
    }

    @Override // defpackage.was
    public final void j(war warVar) {
        this.g.add(warVar);
    }

    @Override // defpackage.was
    public final void k(war warVar) {
        this.g.remove(warVar);
    }
}
