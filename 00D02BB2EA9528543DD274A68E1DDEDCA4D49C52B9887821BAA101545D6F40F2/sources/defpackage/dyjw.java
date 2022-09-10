package defpackage;

import java.net.InetSocketAddress;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: dyjw  reason: default package */
/* loaded from: classes6.dex */
public final class dyjw extends dykl<dyjw> {
    @dzsi
    public ScheduledExecutorService a;
    public final CronetEngine b;
    public final dyvq c = dyvr.a;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    private final dysf h;

    private dyjw(String str, int i, CronetEngine cronetEngine) {
        this.h = new dysf(InetSocketAddress.createUnresolved(str, i), dyow.f(str, i), new dyjs(this));
        dbsk.t(cronetEngine, "cronetEngine");
        this.b = cronetEngine;
    }

    public static dyjw a(String str, int i, CronetEngine cronetEngine) {
        dbsk.t(cronetEngine, "cronetEngine");
        return new dyjw(str, i, cronetEngine);
    }

    @Override // defpackage.dykl
    protected final dyhj<?> b() {
        return this.h;
    }
}
