package defpackage;

import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dcti  reason: default package */
/* loaded from: classes.dex */
public final class dcti extends dctf {
    public static final dctf a = new dcti();

    private dcti() {
    }

    @Override // defpackage.dctf
    public final dcrl a(String str) {
        return new dctk(Logger.getLogger(str.replace('$', '.')));
    }

    public final String toString() {
        return "Default logger backend factory";
    }
}
