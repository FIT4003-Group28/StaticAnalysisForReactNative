package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgvh  reason: default package */
/* loaded from: classes3.dex */
public final class bgvh implements bgvd {
    private final Resources a;
    private final dxio<apyz> b;

    public bgvh(Resources resources, dxio<apyz> dxioVar) {
        dbsk.l(false);
        this.a = resources;
        this.b = dxioVar;
    }

    @Override // defpackage.bgvd
    public final String a() {
        return this.a.getString(R.string.MESSAGING_INBOX_TITLE);
    }

    @Override // defpackage.bgvd
    public final ddho b() {
        return dtxv.bf;
    }

    @Override // defpackage.bgvd
    public final void c(bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        if (c == null) {
            throw new IllegalArgumentException("Cannot open messages without a placemark");
        }
        this.b.a().l(c.cQ(), apzb.UNRESOLVED);
    }
}
