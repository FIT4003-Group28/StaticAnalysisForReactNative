package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aotd  reason: default package */
/* loaded from: classes2.dex */
class aotd implements baei {
    final /* synthetic */ aote a;

    public aotd(aote aoteVar) {
        this.a = aoteVar;
    }

    @Override // defpackage.baei
    public cqsn a() {
        return cqrt.l(R.string.VISITED);
    }

    @Override // defpackage.baei
    public cqsn b() {
        return cqrt.l(R.string.FROM_YOUR_LOCATION_HISTORY);
    }

    @Override // defpackage.baei
    public baeh c() {
        return new aotc(this);
    }
}
