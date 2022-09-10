package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
/* compiled from: PG */
/* renamed from: cpgn  reason: default package */
/* loaded from: classes5.dex */
public final class cpgn extends cntv<cpgl> implements cnom {
    public final Status b;

    public cpgn(DataHolder dataHolder) {
        super(dataHolder);
        this.b = new Status(dataHolder.e);
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.b;
    }

    @Override // defpackage.cntv
    protected final /* bridge */ /* synthetic */ cpgl e(int i, int i2) {
        return new cpid(this.a, i, i2);
    }

    @Override // defpackage.cntv
    protected final String f() {
        return "path";
    }
}
