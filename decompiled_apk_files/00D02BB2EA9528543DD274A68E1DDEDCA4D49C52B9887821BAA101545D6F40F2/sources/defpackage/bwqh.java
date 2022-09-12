package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bwqh  reason: default package */
/* loaded from: classes4.dex */
public class bwqh implements bwom {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public bwqh(qeg qegVar, boolean z) {
        int i;
        int d = z ? 4 : qegVar.d();
        if (d == 3) {
            this.a = R.string.TWO_WHEELER_CARD_TITLE;
            this.b = R.string.TWO_WHEELER_CARD_BODY_ACCURATE_ARRIVAL_TIMES;
            this.c = R.string.TWO_WHEELER_CARD_BODY_RESTRICTED_ROADS;
            i = R.string.TWO_WHEELER_CARD_BODY_SEE_MEMORIZE_ROUTES;
        } else if (d == 4) {
            this.a = R.string.TWO_WHEELER_CAMPAIGN_CARD_TITLE;
            this.b = R.string.TWO_WHEELER_CARD_BODY_SHORTCUTS;
            this.c = R.string.TWO_WHEELER_CARD_BODY_TOLLS;
            i = R.string.TWO_WHEELER_CAMPAIGN_CARD_BODY_MEMORIZE;
        } else {
            this.a = R.string.TWO_WHEELER_CARD_TITLE;
            this.b = R.string.TWO_WHEELER_CARD_BODY_SHORTCUTS;
            this.c = R.string.TWO_WHEELER_CARD_BODY_TOLLS;
            i = R.string.TWO_WHEELER_CARD_BODY_MEMORIZE;
        }
        this.d = i;
    }

    @Override // defpackage.bwom
    public Integer a() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.bwom
    public Integer b() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.bwom
    public Integer c() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.bwom
    public Integer d() {
        return Integer.valueOf(this.d);
    }
}
