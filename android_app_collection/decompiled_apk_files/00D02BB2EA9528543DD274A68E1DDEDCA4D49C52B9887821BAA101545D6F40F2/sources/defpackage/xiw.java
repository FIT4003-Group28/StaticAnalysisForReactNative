package defpackage;

import android.view.View;
import com.google.android.apps.gmm.directions.api.GmmNotice;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xiw  reason: default package */
/* loaded from: classes7.dex */
public final class xiw implements cqkn<zcv> {
    private final eeu a;
    private final dxio<qbt> b;
    private final List<GmmNotice> c;
    private final qda d;
    @dzsi
    private final CharSequence e;
    @dzsi
    private final dbsl<zcv> f;

    public xiw(eeu eeuVar, dxio<qbt> dxioVar, List<GmmNotice> list, @dzsi CharSequence charSequence, @dzsi dbsl<zcv> dbslVar, qda qdaVar) {
        this.a = eeuVar;
        this.b = dxioVar;
        this.c = list;
        this.e = charSequence;
        this.f = dbslVar;
        this.d = qdaVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(zcv zcvVar, View view) {
        List<GmmNotice> list;
        zcv zcvVar2 = zcvVar;
        dbsl<zcv> dbslVar = this.f;
        if ((dbslVar == null || dbslVar.a(zcvVar2)) && this.a.b() && (list = this.c) != null && !list.isEmpty()) {
            this.b.a().q(this.e, this.c, this.d, null);
        }
    }
}
