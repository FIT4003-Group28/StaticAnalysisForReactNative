package defpackage;

import com.google.android.apps.gmm.cloudmessage.chime.GmmChimeTaskService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ftu  reason: default package */
/* loaded from: classes6.dex */
public final class ftu implements dxir {
    final /* synthetic */ fyu a;

    public ftu(fyu fyuVar) {
        this.a = fyuVar;
    }

    @Override // defpackage.dxir
    public final /* bridge */ /* synthetic */ dxis a(Object obj) {
        GmmChimeTaskService gmmChimeTaskService = (GmmChimeTaskService) obj;
        return new ftv(this.a);
    }
}
