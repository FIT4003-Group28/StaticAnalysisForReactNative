package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.gallery.MediaGridRecyclerView;
import com.google.android.youtube.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: hdz  reason: default package */
/* loaded from: classes3.dex */
public final class hdz extends hdu {
    public Executor a;
    View ae;
    MediaGridRecyclerView af;
    public acti ag;
    public hkg ah;
    private String ai = null;
    private boolean aj;
    private int ak;
    private boolean al;
    private int am;
    private gyq an;
    public Context b;
    zvo c;
    public hdy d;
    View e;

    public static hdz aF(boolean z, int i, boolean z2, int i2, apzg apzgVar) {
        hdz hdzVar = new hdz();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_DIRECTORY_PATH", null);
        bundle.putBoolean("ARG_BOTTOM_SHEET_MODE", z);
        bundle.putInt("ARG_TITLE_RESOURCE", i);
        bundle.putInt("ARG_FILE_TYPE", i2);
        bundle.putBoolean("ARG_HIDE_HEADER", z2);
        if (apzgVar != null) {
            bundle.putByteArray("navigation_endpoint", apzgVar.toByteArray());
        }
        hdzVar.ae(bundle);
        return hdzVar;
    }

    public static hdz aG(boolean z, apzg apzgVar) {
        return aF(z, R.string.shorts_gallery_upload, z, 0, apzgVar);
    }

    @Override // defpackage.dp
    public final void W() {
        super.W();
        zvo.y(this.af);
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        this.c.getClass();
        zne zneVar = new zne(mJ());
        List q = amuk.q();
        if (aE()) {
            q = zneVar.c(this.am);
        }
        if (TextUtils.isEmpty(this.ai)) {
            this.c.z(q);
        } else {
            this.c.z((List) zneVar.d(this.am).get(this.ai));
        }
        this.e.setVisibility(8);
        this.ae.setVisibility(8);
        if (!aE()) {
            this.ae.setVisibility(0);
            gyo b = this.an.b(acuo.b(99787));
            b.h(true);
            b.a();
        } else if (q != null && !q.isEmpty()) {
        } else {
            this.e.setVisibility(0);
        }
    }

    final boolean aE() {
        return zwn.e(mJ(), 0);
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        Bundle bundle2 = this.m;
        this.ai = bundle2.getString("ARG_DIRECTORY_PATH");
        this.aj = bundle2.getBoolean("ARG_BOTTOM_SHEET_MODE");
        this.ak = bundle2.getInt("ARG_TITLE_RESOURCE");
        this.al = bundle2.getBoolean("ARG_HIDE_HEADER");
        this.am = bundle2.getInt("ARG_FILE_TYPE");
        this.an = new gyq(this.ag);
    }

    @Override // defpackage.actq, defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.cloneInContext(this.b).inflate(R.layout.shorts_gallery_fragment, viewGroup, false);
        dt mJ = mJ();
        if (this.al) {
            inflate.findViewById(R.id.gallery_header).setVisibility(8);
        }
        ((TextView) inflate.findViewById(R.id.bottom_sheet_title)).setText(this.b.getResources().getString(this.ak));
        this.e = inflate.findViewById(R.id.zero_state_container);
        this.ae = inflate.findViewById(R.id.permissions_required_container);
        this.af = (MediaGridRecyclerView) inflate.findViewById(R.id.media_grid_recycler_view);
        inflate.findViewById(R.id.allow_access_button).setOnClickListener(new hdv(this, 1));
        inflate.findViewById(R.id.close_button).setOnClickListener(new hdv(this));
        this.af.setFocusableInTouchMode(false);
        Parcelable parcelable = bundle != null ? bundle.getParcelable("layout_manager_state") : null;
        zvo zvoVar = new zvo(mJ, this.a, 0);
        this.c = zvoVar;
        zvoVar.e = this.aj;
        zvoVar.u(new hdw(this));
        this.af.ad(this.c);
        if (parcelable != null) {
            this.af.n.Y(parcelable);
        }
        this.af.aC(new hea(this.b));
        this.c.d = new hdx(this);
        gyo b = this.an.b(acuo.b(96638));
        b.h(true);
        b.a();
        this.an.b(acuo.b(22156)).a();
        zvo zvoVar2 = this.c;
        if (zvoVar2 != null && !zvoVar2.B()) {
            s();
        }
        hkg hkgVar = this.ah;
        String str = hkgVar.e;
        if (str != null && hkgVar.f) {
            hkgVar.d.y(str, avul.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_ENTERED_SHORTS_GALLERY);
        }
        return inflate;
    }

    @Override // defpackage.actq
    public final acti oi() {
        return this.ag;
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putParcelable("layout_manager_state", this.af.n.P());
    }

    @Override // defpackage.actq
    protected final acup p() {
        if (this.aj) {
            return null;
        }
        return acuo.a(96660);
    }

    public final void s() {
        gyo b = this.an.b(acuo.b(97092));
        b.h(true);
        b.a();
    }
}
