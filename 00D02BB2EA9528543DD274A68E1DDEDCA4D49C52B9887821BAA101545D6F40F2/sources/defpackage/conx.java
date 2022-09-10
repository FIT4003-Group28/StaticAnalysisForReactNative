package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
/* compiled from: PG */
@Deprecated
/* renamed from: conx  reason: default package */
/* loaded from: classes5.dex */
public final class conx extends cntl<coot> implements cnom {
    public conx(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // defpackage.cnom
    public final Status a() {
        return coor.a(this.a.e);
    }

    @Override // defpackage.cntn
    public final /* bridge */ /* synthetic */ Object d(int i) {
        return new coot(this.a, i);
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("status", a());
        return b.toString();
    }
}
