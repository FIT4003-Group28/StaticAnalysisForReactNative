package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.edit.common.DeviceLocalFile;
import com.google.android.youtube.R;
import java.io.File;
/* compiled from: PG */
/* renamed from: acik  reason: default package */
/* loaded from: classes.dex */
public final class acik extends acjc implements zvg, acif, aaj {
    public acij a;
    private MenuItem ae;
    public acti b;
    public zvh c;
    public File d;
    private acig e;

    private final void aH() {
        acig acigVar = this.e;
        acigVar.getClass();
        acigVar.a = this;
        aI(acigVar);
        this.ae.setEnabled(true);
        this.ae.setVisible(true);
    }

    private final void aI(dp dpVar) {
        dpVar.getClass();
        ex l = mL().l();
        l.y(R.id.edit_thumbnail_fragment_container, dpVar);
        l.a();
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        achk.a(mJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: IOException -> 0x010d, TryCatch #0 {IOException -> 0x010d, blocks: (B:6:0x000f, B:10:0x001a, B:12:0x0035, B:15:0x0042, B:17:0x0046, B:20:0x0055, B:22:0x005d, B:26:0x006a, B:28:0x0082, B:30:0x00b0, B:35:0x00d1, B:37:0x00d5, B:41:0x00f4, B:38:0x00d9, B:40:0x00e7, B:31:0x00b4, B:33:0x00c2, B:27:0x006e), top: B:46:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4 A[Catch: IOException -> 0x010d, TryCatch #0 {IOException -> 0x010d, blocks: (B:6:0x000f, B:10:0x001a, B:12:0x0035, B:15:0x0042, B:17:0x0046, B:20:0x0055, B:22:0x005d, B:26:0x006a, B:28:0x0082, B:30:0x00b0, B:35:0x00d1, B:37:0x00d5, B:41:0x00f4, B:38:0x00d9, B:40:0x00e7, B:31:0x00b4, B:33:0x00c2, B:27:0x006e), top: B:46:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5 A[Catch: IOException -> 0x010d, TryCatch #0 {IOException -> 0x010d, blocks: (B:6:0x000f, B:10:0x001a, B:12:0x0035, B:15:0x0042, B:17:0x0046, B:20:0x0055, B:22:0x005d, B:26:0x006a, B:28:0x0082, B:30:0x00b0, B:35:0x00d1, B:37:0x00d5, B:41:0x00f4, B:38:0x00d9, B:40:0x00e7, B:31:0x00b4, B:33:0x00c2, B:27:0x006e), top: B:46:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9 A[Catch: IOException -> 0x010d, TryCatch #0 {IOException -> 0x010d, blocks: (B:6:0x000f, B:10:0x001a, B:12:0x0035, B:15:0x0042, B:17:0x0046, B:20:0x0055, B:22:0x005d, B:26:0x006a, B:28:0x0082, B:30:0x00b0, B:35:0x00d1, B:37:0x00d5, B:41:0x00f4, B:38:0x00d9, B:40:0x00e7, B:31:0x00b4, B:33:0x00c2, B:27:0x006e), top: B:46:0x000f }] */
    @Override // defpackage.aaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.MenuItem r13) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acik.a(android.view.MenuItem):boolean");
    }

    public final void aE() {
        if (this.c == null) {
            this.c = zvh.o(1);
        }
        this.c.ae = this;
        s();
        aI(this.c);
        this.ae.setEnabled(false);
        this.ae.setVisible(false);
    }

    @Override // defpackage.zvg
    public final void aK(DeviceLocalFile deviceLocalFile) {
        Uri f = deviceLocalFile.f();
        acig acigVar = new acig();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_INPUT_IMAGE", f);
        acigVar.ae(bundle);
        this.e = acigVar;
        aH();
    }

    @Override // defpackage.actq
    protected final apzg kw() {
        return null;
    }

    @Override // defpackage.actq, defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.lc_edit_thumbnail_fragment, viewGroup, false);
        super.mc(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            this.d = (File) bundle.getSerializable("STATE_PREEXISTING_THUMBNAIL_FILE");
        }
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.lc_crop_toolbar);
        toolbar.l(R.menu.lc_crop_toolbar_menu);
        toolbar.q = this;
        toolbar.r(new View.OnClickListener() { // from class: acii
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acik.this.n();
            }
        });
        this.ae = toolbar.g().findItem(R.id.lc_crop_save_button);
        if (mL().m().isEmpty()) {
            aE();
        } else {
            dp dpVar = (dp) arey.t(mL().m());
            if (dpVar instanceof zvh) {
                this.c = (zvh) dpVar;
                aE();
            } else if (dpVar instanceof acig) {
                this.e = (acig) dpVar;
                aH();
            }
        }
        return inflate;
    }

    public final void n() {
        acig acigVar = this.e;
        if (acigVar == null || !acigVar.at()) {
            acij acijVar = this.a;
            if (acijVar == null) {
                return;
            }
            acijVar.z();
            return;
        }
        aE();
    }

    @Override // defpackage.actq
    protected final acti oi() {
        return this.b;
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putSerializable("STATE_PREEXISTING_THUMBNAIL_FILE", this.d);
    }

    @Override // defpackage.actq
    protected final acup p() {
        return acuo.a(28236);
    }

    public final void s() {
        this.c.getClass();
        File file = this.d;
        DeviceLocalFile deviceLocalFile = null;
        if (file != null && file.exists()) {
            znd i = DeviceLocalFile.i();
            i.d(2);
            i.b(N(R.string.lc_crop_image_preexisting_thumbnail_cd));
            i.a = this.d.getParent();
            i.h(Uri.fromFile(this.d));
            i.g(this.d.length());
            i.c(0L);
            i.f(Long.MAX_VALUE);
            deviceLocalFile = i.a();
        }
        zvh zvhVar = this.c;
        zvhVar.ai = deviceLocalFile;
        if (zvhVar.e != null) {
            zvhVar.p();
        }
    }
}
