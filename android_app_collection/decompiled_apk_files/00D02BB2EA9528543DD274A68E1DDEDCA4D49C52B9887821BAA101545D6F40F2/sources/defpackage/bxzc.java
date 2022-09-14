package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxzc  reason: default package */
/* loaded from: classes4.dex */
public class bxzc implements bxxp {
    private final cjtd a = cjtd.a(dtyb.bD);
    private final CharSequence b;

    public bxzc(gga ggaVar) {
        this.b = ggaVar.getString(R.string.SIGNED_OUT_HISTORY_RECENT_HISTORY_LABEL);
    }

    @Override // defpackage.bxxp
    public CharSequence a() {
        return this.b;
    }

    @Override // defpackage.bxxp
    public cqkl b(cjqm cjqmVar) {
        return cqkl.a;
    }

    @Override // defpackage.bxxp
    public cjtd c() {
        return this.a;
    }
}
