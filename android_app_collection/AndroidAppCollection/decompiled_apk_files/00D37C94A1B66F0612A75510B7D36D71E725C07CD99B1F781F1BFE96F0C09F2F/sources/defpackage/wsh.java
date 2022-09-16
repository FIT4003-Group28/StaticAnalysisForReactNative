package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
@wsf(a = xbe.class)
/* renamed from: wsh  reason: default package */
/* loaded from: classes4.dex */
public final class wsh implements wsg {
    @Override // defpackage.wsg
    public final String a() {
        return "0";
    }

    @Override // defpackage.wsg
    public final String b(xac xacVar) {
        InstreamAdBreak instreamAdBreak = (InstreamAdBreak) xacVar.c(xbe.class);
        return instreamAdBreak.b() == xdb.MID_ROLL ? Long.toString(TimeUnit.MILLISECONDS.toSeconds(instreamAdBreak.a())) : "0";
    }
}
