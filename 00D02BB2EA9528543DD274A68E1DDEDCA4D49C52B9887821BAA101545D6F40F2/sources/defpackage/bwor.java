package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwor  reason: default package */
/* loaded from: classes4.dex */
public class bwor extends bwoq {
    final /* synthetic */ bwov c;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwor(bwov bwovVar, eeu eeuVar, Context context) {
        super(bwovVar, eeuVar, new bwop(context, dpvf.UNKNOWN_CATEGORY, (int) R.string.LOCAL_ZERO_LESS, 2131231617, dtxu.cK));
        this.c = bwovVar;
    }

    @Override // defpackage.bwoq, defpackage.bwny
    public Boolean e() {
        return true;
    }

    @Override // defpackage.bwoq, defpackage.bwny
    public cqkl f(cjqm cjqmVar) {
        if (!this.a.b()) {
            return cqkl.a;
        }
        this.c.f();
        return cqkl.a;
    }
}
