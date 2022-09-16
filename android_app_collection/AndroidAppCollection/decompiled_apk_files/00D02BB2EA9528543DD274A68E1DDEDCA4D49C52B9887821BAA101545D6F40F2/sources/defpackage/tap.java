package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tap  reason: default package */
/* loaded from: classes7.dex */
public class tap implements twa {
    private final cqtd a;
    @dzsi
    private final String b;

    public tap(Activity activity, amve amveVar) {
        dqvj b = vyb.b(amveVar);
        dbsk.s(b);
        this.a = vyv.b(b);
        this.b = b != null ? stf.a(activity, b) : null;
    }

    @Override // defpackage.twa
    public cqtd a() {
        return this.a;
    }

    @Override // defpackage.twa
    @dzsi
    public String b() {
        return this.b;
    }
}
