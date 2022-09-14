package com.google.android.apps.gmm.location.model;

import android.location.Location;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes.dex */
public class DeviceLocation extends Location implements ahnc {
    @dzsi
    public dtai a;
    public int b;
    @Deprecated
    public boolean c;
    public boolean d;
    @dzsi
    public QuantizedDeviceLocation e;

    public DeviceLocation(String str) {
        super(str);
        this.e = null;
    }

    @Override // defpackage.ahnc
    public final dtaq a() {
        dtap a = ahmq.a(this);
        if (a.c) {
            a.bF();
            a.c = false;
        }
        dtaq dtaqVar = (dtaq) a.b;
        dtaq dtaqVar2 = dtaq.m;
        dtaqVar.b = 1;
        dtaqVar.a = 1 | dtaqVar.a;
        dtaq dtaqVar3 = (dtaq) a.b;
        dtaqVar3.c = 12;
        int i = dtaqVar3.a | 2;
        dtaqVar3.a = i;
        dtaqVar3.a = i | 256;
        dtaqVar3.h = 68;
        dtan bZ = dtao.e.bZ();
        if (f()) {
            int round = Math.round(getBearing());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtao dtaoVar = (dtao) bZ.b;
            dtaoVar.a |= 2;
            dtaoVar.b = round;
        }
        if (hasSpeed()) {
            int round2 = Math.round(getSpeed() * 3.6f);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dtao dtaoVar2 = (dtao) bZ.b;
            dtaoVar2.a |= 8;
            dtaoVar2.c = round2;
        }
        dtao bK = bZ.bK();
        if (a.c) {
            a.bF();
            a.c = false;
        }
        dtaq dtaqVar4 = (dtaq) a.b;
        bK.getClass();
        dtaqVar4.l = bK;
        int i2 = dtaqVar4.a | 262144;
        dtaqVar4.a = i2;
        dtai dtaiVar = this.a;
        if (dtaiVar != null) {
            dtaiVar.getClass();
            dtaqVar4.j = dtaiVar;
            int i3 = i2 | 2048;
            dtaqVar4.a = i3;
            int i4 = this.b;
            dtaqVar4.a = i3 | 4096;
            dtaqVar4.k = i4 * 0.001f;
        }
        if (this.c) {
            long micros = TimeUnit.MILLISECONDS.toMicros(getTime());
            if (a.c) {
                a.bF();
                a.c = false;
            }
            dtaq dtaqVar5 = (dtaq) a.b;
            dtaqVar5.a |= 4;
            dtaqVar5.d = micros;
        }
        return a.bK();
    }

    @Override // defpackage.ahnc
    public long b() {
        return TimeUnit.NANOSECONDS.toMillis(getElapsedRealtimeNanos());
    }

    @Override // defpackage.ahnc
    @Deprecated
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.ahnc
    public final boolean d() {
        return this.d;
    }

    public boolean e() {
        return false;
    }

    public final boolean f() {
        return hasBearing() && ((hasSpeed() && (getSpeed() > 3.0f ? 1 : (getSpeed() == 3.0f ? 0 : -1)) > 0) || e());
    }
}
