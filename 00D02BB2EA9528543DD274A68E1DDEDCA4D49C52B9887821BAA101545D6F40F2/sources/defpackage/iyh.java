package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: iyh  reason: default package */
/* loaded from: classes7.dex */
public final class iyh implements btzi {
    final /* synthetic */ dqjh a;
    final /* synthetic */ iyi b;

    public iyh(iyi iyiVar, dqjh dqjhVar) {
        this.b = iyiVar;
        this.a = dqjhVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr btzrVar, btzy btzyVar) {
        this.b.o(this.a);
    }

    @Override // defpackage.btzi
    public final void QZ(btzr btzrVar, Object obj) {
        if (this.b.c().booleanValue() || this.b.d().booleanValue()) {
            iyi iyiVar = this.b;
            ff ffVar = iyiVar.a;
            cjxu.n(iyiVar.b, ffVar, ffVar.getString(R.string.REVIEW_THUMBS_UP_THANK_YOU_TOAST), 0);
        }
    }
}
