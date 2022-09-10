package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
/* compiled from: PG */
/* renamed from: cpgk  reason: default package */
/* loaded from: classes5.dex */
public final class cpgk extends cntv<cphz> implements cnom {
    private final Status b;

    public cpgk(DataHolder dataHolder) {
        super(dataHolder);
        this.b = new Status(dataHolder.e);
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.b;
    }

    @Override // defpackage.cntv
    protected final /* bridge */ /* synthetic */ cphz e(int i, int i2) {
        return new cphz(this.a, i, i2);
    }

    @Override // defpackage.cntv
    protected final String f() {
        return "path";
    }
}
