package com.google.android.apps.youtube.embeddedplayer.service.hostappverification;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class f extends yua {
    private static final cfc a = new j();
    private final aotv b;
    private final String c;
    private final String k;

    public f(String str, String str2, String str3, String str4) {
        super(2, str, null);
        this.c = str2;
        this.k = str3;
        str4.getClass();
        List h = amqf.c(".").h(str4);
        aqxo.y(h.size() == 3);
        aopa createBuilder = aotv.a.createBuilder();
        int parseInt = Integer.parseInt((String) h.get(0));
        createBuilder.copyOnWrite();
        ((aotv) createBuilder.instance).b = parseInt;
        int parseInt2 = Integer.parseInt((String) h.get(1));
        createBuilder.copyOnWrite();
        ((aotv) createBuilder.instance).c = parseInt2;
        int parseInt3 = Integer.parseInt((String) h.get(2));
        createBuilder.copyOnWrite();
        ((aotv) createBuilder.instance).d = parseInt3;
        this.b = (aotv) createBuilder.mo39build();
        this.h = false;
        s();
    }

    @Override // defpackage.yua
    public final cff d(cff cffVar) {
        return e.a(cffVar.b);
    }

    @Override // defpackage.yua
    public final boolean h() {
        return true;
    }

    @Override // defpackage.yua
    public final cfc kX() {
        return a;
    }

    @Override // defpackage.yua
    public final String kY() {
        return "application/x-protobuf";
    }

    @Override // defpackage.yua
    public final byte[] qA() {
        aopa createBuilder = aott.a.createBuilder();
        createBuilder.copyOnWrite();
        ((aott) createBuilder.instance).f = 1;
        String str = this.c;
        createBuilder.copyOnWrite();
        str.getClass();
        ((aott) createBuilder.instance).c = str;
        String str2 = this.k;
        createBuilder.copyOnWrite();
        str2.getClass();
        ((aott) createBuilder.instance).d = str2;
        aotv aotvVar = this.b;
        createBuilder.copyOnWrite();
        aotvVar.getClass();
        ((aott) createBuilder.instance).b = aotvVar;
        createBuilder.copyOnWrite();
        ((aott) createBuilder.instance).e = true;
        return ((aott) createBuilder.mo39build()).toByteArray();
    }

    @Override // defpackage.yua
    public final cfb qy(cew cewVar) {
        int i = cewVar.a;
        if (i < 200 || i > 299) {
            return cfb.a(e.a(cewVar));
        }
        try {
            aotu aotuVar = (aotu) aopi.parseFrom(aotu.a, cewVar.b, aoos.b());
            int i2 = aotuVar.f;
            int i3 = 3;
            char c = i2 != 0 ? i2 != 1 ? (char) 0 : (char) 3 : (char) 2;
            if (c == 0) {
                c = 1;
            }
            if (c == 2) {
                return cfb.b(aotuVar, null);
            }
            aqxo.y(true);
            if (c != 3) {
                i3 = 1;
            }
            return cfb.a(new e(i3));
        } catch (aopx unused) {
            return cfb.a(e.a(cewVar));
        }
    }

    @Override // defpackage.yua
    public final /* bridge */ /* synthetic */ void qz(Object obj) {
        aotu aotuVar = (aotu) obj;
    }
}
