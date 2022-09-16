package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;
/* compiled from: PG */
/* renamed from: aikc  reason: default package */
/* loaded from: classes.dex */
public final class aikc extends aijj {
    public static final String f(awev awevVar) {
        return (awevVar.b & 1) != 0 ? awevVar.c : "";
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ ory a(Object obj) {
        awev awevVar = (awev) obj;
        aopa createBuilder = ory.a.createBuilder();
        createBuilder.copyOnWrite();
        ory oryVar = (ory) createBuilder.instance;
        oryVar.b |= 1;
        oryVar.c = "";
        String f = f(awevVar);
        createBuilder.copyOnWrite();
        ory oryVar2 = (ory) createBuilder.instance;
        f.getClass();
        oryVar2.b |= 2;
        oryVar2.e = f;
        int i = awevVar.d;
        createBuilder.copyOnWrite();
        ory oryVar3 = (ory) createBuilder.instance;
        oryVar3.b |= 4;
        oryVar3.f = i;
        String str = awevVar.e;
        createBuilder.copyOnWrite();
        ory oryVar4 = (ory) createBuilder.instance;
        str.getClass();
        oryVar4.b |= 8;
        oryVar4.g = str;
        createBuilder.copyOnWrite();
        ory oryVar5 = (ory) createBuilder.instance;
        oryVar5.b |= 512;
        oryVar5.m = "";
        createBuilder.copyOnWrite();
        ory oryVar6 = (ory) createBuilder.instance;
        oryVar6.b |= 64;
        oryVar6.j = false;
        createBuilder.copyOnWrite();
        ory oryVar7 = (ory) createBuilder.instance;
        oryVar7.b |= 32;
        oryVar7.i = false;
        createBuilder.copyOnWrite();
        ory oryVar8 = (ory) createBuilder.instance;
        oryVar8.b |= 256;
        oryVar8.l = 0L;
        return (ory) createBuilder.mo39build();
    }

    @Override // defpackage.aijm
    public final aooq b() {
        return WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint;
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ String c(Object obj) {
        return f((awev) obj);
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        awev awevVar = (awev) obj;
        return "";
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ boolean e(Object obj, Object obj2) {
        awev awevVar = (awev) obj;
        awev awevVar2 = (awev) obj2;
        if (akzj.f(awevVar, awevVar2)) {
            return true;
        }
        return TextUtils.equals(f(awevVar), f(awevVar2)) && Math.abs(awevVar.d - awevVar2.d) <= 1;
    }
}
