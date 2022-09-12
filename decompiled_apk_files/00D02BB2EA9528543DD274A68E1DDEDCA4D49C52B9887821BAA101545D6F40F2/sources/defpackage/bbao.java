package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bbao  reason: default package */
/* loaded from: classes3.dex */
public class bbao implements baye {
    private final String a;
    private final String b;
    private final String c;
    @dzsi
    private final cqtd d;
    private final Boolean e;
    private final Runnable f;

    public bbao(gga ggaVar, String str, @dzsi cqtd cqtdVar, Boolean bool, Runnable runnable) {
        this.c = str;
        this.d = cqtdVar;
        this.e = bool;
        this.f = runnable;
        this.b = ggaVar.getString(R.string.RETRY_SYNC_DETAILS_TEXT);
        this.a = ggaVar.getString(R.string.RETRY_SYNC_ACTION_TEXT);
    }

    @Override // defpackage.baye
    public final Boolean a() {
        return true;
    }

    @Override // defpackage.baye
    public final String b() {
        return this.c;
    }

    @Override // defpackage.baye
    public final String c() {
        return this.b;
    }

    @Override // defpackage.baye
    public final String d() {
        return this.a;
    }

    @Override // defpackage.baye
    public final cqkl e() {
        this.f.run();
        return cqkl.a;
    }

    @Override // defpackage.baye
    public final cjtd f() {
        return cjtd.b;
    }

    @Override // defpackage.baye
    @dzsi
    public final cqtd g() {
        return this.d;
    }

    @Override // defpackage.baye
    public final Boolean h() {
        return this.e;
    }
}
