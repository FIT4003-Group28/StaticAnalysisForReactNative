package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpmc  reason: default package */
/* loaded from: classes4.dex */
public final class bpmc extends cqiw<bpvv> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bpvv bpvvVar, Context context, cqiv cqivVar) {
        bpvv bpvvVar2 = bpvvVar;
        for (int i2 = 0; i2 < bpvvVar2.b().intValue(); i2++) {
            cqivVar.a(new bpmb(), bpvvVar2.c(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bpvv> a() {
        return bplh.a(2131232979, R.string.ROAD_CLOSED_REASON_PROMPT, cqgr.gi(cqgr.ck(C())));
    }
}
