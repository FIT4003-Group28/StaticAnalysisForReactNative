package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bweg  reason: default package */
/* loaded from: classes4.dex */
final class bweg implements btzi<djrc, djre> {
    final /* synthetic */ bweh a;

    public bweg(bweh bwehVar) {
        this.a = bwehVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<djrc> btzrVar, btzy btzyVar) {
        bweh.a(this.a.a.getString(R.string.SHARE_EMAIL_FAILURE), this.a.a);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<djrc> btzrVar, djre djreVar) {
        bweh.a(this.a.a.getString(R.string.SHARE_EMAIL_SUCCESS), this.a.a);
    }
}
