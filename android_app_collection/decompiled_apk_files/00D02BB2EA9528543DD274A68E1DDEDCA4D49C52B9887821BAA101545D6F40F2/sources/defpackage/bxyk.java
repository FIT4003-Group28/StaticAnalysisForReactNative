package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxyk  reason: default package */
/* loaded from: classes4.dex */
public class bxyk implements bxxp {
    private final cjtd a = cjtd.a(dtyb.bE);
    private final gga b;

    public bxyk(gga ggaVar) {
        this.b = ggaVar;
    }

    @Override // defpackage.bxxp
    public cqkl b(cjqm cjqmVar) {
        this.b.D(new bxxx());
        return cqkl.a;
    }

    @Override // defpackage.bxxp
    public cjtd c() {
        return this.a;
    }

    @Override // defpackage.bxxp
    /* renamed from: d */
    public String a() {
        return this.b.getString(R.string.MORE_FROM_RECENT_HISTORY);
    }
}
