package defpackage;

import android.content.Context;
import com.google.firebase.appindexing.internal.ActionImpl;
/* compiled from: PG */
/* renamed from: deoe  reason: default package */
/* loaded from: classes6.dex */
public final class deoe extends demb {
    private final deoc a;

    public deoe(Context context) {
        this.a = new deoc(context);
    }

    @Override // defpackage.demb
    public final cpcq<Void> a(ActionImpl actionImpl) {
        ActionImpl[] actionImplArr = {actionImpl};
        actionImpl.e.a = 2;
        return this.a.d(new deob(actionImplArr));
    }
}
