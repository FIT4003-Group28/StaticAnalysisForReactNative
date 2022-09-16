package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: qvz  reason: default package */
/* loaded from: classes4.dex */
public final class qvz implements rui {
    @Override // defpackage.rui
    public final /* bridge */ /* synthetic */ Object a(rve rveVar) {
        if (((Boolean) rveVar.g()).booleanValue()) {
            return null;
        }
        throw new qsp(new Status(13, "listener already unregistered"));
    }
}
