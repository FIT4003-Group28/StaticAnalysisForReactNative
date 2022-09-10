package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bnai  reason: default package */
/* loaded from: classes3.dex */
public final class bnai {
    public final Executor b;
    public final akqi c;
    @dzsi
    public String e;
    @dzsi
    public dinq f;
    public final buuy g;
    public final bnha h;
    public final btzi<dinq, dins> a = new bnah(this);
    public boolean d = true;

    public bnai(buuy buuyVar, Executor executor, akqi akqiVar, bnha bnhaVar) {
        this.g = buuyVar;
        this.b = executor;
        this.c = akqiVar;
        this.h = bnhaVar;
    }

    public final boolean a() {
        bvrj.UI_THREAD.c();
        return this.d || !dbsj.d(this.e);
    }
}
