package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: bujh  reason: default package */
/* loaded from: classes4.dex */
public final class bujh implements buis {
    private final btvg a;
    private final CronetEngine b;
    private final dxio<btup> c;
    private final cqat d;
    private final ckcw e;
    private final Executor f;
    private final dzsj<dmxf> g;
    @dzsi
    private final String h;

    public bujh(btvg btvgVar, CronetEngine cronetEngine, dxio<btup> dxioVar, cqat cqatVar, ckcw ckcwVar, Executor executor, dzsj<dmxf> dzsjVar, @dzsi String str) {
        this.a = btvgVar;
        this.b = cronetEngine;
        this.c = dxioVar;
        this.d = cqatVar;
        this.e = ckcwVar;
        this.f = executor;
        this.g = dzsjVar;
        this.h = str;
    }

    @Override // defpackage.buis
    public final <S extends dssj> buir<S> a(dssj dssjVar, buid buidVar, buad buadVar) {
        return new bujg(dssjVar, this.b, this.a, buidVar, new btuj(this.c.a(), this.d), this.d, this.e, this.f, this.g, this.h);
    }
}
