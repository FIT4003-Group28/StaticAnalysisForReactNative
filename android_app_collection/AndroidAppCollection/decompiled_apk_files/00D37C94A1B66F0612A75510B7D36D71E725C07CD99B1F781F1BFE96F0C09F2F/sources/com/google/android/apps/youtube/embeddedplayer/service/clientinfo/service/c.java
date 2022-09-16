package com.google.android.apps.youtube.embeddedplayer.service.clientinfo.service;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class c implements aaqw {
    private final String a;
    private final String b;
    private final String c;

    public c(Context context, String str, String str2) {
        zgh.m(str);
        this.a = str;
        zgh.m(str2);
        this.b = str2;
        try {
            PackageInfo b = zfm.b(context, 64);
            if (b.signatures.length != 1) {
                int length = b.signatures.length;
                throw new zfl();
            } else {
                this.c = Base64.encodeToString(zgt.f(b.signatures[0].toByteArray()), 10);
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Couldn't get package information.", e);
        }
    }

    @Override // defpackage.aaqw
    public final void a(aopa aopaVar) {
        arpc b = b();
        aopaVar.copyOnWrite();
        aroy aroyVar = (aroy) aopaVar.instance;
        aroy aroyVar2 = aroy.a;
        b.getClass();
        aroyVar.i = b;
        aroyVar.b |= 128;
    }

    public final arpc b() {
        aopa createBuilder = arpc.a.createBuilder();
        String str = this.b;
        createBuilder.copyOnWrite();
        arpc arpcVar = (arpc) createBuilder.instance;
        str.getClass();
        arpcVar.b |= 2;
        arpcVar.d = str;
        String str2 = this.c;
        createBuilder.copyOnWrite();
        arpc arpcVar2 = (arpc) createBuilder.instance;
        str2.getClass();
        arpcVar2.b |= 4;
        arpcVar2.e = str2;
        String str3 = this.a;
        createBuilder.copyOnWrite();
        arpc arpcVar3 = (arpc) createBuilder.instance;
        str3.getClass();
        arpcVar3.b |= 1;
        arpcVar3.c = str3;
        return (arpc) createBuilder.mo39build();
    }
}
