package defpackage;

import android.util.Pair;
import java.io.Serializable;
import java.security.KeyPair;
/* compiled from: PG */
/* renamed from: ctzp  reason: default package */
/* loaded from: classes5.dex */
public abstract class ctzp implements Serializable {
    public static ctzm f() {
        cucn cucnVar = new cucn();
        cucnVar.c = cuah.a;
        return cucnVar;
    }

    public abstract dcdc<Byte> a();

    public abstract Long b();

    public abstract Long c();

    public final KeyPair d() {
        return g().a();
    }

    public final Pair<byte[], byte[]> e() {
        return g().b();
    }

    public abstract ctzo g();

    public final int h() {
        return g().c();
    }
}
