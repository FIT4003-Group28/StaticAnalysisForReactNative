package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: flr  reason: default package */
/* loaded from: classes3.dex */
public class flr {
    public final atfa a;

    public flr(atfa atfaVar) {
        this.a = atfaVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof flr) && this.a.equals(((flr) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
