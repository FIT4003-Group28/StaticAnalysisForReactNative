package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vmj  reason: default package */
/* loaded from: classes7.dex */
public final class vmj implements avid {
    final /* synthetic */ vml a;

    public vmj(vml vmlVar) {
        this.a = vmlVar;
    }

    @Override // defpackage.avid
    public final void a() {
        this.a.b(R.string.OFFLINE_MANUAL_DOWNLOAD_STARTED_SNACKBAR);
    }

    @Override // defpackage.avid
    public final void b(boolean z) {
        if (!z) {
            this.a.b(R.string.OFFLINE_MAPS_CANNOT_SAVE_OFFLINE);
        }
    }
}
