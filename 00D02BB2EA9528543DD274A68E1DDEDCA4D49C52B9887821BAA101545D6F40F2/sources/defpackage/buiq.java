package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;
/* compiled from: PG */
/* renamed from: buiq  reason: default package */
/* loaded from: classes4.dex */
public final class buiq implements buis {
    private final btvg a;
    private final btus b;
    private final CronetEngine c;
    private final dxio<btto> d;
    private final dxio<btup> e;
    private final cqat f;
    private final ckcw g;
    private final Executor h;
    @dzsi
    private final String i;

    public buiq(btvg btvgVar, btus btusVar, CronetEngine cronetEngine, dxio<btto> dxioVar, dxio<btup> dxioVar2, cqat cqatVar, ckcw ckcwVar, Executor executor, @dzsi String str) {
        this.a = btvgVar;
        this.b = btusVar;
        this.c = cronetEngine;
        this.d = dxioVar;
        this.e = dxioVar2;
        this.f = cqatVar;
        this.g = ckcwVar;
        this.h = executor;
        this.i = str;
    }

    @Override // defpackage.buis
    public final <S extends dssj> buir<S> a(dssj dssjVar, buid buidVar, buad buadVar) {
        return new buip(dssjVar, this.c, this.a, this.b, buidVar, buadVar, this.d, new btuj(this.e.a(), this.f), this.f, this.g, this.h, this.i);
    }
}
