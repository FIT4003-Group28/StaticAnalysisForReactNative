package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ycn  reason: default package */
/* loaded from: classes7.dex */
public class ycn implements xzs {
    private final xyu a;
    private final Boolean b;
    private final CharSequence c;
    private final Runnable d;
    private final xkl e;
    private final cjta f;

    public ycn(xyu xyuVar, boolean z, CharSequence charSequence, cjta cjtaVar, Runnable runnable, xkl xklVar) {
        this.a = xyuVar;
        this.b = Boolean.valueOf(z);
        this.c = charSequence;
        this.f = cjtaVar;
        this.d = runnable;
        this.e = xklVar;
    }

    @Override // defpackage.xyv
    public void a(Context context) {
    }

    @Override // defpackage.xyv
    public boolean b() {
        return false;
    }

    @Override // defpackage.xzs
    public xyu c() {
        return this.a;
    }

    @Override // defpackage.xzs
    public Boolean d() {
        return this.b;
    }

    @Override // defpackage.xzs
    public CharSequence e() {
        return this.c;
    }

    @Override // defpackage.xzs
    public cqkl f() {
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.xzs
    public cjtd g(ddho ddhoVar) {
        cjta cjtaVar = this.f;
        cjtaVar.d = ddhoVar;
        return cjtaVar.a();
    }

    @Override // defpackage.xzs
    public Boolean h() {
        return Boolean.valueOf(this.e.a());
    }
}
