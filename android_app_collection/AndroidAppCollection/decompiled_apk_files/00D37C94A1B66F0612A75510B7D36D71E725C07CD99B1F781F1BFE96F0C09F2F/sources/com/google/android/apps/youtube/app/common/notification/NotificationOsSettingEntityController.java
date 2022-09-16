package com.google.android.apps.youtube.app.common.notification;

import android.content.Context;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class NotificationOsSettingEntityController implements f {
    private final aagi a;
    private final Context b;
    private final agbd c;
    private final String d = aakj.f(atoz.b.a(), "notification_os_setting_entity");

    public NotificationOsSettingEntityController(aagi aagiVar, Context context, agbd agbdVar) {
        this.a = aagiVar;
        this.b = context;
        this.c = agbdVar;
    }

    @Override // defpackage.f, defpackage.g
    public final void kG(apy apyVar) {
        atpa atpaVar;
        aagh c = this.a.c();
        int f = agel.f(this.b, this.c) - 1;
        if (f != 1) {
            if (f == 2) {
                atpaVar = atpa.NOTIFICATION_OS_SETTING_STATE_DISABLED;
            } else if (f != 3) {
                atpaVar = atpa.NOTIFICATION_OS_SETTING_STATE_ONLY_CHANNEL_DISABLED;
            }
            String str = this.d;
            str.getClass();
            aqxo.z(!str.isEmpty(), "key cannot be empty");
            aopa createBuilder = atoz.a.createBuilder();
            createBuilder.copyOnWrite();
            atoz atozVar = (atoz) createBuilder.instance;
            atozVar.c = 1 | atozVar.c;
            atozVar.d = str;
            atow atowVar = new atow(createBuilder);
            aopa aopaVar = atowVar.a;
            aopaVar.copyOnWrite();
            atoz atozVar2 = (atoz) aopaVar.instance;
            atozVar2.e = atpaVar.e;
            atozVar2.c |= 2;
            atoy b = atowVar.b();
            aahb c2 = ((aagu) c).c();
            c2.d(b);
            c2.b().Q();
        }
        atpaVar = atpa.NOTIFICATION_OS_SETTING_STATE_ENABLED;
        String str2 = this.d;
        str2.getClass();
        aqxo.z(!str2.isEmpty(), "key cannot be empty");
        aopa createBuilder2 = atoz.a.createBuilder();
        createBuilder2.copyOnWrite();
        atoz atozVar3 = (atoz) createBuilder2.instance;
        atozVar3.c = 1 | atozVar3.c;
        atozVar3.d = str2;
        atow atowVar2 = new atow(createBuilder2);
        aopa aopaVar2 = atowVar2.a;
        aopaVar2.copyOnWrite();
        atoz atozVar22 = (atoz) aopaVar2.instance;
        atozVar22.e = atpaVar.e;
        atozVar22.c |= 2;
        atoy b2 = atowVar2.b();
        aahb c22 = ((aagu) c).c();
        c22.d(b2);
        c22.b().Q();
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
