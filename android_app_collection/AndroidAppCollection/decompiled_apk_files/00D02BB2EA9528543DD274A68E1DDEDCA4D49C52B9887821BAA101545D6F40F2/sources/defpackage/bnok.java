package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnok  reason: default package */
/* loaded from: classes3.dex */
public final class bnok implements dbsz<Long> {
    final /* synthetic */ bnom a;
    private int b = 0;

    public bnok(bnom bnomVar) {
        this.a = bnomVar;
    }

    @Override // defpackage.dbsz
    public final /* bridge */ /* synthetic */ void NU(@dzsi Long l) {
        Long l2 = l;
        this.a.e = l2.longValue();
        if (Math.round(((float) l2.longValue()) / 1000.0f) != this.b) {
            int round = Math.round(((float) l2.longValue()) / 1000.0f);
            this.b = round;
            if (round == 0) {
                bnom bnomVar = this.a;
                bnomVar.d = bnomVar.b.getResources().getString(R.string.DISMISS);
                this.a.w = true;
            } else {
                bnom bnomVar2 = this.a;
                bnomVar2.d = bnomVar2.b.getResources().getString(R.string.NUDGEBAR_FULLSCREEN_DISMISS_WITH_SECONDS, Integer.valueOf(this.b));
            }
            cqkx.p(this.a.a);
        }
    }
}
