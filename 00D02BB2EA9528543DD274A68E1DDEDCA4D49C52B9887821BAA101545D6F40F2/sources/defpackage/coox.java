package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: coox  reason: default package */
/* loaded from: classes5.dex */
public final class coox extends coon<copa> {
    final /* synthetic */ String[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coox(Api api, GoogleApiClient googleApiClient, String[] strArr) {
        super(api, googleApiClient);
        this.a = strArr;
    }

    @Override // defpackage.cnpg
    protected final /* bridge */ /* synthetic */ void b(cnnq cnnqVar) {
        copa copaVar = (copa) cnnqVar;
        ((copd) copaVar.L()).e(Arrays.asList(this.a), copaVar.a, new coop(this));
    }
}
