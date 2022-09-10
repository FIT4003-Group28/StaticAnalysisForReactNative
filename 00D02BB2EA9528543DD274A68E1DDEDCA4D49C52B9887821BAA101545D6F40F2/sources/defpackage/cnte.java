package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cnte  reason: default package */
/* loaded from: classes5.dex */
final class cnte implements cpbu<Boolean, Void> {
    @Override // defpackage.cpbu
    public final /* bridge */ /* synthetic */ Void a(cpcq<Boolean> cpcqVar) {
        if (cpcqVar.d().booleanValue()) {
            return null;
        }
        throw new cnob(new Status(13, "listener already unregistered"));
    }
}
