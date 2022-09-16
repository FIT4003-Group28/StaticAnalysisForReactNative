package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: jpa  reason: default package */
/* loaded from: classes3.dex */
public final class jpa {
    public final Context a;

    public jpa(Context context) {
        this.a = context;
    }

    public static apok a(String str) {
        aopa createBuilder = apok.a.createBuilder();
        aopc aopcVar = (aopc) apoj.a.createBuilder();
        arag g = ajgl.g(str);
        aopcVar.copyOnWrite();
        apoj apojVar = (apoj) aopcVar.instance;
        g.getClass();
        apojVar.i = g;
        apojVar.b |= 256;
        apoj apojVar2 = (apoj) aopcVar.mo39build();
        createBuilder.copyOnWrite();
        apok apokVar = (apok) createBuilder.instance;
        apojVar2.getClass();
        apokVar.c = apojVar2;
        apokVar.b |= 1;
        return (apok) createBuilder.mo39build();
    }
}
