package defpackage;

import android.os.Handler;
import java.security.SecureRandom;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aitp  reason: default package */
/* loaded from: classes.dex */
public final class aitp {
    public final snc a;
    public final Executor b;
    public final Handler c;
    public final SecureRandom d;
    public final aawx e;
    public final String f;
    public final aiix g;
    public final acrr h;
    public aitr i;
    public final ahfm j;

    public aitp(snc sncVar, Executor executor, Handler handler, SecureRandom secureRandom, aawx aawxVar, String str, ahfm ahfmVar, aiix aiixVar, acrr acrrVar) {
        sncVar.getClass();
        this.a = sncVar;
        executor.getClass();
        this.b = executor;
        handler.getClass();
        this.c = handler;
        secureRandom.getClass();
        this.d = secureRandom;
        aawxVar.getClass();
        this.e = aawxVar;
        zgh.m(str);
        this.f = str;
        ahfmVar.getClass();
        this.j = ahfmVar;
        this.g = aiixVar;
        this.h = acrrVar;
    }

    public static final boolean a(arzt arztVar) {
        return arztVar != null && !arztVar.c.isEmpty() && arztVar.d > 0 && arztVar.e != 0;
    }

    public static final boolean b(byte[] bArr) {
        return bArr != null && bArr.length > 0;
    }
}
