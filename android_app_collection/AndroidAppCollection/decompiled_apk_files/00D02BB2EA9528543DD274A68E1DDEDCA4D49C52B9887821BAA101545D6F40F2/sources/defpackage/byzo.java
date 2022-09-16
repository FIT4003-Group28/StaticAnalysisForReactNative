package defpackage;

import android.app.Service;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: byzo  reason: default package */
/* loaded from: classes4.dex */
public final class byzo extends byzq {
    public final dbty<Drawable> a;

    public byzo(vyl vylVar, Service service, btvo btvoVar) {
        super(vylVar, service, btvoVar);
        this.a = dbud.a(new dbty(this) { // from class: byzn
            private final byzo a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return this.a.g(2131231784);
            }
        });
    }

    @Override // defpackage.byzz
    public final byzy a(bzdk bzdkVar, byzg byzgVar) {
        throw null;
    }

    public final String b(bzdk bzdkVar) {
        return f(R.string.TRANSIT_GUIDANCE_NOTIFICATION_ARRIVE_DESCRIPTION_REVIEW, bzdkVar.j());
    }

    @Override // defpackage.byzq
    protected final Intent c(bzdg bzdgVar, byzg byzgVar, boolean z) {
        Service service = this.c;
        return new Intent(bzcd.a, new Uri.Builder().appendQueryParameter("active", Boolean.toString(z)).build(), service, service.getClass());
    }

    @Override // defpackage.byzq
    protected final CharSequence d(bzdk bzdkVar) {
        if (bzdkVar.g().p()) {
            return e().getString(R.string.TRANSIT_GUIDANCE_NOTIFICATION_ARRIVED_TIME, bvtb.i(this.c, TimeUnit.MILLISECONDS.toSeconds(bzdkVar.d().a)));
        }
        return super.d(bzdkVar);
    }
}
