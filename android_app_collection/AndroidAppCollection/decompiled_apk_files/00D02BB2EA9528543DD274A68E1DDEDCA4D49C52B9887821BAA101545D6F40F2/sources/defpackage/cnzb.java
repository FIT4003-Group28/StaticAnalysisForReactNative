package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
/* compiled from: PG */
/* renamed from: cnzb  reason: default package */
/* loaded from: classes5.dex */
final class cnzb implements cnyk {
    final /* synthetic */ DataHolder a;
    final /* synthetic */ Status b;
    private final cnyc c;

    public cnzb(DataHolder dataHolder, Status status) {
        this.a = dataHolder;
        this.b = status;
        this.c = dataHolder == null ? null : new cnyc(dataHolder);
    }

    @Override // defpackage.cnom
    public final Status a() {
        return this.b;
    }

    @Override // defpackage.cnyk
    public final cnyc b() {
        return this.c;
    }
}
