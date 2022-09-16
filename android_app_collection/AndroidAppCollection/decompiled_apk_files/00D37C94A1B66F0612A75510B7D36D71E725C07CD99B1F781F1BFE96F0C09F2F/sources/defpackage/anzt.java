package defpackage;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: PG */
/* renamed from: anzt  reason: default package */
/* loaded from: classes.dex */
public final class anzt {
    public final anwg a;
    public final anzv b;
    public final qrl c;
    public final aoaf d;
    public final aoaf e;
    public final aoal f;

    public anzt(anwg anwgVar, anzv anzvVar, qrl qrlVar, aoaf aoafVar, aoaf aoafVar2, aoal aoalVar) {
        this.a = anwgVar;
        this.b = anzvVar;
        this.c = qrlVar;
        this.d = aoafVar;
        this.e = aoafVar2;
        this.f = aoalVar;
    }

    public final String a() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.a.g().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }
}
